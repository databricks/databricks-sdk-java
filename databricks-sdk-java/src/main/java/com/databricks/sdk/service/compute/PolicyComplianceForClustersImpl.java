// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of PolicyComplianceForClusters */
@Generated
class PolicyComplianceForClustersImpl implements PolicyComplianceForClustersService {
  private final ApiClient apiClient;

  public PolicyComplianceForClustersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EnforceClusterComplianceResponse enforceCompliance(
      EnforceClusterComplianceRequest request) {
    String path = "/api/2.0/policies/clusters/enforce-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute(
        "POST", path, request, EnforceClusterComplianceResponse.class, headers);
  }

  @Override
  public GetClusterComplianceResponse getCompliance(GetClusterComplianceRequest request) {
    String path = "/api/2.0/policies/clusters/get-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetClusterComplianceResponse.class, headers);
  }

  @Override
  public ListClusterCompliancesResponse listCompliance(ListClusterCompliancesRequest request) {
    String path = "/api/2.0/policies/clusters/list-compliance";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListClusterCompliancesResponse.class, headers);
  }
}
