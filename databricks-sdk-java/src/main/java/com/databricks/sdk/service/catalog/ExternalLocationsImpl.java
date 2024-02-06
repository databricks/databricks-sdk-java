// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ExternalLocations */
@Generated
class ExternalLocationsImpl implements ExternalLocationsService {
  private final ApiClient apiClient;

  public ExternalLocationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ExternalLocationInfo create(CreateExternalLocation request) {
    String path = "/api/2.1/unity-catalog/external-locations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ExternalLocationInfo.class, headers);
  }

  @Override
  public void delete(DeleteExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, null, Void.class, headers);
  }

  @Override
  public ExternalLocationInfo get(GetExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ExternalLocationInfo.class, headers);
  }

  @Override
  public ListExternalLocationsResponse list(ListExternalLocationsRequest request) {
    String path = "/api/2.1/unity-catalog/external-locations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, ListExternalLocationsResponse.class, headers);
  }

  @Override
  public ExternalLocationInfo update(UpdateExternalLocation request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ExternalLocationInfo.class, headers);
  }
}
