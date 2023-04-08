// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of LogDelivery */
class LogDeliveryImpl implements LogDeliveryService {
    private final ApiClient apiClient;

    public LogDeliveryImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
        String path = String.format("/api/2.0/accounts//log-delivery");
        return apiClient.POST(path, request, WrappedLogDeliveryConfiguration.class);
    }
    
    @Override
    public WrappedLogDeliveryConfiguration get(GetLogDeliveryRequest request) {
        String path = String.format("/api/2.0/accounts//log-delivery/%s", request.getLogDeliveryConfigurationId());
        return apiClient.GET(path, request, WrappedLogDeliveryConfiguration.class);
    }
    
    @Override
    public WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest request) {
        String path = String.format("/api/2.0/accounts//log-delivery");
        return apiClient.GET(path, request, WrappedLogDeliveryConfigurations.class);
    }
    
    @Override
    public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
        String path = String.format("/api/2.0/accounts//log-delivery/%s", request.getLogDeliveryConfigurationId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}