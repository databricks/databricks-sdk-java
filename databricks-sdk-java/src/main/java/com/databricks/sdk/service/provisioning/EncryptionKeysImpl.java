// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.Collection;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CustomerManagedKey.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomerManagedKey delete(DeleteEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CustomerManagedKey.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomerManagedKey get(GetEncryptionKeyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys/%s",
            apiClient.configuredAccountID(), request.getCustomerManagedKeyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CustomerManagedKey.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Collection<CustomerManagedKey> list() {
    String path =
        String.format(
            "/api/2.0/accounts/%s/customer-managed-keys", apiClient.configuredAccountID());
    Request req = new Request("GET", path);
    req.withHeader("Accept", "application/json");
    return apiClient.getCollection(req, CustomerManagedKey.class);
  }
}
