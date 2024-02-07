// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, NetworkConnectivityConfiguration.class, headers);
  }

  @Override
  public NccAzurePrivateEndpointRule createPrivateEndpointRule(
      CreatePrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, NccAzurePrivateEndpointRule.class, headers);
  }

  @Override
  public void deleteNetworkConnectivityConfiguration(
      DeleteNetworkConnectivityConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public NccAzurePrivateEndpointRule deletePrivateEndpointRule(
      DeletePrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules/%s",
            apiClient.configuredAccountID(),
            request.getNetworkConnectivityConfigId(),
            request.getPrivateEndpointRuleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.DELETE(path, request, NccAzurePrivateEndpointRule.class, headers);
  }

  @Override
  public NetworkConnectivityConfiguration getNetworkConnectivityConfiguration(
      GetNetworkConnectivityConfigurationRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, NetworkConnectivityConfiguration.class, headers);
  }

  @Override
  public NccAzurePrivateEndpointRule getPrivateEndpointRule(GetPrivateEndpointRuleRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules/%s",
            apiClient.configuredAccountID(),
            request.getNetworkConnectivityConfigId(),
            request.getPrivateEndpointRuleId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, NccAzurePrivateEndpointRule.class, headers);
  }

  @Override
  public ListNetworkConnectivityConfigurationsResponse listNetworkConnectivityConfigurations(
      ListNetworkConnectivityConfigurationsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(
        path, request, ListNetworkConnectivityConfigurationsResponse.class, headers);
  }

  @Override
  public ListNccAzurePrivateEndpointRulesResponse listPrivateEndpointRules(
      ListPrivateEndpointRulesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-connectivity-configs/%s/private-endpoint-rules",
            apiClient.configuredAccountID(), request.getNetworkConnectivityConfigId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListNccAzurePrivateEndpointRulesResponse.class, headers);
  }
}
