// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;

/**
 * APIs to manage environment resources.
 *
 * <p>The Environments API provides management capabilities for different types of environments
 * including workspace-level base environments that define the environment version and dependencies
 * to be used in serverless notebooks and jobs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface EnvironmentsService {
  /**
   * Creates a new WorkspaceBaseEnvironment. This is a long-running operation. The operation will
   * asynchronously generate a materialized environment to optimize dependency resolution and is
   * only marked as done when the materialized environment has been successfully generated or has
   * failed.
   */
  Operation createWorkspaceBaseEnvironment(
      CreateWorkspaceBaseEnvironmentRequest createWorkspaceBaseEnvironmentRequest);

  /**
   * Deletes a WorkspaceBaseEnvironment. Deleting a base environment may impact linked notebooks and
   * jobs. This operation is irreversible and should be performed only when you are certain the
   * environment is no longer needed.
   */
  void deleteWorkspaceBaseEnvironment(
      DeleteWorkspaceBaseEnvironmentRequest deleteWorkspaceBaseEnvironmentRequest);

  /**
   * Gets the default WorkspaceBaseEnvironment configuration for the workspace. Returns the current
   * default base environment settings for both CPU and GPU compute.
   */
  DefaultWorkspaceBaseEnvironment getDefaultWorkspaceBaseEnvironment(
      GetDefaultWorkspaceBaseEnvironmentRequest getDefaultWorkspaceBaseEnvironmentRequest);

  /**
   * Gets the status of a long-running operation. Clients can use this method to poll the operation
   * result.
   */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Retrieves a WorkspaceBaseEnvironment by its name. */
  WorkspaceBaseEnvironment getWorkspaceBaseEnvironment(
      GetWorkspaceBaseEnvironmentRequest getWorkspaceBaseEnvironmentRequest);

  /** Lists all WorkspaceBaseEnvironments in the workspace. */
  ListWorkspaceBaseEnvironmentsResponse listWorkspaceBaseEnvironments(
      ListWorkspaceBaseEnvironmentsRequest listWorkspaceBaseEnvironmentsRequest);

  /**
   * Refreshes the materialized environment for a WorkspaceBaseEnvironment. This is a long-running
   * operation. The operation will asynchronously regenerate the materialized environment and is
   * only marked as done when the materialized environment has been successfully generated or has
   * failed. The existing materialized environment remains available until it expires.
   */
  Operation refreshWorkspaceBaseEnvironment(
      RefreshWorkspaceBaseEnvironmentRequest refreshWorkspaceBaseEnvironmentRequest);

  /**
   * Updates the default WorkspaceBaseEnvironment configuration for the workspace. Sets the
   * specified base environments as the workspace defaults for CPU and/or GPU compute.
   */
  DefaultWorkspaceBaseEnvironment updateDefaultWorkspaceBaseEnvironment(
      UpdateDefaultWorkspaceBaseEnvironmentRequest updateDefaultWorkspaceBaseEnvironmentRequest);

  /**
   * Updates an existing WorkspaceBaseEnvironment. This is a long-running operation. The operation
   * will asynchronously regenerate the materialized environment and is only marked as done when the
   * materialized environment has been successfully generated or has failed. The existing
   * materialized environment remains available until it expires.
   */
  Operation updateWorkspaceBaseEnvironment(
      UpdateWorkspaceBaseEnvironmentRequest updateWorkspaceBaseEnvironmentRequest);
}
