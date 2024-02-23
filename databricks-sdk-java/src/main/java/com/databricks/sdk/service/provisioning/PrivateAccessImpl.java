// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of PrivateAccess */
@Generated
class PrivateAccessImpl implements PrivateAccessService {
  private final ApiClient apiClient;

  public PrivateAccessImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public PrivateAccessSettings create(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, PrivateAccessSettings.class, headers);
  }

  @Override
  public void delete(DeletePrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, PrivateAccessSettings.class, headers);
  }

  @Override
  public Collection<PrivateAccessSettings> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.getCollection(path, null, PrivateAccessSettings.class, headers);
  }

  @Override
  public void replace(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, ReplaceResponse.class, headers);
  }
}
