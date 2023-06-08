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

  public StorageCredentialInfo create(String metastoreId) {
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
  public StorageCredentialInfo create(AccountsCreateStorageCredential request) {
    return impl.create(request);
  }

  public void delete(String metastoreId, String name) {
    delete(new DeleteAccountStorageCredentialRequest().setMetastoreId(metastoreId).setName(name));
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

  public ListStorageCredentialsResponse list(String metastoreId) {
    return list(new ListAccountStorageCredentialsRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get all storage credentials assigned to a metastore.
   *
   * <p>Gets a list of all storage credentials that have been assigned to given metastore.
   */
  public ListStorageCredentialsResponse list(ListAccountStorageCredentialsRequest request) {
    return impl.list(request);
  }

  public StorageCredentialInfo update(String metastoreId, String name) {
    return update(new AccountsUpdateStorageCredential().setMetastoreId(metastoreId).setName(name));
  }

  /**
   * Updates a storage credential.
   *
   * <p>Updates a storage credential on the metastore. The caller must be the owner of the storage
   * credential. If the caller is a metastore admin, only the __owner__ credential can be changed.
   */
  public StorageCredentialInfo update(AccountsUpdateStorageCredential request) {
    return impl.update(request);
  }

  public AccountStorageCredentialsService impl() {
    return impl;
  }
}
