// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EnforceClusterComplianceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetClusterComplianceResponse getCompliance(GetClusterComplianceRequest request) {
    String path = "/api/2.0/policies/clusters/get-compliance";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetClusterComplianceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListClusterCompliancesResponse listCompliance(ListClusterCompliancesRequest request) {
    String path = "/api/2.0/policies/clusters/list-compliance";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListClusterCompliancesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
