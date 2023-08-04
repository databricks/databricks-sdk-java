// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class ClusterPoliciesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ClusterPoliciesAPI.class);

  private final ClusterPoliciesService impl;

  /** Regular-use constructor */
  public ClusterPoliciesAPI(ApiClient apiClient) {
    impl = new ClusterPoliciesImpl(apiClient);
  }

  /** Constructor for mocks */
  public ClusterPoliciesAPI(ClusterPoliciesService mock) {
    impl = mock;
  }

  public CreatePolicyResponse create(String name) {
    return create(new CreatePolicy().setName(name));
  }

  /**
   * Create a new policy.
   *
   * <p>Creates a new policy with prescribed settings.
   */
  public CreatePolicyResponse create(CreatePolicy request) {
    return impl.create(request);
  }

  public void delete(String policyId) {
    delete(new DeletePolicy().setPolicyId(policyId));
  }

  /**
   * Delete a cluster policy.
   *
   * <p>Delete a policy for a cluster. Clusters governed by this policy can still run, but cannot be
   * edited.
   */
  public void delete(DeletePolicy request) {
    impl.delete(request);
  }

  public void edit(String policyId, String name) {
    edit(new EditPolicy().setPolicyId(policyId).setName(name));
  }

  /**
   * Update a cluster policy.
   *
   * <p>Update an existing policy for cluster. This operation may make some clusters governed by the
   * previous policy invalid.
   */
  public void edit(EditPolicy request) {
    impl.edit(request);
  }

  public Policy get(String policyId) {
    return get(new GetClusterPolicyRequest().setPolicyId(policyId));
  }

  /**
   * Get entity.
   *
   * <p>Get a cluster policy entity. Creation and editing is available to admins only.
   */
  public Policy get(GetClusterPolicyRequest request) {
    return impl.get(request);
  }

  public GetClusterPolicyPermissionLevelsResponse getClusterPolicyPermissionLevels(
      String clusterPolicyId) {
    return getClusterPolicyPermissionLevels(
        new GetClusterPolicyPermissionLevelsRequest().setClusterPolicyId(clusterPolicyId));
  }

  /**
   * Get cluster policy permission levels.
   *
   * <p>Gets the permission levels that a user can have on an object.
   */
  public GetClusterPolicyPermissionLevelsResponse getClusterPolicyPermissionLevels(
      GetClusterPolicyPermissionLevelsRequest request) {
    return impl.getClusterPolicyPermissionLevels(request);
  }

  public ClusterPolicyPermissions getClusterPolicyPermissions(String clusterPolicyId) {
    return getClusterPolicyPermissions(
        new GetClusterPolicyPermissionsRequest().setClusterPolicyId(clusterPolicyId));
  }

  /**
   * Get cluster policy permissions.
   *
   * <p>Gets the permissions of a cluster policy. Cluster policies can inherit permissions from
   * their root object.
   */
  public ClusterPolicyPermissions getClusterPolicyPermissions(
      GetClusterPolicyPermissionsRequest request) {
    return impl.getClusterPolicyPermissions(request);
  }

  /**
   * Get a cluster policy.
   *
   * <p>Returns a list of policies accessible by the requesting user.
   */
  public Iterable<Policy> list(ListClusterPoliciesRequest request) {
    return impl.list(request).getPolicies();
  }

  public ClusterPolicyPermissions setClusterPolicyPermissions(String clusterPolicyId) {
    return setClusterPolicyPermissions(
        new ClusterPolicyPermissionsRequest().setClusterPolicyId(clusterPolicyId));
  }

  /**
   * Set cluster policy permissions.
   *
   * <p>Sets permissions on a cluster policy. Cluster policies can inherit permissions from their
   * root object.
   */
  public ClusterPolicyPermissions setClusterPolicyPermissions(
      ClusterPolicyPermissionsRequest request) {
    return impl.setClusterPolicyPermissions(request);
  }

  public ClusterPolicyPermissions updateClusterPolicyPermissions(String clusterPolicyId) {
    return updateClusterPolicyPermissions(
        new ClusterPolicyPermissionsRequest().setClusterPolicyId(clusterPolicyId));
  }

  /**
   * Update cluster policy permissions.
   *
   * <p>Updates the permissions on a cluster policy. Cluster policies can inherit permissions from
   * their root object.
   */
  public ClusterPolicyPermissions updateClusterPolicyPermissions(
      ClusterPolicyPermissionsRequest request) {
    return impl.updateClusterPolicyPermissions(request);
  }

  public ClusterPoliciesService impl() {
    return impl;
  }
}
