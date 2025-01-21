// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, WrappedLogDeliveryConfiguration.class, headers);
  }

  @Override
  public WrappedLogDeliveryConfiguration get(GetLogDeliveryRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, WrappedLogDeliveryConfiguration.class, headers);
  }

  @Override
  public WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, WrappedLogDeliveryConfigurations.class, headers);
  }

  @Override
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, PatchStatusResponse.class, headers);
  }
}
