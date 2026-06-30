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
   * Creates a new workspace using a credential configuration and a storage configuration, an
   * optional network configuration (if using a customer-managed VPC), an optional managed services
   * key configuration (if using customer-managed keys for managed services), and an optional
   * storage key configuration (if using customer-managed keys for storage). The key configurations
   * used for managed services and storage encryption can be the same or different.
   *
   * <p>Important: This operation is asynchronous. A response with HTTP status code 200 means the
   * request has been accepted and is in progress, but does not mean that the workspace deployed
   * successfully and is running. The initial workspace status is typically PROVISIONING. Use the
   * workspace ID (workspace_id) field in the response to identify the new workspace and make
   * repeated GET requests with the workspace ID and check its status. The workspace becomes
   * available when the status changes to RUNNING.
   *
   * <p>You can share one customer-managed VPC with multiple workspaces in a single account. It is
   * not required to create a new VPC for each workspace. However, you cannot reuse subnets or
   * Security Groups between workspaces. If you plan to share one VPC with multiple workspaces, make
   * sure you size your VPC and subnets accordingly. Because a Databricks Account API network
   * configuration encapsulates this information, you cannot reuse a Databricks Account API network
   * configuration across workspaces.
   *
   * <p>For information about how to create a new workspace with this API including error handling,
   * see [Create a new workspace using the Account API].
   *
   * <p>Important: Customer-managed VPCs, PrivateLink, and customer-managed keys are supported on a
   * limited set of deployment and subscription types. If you have questions about availability,
   * contact your Databricks representative.
   *
   * <p>This operation is available only if your account is on the E2 version of the platform or on
   * a select custom plan that allows multiple workspaces per account.
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  Workspace create(CreateWorkspaceRequest createWorkspaceRequest);

  /** Deletes a Databricks workspace, both specified by ID. */
  Workspace delete(DeleteWorkspaceRequest deleteWorkspaceRequest);

  /**
   * Gets information including status for a Databricks workspace, specified by ID. In the response,
   * the `workspace_status` field indicates the current status. After initial workspace creation
   * (which is asynchronous), make repeated `GET` requests with the workspace ID and check its
   * status. The workspace becomes available when the status changes to `RUNNING`. For information
   * about how to create a new workspace with this API **including error handling**, see [Create a
   * new workspace using the Account API].
   *
   * <p>[Create a new workspace using the Account API]:
   * http://docs.databricks.com/administration-guide/account-api/new-workspace.html
   */
  Workspace get(GetWorkspaceRequest getWorkspaceRequest);

  /** Lists Databricks workspaces for an account. */
  Collection<Workspace> list();

  /** Updates a workspace. */
  Workspace update(UpdateWorkspaceRequest updateWorkspaceRequest);
}
