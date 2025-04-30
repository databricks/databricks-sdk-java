// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs provide configurations for the network connectivity of your workspaces for serverless
 * compute resources. This API provides stable subnets for your workspace so that you can configure
 * your firewalls on your Azure Storage accounts to allow access from Databricks. You can also use
 * the API to provision private endpoints for Databricks to privately connect serverless compute
 * resources to your Azure resources using Azure Private Link. See [configure serverless secure
 * connectivity].
 *
 * <p>[configure serverless secure connectivity]:
 * https://learn.microsoft.com/azure/databricks/security/network/serverless-network-security
 */
@Generated
public class NetworkConnectivityAPI {
  private static final Logger LOG = LoggerFactory.getLogger(NetworkConnectivityAPI.class);

  private final NetworkConnectivityService impl;

  /** Regular-use constructor */
  public NetworkConnectivityAPI(ApiClient apiClient) {
    impl = new NetworkConnectivityImpl(apiClient);
  }

  /** Constructor for mocks */
  public NetworkConnectivityAPI(NetworkConnectivityService mock) {
    impl = mock;
  }

  public NetworkConnectivityConfiguration createNetworkConnectivityConfiguration(
      CreateNetworkConnectivityConfiguration networkConnectivityConfig) {
    return createNetworkConnectivityConfiguration(
        new CreateNetworkConnectivityConfigRequest()
            .setNetworkConnectivityConfig(networkConnectivityConfig));
  }

  /**
   * Create a network connectivity configuration.
   *
   * <p>Creates a network connectivity configuration (NCC), which provides stable Azure service
   * subnets when accessing your Azure Storage accounts. You can also use a network connectivity
   * configuration to create Databricks managed private endpoints so that Databricks serverless
   * compute resources privately access your resources.
   *
   * <p>**IMPORTANT**: After you create the network connectivity configuration, you must assign one
   * or more workspaces to the new network connectivity configuration. You can share one network
   * connectivity configuration with multiple workspaces from the same Azure region within the same
   * Databricks account. See [configure serverless secure connectivity].
   *
   * <p>[configure serverless secure connectivity]:
   * https://learn.microsoft.com/azure/databricks/security/network/serverless-network-security
   */
  public NetworkConnectivityConfiguration createNetworkConnectivityConfiguration(
      CreateNetworkConnectivityConfigRequest request) {
    return impl.createNetworkConnectivityConfiguration(request);
  }

