// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of LogDelivery */
@Generated
class LogDeliveryImpl implements LogDeliveryService {
  private final ApiClient apiClient;

  public LogDeliveryImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    return apiClient.POST(path, request, WrappedLogDeliveryConfiguration.class);
  }

  @Override
  public WrappedLogDeliveryConfiguration get(GetLogDeliveryRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    return apiClient.GET(path, request, WrappedLogDeliveryConfiguration.class, "application/json");
  }

  @Override
  public WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    return apiClient.GET(path, request, WrappedLogDeliveryConfigurations.class, "application/json");
  }

  @Override
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    apiClient.PATCH(path, request, Void.class);
  }
}
