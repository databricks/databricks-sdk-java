// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ConsumerInstallations */
@Generated
class ConsumerInstallationsImpl implements ConsumerInstallationsService {
  private final ApiClient apiClient;

  public ConsumerInstallationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Installation create(CreateInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations", request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, Installation.class, headers);
  }

  @Override
  public void delete(DeleteInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations/%s",
            request.getListingId(), request.getInstallationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteInstallationResponse.class, headers);
  }

  @Override
  public ListAllInstallationsResponse list(ListAllInstallationsRequest request) {
    String path = "/api/2.1/marketplace-consumer/installations";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListAllInstallationsResponse.class, headers);
  }

  @Override
  public ListInstallationsResponse listListingInstallations(ListInstallationsRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations", request.getListingId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListInstallationsResponse.class, headers);
  }

  @Override
  public UpdateInstallationResponse update(UpdateInstallationRequest request) {
    String path =
        String.format(
            "/api/2.1/marketplace-consumer/listings/%s/installations/%s",
            request.getListingId(), request.getInstallationId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, UpdateInstallationResponse.class, headers);
  }
}
