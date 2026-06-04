// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.bundle;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/** Service for managing bundle deployment metadata. */
@Generated
public class BundleAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BundleAPI.class);

  private final BundleService impl;

  /** Regular-use constructor */
  public BundleAPI(ApiClient apiClient) {
    impl = new BundleImpl(apiClient);
  }

  /** Constructor for mocks */
  public BundleAPI(BundleService mock) {
    impl = mock;
  }

  /**
   * Marks a version as complete and releases the deployment lock.
   *
   * <p>The server atomically: 1. Sets the version status to the provided terminal status. 2. Sets
   * `complete_time` to the current server timestamp. 3. Releases the lock on the parent deployment.
   * 4. Updates the parent deployment's `status` and `last_version_id`.
   */
  public Version completeVersion(CompleteVersionRequest request) {
    return impl.completeVersion(request);
  }

  /**
   * Creates a new deployment in the workspace.
   *
   * <p>The caller must provide a `deployment_id` which becomes the final component of the
   * deployment's resource name. If a deployment with the same ID already exists, the server returns
   * `ALREADY_EXISTS`.
   */
  public Deployment createDeployment(CreateDeploymentRequest request) {
    return impl.createDeployment(request);
  }

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
  public Operation createOperation(CreateOperationRequest request) {
    return impl.createOperation(request);
  }

  /**
   * Creates a new version under a deployment.
   *
   * <p>Creating a version acquires an exclusive lock on the deployment, preventing concurrent
   * deploys. The caller provides a `version_id` which the server validates equals `last_version_id
   * + 1` on the deployment.
   */
  public Version createVersion(CreateVersionRequest request) {
    return impl.createVersion(request);
  }

  public void deleteDeployment(String name) {
    deleteDeployment(new DeleteDeploymentRequest().setName(name));
  }

  /**
   * Deletes a deployment.
   *
   * <p>The deployment is marked as deleted. It and all its children (versions and their operations)
   * will be permanently deleted after the retention policy expires. If the deployment has an
   * in-progress version, the server returns `RESOURCE_CONFLICT`.
   */
  public void deleteDeployment(DeleteDeploymentRequest request) {
    impl.deleteDeployment(request);
  }

  public Deployment getDeployment(String name) {
    return getDeployment(new GetDeploymentRequest().setName(name));
  }

  /** Retrieves a deployment by its resource name. */
  public Deployment getDeployment(GetDeploymentRequest request) {
    return impl.getDeployment(request);
  }

  public Operation getOperation(String name) {
    return getOperation(new GetOperationRequest().setName(name));
  }

  /** Retrieves a resource operation by its resource name. */
  public Operation getOperation(GetOperationRequest request) {
    return impl.getOperation(request);
  }

  public Resource getResource(String name) {
    return getResource(new GetResourceRequest().setName(name));
  }

  /** Retrieves a deployment resource by its resource name. */
  public Resource getResource(GetResourceRequest request) {
    return impl.getResource(request);
  }

  public Version getVersion(String name) {
    return getVersion(new GetVersionRequest().setName(name));
  }

  /** Retrieves a version by its resource name. */
  public Version getVersion(GetVersionRequest request) {
    return impl.getVersion(request);
  }

  /**
   * Sends a heartbeat to renew the lock held by a version.
   *
   * <p>The server validates that the version is the active (non-terminal) version on the parent
   * deployment and resets the lock expiry. If the lock has already expired or the version is no
   * longer active, the server returns `ABORTED`.
   */
  public HeartbeatResponse heartbeat(HeartbeatRequest request) {
    return impl.heartbeat(request);
  }

  /** Lists deployments in the workspace. */
  public Iterable<Deployment> listDeployments(ListDeploymentsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listDeployments,
        ListDeploymentsResponse::getDeployments,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Operation> listOperations(String parent) {
    return listOperations(new ListOperationsRequest().setParent(parent));
  }

  /** Lists resource operations under a version. */
  public Iterable<Operation> listOperations(ListOperationsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listOperations,
        ListOperationsResponse::getOperations,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Resource> listResources(String parent) {
    return listResources(new ListResourcesRequest().setParent(parent));
  }

  /** Lists resources under a deployment. */
  public Iterable<Resource> listResources(ListResourcesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listResources,
        ListResourcesResponse::getResources,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<Version> listVersions(String parent) {
    return listVersions(new ListVersionsRequest().setParent(parent));
  }

  /** Lists versions under a deployment, ordered by version_id descending (most recent first). */
  public Iterable<Version> listVersions(ListVersionsRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listVersions,
        ListVersionsResponse::getVersions,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public BundleService impl() {
    return impl;
  }
}
