// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AibiDashboardEmbeddingApprovedDomains */
@Generated
class AibiDashboardEmbeddingApprovedDomainsImpl
    implements AibiDashboardEmbeddingApprovedDomainsService {
  private final ApiClient apiClient;

  public AibiDashboardEmbeddingApprovedDomainsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteAibiDashboardEmbeddingApprovedDomainsSettingResponse delete(
      DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_apprvd_domains/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "DELETE",
        path,
        request,
        DeleteAibiDashboardEmbeddingApprovedDomainsSettingResponse.class,
        headers);
  }

  @Override
  public AibiDashboardEmbeddingApprovedDomainsSetting get(
      GetAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_apprvd_domains/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, AibiDashboardEmbeddingApprovedDomainsSetting.class, headers);
  }

  @Override
  public AibiDashboardEmbeddingApprovedDomainsSetting update(
      UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_apprvd_domains/names/default";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute(
        "PATCH", path, request, AibiDashboardEmbeddingApprovedDomainsSetting.class, headers);
  }
}
