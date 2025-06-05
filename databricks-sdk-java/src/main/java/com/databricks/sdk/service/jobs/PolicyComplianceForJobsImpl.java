// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EnforcePolicyComplianceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetPolicyComplianceResponse getCompliance(GetPolicyComplianceRequest request) {
    String path = "/api/2.0/policies/jobs/get-compliance";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPolicyComplianceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListJobComplianceForPolicyResponse listCompliance(ListJobComplianceRequest request) {
    String path = "/api/2.0/policies/jobs/list-compliance";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListJobComplianceForPolicyResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
