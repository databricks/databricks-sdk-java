// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, WrappedLogDeliveryConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WrappedLogDeliveryConfiguration get(GetLogDeliveryRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WrappedLogDeliveryConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, WrappedLogDeliveryConfigurations.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, PatchStatusResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
