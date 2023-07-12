// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
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

  public CreateInstancePoolResponse create(String instancePoolName, String nodeTypeId) {
    return create(
        new CreateInstancePool().setInstancePoolName(instancePoolName).setNodeTypeId(nodeTypeId));
  }

  /**
   * Create a new instance pool.
   *
   * <p>Creates a new instance pool using idle and ready-to-use cloud instances.
   */
  public CreateInstancePoolResponse create(CreateInstancePool request) {
    return impl.create(request);
  }

  public void delete(String instancePoolId) {
    delete(new DeleteInstancePool().setInstancePoolId(instancePoolId));
  }

  /**
   * Delete an instance pool.
   *
   * <p>Deletes the instance pool permanently. The idle instances in the pool are terminated
   * asynchronously.
   */
  public void delete(DeleteInstancePool request) {
    impl.delete(request);
  }

  public void edit(String instancePoolId, String instancePoolName, String nodeTypeId) {
    edit(
        new EditInstancePool()
            .setInstancePoolId(instancePoolId)
            .setInstancePoolName(instancePoolName)
            .setNodeTypeId(nodeTypeId));
  }

  /**
   * Edit an existing instance pool.
   *
   * <p>Modifies the configuration of an existing instance pool.
   */
  public void edit(EditInstancePool request) {
    impl.edit(request);
  }

  public GetInstancePool get(String instancePoolId) {
    return get(new GetInstancePoolRequest().setInstancePoolId(instancePoolId));
  }

  /**
   * Get instance pool information.
   *
   * <p>Retrieve the information for an instance pool based on its identifier.
   */
  public GetInstancePool get(GetInstancePoolRequest request) {
    return impl.get(request);
  }

  /**
   * List instance pool info.
   *
   * <p>Gets a list of instance pools with their statistics.
   */
  public Iterable<InstancePoolAndStats> list() {
    return impl.list().getInstancePools();
  }

  public InstancePoolsService impl() {
    return impl;
  }
}
