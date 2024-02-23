// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs enable administrators to manage service principal secrets.
 *
 * <p>You can use the generated secrets to obtain OAuth access tokens for a service principal, which
 * can then be used to access Databricks Accounts and Workspace APIs. For more information, see
 * [Authentication using OAuth tokens for service principals],
 *
 * <p>In addition, the generated secrets can be used to configure the Databricks Terraform Provider
 * to authenticate with the service principal. For more information, see [Databricks Terraform
 * Provider].
 *
 * <p>[Authentication using OAuth tokens for service principals]:
 * https://docs.databricks.com/dev-tools/authentication-oauth.html [Databricks Terraform Provider]:
 * https://github.com/databricks/terraform-provider-databricks/blob/master/docs/index.md#authenticating-with-service-principal
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ServicePrincipalSecretsService {
  /**
   * Create service principal secret.
   *
   * <p>Create a secret for the given service principal.
   */
  CreateServicePrincipalSecretResponse create(
      CreateServicePrincipalSecretRequest createServicePrincipalSecretRequest);

  /**
   * Delete service principal secret.
   *
   * <p>Delete a secret from the given service principal.
   */
  void delete(DeleteServicePrincipalSecretRequest deleteServicePrincipalSecretRequest);

  /**
   * List service principal secrets.
   *
   * <p>List all secrets associated with the given service principal. This operation only returns
   * information about the secrets themselves and does not include the secret values.
   */
  ListServicePrincipalSecretsResponse list(
      ListServicePrincipalSecretsRequest listServicePrincipalSecretsRequest);
}
