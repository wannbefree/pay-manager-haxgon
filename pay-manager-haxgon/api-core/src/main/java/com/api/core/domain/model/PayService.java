package com.api.core.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PayService {
    private String serviceId;
    private String serviceName;

    @Builder
    public PayService(String serviceId, String serviceName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }
}