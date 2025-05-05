// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

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
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface NetworkConnectivityService {
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
  NetworkConnectivityConfiguration createNetworkConnectivityConfiguration(
      CreateNetworkConnectivityConfigRequest createNetworkConnectivityConfigRequest);

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
  NccAzurePrivateEndpointRule createPrivateEndpointRule(
      CreatePrivateEndpointRuleRequest createPrivateEndpointRuleRequest);

  /**
   * Delete a network connectivity configuration.
   *
   * <p>Deletes a network connectivity configuration.
   */
  void deleteNetworkConnectivityConfiguration(
      DeleteNetworkConnectivityConfigurationRequest deleteNetworkConnectivityConfigurationRequest);

  /**
   * Delete a private endpoint rule.
   *
   * <p>Initiates deleting a private endpoint rule. If the connection state is PENDING or EXPIRED,
   * the private endpoint is immediately deleted. Otherwise, the private endpoint is deactivated and
   * will be deleted after seven days of deactivation. When a private endpoint is deactivated, the
   * `deactivated` field is set to `true` and the private endpoint is not available to your
   * serverless compute resources.
   */
  NccAzurePrivateEndpointRule deletePrivateEndpointRule(
      DeletePrivateEndpointRuleRequest deletePrivateEndpointRuleRequest);

  /**
   * Get a network connectivity configuration.
   *
   * <p>Gets a network connectivity configuration.
   */
  NetworkConnectivityConfiguration getNetworkConnectivityConfiguration(
      GetNetworkConnectivityConfigurationRequest getNetworkConnectivityConfigurationRequest);

  /**
   * Gets a private endpoint rule.
   *
   * <p>Gets the private endpoint rule.
   */
  NccAzurePrivateEndpointRule getPrivateEndpointRule(
      GetPrivateEndpointRuleRequest getPrivateEndpointRuleRequest);

  /**
   * List network connectivity configurations.
   *
   * <p>Gets an array of network connectivity configurations.
   */
  ListNetworkConnectivityConfigurationsResponse listNetworkConnectivityConfigurations(
      ListNetworkConnectivityConfigurationsRequest listNetworkConnectivityConfigurationsRequest);

  /**
   * List private endpoint rules.
   *
   * <p>Gets an array of private endpoint rules.
   */
  ListNccAzurePrivateEndpointRulesResponse listPrivateEndpointRules(
      ListPrivateEndpointRulesRequest listPrivateEndpointRulesRequest);

  /**
   * Update a private endpoint rule.
   *
   * <p>Updates a private endpoint rule. Currently only a private endpoint rule to customer-managed
   * resources is allowed to be updated.
   */
  NccAzurePrivateEndpointRule updateNccAzurePrivateEndpointRulePublic(
      UpdateNccAzurePrivateEndpointRulePublicRequest
          updateNccAzurePrivateEndpointRulePublicRequest);
}
