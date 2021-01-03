package com.beiken.saas.platform.service;

import com.beiken.saas.platform.pojo.ExternalInspection;
import com.beiken.saas.platform.pojo.HiddenDanger;

import java.util.List;

public interface ExternalInspectionService {

    ExternalInspection queryById(Long id);

    List<ExternalInspection> queryExternalInspection(Integer id);

    int addExternalInspection(ExternalInspection externalInspection);
}
