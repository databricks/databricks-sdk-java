// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import com.databricks.sdk.client.ApiClient;
import java.util.List;
import org.apache.http.client.methods.*;

/**
 * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
 * account is required to store objects like cluster logs, notebook revisions, and job results. You
 * can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
 * configuration encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 */
public class StorageAPI {
  private final StorageService impl;

  /** Regular-use constructor */
  public StorageAPI(ApiClient apiClient) {
    impl = new StorageImpl(apiClient);
  }

  /** Constructor for mocks */
  public StorageAPI(StorageService mock) {
    impl = mock;
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
   */
  public StorageConfiguration create(CreateStorageConfigurationRequest request) {
    return impl.create(request);
  }

  /**
   * Delete storage configuration.
   *
   * <p>Deletes a Databricks storage configuration. You cannot delete a storage configuration that
   * is associated with any workspace.
   */
  public void delete(DeleteStorageRequest request) {
    impl.delete(request);
  }

  /**
   * Get storage configuration.
   *
   * <p>Gets a Databricks storage configuration for an account, both specified by ID.
   */
  public StorageConfiguration get(GetStorageRequest request) {
    return impl.get(request);
  }

  /**
   * Get all storage configurations.
   *
   * <p>Gets a list of all Databricks storage configurations for your account, specified by ID.
   */
  public List<StorageConfiguration> list() {
    return impl.list();
  }

  public StorageService impl() {
    return impl;
  }
}
