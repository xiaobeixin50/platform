package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.RankVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.UserVO;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: panboliang
 * Date: 21/3/18
 * Time: 下午7:53
 */
@Api(value = "/rank", description = "排行榜", tags = "排行榜接口")
@RestController
@RequestMapping("/rank")
public class RankController {

    @ApiOperation("监理上传隐患排名")
    @ResponseBody
    @GetMapping(value = "/report")
    @ApiImplicitParams({@ApiImplicitParam(name = "time", value = "时间范围,0-周,1-月,2-年", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "roleName", value = "角色名(井队长/监理)", required = true, dataType = "String")
            , @ApiImplicitParam(name = "pageNo", value = "pageNo", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "pageSize", value = "pageSize", required = false, dataType = "Integer")})
    public Result rankReportDanger(@RequestParam Integer time, @RequestParam String roleName) {
        PageBo<RankVO> page = new PageBo();
        page.setTotalSize(3L);
        List<RankVO> rankVOList = Lists.newArrayList();
        if (roleName.equals("井队长")) {
            RankVO rankVO1 = new RankVO();
            UserVO userVO1 = new UserVO();
            userVO1.setName("张三");
            userVO1.setDepId(1L);
            userVO1.setDepName("北疆油服第21井队");
            rankVO1.setRankNo(1L);
            rankVO1.setDangerNum(20L);
            rankVO1.setUserVO(userVO1);

            RankVO rankVO2 = new RankVO();
            UserVO userVO2 = new UserVO();
            userVO2.setName("李四");
            userVO2.setDepId(2L);
            userVO2.setDepName("北疆油服第21井队");
            rankVO2.setRankNo(2L);
            rankVO2.setDangerNum(10L);
            rankVO2.setUserVO(userVO2);

            RankVO rankVO3 = new RankVO();
            UserVO userVO3 = new UserVO();
            userVO3.setName("李四");
            userVO3.setDepId(1L);
            userVO3.setDepName("北疆油服第21井队");
            rankVO3.setRankNo(3L);
            rankVO3.setDangerNum(2L);
            rankVO3.setUserVO(userVO3);

            rankVOList.add(rankVO1);
            rankVOList.add(rankVO2);
            rankVOList.add(rankVO3);
        } else if (roleName.equals("监理")) {

            RankVO rankVO1 = new RankVO();
            UserVO userVO1 = new UserVO();
            userVO1.setName("张三");
            userVO1.setDepId(1L);
            userVO1.setDepName("监理");
            rankVO1.setRankNo(1L);
            rankVO1.setDangerNum(50L);
            rankVO1.setManageRigNum(5L);
            rankVO1.setUserVO(userVO1);

            RankVO rankVO2 = new RankVO();
            UserVO userVO2 = new UserVO();
            userVO2.setName("李四");
            userVO2.setDepId(2L);
            userVO2.setDepName("监理");
            rankVO2.setRankNo(2L);
            rankVO2.setDangerNum(30L);
            rankVO2.setManageRigNum(3L);
            rankVO2.setUserVO(userVO2);

            RankVO rankVO3 = new RankVO();
            UserVO userVO3 = new UserVO();
            userVO3.setName("李四");
            userVO3.setDepId(2L);
            userVO3.setDepName("监理");
            rankVO3.setRankNo(3L);
            rankVO3.setDangerNum(20L);
            rankVO3.setManageRigNum(2L);
            rankVO3.setUserVO(userVO3);

            rankVOList.add(rankVO1);
            rankVOList.add(rankVO2);
            rankVOList.add(rankVO3);
        }
        page.setItemList(rankVOList);
        return Result.success(page);
    }

}
