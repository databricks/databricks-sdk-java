// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import java.util.Collection;
import org.apache.http.client.methods.*;

/** Package-local implementation of EncryptionKeys */
class EncryptionKeysImpl implements EncryptionKeysService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for EncryptionKeysImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public EncryptionKeysImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerManagedKey create(CreateCustomerManagedKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys", apiClient.configuredAccountID());
    return apiClient.POST(path, request, CustomerManagedKey.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeleteEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    apiClient.DELETE(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public CustomerManagedKey get(GetEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    return apiClient.GET(path, request, CustomerManagedKey.class);
  }

  /** {@inheritDoc} */
  @Override
  public Collection<CustomerManagedKey> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys", apiClient.configuredAccountID());
    return apiClient.GET(path, Collection.class);
  }
}
