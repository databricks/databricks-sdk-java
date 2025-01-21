// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Secrets */
@Generated
class SecretsImpl implements SecretsService {
  private final ApiClient apiClient;

  public SecretsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void createScope(CreateScope request) {
    String path = "/api/2.0/secrets/scopes/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, CreateScopeResponse.class, headers);
  }

  @Override
  public void deleteAcl(DeleteAcl request) {
    String path = "/api/2.0/secrets/acls/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteAclResponse.class, headers);
  }

  @Override
  public void deleteScope(DeleteScope request) {
    String path = "/api/2.0/secrets/scopes/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteScopeResponse.class, headers);
  }

  @Override
  public void deleteSecret(DeleteSecret request) {
    String path = "/api/2.0/secrets/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteSecretResponse.class, headers);
  }

  @Override
  public AclItem getAcl(GetAclRequest request) {
    String path = "/api/2.0/secrets/acls/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, AclItem.class, headers);
  }

  @Override
  public GetSecretResponse getSecret(GetSecretRequest request) {
    String path = "/api/2.0/secrets/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetSecretResponse.class, headers);
  }

  @Override
  public ListAclsResponse listAcls(ListAclsRequest request) {
    String path = "/api/2.0/secrets/acls/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListAclsResponse.class, headers);
  }

  @Override
  public ListScopesResponse listScopes() {
    String path = "/api/2.0/secrets/scopes/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, ListScopesResponse.class, headers);
  }

  @Override
  public ListSecretsResponse listSecrets(ListSecretsRequest request) {
    String path = "/api/2.0/secrets/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListSecretsResponse.class, headers);
  }

  @Override
  public void putAcl(PutAcl request) {
    String path = "/api/2.0/secrets/acls/put";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, PutAclResponse.class, headers);
  }

  @Override
  public void putSecret(PutSecret request) {
    String path = "/api/2.0/secrets/put";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, PutSecretResponse.class, headers);
  }
}
