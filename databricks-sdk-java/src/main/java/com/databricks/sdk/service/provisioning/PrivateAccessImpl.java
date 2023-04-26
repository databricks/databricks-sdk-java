// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of PrivateAccess */
class PrivateAccessImpl implements PrivateAccessService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for PrivateAccessImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PrivateAccessImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public PrivateAccessSettings create(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    return apiClient.POST(path, request, PrivateAccessSettings.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeletePrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    return apiClient.GET(path, request, PrivateAccessSettings.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<PrivateAccessSettings> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }

  /** {@inheritDoc} */
  @Override
  public void replace(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    apiClient.PUT(path, request, Void.class);
  }
}
