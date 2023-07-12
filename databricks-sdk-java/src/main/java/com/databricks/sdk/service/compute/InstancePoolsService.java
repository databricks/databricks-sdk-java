// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * Instance Pools API are used to create, edit, delete and list instance pools
 * by using ready-to-use cloud instances which reduces a cluster start and
 * auto-scaling times.
 * 
 * Databricks pools reduce cluster start and auto-scaling times by maintaining a
 * set of idle, ready-to-use instances. When a cluster is attached to a pool,
 * cluster nodes are created using the pool’s idle instances. If the pool has
 * no idle instances, the pool expands by allocating a new instance from the
 * instance provider in order to accommodate the cluster’s request. When a
 * cluster releases an instance, it returns to the pool and is free for another
 * cluster to use. Only clusters attached to a pool can use that pool’s idle
 * instances.
 * 
 * You can specify a different pool for the driver node and worker nodes, or use
 * the same pool for both.
 * 
 * Databricks does not charge DBUs while instances are idle in the pool.
 * Instance provider billing does apply. See pricing.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface InstancePoolsService {
	/**
   * Create a new instance pool.
   * 
   * Creates a new instance pool using idle and ready-to-use cloud instances.
   */
  CreateInstancePoolResponse create(CreateInstancePool createInstancePool);
  
	/**
   * Delete an instance pool.
   * 
   * Deletes the instance pool permanently. The idle instances in the pool are
   * terminated asynchronously.
   */
  void delete(DeleteInstancePool deleteInstancePool);
  
	/**
   * Edit an existing instance pool.
   * 
   * Modifies the configuration of an existing instance pool.
   */
  void edit(EditInstancePool editInstancePool);
  
	/**
   * Get instance pool information.
   * 
   * Retrieve the information for an instance pool based on its identifier.
   */
  GetInstancePool get(GetInstancePoolRequest getInstancePoolRequest);
  
	/**
   * List instance pool info.
   * 
   * Gets a list of instance pools with their statistics.
   */
  ListInstancePools list();
  
}