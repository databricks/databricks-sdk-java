// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

/**
 * You can use cluster policies to control users' ability to configure clusters based on a set of
 * rules. These rules specify which attributes or attribute values can be used during cluster
 * creation. Cluster policies have ACLs that limit their use to specific users and groups.
 *
 * <p>With cluster policies, you can: - Auto-install cluster libraries on the next restart by
 * listing them in the policy's "libraries" field (Public Preview). - Limit users to creating
 * clusters with the prescribed settings. - Simplify the user interface, enabling more users to
 * create clusters, by fixing and hiding some fields. - Manage costs by setting limits on attributes
 * that impact the hourly rate.
 *
 * <p>Cluster policy permissions limit which policies a user can select in the Policy drop-down when
 * the user creates a cluster: - A user who has unrestricted cluster create permission can select
 * the Unrestricted policy and create fully-configurable clusters. - A user who has both
 * unrestricted cluster create permission and access to cluster policies can select the Unrestricted
 * policy and policies they have access to. - A user that has access to only cluster policies, can
 * select the policies they have access to.
 *
 * <p>If no policies exist in the workspace, the Policy drop-down doesn't appear. Only admin users
 * can create, edit, and delete policies. Admin users also have access to all policies.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ClusterPoliciesService {
  /**
   * Create a new policy.
   *
   * <p>Creates a new policy with prescribed settings.
   */
  CreatePolicyResponse create(CreatePolicy createPolicy);

  /**
   * Delete a cluster policy.
   *
   * <p>Delete a policy for a cluster. Clusters governed by this policy can still run, but cannot be
   * edited.
   */
  void delete(DeletePolicy deletePolicy);

  /**
   * Update a cluster policy.
   *
   * <p>Update an existing policy for cluster. This operation may make some clusters governed by the
   * previous policy invalid.
   */
  void edit(EditPolicy editPolicy);

  /**
   * Get a cluster policy.
   *
   * <p>Get a cluster policy entity. Creation and editing is available to admins only.
   */
  Policy get(GetClusterPolicyRequest getClusterPolicyRequest);

  /**
   * Get cluster policy permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  GetClusterPolicyPermissionLevelsResponse getPermissionLevels(
      GetClusterPolicyPermissionLevelsRequest getClusterPolicyPermissionLevelsRequest);

  /**
   * Get cluster policy permissions.
   *
   * <p>Gets the permissions of a cluster policy. Cluster policies can inherit permissions from
   * their root object.
   */
  ClusterPolicyPermissions getPermissions(
      GetClusterPolicyPermissionsRequest getClusterPolicyPermissionsRequest);

  /**
   * List cluster policies.
   *
   * <p>Returns a list of policies accessible by the requesting user.
   */
  ListPoliciesResponse list(ListClusterPoliciesRequest listClusterPoliciesRequest);

  /**
   * Set cluster policy permissions.
   *
   * <p>Sets permissions on a cluster policy. Cluster policies can inherit permissions from their
   * root object.
   */
  ClusterPolicyPermissions setPermissions(
      ClusterPolicyPermissionsRequest clusterPolicyPermissionsRequest);

  /**
   * Update cluster policy permissions.
   *
   * <p>Updates the permissions on a cluster policy. Cluster policies can inherit permissions from
   * their root object.
   */
  ClusterPolicyPermissions updatePermissions(
      ClusterPolicyPermissionsRequest clusterPolicyPermissionsRequest);
}
