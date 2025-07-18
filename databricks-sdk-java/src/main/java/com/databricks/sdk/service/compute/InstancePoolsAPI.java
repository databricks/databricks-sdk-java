// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Instance Pools API are used to create, edit, delete and list instance pools by using ready-to-use
 * cloud instances which reduces a cluster start and auto-scaling times.
 *
 * <p>Databricks pools reduce cluster start and auto-scaling times by maintaining a set of idle,
 * ready-to-use instances. When a cluster is attached to a pool, cluster nodes are created using the
 * pool’s idle instances. If the pool has no idle instances, the pool expands by allocating a new
 * instance from the instance provider in order to accommodate the cluster’s request. When a cluster
 * releases an instance, it returns to the pool and is free for another cluster to use. Only
 * clusters attached to a pool can use that pool’s idle instances.
 *
 * <p>You can specify a different pool for the driver node and worker nodes, or use the same pool
 * for both.
 *
 * <p>Databricks does not charge DBUs while instances are idle in the pool. Instance provider
 * billing does apply. See pricing.
 */
@Generated
public class InstancePoolsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(InstancePoolsAPI.class);

  private final InstancePoolsService impl;

  /** Regular-use constructor */
  public InstancePoolsAPI(ApiClient apiClient) {
    impl = new InstancePoolsImpl(apiClient);
  }

  /** Constructor for mocks */
  public InstancePoolsAPI(InstancePoolsService mock) {
    impl = mock;
  }

  /** Creates a new instance pool using idle and ready-to-use cloud instances. */
  public CreateInstancePoolResponse create(CreateInstancePool request) {
    return impl.create(request);
  }

  public void delete(String instancePoolId) {
    delete(new DeleteInstancePool().setInstancePoolId(instancePoolId));
  }

  /**
   * Deletes the instance pool permanently. The idle instances in the pool are terminated
   * asynchronously.
   */
  public void delete(DeleteInstancePool request) {
    impl.delete(request);
  }

  /** Modifies the configuration of an existing instance pool. */
  public void edit(EditInstancePool request) {
    impl.edit(request);
  }

  public GetInstancePool get(String instancePoolId) {
    return get(new GetInstancePoolRequest().setInstancePoolId(instancePoolId));
  }

  /** Retrieve the information for an instance pool based on its identifier. */
  public GetInstancePool get(GetInstancePoolRequest request) {
    return impl.get(request);
  }

  public GetInstancePoolPermissionLevelsResponse getPermissionLevels(String instancePoolId) {
    return getPermissionLevels(
        new GetInstancePoolPermissionLevelsRequest().setInstancePoolId(instancePoolId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetInstancePoolPermissionLevelsResponse getPermissionLevels(
      GetInstancePoolPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public InstancePoolPermissions getPermissions(String instancePoolId) {
    return getPermissions(
        new GetInstancePoolPermissionsRequest().setInstancePoolId(instancePoolId));
  }

  /**
   * Gets the permissions of an instance pool. Instance pools can inherit permissions from their
   * root object.
   */
  public InstancePoolPermissions getPermissions(GetInstancePoolPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  /** Gets a list of instance pools with their statistics. */
  public Iterable<InstancePoolAndStats> list() {
    return new Paginator<>(
        null, (Void v) -> impl.list(), ListInstancePools::getInstancePools, response -> null);
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public InstancePoolPermissions setPermissions(InstancePoolPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Updates the permissions on an instance pool. Instance pools can inherit permissions from their
   * root object.
   */
  public InstancePoolPermissions updatePermissions(InstancePoolPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public InstancePoolsService impl() {
    return impl;
  }
}
