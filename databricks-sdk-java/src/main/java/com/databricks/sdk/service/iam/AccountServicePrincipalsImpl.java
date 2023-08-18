// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountServicePrincipals */
@Generated
class AccountServicePrincipalsImpl implements AccountServicePrincipalsService {
  private final ApiClient apiClient;

  public AccountServicePrincipalsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ServicePrincipal create(ServicePrincipal request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ServicePrincipal.class, headers);
  }

  @Override
  public void delete(DeleteAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public ServicePrincipal get(GetAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ServicePrincipal.class, headers);
  }

  @Override
  public ListServicePrincipalResponse list(ListAccountServicePrincipalsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListServicePrincipalResponse.class, headers);
  }

  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PATCH(path, request, Void.class, headers);
  }

  @Override
  public void update(ServicePrincipal request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, Void.class, headers);
  }
}
