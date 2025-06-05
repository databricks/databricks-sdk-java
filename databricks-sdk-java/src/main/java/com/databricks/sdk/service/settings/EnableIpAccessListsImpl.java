// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of EnableIpAccessLists */
@Generated
class EnableIpAccessListsImpl implements EnableIpAccessListsService {
  private final ApiClient apiClient;

  public EnableIpAccessListsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteAccountIpAccessEnableResponse delete(DeleteAccountIpAccessEnableRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/acct_ip_acl_enable/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeleteAccountIpAccessEnableResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountIpAccessEnable get(GetAccountIpAccessEnableRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/acct_ip_acl_enable/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountIpAccessEnable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountIpAccessEnable update(UpdateAccountIpAccessEnableRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/acct_ip_acl_enable/names/default",
            apiClient.configuredAccountID());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountIpAccessEnable.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
