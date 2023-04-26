// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Functions */
class FunctionsImpl implements FunctionsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for FunctionsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public FunctionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public FunctionInfo create(CreateFunction request) {
    String path = "/api/2.1/unity-catalog/functions";
    return apiClient.POST(path, request, FunctionInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteFunctionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public FunctionInfo get(GetFunctionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    return apiClient.GET(path, request, FunctionInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListFunctionsResponse list(ListFunctionsRequest request) {
    String path = "/api/2.1/unity-catalog/functions";
    return apiClient.GET(path, request, ListFunctionsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public FunctionInfo update(UpdateFunction request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    return apiClient.PATCH(path, request, FunctionInfo.class);
  }
}
