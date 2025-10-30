// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AibiDashboardEmbeddingAccessPolicy */
@Generated
class AibiDashboardEmbeddingAccessPolicyImpl implements AibiDashboardEmbeddingAccessPolicyService {
  private final ApiClient apiClient;

  public AibiDashboardEmbeddingAccessPolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteAibiDashboardEmbeddingAccessPolicySettingResponse delete(
      DeleteAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_acc_policy/names/default";
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteAibiDashboardEmbeddingAccessPolicySettingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AibiDashboardEmbeddingAccessPolicySetting get(
      GetAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_acc_policy/names/default";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AibiDashboardEmbeddingAccessPolicySetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AibiDashboardEmbeddingAccessPolicySetting update(
      UpdateAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_acc_policy/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AibiDashboardEmbeddingAccessPolicySetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
