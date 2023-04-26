// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of Credentials */
class CredentialsImpl implements CredentialsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for CredentialsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public CredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public Credential create(CreateCredentialRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/credentials", apiClient.configuredAccountID());
    return apiClient.POST(path, request, Credential.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Credential get(GetCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    return apiClient.GET(path, request, Credential.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<Credential> list() {
    String path =
        String.format("/api/2.0/accounts/%s/credentials", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }
}
