// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage storage credentials for a particular metastore.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AccountStorageCredentialsService {
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
  AccountsStorageCredentialInfo create(
      AccountsCreateStorageCredential accountsCreateStorageCredential);

  /**
   * Delete a storage credential.
   *
   * <p>Deletes a storage credential from the metastore. The caller must be an owner of the storage
   * credential.
   */
  void delete(DeleteAccountStorageCredentialRequest deleteAccountStorageCredentialRequest);

  /**
   * Gets the named storage credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have a level of privilege on the storage credential.
   */
  AccountsStorageCredentialInfo get(
      GetAccountStorageCredentialRequest getAccountStorageCredentialRequest);

  /**
   * Get all storage credentials assigned to a metastore.
   *
   * <p>Gets a list of all storage credentials that have been assigned to given metastore.
   */
  Collection<StorageCredentialInfo> list(
      ListAccountStorageCredentialsRequest listAccountStorageCredentialsRequest);

  /**
   * Updates a storage credential.
   *
   * <p>Updates a storage credential on the metastore. The caller must be the owner of the storage
   * credential. If the caller is a metastore admin, only the __owner__ credential can be changed.
   */
  AccountsStorageCredentialInfo update(
      AccountsUpdateStorageCredential accountsUpdateStorageCredential);
}
