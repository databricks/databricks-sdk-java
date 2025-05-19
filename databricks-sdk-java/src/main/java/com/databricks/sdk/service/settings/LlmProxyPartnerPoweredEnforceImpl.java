// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of LlmProxyPartnerPoweredEnforce */
@Generated
class LlmProxyPartnerPoweredEnforceImpl implements LlmProxyPartnerPoweredEnforceService {
  private final ApiClient apiClient;

  public LlmProxyPartnerPoweredEnforceImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public LlmProxyPartnerPoweredEnforce get(GetLlmProxyPartnerPoweredEnforceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/llm_proxy_partner_powered_enforce/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredEnforce.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LlmProxyPartnerPoweredEnforce update(UpdateLlmProxyPartnerPoweredEnforceRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/llm_proxy_partner_powered_enforce/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredEnforce.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
