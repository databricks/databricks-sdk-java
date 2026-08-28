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

  /** Creates a new deployment in the workspace. */
  Deployment createDeployment(CreateDeploymentRequest createDeploymentRequest);

  /**
   * Creates a new version under a deployment.
   *
   * <p>Creating a version acquires an exclusive lock on the deployment, preventing concurrent
   * deploys. The caller provides a `version_id`, a numeric string that must be numerically greater
   * than the deployment's most recent version, and sets the version's `previous_version_id` to the
   * deployment's most recent version (leaving it unset for the first version), which the server
   * validates to detect concurrent deploys.
   *
   * <p>The caller also provides the full set of `operations` planned for this version, each
   * identified by a `resource_key` and an `action_type`. The server records one operation per
   * resource in `OPERATION_STATUS_PENDING` in the same transaction as the version, so the plan is
   * captured atomically. The outcome of each operation is recorded later via UpdateOperation as the
   * resource is applied; the set of operations cannot be changed after the version is created.
   */
  Version createVersion(CreateVersionRequest createVersionRequest);

  /** Deletes a deployment. */
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

  /** Updates a deployment. */
  Deployment updateDeployment(UpdateDeploymentRequest updateDeploymentRequest);

  /**
   * Updates a resource operation's mutable fields.
   *
   * <p>`state`, `error_message`, `resource_id`, `status`, and `dashboard_metadata` may be updated,
   * independently; `update_mask` must contain only those paths. All other fields are immutable. The
   * update is guarded by an optimistic-concurrency check: the caller sets `operation.sequence_id`
   * to the value it last observed, and the server rejects the update with `ABORTED` if the
   * operation has been modified since. On success the server increments `sequence_id`; updates to
   * `state`, `resource_id`, and `dashboard_metadata` are mirrored onto the corresponding
   * deployment-level resource. Listing `state` in `update_mask` with no value clears it, which
   * removes the resource, so a delete that is retried until it succeeds must clear `state`. The
   * parent version must be in progress, and after the update is applied a succeeded operation
   * cannot carry an `error_message`. See the `state` and `resource_id` fields for the rest.
   */
  Operation updateOperation(UpdateOperationRequest updateOperationRequest);
}
