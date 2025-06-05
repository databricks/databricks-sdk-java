// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.Collection;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PrivateAccessSettings.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeletePrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PrivateAccessSettings get(GetPrivateAccesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PrivateAccessSettings.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Collection<PrivateAccessSettings> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings", apiClient.configuredAccountID());
    Request req = new Request("GET", path);
    req.withHeader("Accept", "application/json");
    return apiClient.getCollection(req, PrivateAccessSettings.class);
  }

  @Override
  public void replace(UpsertPrivateAccessSettingsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/private-access-settings/%s",
            apiClient.configuredAccountID(), request.getPrivateAccessSettingsId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, ReplaceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
