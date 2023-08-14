// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Credentials */
@Generated
class CredentialsImpl implements CredentialsService {
  private final ApiClient apiClient;

  public CredentialsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Credential create(CreateCredentialRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/credentials", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.POST(path, request, Credential.class, headers);
  }

  @Override
  public void delete(DeleteCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public Credential get(GetCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, Credential.class, headers);
  }

  @Override
  public Collection<Credential> list() {
    String path =
        String.format("/api/2.0/accounts/%s/credentials", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.getCollection(path, null, Credential.class, headers);
  }
}
