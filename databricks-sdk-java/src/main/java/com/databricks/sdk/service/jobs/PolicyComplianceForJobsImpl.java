// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of PolicyComplianceForJobs */
@Generated
class PolicyComplianceForJobsImpl implements PolicyComplianceForJobsService {
  private final ApiClient apiClient;

  public PolicyComplianceForJobsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnforcePolicyComplianceResponse enforceCompliance(EnforcePolicyComplianceRequest request) {
    String path = "/api/2.0/policies/jobs/enforce-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, EnforcePolicyComplianceResponse.class, headers);
  }

  @Override
  public GetPolicyComplianceResponse getCompliance(GetPolicyComplianceRequest request) {
    String path = "/api/2.0/policies/jobs/get-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetPolicyComplianceResponse.class, headers);
  }

  @Override
  public ListJobComplianceForPolicyResponse listCompliance(ListJobComplianceRequest request) {
    String path = "/api/2.0/policies/jobs/list-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListJobComplianceForPolicyResponse.class, headers);
  }
}
