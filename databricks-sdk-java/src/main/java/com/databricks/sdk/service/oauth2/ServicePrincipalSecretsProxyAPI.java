// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs enable administrators to manage service principal secrets at the workspace level. To
 * use these APIs, the service principal must be first added to the current workspace.
 *
 * <p>You can use the generated secrets to obtain OAuth access tokens for a service principal, which
 * can then be used to access Databricks Accounts and Workspace APIs. For more information, see
 * [Authentication using OAuth tokens for service principals].
 *
 * <p>In addition, the generated secrets can be used to configure the Databricks Terraform
 * Providerto authenticate with the service principal. For more information, see [Databricks
 * Terraform Provider].
 *
 * <p>[Authentication using OAuth tokens for service principals]:
 * https://docs.databricks.com/dev-tools/authentication-oauth.html [Databricks Terraform Provider]:
 * https://github.com/databricks/terraform-provider-databricks/blob/master/docs/index.md#authenticating-with-service-principal
 */
@Generated
public class ServicePrincipalSecretsProxyAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ServicePrincipalSecretsProxyAPI.class);

  private final ServicePrincipalSecretsProxyService impl;

  /** Regular-use constructor */
  public ServicePrincipalSecretsProxyAPI(ApiClient apiClient) {
    impl = new ServicePrincipalSecretsProxyImpl(apiClient);
  }

  /** Constructor for mocks */
  public ServicePrincipalSecretsProxyAPI(ServicePrincipalSecretsProxyService mock) {
    impl = mock;
  }

  /** Create a secret for the given service principal. */
  public CreateServicePrincipalSecretResponse create(CreateServicePrincipalSecretRequest request) {
    return impl.create(request);
  }

  public void delete(String servicePrincipalId, String secretId) {
    delete(
        new DeleteServicePrincipalSecretRequest()
            .setServicePrincipalId(servicePrincipalId)
            .setSecretId(secretId));
  }

  /** Delete a secret from the given service principal. */
  public void delete(DeleteServicePrincipalSecretRequest request) {
    impl.delete(request);
  }

  public Iterable<SecretInfo> list(String servicePrincipalId) {
    return list(new ListServicePrincipalSecretsRequest().setServicePrincipalId(servicePrincipalId));
  }

  /**
   * List all secrets associated with the given service principal. This operation only returns
   * information about the secrets themselves and does not include the secret values.
   */
  public Iterable<SecretInfo> list(ListServicePrincipalSecretsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListServicePrincipalSecretsResponse::getSecrets,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public ServicePrincipalSecretsProxyService impl() {
    return impl;
  }
}
