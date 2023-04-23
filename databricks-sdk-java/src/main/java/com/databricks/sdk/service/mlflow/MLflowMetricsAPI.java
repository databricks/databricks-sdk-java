// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MLflowMetricsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MLflowMetricsAPI.class);

  private final MLflowMetricsService impl;

  /** Regular-use constructor */
  public MLflowMetricsAPI(ApiClient apiClient) {
    impl = new MLflowMetricsImpl(apiClient);
  }

  /** Constructor for mocks */
  public MLflowMetricsAPI(MLflowMetricsService mock) {
    impl = mock;
  }

  public GetMetricHistoryResponse getHistory(String metricKey) {
    return getHistory(new GetHistoryRequest().setMetricKey(metricKey));
  }

  /**
   * Get history of a given metric within a run.
   *
   * <p>Gets a list of all values for the specified metric for a given run.
   */
  public GetMetricHistoryResponse getHistory(GetHistoryRequest request) {
    return impl.getHistory(request);
  }

  public MLflowMetricsService impl() {
    return impl;
  }
}
