// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.environments;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * APIs to manage environment resources.
 *
 * <p>The Environments API provides management capabilities for different types of environments
 * including workspace-level base environments that define the environment version and dependencies
 * to be used in serverless notebooks and jobs.
 */
@Generated
public class EnvironmentsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(EnvironmentsAPI.class);

  private final EnvironmentsService impl;

  /** Regular-use constructor */
  public EnvironmentsAPI(ApiClient apiClient) {
    impl = new EnvironmentsImpl(apiClient);
  }

  /** Constructor for mocks */
  public EnvironmentsAPI(EnvironmentsService mock) {
    impl = mock;
  }

  /**
   * Creates a new WorkspaceBaseEnvironment. This is a long-running operation. The operation will
   * asynchronously generate a materialized environment to optimize dependency resolution and is
   * only marked as done when the materialized environment has been successfully generated or has
   * failed.
   */
  public CreateWorkspaceBaseEnvironmentOperation createWorkspaceBaseEnvironment(
      CreateWorkspaceBaseEnvironmentRequest request) {
    Operation operation = impl.createWorkspaceBaseEnvironment(request);
    return new CreateWorkspaceBaseEnvironmentOperation(impl, operation);
  }

  public void deleteWorkspaceBaseEnvironment(String name) {
    deleteWorkspaceBaseEnvironment(new DeleteWorkspaceBaseEnvironmentRequest().setName(name));
  }

  /**
   * Deletes a WorkspaceBaseEnvironment. Deleting a base environment may impact linked notebooks and
   * jobs. This operation is irreversible and should be performed only when you are certain the
   * environment is no longer needed.
   */
  public void deleteWorkspaceBaseEnvironment(DeleteWorkspaceBaseEnvironmentRequest request) {
    impl.deleteWorkspaceBaseEnvironment(request);
  }

  public DefaultWorkspaceBaseEnvironment getDefaultWorkspaceBaseEnvironment(String name) {
    return getDefaultWorkspaceBaseEnvironment(
        new GetDefaultWorkspaceBaseEnvironmentRequest().setName(name));
  }

  /**
   * Gets the default WorkspaceBaseEnvironment configuration for the workspace. Returns the current
   * default base environment settings for both CPU and GPU compute.
   */
  public DefaultWorkspaceBaseEnvironment getDefaultWorkspaceBaseEnvironment(
      GetDefaultWorkspaceBaseEnvironmentRequest request) {
    return impl.getDefaultWorkspaceBaseEnvironment(request);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  /**
   * Gets the status of a long-running operation. Clients can use this method to poll the operation
   * result.
   */
  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  public WorkspaceBaseEnvironment getWorkspaceBaseEnvironment(String name) {
    return getWorkspaceBaseEnvironment(new GetWorkspaceBaseEnvironmentRequest().setName(name));
  }

  /** Retrieves a WorkspaceBaseEnvironment by its name. */
  public WorkspaceBaseEnvironment getWorkspaceBaseEnvironment(
      GetWorkspaceBaseEnvironmentRequest request) {
    return impl.getWorkspaceBaseEnvironment(request);
  }

  /** Lists all WorkspaceBaseEnvironments in the workspace. */
  public Iterable<WorkspaceBaseEnvironment> listWorkspaceBaseEnvironments(
      ListWorkspaceBaseEnvironmentsRequest request) {
    return new Paginator<>(
        request,
        impl::listWorkspaceBaseEnvironments,
        ListWorkspaceBaseEnvironmentsResponse::getWorkspaceBaseEnvironments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Refreshes the materialized environment for a WorkspaceBaseEnvironment. This is a long-running
   * operation. The operation will asynchronously regenerate the materialized environment and is
   * only marked as done when the materialized environment has been successfully generated or has
   * failed. The existing materialized environment remains available until it expires.
   */
  public RefreshWorkspaceBaseEnvironmentOperation refreshWorkspaceBaseEnvironment(
      RefreshWorkspaceBaseEnvironmentRequest request) {
    Operation operation = impl.refreshWorkspaceBaseEnvironment(request);
    return new RefreshWorkspaceBaseEnvironmentOperation(impl, operation);
  }

  /**
   * Updates the default WorkspaceBaseEnvironment configuration for the workspace. Sets the
   * specified base environments as the workspace defaults for CPU and/or GPU compute.
   */
  public DefaultWorkspaceBaseEnvironment updateDefaultWorkspaceBaseEnvironment(
      UpdateDefaultWorkspaceBaseEnvironmentRequest request) {
    return impl.updateDefaultWorkspaceBaseEnvironment(request);
  }

  /**
   * Updates an existing WorkspaceBaseEnvironment. This is a long-running operation. The operation
   * will asynchronously regenerate the materialized environment and is only marked as done when the
   * materialized environment has been successfully generated or has failed. The existing
   * materialized environment remains available until it expires.
   */
  public UpdateWorkspaceBaseEnvironmentOperation updateWorkspaceBaseEnvironment(
      UpdateWorkspaceBaseEnvironmentRequest request) {
    Operation operation = impl.updateWorkspaceBaseEnvironment(request);
    return new UpdateWorkspaceBaseEnvironmentOperation(impl, operation);
  }

  public EnvironmentsService impl() {
    return impl;
  }
}
