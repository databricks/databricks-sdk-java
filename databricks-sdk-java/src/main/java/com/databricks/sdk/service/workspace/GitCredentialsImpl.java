// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of GitCredentials */
@Generated
class GitCredentialsImpl implements GitCredentialsService {
  private final ApiClient apiClient;

  public GitCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateCredentialsResponse create(CreateCredentials request) {
    String path = "/api/2.0/git-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, CreateCredentialsResponse.class, headers);
  }

  @Override
  public void delete(DeleteGitCredentialRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    Map<String, String> headers = new HashMap<>();

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public CredentialInfo get(GetGitCredentialRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, CredentialInfo.class, headers);
  }

  @Override
  public GetCredentialsResponse list() {
    String path = "/api/2.0/git-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, GetCredentialsResponse.class, headers);
  }

  @Override
  public void update(UpdateCredentials request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.PATCH(path, request, Void.class, headers);
  }
}
