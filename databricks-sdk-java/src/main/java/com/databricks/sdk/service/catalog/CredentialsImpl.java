// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
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
  public CredentialInfo createCredential(CreateCredentialRequest request) {
    String path = "/api/2.1/unity-catalog/credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CredentialInfo.class, headers);
  }

  @Override
  public void deleteCredential(DeleteCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/credentials/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteCredentialResponse.class, headers);
  }

  @Override
  public TemporaryCredentials generateTemporaryServiceCredential(
      GenerateTemporaryServiceCredentialRequest request) {
    String path = "/api/2.1/unity-catalog/temporary-service-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, TemporaryCredentials.class, headers);
  }

  @Override
  public CredentialInfo getCredential(GetCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/credentials/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, CredentialInfo.class, headers);
  }

  @Override
  public ListCredentialsResponse listCredentials(ListCredentialsRequest request) {
    String path = "/api/2.1/unity-catalog/credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListCredentialsResponse.class, headers);
  }

  @Override
  public CredentialInfo updateCredential(UpdateCredentialRequest request) {
    String path = String.format("/api/2.1/unity-catalog/credentials/%s", request.getNameArg());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, CredentialInfo.class, headers);
  }

  @Override
  public ValidateCredentialResponse validateCredential(ValidateCredentialRequest request) {
    String path = "/api/2.1/unity-catalog/validate-credentials";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ValidateCredentialResponse.class, headers);
  }
}
