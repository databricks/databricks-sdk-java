// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, ExternalLocationInfo.class);
  }

  @Override
  public void delete(DeleteExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ExternalLocationInfo get(GetExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    return apiClient.GET(path, request, ExternalLocationInfo.class);
  }

  @Override
  public ListExternalLocationsResponse list() {
    String path = "/api/2.1/unity-catalog/external-locations";
    return apiClient.GET(path, ListExternalLocationsResponse.class);
  }

  @Override
  public ExternalLocationInfo update(UpdateExternalLocation request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    return apiClient.PATCH(path, request, ExternalLocationInfo.class);
  }
}
