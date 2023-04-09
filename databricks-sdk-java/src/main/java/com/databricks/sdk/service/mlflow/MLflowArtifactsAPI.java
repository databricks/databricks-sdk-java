// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

public class MLflowArtifactsAPI {
  private final MLflowArtifactsService impl;

  /** Regular-use constructor */
  public MLflowArtifactsAPI(ApiClient apiClient) {
    impl = new MLflowArtifactsImpl(apiClient);
  }

  /** Constructor for mocks */
  public MLflowArtifactsAPI(MLflowArtifactsService mock) {
    impl = mock;
  }

  /**
   * Get all artifacts.
   *
   * <p>List artifacts for a run. Takes an optional `artifact_path` prefix. If it is specified, the
   * response contains only artifacts with the specified prefix.",
   */
  public ListArtifactsResponse list(ListArtifactsRequest request) {
    return impl.list(request);
  }

  public MLflowArtifactsService impl() {
    return impl;
  }
}
