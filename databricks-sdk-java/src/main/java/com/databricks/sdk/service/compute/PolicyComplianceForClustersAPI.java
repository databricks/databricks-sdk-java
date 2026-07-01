// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * The policy compliance APIs allow you to view and manage the policy compliance status of clusters
 * in your workspace.
 *
 * <p>A cluster is compliant with its policy if its configuration satisfies all its policy rules.
 * Clusters could be out of compliance if their policy was updated after the cluster was last
 * edited.
 *
 * <p>The get and list compliance APIs allow you to view the policy compliance status of a cluster.
 * The enforce compliance API allows you to update a cluster to be compliant with the current
 * version of its policy.
 */
@Generated
public class PolicyComplianceForClustersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PolicyComplianceForClustersAPI.class);

  private final PolicyComplianceForClustersService impl;

  /** Regular-use constructor */
  public PolicyComplianceForClustersAPI(ApiClient apiClient) {
    impl = new PolicyComplianceForClustersImpl(apiClient);
  }

  /** Constructor for mocks */
  public PolicyComplianceForClustersAPI(PolicyComplianceForClustersService mock) {
    impl = mock;
  }

  /**
   * Cancels a pending enforcement on a cluster. After canceling the pending enforcement, the
   * cluster will no longer update on the next termination or restart. Pending enforcements cannot
   * be canceled when a cluster is in `TERMINATING` state. Only workspace admins can cancel pending
   * enforcements.
   */
  public CancelPendingClusterEnforcementResponse cancelPendingClusterEnforcement(
      CancelPendingClusterEnforcementRequest request) {
    return impl.cancelPendingClusterEnforcement(request);
  }

  /**
   * Updates a cluster to be compliant with the current version of its policy.
   *
   * <p>If a cluster is updated while in a `TERMINATED` state, it will remain `TERMINATED`. The next
   * time the cluster is started, the new attributes will take effect.
   *
   * <p>For clusters in other states, the behavior depends on the `enforce_mode` used.
   *
   * <p>Clusters created by the Databricks Jobs, SDP, or Models services cannot be enforced by this
   * API. Instead, use the "Enforce job policy compliance" API to enforce policy compliance on jobs.
   */
  public EnforceClusterComplianceResponse enforceCompliance(
      EnforceClusterComplianceRequest request) {
    return impl.enforceCompliance(request);
  }

  public GetClusterComplianceResponse getCompliance(String clusterId) {
    return getCompliance(new GetClusterComplianceRequest().setClusterId(clusterId));
  }

  /**
   * Returns the policy compliance status of a cluster. Clusters could be out of compliance if their
   * policy was updated after the cluster was last edited.
   */
  public GetClusterComplianceResponse getCompliance(GetClusterComplianceRequest request) {
    return impl.getCompliance(request);
  }

  public Iterable<ClusterCompliance> listCompliance(String policyId) {
    return listCompliance(new ListClusterCompliancesRequest().setPolicyId(policyId));
  }

  /**
   * Returns the policy compliance status of all clusters that use a given policy. Clusters could be
   * out of compliance if their policy was updated after the cluster was last edited.
   */
  public Iterable<ClusterCompliance> listCompliance(ListClusterCompliancesRequest request) {
    return Paginator.newTokenPagination(
        request,
        impl::listCompliance,
        ListClusterCompliancesResponse::getClusters,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public PolicyComplianceForClustersService impl() {
    return impl;
  }
}
