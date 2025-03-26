// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServicePrincipal get(GetAccountServicePrincipalRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ServicePrincipal.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListServicePrincipalResponse list(ListAccountServicePrincipalsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListServicePrincipalResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void patch(PartialUpdate request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, PatchResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(ServicePrincipal request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/scim/v2/ServicePrincipals/%s",
            apiClient.configuredAccountID(), request.getId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, UpdateResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
