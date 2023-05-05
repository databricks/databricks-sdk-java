// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, PrivateAccessSettings.class);
  }

  @Override
  public void delete(DeletePrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    return apiClient.GET(path, request, PrivateAccessSettings.class);
  }

  @Override
  public Collection<PrivateAccessSettings> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    return apiClient.getCollection(path, null, PrivateAccessSettings.class);
  }

  @Override
  public void replace(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());

    apiClient.PUT(path, request, Void.class);
  }
}
