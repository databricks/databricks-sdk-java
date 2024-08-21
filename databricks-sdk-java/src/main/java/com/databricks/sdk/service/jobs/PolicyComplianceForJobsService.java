// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The compliance APIs allow you to view and manage the policy compliance status of jobs in your
 * workspace. This API currently only supports compliance controls for cluster policies.
 *
 * <p>A job is in compliance if its cluster configurations satisfy the rules of all their respective
 * cluster policies. A job could be out of compliance if a cluster policy it uses was updated after
 * the job was last edited. The job is considered out of compliance if any of its clusters no longer
 * comply with their updated policies.
 *
 * <p>The get and list compliance APIs allow you to view the policy compliance status of a job. The
 * enforce compliance API allows you to update a job so that it becomes compliant with all of its
 * policies.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PolicyComplianceForJobsService {
  /**
   * Enforce job policy compliance.
   *
   * <p>Updates a job so the job clusters that are created when running the job (specified in
   * `new_cluster`) are compliant with the current versions of their respective cluster policies.
   * All-purpose clusters used in the job will not be updated.
   */
  EnforcePolicyComplianceResponse enforceCompliance(
      EnforcePolicyComplianceRequest enforcePolicyComplianceRequest);

  /**
   * Get job policy compliance.
   *
   * <p>Returns the policy compliance status of a job. Jobs could be out of compliance if a cluster
   * policy they use was updated after the job was last edited and some of its job clusters no
   * longer comply with their updated policies.
   */
  GetPolicyComplianceResponse getCompliance(GetPolicyComplianceRequest getPolicyComplianceRequest);

  /**
   * List job policy compliance.
   *
   * <p>Returns the policy compliance status of all jobs that use a given policy. Jobs could be out
   * of compliance if a cluster policy they use was updated after the job was last edited and its
   * job clusters no longer comply with the updated policy.
   */
  ListJobComplianceForPolicyResponse listCompliance(
      ListJobComplianceRequest listJobComplianceRequest);
}
