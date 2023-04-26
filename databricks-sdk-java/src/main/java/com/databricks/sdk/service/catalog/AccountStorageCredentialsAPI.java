// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage storage credentials for a particular metastore.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AccountStorageCredentialsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AccountStorageCredentialsAPI.class);

  private final AccountStorageCredentialsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public AccountStorageCredentialsAPI(ApiClient apiClient) {
    impl = new AccountStorageCredentialsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.catalog.AccountStorageCredentialsService} object
   */
  public AccountStorageCredentialsAPI(AccountStorageCredentialsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.catalog.CreateStorageCredential} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo create(CreateStorageCredential request) {
    return impl.create(request);
  }

  /**
   * <p>get.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo get(String metastoreId, String name) {
    return get(new GetAccountStorageCredentialRequest().setMetastoreId(metastoreId).setName(name));
  }

  /**
   * Gets the named storage credential.
   *
   * <p>Gets a storage credential from the metastore. The caller must be a metastore admin, the
   * owner of the storage credential, or have a level of privilege on the storage credential.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.GetAccountStorageCredentialRequest} object
   * @return a {@link com.databricks.sdk.service.catalog.StorageCredentialInfo} object
   */
  public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
    return impl.get(request);
  }

  /**
   * <p>list.</p>
   *
   * @param metastoreId a {@link java.lang.String} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<StorageCredentialInfo> list(String metastoreId) {
    return list(new ListAccountStorageCredentialsRequest().setMetastoreId(metastoreId));
  }

  /**
   * Get all storage credentials assigned to a metastore.
   *
   * <p>Gets a list of all storage credentials that have been assigned to given metastore.
   *
   * @param request a {@link com.databricks.sdk.service.catalog.ListAccountStorageCredentialsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
    return impl.list(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.AccountStorageCredentialsService} object
   */
  public AccountStorageCredentialsService impl() {
    return impl;
  }
}
