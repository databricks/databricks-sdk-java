// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PolicyComplianceForClustersService {
  /**
   * Updates a cluster to be compliant with the current version of its policy. A cluster can be
   * updated if it is in a `RUNNING` or `TERMINATED` state.
   *
   * <p>If a cluster is updated while in a `RUNNING` state, it will be restarted so that the new
   * attributes can take effect.
   *
   * <p>If a cluster is updated while in a `TERMINATED` state, it will remain `TERMINATED`. The next
   * time the cluster is started, the new attributes will take effect.
   *
   * <p>Clusters created by the Databricks Jobs, DLT, or Models services cannot be enforced by this
   * API. Instead, use the "Enforce job policy compliance" API to enforce policy compliance on jobs.
   */
  EnforceClusterComplianceResponse enforceCompliance(
      EnforceClusterComplianceRequest enforceClusterComplianceRequest);

  /**
   * Returns the policy compliance status of a cluster. Clusters could be out of compliance if their
   * policy was updated after the cluster was last edited.
   */
  GetClusterComplianceResponse getCompliance(
      GetClusterComplianceRequest getClusterComplianceRequest);

  /**
   * Returns the policy compliance status of all clusters that use a given policy. Clusters could be
   * out of compliance if their policy was updated after the cluster was last edited.
   */
  ListClusterCompliancesResponse listCompliance(
      ListClusterCompliancesRequest listClusterCompliancesRequest);
}
