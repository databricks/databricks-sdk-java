// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.instancepools;

import javax.annotation.Generated;
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
@Generated("databricks-sdk-generator")
public class InstancePoolsAPI implements InstancePoolsService {
    private final ApiClient apiClient;

    public InstancePoolsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new instance pool.
     * 
     * Creates a new instance pool using idle and ready-to-use cloud instances.
     */
    @Override
    public CreateInstancePoolResponse create(CreateInstancePool request) {
        String path = "/api/2.0/instance-pools/create";
        return apiClient.POST(path, request, CreateInstancePoolResponse.class);
    }
    
	/**
     * Delete an instance pool.
     * 
     * Deletes the instance pool permanently. The idle instances in the pool are
     * terminated asynchronously.
     */
    @Override
    public void delete(DeleteInstancePool request) {
        String path = "/api/2.0/instance-pools/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Edit an existing instance pool.
     * 
     * Modifies the configuration of an existing instance pool.
     */
    @Override
    public void edit(EditInstancePool request) {
        String path = "/api/2.0/instance-pools/edit";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get instance pool information.
     * 
     * Retrieve the information for an instance pool based on its identifier.
     */
    @Override
    public GetInstancePool get(Get request) {
        String path = "/api/2.0/instance-pools/get";
        return apiClient.GET(path, request, GetInstancePool.class);
    }
    
	/**
     * List instance pool info.
     * 
     * Gets a list of instance pools with their statistics.
     */
    @Override
    public ListInstancePools list() {
        String path = "/api/2.0/instance-pools/list";
        return apiClient.GET(path, ListInstancePools.class);
    }
    
}