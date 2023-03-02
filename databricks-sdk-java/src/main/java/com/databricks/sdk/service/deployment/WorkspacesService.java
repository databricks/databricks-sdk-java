// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * These APIs manage workspaces for this account. A Databricks workspace is an
 * environment for accessing all of your Databricks assets. The workspace
 * organizes objects (notebooks, libraries, and experiments) into folders, and
 * provides access to data and computational resources such as clusters and
 * jobs.
 * 
 * These endpoints are available if your account is on the E2 version of the
 * platform or on a select custom plan that allows multiple workspaces per
 * account.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface WorkspacesService {
	/**
     * Create a new workspace.
     * 
     * Creates a new workspace.
     * 
     * **Important**: This operation is asynchronous. A response with HTTP
     * status code 200 means the request has been accepted and is in progress,
     * but does not mean that the workspace deployed successfully and is
     * running. The initial workspace status is typically `PROVISIONING`. Use
     * the workspace ID (`workspace_id`) field in the response to identify the
     * new workspace and make repeated `GET` requests with the workspace ID and
     * check its status. The workspace becomes available when the status changes
     * to `RUNNING`.
     */
    Workspace create(CreateWorkspaceRequest createWorkspaceRequest);
    
	/**
     * Delete a workspace.
     * 
     * Terminates and deletes a Databricks workspace. From an API perspective,
     * deletion is immediate. However, it might take a few minutes for all
     * workspaces resources to be deleted, depending on the size and number of
     * workspace resources.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform or on a select custom plan that allows multiple workspaces
     * per account.
     */
    void delete(DeleteWorkspaceRequest deleteWorkspaceRequest);
    
	/**
     * Get a workspace.
     * 
     * Gets information including status for a Databricks workspace, specified
     * by ID. In the response, the `workspace_status` field indicates the
     * current status. After initial workspace creation (which is asynchronous),
     * make repeated `GET` requests with the workspace ID and check its status.
     * The workspace becomes available when the status changes to `RUNNING`.
     * 
     * For information about how to create a new workspace with this API
     * **including error handling**, see [Create a new workspace using the
     * Account API].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform or on a select custom plan that allows multiple workspaces
     * per account.
     * 
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     */
    Workspace get(GetWorkspaceRequest getWorkspaceRequest);
    
	/**
     * Get all workspaces.
     * 
     * Gets a list of all workspaces associated with an account, specified by
     * ID.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform or on a select custom plan that allows multiple workspaces
     * per account.
     */
    List<Workspace> list();
    
	/**
     * Update workspace configuration.
     * 
     * Updates a workspace configuration for either a running workspace or a
     * failed workspace. The elements that can be updated varies between these
     * two use cases.
     * 
     * ### Update a failed workspace You can update a Databricks workspace
     * configuration for failed workspace deployment for some fields, but not
     * all fields. For a failed workspace, this request supports updates to the
     * following fields only: - Credential configuration ID - Storage
     * configuration ID - Network configuration ID. Used only if you use
     * customer-managed VPC. - Key configuration ID for managed services
     * (control plane storage, such as notebook source and Databricks SQL
     * queries). Used only if you use customer-managed keys for managed
     * services. - Key configuration ID for workspace storage (root S3 bucket
     * and, optionally, EBS volumes). Used only if you use customer-managed keys
     * for workspace storage. **Important**: If the workspace was ever in the
     * running state, even if briefly before becoming a failed workspace, you
     * cannot add a new key configuration ID for workspace storage.
     * 
     * After calling the `PATCH` operation to update the workspace
     * configuration, make repeated `GET` requests with the workspace ID and
     * check the workspace status. The workspace is successful if the status
     * changes to `RUNNING`.
     * 
     * For information about how to create a new workspace with this API
     * **including error handling**, see [Create a new workspace using the
     * Account API].
     * 
     * ### Update a running workspace You can update a Databricks workspace
     * configuration for running workspaces for some fields, but not all fields.
     * For a running workspace, this request supports updating the following
     * fields only: - Credential configuration ID
     * 
     * - Network configuration ID. Used only if you already use use
     * customer-managed VPC. This change is supported only if you specified a
     * network configuration ID in your original workspace creation. In other
     * words, you cannot switch from a Databricks-managed VPC to a
     * customer-managed VPC. **Note**: You cannot use a network configuration
     * update in this API to add support for PrivateLink (in Public Preview). To
     * add PrivateLink to an existing workspace, contact your Databricks
     * representative.
     * 
     * - Key configuration ID for managed services (control plane storage, such
     * as notebook source and Databricks SQL queries). Databricks does not
     * directly encrypt the data with the customer-managed key (CMK). Databricks
     * uses both the CMK and the Databricks managed key (DMK) that is unique to
     * your workspace to encrypt the Data Encryption Key (DEK). Databricks uses
     * the DEK to encrypt your workspace's managed services persisted data. If
     * the workspace does not already have a CMK for managed services, adding
     * this ID enables managed services encryption for new or updated data.
     * Existing managed services data that existed before adding the key remains
     * not encrypted with the DEK until it is modified. If the workspace already
     * has customer-managed keys for managed services, this request rotates
     * (changes) the CMK keys and the DEK is re-encrypted with the DMK and the
     * new CMK. - Key configuration ID for workspace storage (root S3 bucket
     * and, optionally, EBS volumes). You can set this only if the workspace
     * does not already have a customer-managed key configuration for workspace
     * storage.
     * 
     * **Important**: For updating running workspaces, this API is unavailable
     * on Mondays, Tuesdays, and Thursdays from 4:30pm-7:30pm PST due to routine
     * maintenance. Plan your workspace updates accordingly. For questions about
     * this schedule, contact your Databricks representative.
     * 
     * **Important**: To update a running workspace, your workspace must have no
     * running cluster instances, which includes all-purpose clusters, job
     * clusters, and pools that might have running clusters. Terminate all
     * cluster instances in the workspace before calling this API.
     * 
     * ### Wait until changes take effect. After calling the `PATCH` operation
     * to update the workspace configuration, make repeated `GET` requests with
     * the workspace ID and check the workspace status and the status of the
     * fields. * For workspaces with a Databricks-managed VPC, the workspace
     * status becomes `PROVISIONING` temporarily (typically under 20 minutes).
     * If the workspace update is successful, the workspace status changes to
     * `RUNNING`. Note that you can also check the workspace status in the
     * [Account Console]. However, you cannot use or create clusters for another
     * 20 minutes after that status change. This results in a total of up to 40
     * minutes in which you cannot create clusters. If you create or use
     * clusters before this time interval elapses, clusters do not launch
     * successfully, fail, or could cause other unexpected behavior.
     * 
     * * For workspaces with a customer-managed VPC, the workspace status stays
     * at status `RUNNING` and the VPC change happens immediately. A change to
     * the storage customer-managed key configuration ID might take a few
     * minutes to update, so continue to check the workspace until you observe
     * that it has been updated. If the update fails, the workspace might revert
     * silently to its original configuration. After the workspace has been
     * updated, you cannot use or create clusters for another 20 minutes. If you
     * create or use clusters before this time interval elapses, clusters do not
     * launch successfully, fail, or could cause other unexpected behavior.
     * 
     * If you update the _storage_ customer-managed key configurations, it takes
     * 20 minutes for the changes to fully take effect. During the 20 minute
     * wait, it is important that you stop all REST API calls to the DBFS API.
     * If you are modifying _only the managed services key configuration_, you
     * can omit the 20 minute wait.
     * 
     * **Important**: Customer-managed keys and customer-managed VPCs are
     * supported by only some deployment types and subscription types. If you
     * have questions about availability, contact your Databricks
     * representative.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform or on a select custom plan that allows multiple workspaces
     * per account.
     * 
     * [Account Console]: https://docs.databricks.com/administration-guide/account-settings-e2/account-console-e2.html
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     */
    void update(UpdateWorkspaceRequest updateWorkspaceRequest);
    
}