// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of GitCredentials */
@Generated
class GitCredentialsImpl implements GitCredentialsService {
  private final ApiClient apiClient;

  public GitCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateCredentialsResponse create(CreateCredentialsRequest request) {
    String path = "/api/2.0/git-credentials";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateCredentialsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteCredentialsRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetCredentialsResponse get(GetCredentialsRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetCredentialsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListCredentialsResponse list() {
    String path = "/api/2.0/git-credentials";
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListCredentialsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(UpdateCredentialsRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
