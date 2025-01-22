// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(
          req, DeleteAibiDashboardEmbeddingApprovedDomainsSettingResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AibiDashboardEmbeddingApprovedDomainsSetting get(
      GetAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_apprvd_domains/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AibiDashboardEmbeddingApprovedDomainsSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AibiDashboardEmbeddingApprovedDomainsSetting update(
      UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    String path = "/api/2.0/settings/types/aibi_dash_embed_ws_apprvd_domains/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AibiDashboardEmbeddingApprovedDomainsSetting.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
