// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage storage configurations for this workspace. A root storage S3 bucket in your
 * account is required to store objects like cluster logs, notebook revisions, and job results. You
 * can also use the root storage S3 bucket for storage of non-production DBFS data. A storage
 * configuration encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface StorageService {
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
  StorageConfiguration create(CreateStorageConfigurationRequest createStorageConfigurationRequest);

  /**
   * Delete storage configuration.
   *
   * <p>Deletes a Databricks storage configuration. You cannot delete a storage configuration that
   * is associated with any workspace.
   */
  void delete(DeleteStorageRequest deleteStorageRequest);

  /**
   * Get storage configuration.
   *
   * <p>Gets a Databricks storage configuration for an account, both specified by ID.
   */
  StorageConfiguration get(GetStorageRequest getStorageRequest);

  /**
   * Get all storage configurations.
   *
   * <p>Gets a list of all Databricks storage configurations for your account, specified by ID.
   */
  Collection<StorageConfiguration> list();
}
