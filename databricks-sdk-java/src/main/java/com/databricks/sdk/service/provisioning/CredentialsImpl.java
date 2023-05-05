// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

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
    return apiClient.POST(path, request, Credential.class);
  }

  @Override
  public void delete(DeleteCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public Credential get(GetCredentialRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/credentials/%s",
            apiClient.configuredAccountID(), request.getCredentialsId());
    return apiClient.GET(path, request, Credential.class);
  }

  @Override
  public Collection<Credential> list() {
    String path =
        String.format("/api/2.0/accounts/%s/credentials", apiClient.configuredAccountID());
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, Object.class);
    try {
      return apiClient
          .getObjectMapper()
          .readValue(new Gson().toJson(apiClient.GET(path, Collection.class)), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
