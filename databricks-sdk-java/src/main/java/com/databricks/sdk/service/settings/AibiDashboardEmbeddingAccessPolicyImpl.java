// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE",
        path,
        request,
        DeleteAibiDashboardEmbeddingAccessPolicySettingResponse.class,
        headers);
  }

  @Override
  public AibiDashboardEmbeddingAccessPolicySetting get(
      GetAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_acc_policy/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, AibiDashboardEmbeddingAccessPolicySetting.class, headers);
  }

  @Override
  public AibiDashboardEmbeddingAccessPolicySetting update(
      UpdateAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_acc_policy/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute(
        "PATCH", path, request, AibiDashboardEmbeddingAccessPolicySetting.class, headers);
  }
}
