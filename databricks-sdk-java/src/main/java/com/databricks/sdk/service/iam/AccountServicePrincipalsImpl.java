// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of AccountServicePrincipals */
class AccountServicePrincipalsImpl implements AccountServicePrincipalsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for AccountServicePrincipalsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountServicePrincipalsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ServicePrincipal create(ServicePrincipal request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    return apiClient.POST(path, request, ServicePrincipal.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public ServicePrincipal get(GetAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    return apiClient.GET(path, request, ServicePrincipal.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListServicePrincipalResponse list(ListAccountServicePrincipalsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    return apiClient.GET(path, request, ListServicePrincipalResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PATCH(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(ServicePrincipal request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    apiClient.PUT(path, request, Void.class);
  }
}
