// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ExternalLocations */
class ExternalLocationsImpl implements ExternalLocationsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for ExternalLocationsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ExternalLocationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ExternalLocationInfo create(CreateExternalLocation request) {
    String path = "/api/2.1/unity-catalog/external-locations";
    return apiClient.POST(path, request, ExternalLocationInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ExternalLocationInfo get(GetExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    return apiClient.GET(path, request, ExternalLocationInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListExternalLocationsResponse list() {
    String path = "/api/2.1/unity-catalog/external-locations";
    return apiClient.GET(path, ListExternalLocationsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ExternalLocationInfo update(UpdateExternalLocation request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    return apiClient.PATCH(path, request, ExternalLocationInfo.class);
  }
}
