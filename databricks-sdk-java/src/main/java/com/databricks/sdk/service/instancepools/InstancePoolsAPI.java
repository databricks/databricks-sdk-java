// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.instancepools;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

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
 */
public class InstancePoolsAPI {
    private final InstancePoolsService impl;

    /** Regular-use constructor */
    public InstancePoolsAPI(ApiClient apiClient) {
        impl = new InstancePoolsImpl(apiClient);
    }

    /** Constructor for mocks */
    public InstancePoolsAPI(InstancePoolsService mock) {
        impl = mock;
    }
	
	/**
     * Create a new instance pool.
     * 
     * Creates a new instance pool using idle and ready-to-use cloud instances.
     */
    public CreateInstancePoolResponse create(CreateInstancePool request) {
        return impl.create(request);
    }
    
	/**
     * Delete an instance pool.
     * 
     * Deletes the instance pool permanently. The idle instances in the pool are
     * terminated asynchronously.
     */
    public void delete(DeleteInstancePool request) {
        impl.delete(request);
    }
    
	/**
     * Edit an existing instance pool.
     * 
     * Modifies the configuration of an existing instance pool.
     */
    public void edit(EditInstancePool request) {
        impl.edit(request);
    }
    
	/**
     * Get instance pool information.
     * 
     * Retrieve the information for an instance pool based on its identifier.
     */
    public GetInstancePool get(Get request) {
        return impl.get(request);
    }
    
	/**
     * List instance pool info.
     * 
     * Gets a list of instance pools with their statistics.
     */
    public ListInstancePools list() {
        return impl.list();
    }
    
    public InstancePoolsService impl() {
        return impl;
    }
}