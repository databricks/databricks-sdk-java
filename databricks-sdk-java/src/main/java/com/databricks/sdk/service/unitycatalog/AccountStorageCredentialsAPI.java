// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** These APIs manage storage credentials for a particular metastore. */
public class AccountStorageCredentialsAPI {
  private final AccountStorageCredentialsService impl;

  /** Regular-use constructor */
  public AccountStorageCredentialsAPI(ApiClient apiClient) {
    impl = new AccountStorageCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountStorageCredentialsAPI(AccountStorageCredentialsService mock) {
    impl = mock;
  }

  public StorageCredentialInfo create(String name, String metastoreId) {
    return create(new CreateStorageCredential().setName(name).setMetastoreId(metastoreId));
  }

  /**
   * Create a storage credential.
   *
   * <p>Creates a new storage credential. The request object is specific to the cloud:
   *
   * <p>* **AwsIamRole** for AWS credentials * **AzureServicePrincipal** for Azure credentials *
   * **GcpServiceAcountKey** for GCP credentials.
   *
   * <p>The caller must be a metastore admin and have the **CREATE_STORAGE_CREDENTIAL** privilege on
   * the metastore.
   */
  public StorageCredentialInfo create(CreateStorageCredential request) {
    return impl.create(request);
  }

  public StorageCredentialInfo get(String metastoreId, String name) {
    return get(new GetAccountStorageCredentialRequest().setMetastoreId(metastoreId).setName(name));
  }

  /**
   * Gets the named storage credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have a level of privilege on the storage credential.
   */
  public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    return impl.get(request);
  }

  public Iterable<StorageCredentialInfo> list(String metastoreId) {
    return list(new ListAccountStorageCredentialsRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get all storage credentials assigned to a metastore.
   *
   * <p>Gets a list of all storage credentials that have been assigned to given metastore.
   */
  public Iterable<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
    return impl.list(request);
  }

  public AccountStorageCredentialsService impl() {
    return impl;
  }
}
