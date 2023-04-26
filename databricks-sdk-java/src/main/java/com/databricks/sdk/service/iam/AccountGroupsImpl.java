// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountGroups */
class AccountGroupsImpl implements AccountGroupsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for AccountGroupsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountGroupsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Group create(Group request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    return apiClient.POST(path, request, Group.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Group get(GetAccountGroupRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    return apiClient.GET(path, request, Group.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListGroupsResponse list(ListAccountGroupsRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/scim/v2/Groups", apiClient.configuredAccountID());
    return apiClient.GET(path, request, ListGroupsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(Group request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/Groups/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
