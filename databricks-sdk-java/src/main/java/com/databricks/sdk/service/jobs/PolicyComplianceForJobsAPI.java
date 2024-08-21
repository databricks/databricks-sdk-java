// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 */
@Generated
public class PolicyComplianceForJobsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PolicyComplianceForJobsAPI.class);

  private final PolicyComplianceForJobsService impl;

  /** Regular-use constructor */
  public PolicyComplianceForJobsAPI(ApiClient apiClient) {
    impl = new PolicyComplianceForJobsImpl(apiClient);
  }

  /** Constructor for mocks */
  public PolicyComplianceForJobsAPI(PolicyComplianceForJobsService mock) {
    impl = mock;
  }

  public EnforcePolicyComplianceResponse enforceCompliance(long jobId) {
    return enforceCompliance(new EnforcePolicyComplianceRequest().setJobId(jobId));
  }

  /**
   * Enforce job policy compliance.
   *
   * <p>Updates a job so the job clusters that are created when running the job (specified in
   * `new_cluster`) are compliant with the current versions of their respective cluster policies.
   * All-purpose clusters used in the job will not be updated.
   */
  public EnforcePolicyComplianceResponse enforceCompliance(EnforcePolicyComplianceRequest request) {
    return impl.enforceCompliance(request);
  }

  public GetPolicyComplianceResponse getCompliance(long jobId) {
    return getCompliance(new GetPolicyComplianceRequest().setJobId(jobId));
  }

  /**
   * Get job policy compliance.
   *
   * <p>Returns the policy compliance status of a job. Jobs could be out of compliance if a cluster
   * policy they use was updated after the job was last edited and some of its job clusters no
   * longer comply with their updated policies.
   */
  public GetPolicyComplianceResponse getCompliance(GetPolicyComplianceRequest request) {
    return impl.getCompliance(request);
  }

  public Iterable<JobCompliance> listCompliance(String policyId) {
    return listCompliance(new ListJobComplianceRequest().setPolicyId(policyId));
  }

  /**
   * List job policy compliance.
   *
   * <p>Returns the policy compliance status of all jobs that use a given policy. Jobs could be out
   * of compliance if a cluster policy they use was updated after the job was last edited and its
   * job clusters no longer comply with the updated policy.
   */
  public Iterable<JobCompliance> listCompliance(ListJobComplianceRequest request) {
    return new Paginator<>(
        request,
        impl::listCompliance,
        ListJobComplianceForPolicyResponse::getJobs,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public PolicyComplianceForJobsService impl() {
    return impl;
  }
}
