// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.secrets;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Secrets */
class SecretsImpl implements SecretsService {
  private final ApiClient apiClient;

  public SecretsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void createScope(CreateScope request) {
    String path = "/api/2.0/secrets/scopes/create";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void deleteAcl(DeleteAcl request) {
    String path = "/api/2.0/secrets/acls/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void deleteScope(DeleteScope request) {
    String path = "/api/2.0/secrets/scopes/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void deleteSecret(DeleteSecret request) {
    String path = "/api/2.0/secrets/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public AclItem getAcl(GetAcl request) {
    String path = "/api/2.0/secrets/acls/get";
    return apiClient.GET(path, request, AclItem.class);
  }

  @Override
  public ListAclsResponse listAcls(ListAcls request) {
    String path = "/api/2.0/secrets/acls/list";
    return apiClient.GET(path, request, ListAclsResponse.class);
  }

  @Override
  public ListScopesResponse listScopes() {
    String path = "/api/2.0/secrets/scopes/list";
    return apiClient.GET(path, ListScopesResponse.class);
  }

  @Override
  public ListSecretsResponse listSecrets(ListSecrets request) {
    String path = "/api/2.0/secrets/list";
    return apiClient.GET(path, request, ListSecretsResponse.class);
  }

  @Override
  public void putAcl(PutAcl request) {
    String path = "/api/2.0/secrets/acls/put";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void putSecret(PutSecret request) {
    String path = "/api/2.0/secrets/put";
    apiClient.POST(path, request, Void.class);
  }
}
