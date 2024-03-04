// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import java.util.Collection;

/**
 * These APIs manage workspaces for this account. A Databricks workspace is an environment for
 * accessing all of your Databricks assets. The workspace organizes objects (notebooks, libraries,
 * and experiments) into folders, and provides access to data and computational resources such as
 * clusters and jobs.
 *
 * <p>These endpoints are available if your account is on the E2 version of the platform or on a
 * select custom plan that allows multiple workspaces per account.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface WorkspacesService {
  /**
   * Create a new workspace.
   *
   * <p>Creates a new workspace.
   *
   * <p>**Important**: This operation is asynchronous. A response with HTTP status code 200 means
   * the request has been accepted and is in progress, but does not mean that the workspace deployed
   * successfully and is running. The initial workspace status is typically `PROVISIONING`. Use the
   * workspace ID (`workspace_id`) field in the response to identify the new workspace and make
   * repeated `GET` requests with the workspace ID and check its status. The workspace becomes
   * available when the status changes to `RUNNING`.
   */
  Workspace create(CreateWorkspaceRequest createWorkspaceRequest);

  /**
   * Delete a workspace.
   *
   * <p>Terminates and deletes a Databricks workspace. From an API perspective, deletion is
   * immediate. However, it might take a few minutes for all workspaces resources to be deleted,
   * depending on the size and number of workspace resources.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   */
  void delete(DeleteWorkspaceRequest deleteWorkspaceRequest);

  /**
   * Get a workspace.
   *
   * <p>Gets information including status for a Databricks workspace, specified by ID. In the
   * response, the `workspace_status` field indicates the current status. After initial workspace
   * creation (which is asynchronous), make repeated `GET` requests with the workspace ID and check
   * its status. The workspace becomes available when the status changes to `RUNNING`.
   *
   * <p>For information about how to create a new workspace with this API **including error
   * handling**, see [Create a new workspace using the Account API].
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  Workspace get(GetWorkspaceRequest getWorkspaceRequest);

  /**
   * Get all workspaces.
   *
   * <p>Gets a list of all workspaces associated with an account, specified by ID.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   */
  Collection<Workspace> list();

  /**
   * Update workspace configuration.
   *
   * <p>Updates a workspace configuration for either a running workspace or a failed workspace. The
   * elements that can be updated varies between these two use cases.
   *
   * <p>### Update a failed workspace You can update a Databricks workspace configuration for failed
   * workspace deployment for some fields, but not all fields. For a failed workspace, this request
   * supports updates to the following fields only: - Credential configuration ID - Storage
   * configuration ID - Network configuration ID. Used only to add or change a network configuration
   * for a customer-managed VPC. For a failed workspace only, you can convert a workspace with
   * Databricks-managed VPC to use a customer-managed VPC by adding this ID. You cannot downgrade a
   * workspace with a customer-managed VPC to be a Databricks-managed VPC. You can update the
   * network configuration for a failed or running workspace to add PrivateLink support, though you
   * must also add a private access settings object. - Key configuration ID for managed services
   * (control plane storage, such as notebook source and Databricks SQL queries). Used only if you
   * use customer-managed keys for managed services. - Key configuration ID for workspace storage
   * (root S3 bucket and, optionally, EBS volumes). Used only if you use customer-managed keys for
   * workspace storage. **Important**: If the workspace was ever in the running state, even if
   * briefly before becoming a failed workspace, you cannot add a new key configuration ID for
   * workspace storage. - Private access settings ID to add PrivateLink support. You can add or
   * update the private access settings ID to upgrade a workspace to add support for front-end,
   * back-end, or both types of connectivity. You cannot remove (downgrade) any existing front-end
   * or back-end PrivateLink support on a workspace. - Custom tags. Given you provide an empty
   * custom tags, the update would not be applied. - Network connectivity configuration ID to add
   * serverless stable IP support. You can add or update the network connectivity configuration ID
   * to ensure the workspace uses the same set of stable IP CIDR blocks to access your resources.
   * You cannot remove a network connectivity configuration from the workspace once attached, you
   * can only switch to another one.
   *
   * <p>After calling the `PATCH` operation to update the workspace configuration, make repeated
   * `GET` requests with the workspace ID and check the workspace status. The workspace is
   * successful if the status changes to `RUNNING`.
   *
   * <p>For information about how to create a new workspace with this API **including error
   * handling**, see [Create a new workspace using the Account API].
   *
   * <p>### Update a running workspace You can update a Databricks workspace configuration for
   * running workspaces for some fields, but not all fields. For a running workspace, this request
   * supports updating the following fields only: - Credential configuration ID - Network
   * configuration ID. Used only if you already use a customer-managed VPC. You cannot convert a
   * running workspace from a Databricks-managed VPC to a customer-managed VPC. You can use a
   * network configuration update in this API for a failed or running workspace to add support for
   * PrivateLink, although you also need to add a private access settings object. - Key
   * configuration ID for managed services (control plane storage, such as notebook source and
   * Databricks SQL queries). Databricks does not directly encrypt the data with the
   * customer-managed key (CMK). Databricks uses both the CMK and the Databricks managed key (DMK)
   * that is unique to your workspace to encrypt the Data Encryption Key (DEK). Databricks uses the
   * DEK to encrypt your workspace's managed services persisted data. If the workspace does not
   * already have a CMK for managed services, adding this ID enables managed services encryption for
   * new or updated data. Existing managed services data that existed before adding the key remains
   * not encrypted with the DEK until it is modified. If the workspace already has customer-managed
   * keys for managed services, this request rotates (changes) the CMK keys and the DEK is
   * re-encrypted with the DMK and the new CMK. - Key configuration ID for workspace storage (root
   * S3 bucket and, optionally, EBS volumes). You can set this only if the workspace does not
   * already have a customer-managed key configuration for workspace storage. - Private access
   * settings ID to add PrivateLink support. You can add or update the private access settings ID to
   * upgrade a workspace to add support for front-end, back-end, or both types of connectivity. You
   * cannot remove (downgrade) any existing front-end or back-end PrivateLink support on a
   * workspace. - Custom tags. Given you provide an empty custom tags, the update would not be
   * applied. - Network connectivity configuration ID to add serverless stable IP support. You can
   * add or update the network connectivity configuration ID to ensure the workspace uses the same
   * set of stable IP CIDR blocks to access your resources. You cannot remove a network connectivity
   * configuration from the workspace once attached, you can only switch to another one.
   *
   * <p>**Important**: To update a running workspace, your workspace must have no running compute
   * resources that run in your workspace's VPC in the Classic data plane. For example, stop all
   * all-purpose clusters, job clusters, pools with running clusters, and Classic SQL warehouses. If
   * you do not terminate all cluster instances in the workspace before calling this API, the
   * request will fail.
   *
   * <p>### Wait until changes take effect. After calling the `PATCH` operation to update the
   * workspace configuration, make repeated `GET` requests with the workspace ID and check the
   * workspace status and the status of the fields. * For workspaces with a Databricks-managed VPC,
   * the workspace status becomes `PROVISIONING` temporarily (typically under 20 minutes). If the
   * workspace update is successful, the workspace status changes to `RUNNING`. Note that you can
   * also check the workspace status in the [Account Console]. However, you cannot use or create
   * clusters for another 20 minutes after that status change. This results in a total of up to 40
   * minutes in which you cannot create clusters. If you create or use clusters before this time
   * interval elapses, clusters do not launch successfully, fail, or could cause other unexpected
   * behavior. * For workspaces with a customer-managed VPC, the workspace status stays at status
   * `RUNNING` and the VPC change happens immediately. A change to the storage customer-managed key
   * configuration ID might take a few minutes to update, so continue to check the workspace until
   * you observe that it has been updated. If the update fails, the workspace might revert silently
   * to its original configuration. After the workspace has been updated, you cannot use or create
   * clusters for another 20 minutes. If you create or use clusters before this time interval
   * elapses, clusters do not launch successfully, fail, or could cause other unexpected behavior.
   *
   * <p>If you update the _storage_ customer-managed key configurations, it takes 20 minutes for the
   * changes to fully take effect. During the 20 minute wait, it is important that you stop all REST
   * API calls to the DBFS API. If you are modifying _only the managed services key configuration_,
   * you can omit the 20 minute wait.
   *
   * <p>**Important**: Customer-managed keys and customer-managed VPCs are supported by only some
   * deployment types and subscription types. If you have questions about availability, contact your
   * Databricks representative.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   *
   * <p>[Account Console]:
   * https://docs.databricks.com/administration-guide/account-settings-e2/account-console-e2.html
   * [Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  void update(UpdateWorkspaceRequest updateWorkspaceRequest);
}