  public NccAzurePrivateEndpointRule createPrivateEndpointRule(
      String networkConnectivityConfigId, CreatePrivateEndpointRule privateEndpointRule) {
    return createPrivateEndpointRule(
        new CreatePrivateEndpointRuleRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId)
            .setPrivateEndpointRule(privateEndpointRule));
  }

  /**
   * Create a private endpoint rule.
   *
   * <p>Create a private endpoint rule for the specified network connectivity config object. Once
   * the object is created, Databricks asynchronously provisions a new Azure private endpoint to
   * your specified Azure resource.
   *
   * <p>**IMPORTANT**: You must use Azure portal or other Azure tools to approve the private
   * endpoint to complete the connection. To get the information of the private endpoint created,
   * make a `GET` request on the new private endpoint rule. See [serverless private link].
   *
   * <p>[serverless private link]:
   * https://learn.microsoft.com/azure/databricks/security/network/serverless-network-security/serverless-private-link
   */
  public NccAzurePrivateEndpointRule createPrivateEndpointRule(
      CreatePrivateEndpointRuleRequest request) {
    return impl.createPrivateEndpointRule(request);
  }

  public void deleteNetworkConnectivityConfiguration(String networkConnectivityConfigId) {
    deleteNetworkConnectivityConfiguration(
        new DeleteNetworkConnectivityConfigurationRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId));
  }

  /**
   * Delete a network connectivity configuration.
   *
   * <p>Deletes a network connectivity configuration.
   */
  public void deleteNetworkConnectivityConfiguration(
      DeleteNetworkConnectivityConfigurationRequest request) {
    impl.deleteNetworkConnectivityConfiguration(request);
  }

  public NccAzurePrivateEndpointRule deletePrivateEndpointRule(
      String networkConnectivityConfigId, String privateEndpointRuleId) {
    return deletePrivateEndpointRule(
        new DeletePrivateEndpointRuleRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId)
            .setPrivateEndpointRuleId(privateEndpointRuleId));
  }

  /**
   * Delete a private endpoint rule.
   *
   * <p>Initiates deleting a private endpoint rule. If the connection state is PENDING or EXPIRED,
   * the private endpoint is immediately deleted. Otherwise, the private endpoint is deactivated and
   * will be deleted after seven days of deactivation. When a private endpoint is deactivated, the
   * `deactivated` field is set to `true` and the private endpoint is not available to your
   * serverless compute resources.
   */
  public NccAzurePrivateEndpointRule deletePrivateEndpointRule(
      DeletePrivateEndpointRuleRequest request) {
    return impl.deletePrivateEndpointRule(request);
  }

  public NetworkConnectivityConfiguration getNetworkConnectivityConfiguration(
      String networkConnectivityConfigId) {
    return getNetworkConnectivityConfiguration(
        new GetNetworkConnectivityConfigurationRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId));
  }

  /**
   * Get a network connectivity configuration.
   *
   * <p>Gets a network connectivity configuration.
   */
  public NetworkConnectivityConfiguration getNetworkConnectivityConfiguration(
      GetNetworkConnectivityConfigurationRequest request) {
    return impl.getNetworkConnectivityConfiguration(request);
  }

  public NccAzurePrivateEndpointRule getPrivateEndpointRule(
      String networkConnectivityConfigId, String privateEndpointRuleId) {
    return getPrivateEndpointRule(
        new GetPrivateEndpointRuleRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId)
            .setPrivateEndpointRuleId(privateEndpointRuleId));
  }

  /**
   * Gets a private endpoint rule.
   *
   * <p>Gets the private endpoint rule.
   */
  public NccAzurePrivateEndpointRule getPrivateEndpointRule(GetPrivateEndpointRuleRequest request) {
    return impl.getPrivateEndpointRule(request);
  }

  /**
   * List network connectivity configurations.
   *
   * <p>Gets an array of network connectivity configurations.
   */
  public Iterable<NetworkConnectivityConfiguration> listNetworkConnectivityConfigurations(
      ListNetworkConnectivityConfigurationsRequest request) {
    return new Paginator<>(
        request,
        impl::listNetworkConnectivityConfigurations,
        ListNetworkConnectivityConfigurationsResponse::getItems,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<NccAzurePrivateEndpointRule> listPrivateEndpointRules(
      String networkConnectivityConfigId) {
    return listPrivateEndpointRules(
        new ListPrivateEndpointRulesRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId));
  }

  /**
   * List private endpoint rules.
   *
   * <p>Gets an array of private endpoint rules.
   */
  public Iterable<NccAzurePrivateEndpointRule> listPrivateEndpointRules(
      ListPrivateEndpointRulesRequest request) {
    return new Paginator<>(
        request,
        impl::listPrivateEndpointRules,
        ListNccAzurePrivateEndpointRulesResponse::getItems,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public NccAzurePrivateEndpointRule updateNccAzurePrivateEndpointRulePublic(
      String networkConnectivityConfigId,
      String privateEndpointRuleId,
      UpdatePrivateEndpointRule privateEndpointRule,
      String updateMask) {
    return updateNccAzurePrivateEndpointRulePublic(
        new UpdateNccAzurePrivateEndpointRulePublicRequest()
            .setNetworkConnectivityConfigId(networkConnectivityConfigId)
            .setPrivateEndpointRuleId(privateEndpointRuleId)
            .setPrivateEndpointRule(privateEndpointRule)
            .setUpdateMask(updateMask));
  }

  /**
   * Update a private endpoint rule.
   *
   * <p>Updates a private endpoint rule. Currently only a private endpoint rule to customer-managed
   * resources is allowed to be updated.
   */
  public NccAzurePrivateEndpointRule updateNccAzurePrivateEndpointRulePublic(
      UpdateNccAzurePrivateEndpointRulePublicRequest request) {
    return impl.updateNccAzurePrivateEndpointRulePublic(request);
  }

  public NetworkConnectivityService impl() {
    return impl;
  }
}
