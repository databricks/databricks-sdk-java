// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

/**
 * Cluster policy limits the ability to configure clusters based on a set of rules. The policy rules
 * limit the attributes or attribute values available for cluster creation. Cluster policies have
 * ACLs that limit their use to specific users and groups.
 *
 * <p>Cluster policies let you limit users to create clusters with prescribed settings, simplify the
 * user interface and enable more users to create their own clusters (by fixing and hiding some
 * values), control cost by limiting per cluster maximum cost (by setting limits on attributes whose
 * values contribute to hourly price).
 *
 * <p>Cluster policy permissions limit which policies a user can select in the Policy drop-down when
 * the user creates a cluster: - A user who has cluster create permission can select the
 * Unrestricted policy and create fully-configurable clusters. - A user who has both cluster create
 * permission and access to cluster policies can select the Unrestricted policy and policies they
 * have access to. - A user that has access to only cluster policies, can select the policies they
 * have access to.
 *
 * <p>If no policies have been created in the workspace, the Policy drop-down does not display.
 *
 * <p>Only admin users can create, edit, and delete policies. Admin users also have access to all
 * policies.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface ClusterPoliciesService {
  /**
   * Create a new policy.
   *
   * <p>Creates a new policy with prescribed settings.
   *
   * @param createPolicy a {@link com.databricks.sdk.service.compute.CreatePolicy} object
   * @return a {@link com.databricks.sdk.service.compute.CreatePolicyResponse} object
   */
  CreatePolicyResponse create(CreatePolicy createPolicy);

  /**
   * Delete a cluster policy.
   *
   * <p>Delete a policy for a cluster. Clusters governed by this policy can still run, but cannot be
   * edited.
   *
   * @param deletePolicy a {@link com.databricks.sdk.service.compute.DeletePolicy} object
   */
  void delete(DeletePolicy deletePolicy);

  /**
   * Update a cluster policy.
   *
   * <p>Update an existing policy for cluster. This operation may make some clusters governed by the
   * previous policy invalid.
   *
   * @param editPolicy a {@link com.databricks.sdk.service.compute.EditPolicy} object
   */
  void edit(EditPolicy editPolicy);

  /**
   * Get entity.
   *
   * <p>Get a cluster policy entity. Creation and editing is available to admins only.
   *
   * @param getClusterPolicyRequest a {@link com.databricks.sdk.service.compute.GetClusterPolicyRequest} object
   * @return a {@link com.databricks.sdk.service.compute.Policy} object
   */
  Policy get(GetClusterPolicyRequest getClusterPolicyRequest);

  /**
   * Get a cluster policy.
   *
   * <p>Returns a list of policies accessible by the requesting user.
   *
   * @param listClusterPoliciesRequest a {@link com.databricks.sdk.service.compute.ListClusterPoliciesRequest} object
   * @return a {@link com.databricks.sdk.service.compute.ListPoliciesResponse} object
   */
  ListPoliciesResponse list(ListClusterPoliciesRequest listClusterPoliciesRequest);
}
