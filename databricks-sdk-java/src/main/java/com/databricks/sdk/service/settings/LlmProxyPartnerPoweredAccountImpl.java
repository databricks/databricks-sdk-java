// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of LlmProxyPartnerPoweredAccount */
@Generated
class LlmProxyPartnerPoweredAccountImpl implements LlmProxyPartnerPoweredAccountService {
  private final ApiClient apiClient;

  public LlmProxyPartnerPoweredAccountImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public LlmProxyPartnerPoweredAccount get(GetLlmProxyPartnerPoweredAccountRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/llm_proxy_partner_powered/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredAccount.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public LlmProxyPartnerPoweredAccount update(UpdateLlmProxyPartnerPoweredAccountRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/llm_proxy_partner_powered/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, LlmProxyPartnerPoweredAccount.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
