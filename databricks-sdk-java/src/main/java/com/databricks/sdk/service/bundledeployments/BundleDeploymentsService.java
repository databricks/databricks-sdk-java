// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;

/**
 * Service for managing bundle deployment metadata.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BundleDeploymentsService {
  /**
   * Marks a version as complete and releases the deployment lock.
   *
   * <p>The server atomically: 1. Sets the version status to the provided terminal status. 2. Sets
   * `complete_time` to the current server timestamp. 3. Releases the lock on the parent deployment.
   * 4. Updates the parent deployment's `status` and `last_version_id`.
   */
  Version completeVersion(CompleteVersionRequest completeVersionRequest);

  /**
   * Creates a new deployment in the workspace.
   *
   * <p>The caller must provide a `deployment_id` which becomes the final component of the
   * deployment's resource name. If a deployment with the same ID already exists, the server returns
   * `ALREADY_EXISTS`.
   */
  Deployment createDeployment(CreateDeploymentRequest createDeploymentRequest);

  /**
   * Creates a resource operation under a version.
   *
   * <p>The caller must provide a `resource_key` which becomes the final component of the
   * operation's name. If an operation with the same key already exists under the version, the
   * server returns `ALREADY_EXISTS`.
   *
   * <p>On success the server also updates the corresponding deployment-level Resource (creating it
   * if this is the first operation for that resource_key, or removing it if action_type is DELETE).
   */
  Operation createOperation(CreateOperationRequest createOperationRequest);

  /**
   * Creates a new version under a deployment.
   *
   * <p>Creating a version acquires an exclusive lock on the deployment, preventing concurrent
   * deploys. The caller provides a `version_id`, a numeric string that must be numerically greater
   * than the deployment's most recent version, and sets the version's `previous_version_id` to the
   * deployment's most recent version (leaving it unset for the first version), which the server
   * validates to detect concurrent deploys.
   */
  Version createVersion(CreateVersionRequest createVersionRequest);

  /**
   * Deletes a deployment.
   *
   * <p>The deployment is marked as deleted. It and all its children (versions and their operations)
   * will be permanently deleted after the retention policy expires. If the deployment has an
   * in-progress version, the server returns `RESOURCE_CONFLICT`.
   */
  void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest);

  /** Retrieves a deployment by its resource name. */
  Deployment getDeployment(GetDeploymentRequest getDeploymentRequest);

  /** Retrieves a resource operation by its resource name. */
  Operation getOperation(GetOperationRequest getOperationRequest);

  /** Retrieves a deployment resource by its resource name. */
  Resource getResource(GetResourceRequest getResourceRequest);

  /** Retrieves a version by its resource name. */
  Version getVersion(GetVersionRequest getVersionRequest);

  /**
   * Sends a heartbeat to renew the lock held by a version.
   *
   * <p>The server validates that the version is the active (non-terminal) version on the parent
   * deployment and resets the lock expiry. If the lock has already expired or the version is no
   * longer active, the server returns `ABORTED`.
   */
  HeartbeatResponse heartbeat(HeartbeatRequest heartbeatRequest);

  /** Lists deployments in the workspace. */
  ListDeploymentsResponse listDeployments(ListDeploymentsRequest listDeploymentsRequest);

  /** Lists resource operations under a version. */
  ListOperationsResponse listOperations(ListOperationsRequest listOperationsRequest);

  /** Lists resources under a deployment. */
  ListResourcesResponse listResources(ListResourcesRequest listResourcesRequest);

  /**
   * Lists versions under a deployment, ordered numerically by version_id descending (most recent
   * first).
   */
  ListVersionsResponse listVersions(ListVersionsRequest listVersionsRequest);
}
