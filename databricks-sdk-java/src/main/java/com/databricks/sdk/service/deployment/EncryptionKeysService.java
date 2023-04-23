// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.util.Collection;

/**
 * These APIs manage encryption key configurations for this workspace (optional). A key
 * configuration encapsulates the AWS KMS key information and some information about how the key
 * configuration can be used. There are two possible uses for key configurations:
 *
 * <p>* Managed services: A key configuration can be used to encrypt a workspace's notebook and
 * secret data in the control plane, as well as Databricks SQL queries and query history. * Storage:
 * A key configuration can be used to encrypt a workspace's DBFS and EBS data in the data plane.
 *
 * <p>In both of these cases, the key configuration's ID is used when creating a new workspace. This
 * Preview feature is available if your account is on the E2 version of the platform. Updating a
 * running workspace with workspace storage encryption requires that the workspace is on the E2
 * version of the platform. If you have an older workspace, it might not be on the E2 version of the
 * platform. If you are not sure, contact your Databricks representative.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface EncryptionKeysService {
  /**
   * Create encryption key configuration.
   *
   * <p>Creates a customer-managed key configuration object for an account, specified by ID. This
   * operation uploads a reference to a customer-managed key to Databricks. If the key is assigned
   * as a workspace's customer-managed key for managed services, Databricks uses the key to encrypt
   * the workspaces notebooks and secrets in the control plane, in addition to Databricks SQL
   * queries and query history. If it is specified as a workspace's customer-managed key for
   * workspace storage, the key encrypts the workspace's root S3 bucket (which contains the
   * workspace's root DBFS and system data) and, optionally, cluster EBS volume data.
   *
   * <p>**Important**: Customer-managed keys are supported only for some deployment types,
   * subscription types, and AWS regions.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   */
  CustomerManagedKey create(CreateCustomerManagedKeyRequest createCustomerManagedKeyRequest);

  /**
   * Delete encryption key configuration.
   *
   * <p>Deletes a customer-managed key configuration object for an account. You cannot delete a
   * configuration that is associated with a running workspace.
   */
  void delete(DeleteEncryptionKeyRequest deleteEncryptionKeyRequest);

  /**
   * Get encryption key configuration.
   *
   * <p>Gets a customer-managed key configuration object for an account, specified by ID. This
   * operation uploads a reference to a customer-managed key to Databricks. If assigned as a
   * workspace's customer-managed key for managed services, Databricks uses the key to encrypt the
   * workspaces notebooks and secrets in the control plane, in addition to Databricks SQL queries
   * and query history. If it is specified as a workspace's customer-managed key for storage, the
   * key encrypts the workspace's root S3 bucket (which contains the workspace's root DBFS and
   * system data) and, optionally, cluster EBS volume data.
   *
   * <p>**Important**: Customer-managed keys are supported only for some deployment types,
   * subscription types, and AWS regions.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  CustomerManagedKey get(GetEncryptionKeyRequest getEncryptionKeyRequest);

  /**
   * Get all encryption key configurations.
   *
   * <p>Gets all customer-managed key configuration objects for an account. If the key is specified
   * as a workspace's managed services customer-managed key, Databricks uses the key to encrypt the
   * workspace's notebooks and secrets in the control plane, in addition to Databricks SQL queries
   * and query history. If the key is specified as a workspace's storage customer-managed key, the
   * key is used to encrypt the workspace's root S3 bucket and optionally can encrypt cluster EBS
   * volumes data in the data plane.
   *
   * <p>**Important**: Customer-managed keys are supported only for some deployment types,
   * subscription types, and AWS regions.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform.
   */
  Collection<CustomerManagedKey> list();
}
