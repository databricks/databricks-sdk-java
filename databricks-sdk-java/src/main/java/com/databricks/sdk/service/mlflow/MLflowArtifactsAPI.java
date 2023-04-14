// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MLflowArtifactsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(MLflowArtifactsAPI.class);

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
  public Iterable<FileInfo> list(ListArtifactsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListArtifactsResponse::getFiles,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public MLflowArtifactsService impl() {
    return impl;
  }
}
