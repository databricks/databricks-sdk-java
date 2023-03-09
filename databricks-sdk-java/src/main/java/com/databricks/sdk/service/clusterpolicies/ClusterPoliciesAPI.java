// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Cluster policy limits the ability to configure clusters based on a set of
 * rules. The policy rules limit the attributes or attribute values available
 * for cluster creation. Cluster policies have ACLs that limit their use to
 * specific users and groups.
 * 
 * Cluster policies let you limit users to create clusters with prescribed
 * settings, simplify the user interface and enable more users to create their
 * own clusters (by fixing and hiding some values), control cost by limiting per
 * cluster maximum cost (by setting limits on attributes whose values contribute
 * to hourly price).
 * 
 * Cluster policy permissions limit which policies a user can select in the
 * Policy drop-down when the user creates a cluster: - A user who has cluster
 * create permission can select the Unrestricted policy and create
 * fully-configurable clusters. - A user who has both cluster create permission
 * and access to cluster policies can select the Unrestricted policy and
 * policies they have access to. - A user that has access to only cluster
 * policies, can select the policies they have access to.
 * 
 * If no policies have been created in the workspace, the Policy drop-down does
 * not display.
 * 
 * Only admin users can create, edit, and delete policies. Admin users also have
 * access to all policies.
 */
public class ClusterPoliciesAPI implements ClusterPoliciesService {
    private final ApiClient apiClient;

    public ClusterPoliciesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new policy.
     * 
     * Creates a new policy with prescribed settings.
     */
    @Override
    public CreatePolicyResponse create(CreatePolicy request) {
        String path = "/api/2.0/policies/clusters/create";
        return apiClient.POST(path, request, CreatePolicyResponse.class);
    }
    
	/**
     * Delete a cluster policy.
     * 
     * Delete a policy for a cluster. Clusters governed by this policy can still
     * run, but cannot be edited.
     */
    @Override
    public void delete(DeletePolicy request) {
        String path = "/api/2.0/policies/clusters/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Update a cluster policy.
     * 
     * Update an existing policy for cluster. This operation may make some
     * clusters governed by the previous policy invalid.
     */
    @Override
    public void edit(EditPolicy request) {
        String path = "/api/2.0/policies/clusters/edit";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Get entity.
     * 
     * Get a cluster policy entity. Creation and editing is available to admins
     * only.
     */
    @Override
    public Policy get(Get request) {
        String path = "/api/2.0/policies/clusters/get";
        return apiClient.GET(path, request, Policy.class);
    }
    
	/**
     * Get a cluster policy.
     * 
     * Returns a list of policies accessible by the requesting user.
     */
    @Override
    public ListPoliciesResponse list(List request) {
        String path = "/api/2.0/policies/clusters/list";
        return apiClient.GET(path, request, ListPoliciesResponse.class);
    }
    
}