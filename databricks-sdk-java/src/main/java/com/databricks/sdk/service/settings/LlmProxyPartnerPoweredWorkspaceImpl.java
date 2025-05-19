// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of LlmProxyPartnerPoweredWorkspace */
@Generated
class LlmProxyPartnerPoweredWorkspaceImpl implements LlmProxyPartnerPoweredWorkspaceService {
  private final ApiClient apiClient;

  public LlmProxyPartnerPoweredWorkspaceImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteLlmProxyPartnerPoweredWorkspaceResponse delete(
      DeleteLlmProxyPartnerPoweredWorkspaceRequest request) {
    String path = "/api/2.0/settings/types/llm_proxy_partner_powered/names/default";
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteLlmProxyPartnerPoweredWorkspaceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LlmProxyPartnerPoweredWorkspace get(GetLlmProxyPartnerPoweredWorkspaceRequest request) {
    String path = "/api/2.0/settings/types/llm_proxy_partner_powered/names/default";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredWorkspace.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LlmProxyPartnerPoweredWorkspace update(
      UpdateLlmProxyPartnerPoweredWorkspaceRequest request) {
    String path = "/api/2.0/settings/types/llm_proxy_partner_powered/names/default";
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredWorkspace.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
