package com.beiken.saas.platform.manage;


import com.beiken.saas.platform.biz.vo.EquipmentVO;
import com.beiken.saas.platform.mapper.BgInspectItemMapper;
import com.beiken.saas.platform.pojo.BgInspectItemDO;
import com.beiken.saas.platform.pojo.BgInspectItemDOExample;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/2/27
 * Time: 下午8:45
 */
@Component
public class BgManager {

    @Resource
    private BgInspectItemMapper bgInspectItemMapper;


    public Long countBgItemByCode(String bgCode) {
        BgInspectItemDOExample example = new BgInspectItemDOExample();
        example.createCriteria().andBgCodeEqualTo(bgCode);
        return bgInspectItemMapper.countByExample(example);
    }

    public BgInspectItemDO getBgItemDOByItemCode(String bgItemCode) {
        BgInspectItemDOExample example = new BgInspectItemDOExample();
        example.createCriteria().andBgItemCodeEqualTo(bgItemCode);
        List<BgInspectItemDO> bgInspectItemDOs = bgInspectItemMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(bgInspectItemDOs)) {
            return null;
        }
        return bgInspectItemDOs.get(0);
    }

    public Map<String, BgInspectItemDO> getBgItemDOByItemCode(List<String> bgItemCodes) {
        if (CollectionUtils.isEmpty(bgItemCodes)) {
            return Collections.emptyMap();
        }
        BgInspectItemDOExample example = new BgInspectItemDOExample();
        example.createCriteria().andBgItemCodeIn(bgItemCodes);
        List<BgInspectItemDO> bgInspectItemDOs = bgInspectItemMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(bgInspectItemDOs)) {
            return null;
        }
        Map<String, BgInspectItemDO> map = bgInspectItemDOs.stream().collect(Collectors.toMap(BgInspectItemDO::getBgItemCode, p -> p));
        return map;
    }

    public List<BgInspectItemDO> getAll() {
        return bgInspectItemMapper.selectByExample(new BgInspectItemDOExample());
    }

    public Map<String, Map<String, Map<String, List<EquipmentVO>>>> buildEquipment(List<BgInspectItemDO> itemDOList) {
        Map<String, Map<String, Map<String, List<EquipmentVO>>>> result = Maps.newHashMap();
        if (CollectionUtils.isEmpty(itemDOList)) {
            return result;
        }
        for (BgInspectItemDO itemDO : itemDOList) {
            String pkey = itemDO.getInspectType();
            EquipmentVO equipmentVO = new EquipmentVO();
            equipmentVO.setBgItemCode(itemDO.getBgItemCode());
            equipmentVO.setValue(itemDO.getEquipment());

            String skey = itemDO.getManageType();
            if (result.containsKey(pkey)) {
                Map<String, Map<String, List<EquipmentVO>>> secondMap = result.get(pkey);
                if (secondMap.containsKey(skey)) {
                    Map<String, List<EquipmentVO>> thirdMap = secondMap.get(skey);
                    if (thirdMap.containsKey(itemDO.getSite())) {
                        thirdMap.get(itemDO.getSite()).add(equipmentVO);
                    } else {
                        List<EquipmentVO> list = Lists.newArrayList();
                        list.add(equipmentVO);
                        thirdMap.put(itemDO.getSite(), list);
                    }
                }

            } else {
                Map<String, Map<String, List<EquipmentVO>>> secondMap = Maps.newHashMap();
                Map<String, List<EquipmentVO>> thirdMap = Maps.newHashMap();
                List<EquipmentVO> childList = Lists.newArrayList();
                childList.add(equipmentVO);
                thirdMap.put(itemDO.getSite(), childList);
                secondMap.put(skey, thirdMap);
                result.put(pkey, secondMap);
            }
        }
        return result;
    }
}
