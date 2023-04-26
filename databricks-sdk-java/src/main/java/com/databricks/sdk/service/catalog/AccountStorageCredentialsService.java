// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import java.util.Collection;

/**
 * These APIs manage storage credentials for a particular metastore.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
   *
   * @param createStorageCredential a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  StorageCredentialInfo create(CreateStorageCredential createStorageCredential);

  /**
   * Gets the named storage credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have a level of privilege on the storage credential.
   *
   * @param getAccountStorageCredentialRequest a {@link com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  StorageCredentialInfo get(GetAccountStorageCredentialRequest getAccountStorageCredentialRequest);

  /**
   * Get all storage credentials assigned to a metastore.
   *
   * <p>Gets a list of all storage credentials that have been assigned to given metastore.
   *
   * @param listAccountStorageCredentialsRequest a {@link com.databricks.sdk.service.catalog.ListAccountStorageCredentialsRequest} object
   * @return a {@link java.util.Collection} object
   */
  Collection<StorageCredentialInfo> list(
      ListAccountStorageCredentialsRequest listAccountStorageCredentialsRequest);
}
