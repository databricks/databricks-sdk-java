// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of EncryptionKeys */
class EncryptionKeysImpl implements EncryptionKeysService {
  private final ApiClient apiClient;

  public EncryptionKeysImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CustomerManagedKey create(CreateCustomerManagedKeyRequest request) {
    String path = String.format("/api/2.0/accounts//customer-managed-keys");
    return apiClient.POST(path, request, CustomerManagedKey.class);
  }

  @Override
  public void delete(DeleteEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts//customer-managed-keys/%s", request.getCustomerManagedKeyId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public CustomerManagedKey get(GetEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts//customer-managed-keys/%s", request.getCustomerManagedKeyId());
    return apiClient.GET(path, request, CustomerManagedKey.class);
  }

  @Override
  public Collection<CustomerManagedKey> list() {
    String path = String.format("/api/2.0/accounts//customer-managed-keys");
    return apiClient.GET(path, Collection.class);
  }
}
