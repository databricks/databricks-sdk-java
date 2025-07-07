// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of NetworkConnectivity */
@Generated
class NetworkConnectivityImpl implements NetworkConnectivityService {
  private final ApiClient apiClient;

  public NetworkConnectivityImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public NetworkConnectivityConfiguration createNetworkConnectivityConfiguration(
      CreateNetworkConnectivityConfigRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs", apiClient.configuredAccountID());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getNetworkConnectivityConfig()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, NetworkConnectivityConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NccPrivateEndpointRule createPrivateEndpointRule(
      CreatePrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    try {
      Request req =
          new Request("POST", path, apiClient.serialize(request.getPrivateEndpointRule()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, NccPrivateEndpointRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteNetworkConnectivityConfiguration(
      DeleteNetworkConnectivityConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NccPrivateEndpointRule deletePrivateEndpointRule(
      DeletePrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules/%s",
            apiClient.configuredAccountID(),
            request.getNetworkConnectivityConfigId(),
            request.getPrivateEndpointRuleId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, NccPrivateEndpointRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NetworkConnectivityConfiguration getNetworkConnectivityConfiguration(
      GetNetworkConnectivityConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, NetworkConnectivityConfiguration.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NccPrivateEndpointRule getPrivateEndpointRule(GetPrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules/%s",
            apiClient.configuredAccountID(),
            request.getNetworkConnectivityConfigId(),
            request.getPrivateEndpointRuleId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, NccPrivateEndpointRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListNetworkConnectivityConfigurationsResponse listNetworkConnectivityConfigurations(
      ListNetworkConnectivityConfigurationsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListNetworkConnectivityConfigurationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPrivateEndpointRulesResponse listPrivateEndpointRules(
      ListPrivateEndpointRulesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPrivateEndpointRulesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public NccPrivateEndpointRule updatePrivateEndpointRule(
      UpdateNccPrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules/%s",
            apiClient.configuredAccountID(),
            request.getNetworkConnectivityConfigId(),
            request.getPrivateEndpointRuleId());
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getPrivateEndpointRule()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, NccPrivateEndpointRule.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
