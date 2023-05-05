// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of EncryptionKeys */
@Generated
class EncryptionKeysImpl implements EncryptionKeysService {
  private final ApiClient apiClient;

  public EncryptionKeysImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CustomerManagedKey create(CreateCustomerManagedKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys", apiClient.configuredAccountID());
    return apiClient.POST(path, request, CustomerManagedKey.class);
  }

  @Override
  public void delete(DeleteEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public CustomerManagedKey get(GetEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    return apiClient.GET(path, request, CustomerManagedKey.class);
  }

  @Override
  public Collection<CustomerManagedKey> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys", apiClient.configuredAccountID());
    JavaType tpe =
        apiClient
            .getObjectMapper()
            .getTypeFactory()
            .constructCollectionType(Collection.class, CustomerManagedKey.class);
    try {
      return apiClient.getObjectMapper().readValue(apiClient.GET(path, Collection.class), tpe);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
