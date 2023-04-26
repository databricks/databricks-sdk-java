// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of LogDelivery */
class LogDeliveryImpl implements LogDeliveryService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for LogDeliveryImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public LogDeliveryImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public WrappedLogDeliveryConfiguration create(WrappedCreateLogDeliveryConfiguration request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    return apiClient.POST(path, request, WrappedLogDeliveryConfiguration.class);
  }

  /** {@inheritDoc} */
  @Override
  public WrappedLogDeliveryConfiguration get(GetLogDeliveryRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    return apiClient.GET(path, request, WrappedLogDeliveryConfiguration.class);
  }

  /** {@inheritDoc} */
  @Override
  public WrappedLogDeliveryConfigurations list(ListLogDeliveryRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/log-delivery", apiClient.configuredAccountID());
    return apiClient.GET(path, request, WrappedLogDeliveryConfigurations.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patchStatus(UpdateLogDeliveryConfigurationStatusRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/log-delivery/%s",
            apiClient.configuredAccountID(), request.getLogDeliveryConfigurationId());
    apiClient.PATCH(path, request, Void.class);
  }
}
