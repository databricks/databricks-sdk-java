// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
 * account is required to store objects like cluster logs, notebook revisions, and job results. You
 * can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
 * configuration encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class StorageAPI {
  private static final Logger LOG = LoggerFactory.getLogger(StorageAPI.class);

  private final StorageService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public StorageAPI(ApiClient apiClient) {
    impl = new StorageImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.provisioning.StorageService} object
   */
  public StorageAPI(StorageService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param storageConfigurationName a {@link java.lang.String} object
   * @param rootBucketInfo a {@link com.databricks.sdk.service.provisioning.RootBucketInfo} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration create(
      String storageConfigurationName, RootBucketInfo rootBucketInfo) {
    return create(
        new CreateStorageConfigurationRequest()
            .setStorageConfigurationName(storageConfigurationName)
            .setRootBucketInfo(rootBucketInfo));
  }

  /**
   * Create new storage configuration.
   *
   * <p>Creates new storage configuration for an account, specified by ID. Uploads a storage
   * configuration object that represents the root AWS S3 bucket in your account. Databricks stores
   * related workspace assets including DBFS, cluster logs, and job results. For the AWS S3 bucket,
   * you need to configure the required bucket policy.
   *
   * <p>For information about how to create a new workspace with this API, see [Create a new
   * workspace using the Account API]
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.CreateStorageConfigurationRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   */
  public void delete(String storageConfigurationId) {
    delete(new DeleteStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /**
   * Delete storage configuration.
   *
   * <p>Deletes a Databricks storage configuration. You cannot delete a storage configuration that
   * is associated with any workspace.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.DeleteStorageRequest} object
   */
  public void delete(DeleteStorageRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param storageConfigurationId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration get(String storageConfigurationId) {
    return get(new GetStorageRequest().setStorageConfigurationId(storageConfigurationId));
  }

  /**
   * Get storage configuration.
   *
   * <p>Gets a Databricks storage configuration for an account, both specified by ID.
   *
   * @param request a {@link com.databricks.sdk.service.provisioning.GetStorageRequest} object
   * @return a {@link com.databricks.sdk.service.provisioning.StorageConfiguration} object
   */
  public StorageConfiguration get(GetStorageRequest request) {
    return impl.get(request);
  }

  /**
   * Get all storage configurations.
   *
   * <p>Gets a list of all Databricks storage configurations for your account, specified by ID.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<StorageConfiguration> list() {
    return impl.list();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.StorageService} object
   */
  public StorageService impl() {
    return impl;
  }
}
