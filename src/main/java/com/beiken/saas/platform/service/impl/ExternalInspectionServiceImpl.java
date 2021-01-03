package com.beiken.saas.platform.service.impl;

import com.beiken.saas.platform.pojo.ExternalInspection;
import com.beiken.saas.platform.service.ExternalInspectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExternalInspectionServiceImpl implements ExternalInspectionService {
    @Override
    public ExternalInspection queryById(Long id) {
        return null;
    }

    @Override
    public List<ExternalInspection> queryExternalInspection(Integer id) {
        return null;
    }

    @Override
    public int addExternalInspection(ExternalInspection externalInspection) {
        return 0;
    }
}
