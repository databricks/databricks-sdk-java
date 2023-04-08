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
public class ClusterPoliciesAPI {
    private final ClusterPoliciesService impl;

    /** Regular-use constructor */
    public ClusterPoliciesAPI(ApiClient apiClient) {
        impl = new ClusterPoliciesImpl(apiClient);
    }

    /** Constructor for mocks */
    public ClusterPoliciesAPI(ClusterPoliciesService mock) {
        impl = mock;
    }
	
	/**
     * Create a new policy.
     * 
     * Creates a new policy with prescribed settings.
     */
    public CreatePolicyResponse create(CreatePolicy request) {
        return impl.create(request);
    }
    
	/**
     * Delete a cluster policy.
     * 
     * Delete a policy for a cluster. Clusters governed by this policy can still
     * run, but cannot be edited.
     */
    public void delete(DeletePolicy request) {
        impl.delete(request);
    }
    
	/**
     * Update a cluster policy.
     * 
     * Update an existing policy for cluster. This operation may make some
     * clusters governed by the previous policy invalid.
     */
    public void edit(EditPolicy request) {
        impl.edit(request);
    }
    
	/**
     * Get entity.
     * 
     * Get a cluster policy entity. Creation and editing is available to admins
     * only.
     */
    public Policy get(Get request) {
        return impl.get(request);
    }
    
	/**
     * Get a cluster policy.
     * 
     * Returns a list of policies accessible by the requesting user.
     */
    public ListPoliciesResponse list(List request) {
        return impl.list(request);
    }
    
    public ClusterPoliciesService impl() {
        return impl;
    }
}