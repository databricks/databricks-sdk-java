// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** These APIs manage storage credentials for a particular metastore. */
@Generated
public class AccountStorageCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountStorageCredentialsAPI.class);

  private final AccountStorageCredentialsService impl;

  /** Regular-use constructor */
  public AccountStorageCredentialsAPI(ApiClient apiClient) {
    impl = new AccountStorageCredentialsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AccountStorageCredentialsAPI(AccountStorageCredentialsService mock) {
    impl = mock;
  }

  public AccountsStorageCredentialInfo create(String metastoreId) {
    return create(new AccountsCreateStorageCredential().setMetastoreId(metastoreId));
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
  public AccountsStorageCredentialInfo create(AccountsCreateStorageCredential request) {
    return impl.create(request);
  }

  public void delete(String metastoreId, String storageCredentialName) {
    delete(
        new DeleteAccountStorageCredentialRequest()
            .setMetastoreId(metastoreId)
            .setStorageCredentialName(storageCredentialName));
  }

  /**
   * Delete a storage credential.
   *
   * <p>Deletes a storage credential from the metastore. The caller must be an owner of the storage
   * credential.
   */
  public void delete(DeleteAccountStorageCredentialRequest request) {
    impl.delete(request);
  }

  public AccountsStorageCredentialInfo get(String metastoreId, String storageCredentialName) {
    return get(
        new GetAccountStorageCredentialRequest()
            .setMetastoreId(metastoreId)
            .setStorageCredentialName(storageCredentialName));
  }

  /**
   * Gets the named storage credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have a level of privilege on the storage credential.
   */
  public AccountsStorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
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

  public AccountsStorageCredentialInfo update(String metastoreId, String storageCredentialName) {
    return update(
        new AccountsUpdateStorageCredential()
            .setMetastoreId(metastoreId)
            .setStorageCredentialName(storageCredentialName));
  }

  /**
   * Updates a storage credential.
   *
   * <p>Updates a storage credential on the metastore. The caller must be the owner of the storage
   * credential. If the caller is a metastore admin, only the __owner__ credential can be changed.
   */
  public AccountsStorageCredentialInfo update(AccountsUpdateStorageCredential request) {
    return impl.update(request);
  }

  public AccountStorageCredentialsService impl() {
    return impl;
  }
}
