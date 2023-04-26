// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Secrets */
class SecretsImpl implements SecretsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for SecretsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public SecretsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public void createScope(CreateScope request) {
    String path = "/api/2.0/secrets/scopes/create";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteAcl(DeleteAcl request) {
    String path = "/api/2.0/secrets/acls/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteScope(DeleteScope request) {
    String path = "/api/2.0/secrets/scopes/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void deleteSecret(DeleteSecret request) {
    String path = "/api/2.0/secrets/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public AclItem getAcl(GetAclRequest request) {
    String path = "/api/2.0/secrets/acls/get";
    return apiClient.GET(path, request, AclItem.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListAclsResponse listAcls(ListAclsRequest request) {
    String path = "/api/2.0/secrets/acls/list";
    return apiClient.GET(path, request, ListAclsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListScopesResponse listScopes() {
    String path = "/api/2.0/secrets/scopes/list";
    return apiClient.GET(path, ListScopesResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListSecretsResponse listSecrets(ListSecretsRequest request) {
    String path = "/api/2.0/secrets/list";
    return apiClient.GET(path, request, ListSecretsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void putAcl(PutAcl request) {
    String path = "/api/2.0/secrets/acls/put";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void putSecret(PutSecret request) {
    String path = "/api/2.0/secrets/put";
    apiClient.POST(path, request, Void.class);
  }
}
