// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class InstancePoolsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(InstancePoolsAPI.class);

  private final InstancePoolsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public InstancePoolsAPI(ApiClient apiClient) {
    impl = new InstancePoolsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.compute.InstancePoolsService} object
   */
  public InstancePoolsAPI(InstancePoolsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param instancePoolName a {@link java.lang.String} object
   * @param nodeTypeId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.CreateInstancePoolResponse} object
   */
  public CreateInstancePoolResponse create(String instancePoolName, String nodeTypeId) {
    return create(
        new CreateInstancePool().setInstancePoolName(instancePoolName).setNodeTypeId(nodeTypeId));
  }

  /**
   * Create a new instance pool.
   *
   * <p>Creates a new instance pool using idle and ready-to-use cloud instances.
   *
   * @param request a {@link com.databricks.sdk.service.compute.CreateInstancePool} object
   * @return a {@link com.databricks.sdk.service.compute.CreateInstancePoolResponse} object
   */
  public CreateInstancePoolResponse create(CreateInstancePool request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   */
  public void delete(String instancePoolId) {
    delete(new DeleteInstancePool().setInstancePoolId(instancePoolId));
  }

  /**
   * Delete an instance pool.
   *
   * <p>Deletes the instance pool permanently. The idle instances in the pool are terminated
   * asynchronously.
   *
   * @param request a {@link com.databricks.sdk.service.compute.DeleteInstancePool} object
   */
  public void delete(DeleteInstancePool request) {
    impl.delete(request);
  }

  /**
   * <p>edit.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   * @param instancePoolName a {@link java.lang.String} object
   * @param nodeTypeId a {@link java.lang.String} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.compute.EditInstancePool} object
   */
  public void edit(EditInstancePool request) {
    impl.edit(request);
  }

  /**
   * <p>get.</p>
   *
   * @param instancePoolId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.GetInstancePool} object
   */
  public GetInstancePool get(String instancePoolId) {
    return get(new GetInstancePoolRequest().setInstancePoolId(instancePoolId));
  }

  /**
   * Get instance pool information.
   *
   * <p>Retrieve the information for an instance pool based on its identifier.
   *
   * @param request a {@link com.databricks.sdk.service.compute.GetInstancePoolRequest} object
   * @return a {@link com.databricks.sdk.service.compute.GetInstancePool} object
   */
  public GetInstancePool get(GetInstancePoolRequest request) {
    return impl.get(request);
  }

  /**
   * List instance pool info.
   *
   * <p>Gets a list of instance pools with their statistics.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<InstancePoolAndStats> list() {
    return impl.list().getInstancePools();
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.InstancePoolsService} object
   */
  public InstancePoolsService impl() {
    return impl;
  }
}
