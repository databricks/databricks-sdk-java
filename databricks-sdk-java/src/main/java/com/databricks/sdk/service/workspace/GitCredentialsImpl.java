// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of GitCredentials */
class GitCredentialsImpl implements GitCredentialsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for GitCredentialsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GitCredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreateCredentialsResponse create(CreateCredentials request) {
    String path = "/api/2.0/git-credentials";
    return apiClient.POST(path, request, CreateCredentialsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteGitCredentialRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public CredentialInfo get(GetGitCredentialRequest request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    return apiClient.GET(path, request, CredentialInfo.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetCredentialsResponse list() {
    String path = "/api/2.0/git-credentials";
    return apiClient.GET(path, GetCredentialsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(UpdateCredentials request) {
    String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
    apiClient.PATCH(path, request, Void.class);
  }
}
