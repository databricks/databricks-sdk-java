// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Functions */
@Generated
class FunctionsImpl implements FunctionsService {
  private final ApiClient apiClient;

  public FunctionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FunctionInfo create(CreateFunctionRequest request) {
    String path = "/api/2.1/unity-catalog/functions";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, FunctionInfo.class, headers);
  }

  @Override
  public void delete(DeleteFunctionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public FunctionInfo get(GetFunctionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, FunctionInfo.class, headers);
  }

  @Override
  public ListFunctionsResponse list(ListFunctionsRequest request) {
    String path = "/api/2.1/unity-catalog/functions";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListFunctionsResponse.class, headers);
  }

  @Override
  public FunctionInfo update(UpdateFunction request) {
    String path = String.format("/api/2.1/unity-catalog/functions/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, FunctionInfo.class, headers);
  }
}
