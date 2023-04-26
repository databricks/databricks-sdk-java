// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Databricks Providers REST API
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ProvidersAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ProvidersAPI.class);

  private final ProvidersService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ProvidersAPI(ApiClient apiClient) {
    impl = new ProvidersImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sharing.ProvidersService} object
   */
  public ProvidersAPI(ProvidersService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo create(String name, AuthenticationType authenticationType) {
    return create(new CreateProvider().setName(name).setAuthenticationType(authenticationType));
  }

  /**
   * Create an auth provider.
   *
   * <p>Creates a new authentication provider minimally based on a name and authentication type. The
   * caller must be an admin on the metastore.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.CreateProvider} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo create(CreateProvider request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void delete(String name) {
    delete(new DeleteProviderRequest().setName(name));
  }

  /**
   * Delete a provider.
   *
   * <p>Deletes an authentication provider, if the caller is a metastore admin or is the owner of
   * the provider.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.DeleteProviderRequest} object
   */
  public void delete(DeleteProviderRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo get(String name) {
    return get(new GetProviderRequest().setName(name));
  }

  /**
   * Get a provider.
   *
   * <p>Gets a specific authentication provider. The caller must supply the name of the provider,
   * and must either be a metastore admin or the owner of the provider.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.GetProviderRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo get(GetProviderRequest request) {
    return impl.get(request);
  }

  /**
   * List providers.
   *
   * <p>Gets an array of available authentication providers. The caller must either be a metastore
   * admin or the owner of the providers. Providers not owned by the caller are not included in the
   * response. There is no guarantee of a specific ordering of the elements in the array.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.ListProvidersRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<ProviderInfo> list(ListProvidersRequest request) {
    return impl.list(request).getProviders();
  }

  /**
   * <p>listShares.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProviderSharesResponse} object
   */
  public ListProviderSharesResponse listShares(String name) {
    return listShares(new ListSharesRequest().setName(name));
  }

  /**
   * List shares by Provider.
   *
   * <p>Gets an array of a specified provider's shares within the metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.ListSharesRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.ListProviderSharesResponse} object
   */
  public ListProviderSharesResponse listShares(ListSharesRequest request) {
    return impl.listShares(request);
  }

  /**
   * <p>update.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo update(String name) {
    return update(new UpdateProvider().setName(name));
  }

  /**
   * Update a provider.
   *
   * <p>Updates the information for an authentication provider, if the caller is a metastore admin
   * or is the owner of the provider. If the update changes the provider name, the caller must be
   * both a metastore admin and the owner of the provider.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.UpdateProvider} object
   * @return a {@link com.databricks.sdk.service.sharing.ProviderInfo} object
   */
  public ProviderInfo update(UpdateProvider request) {
    return impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.ProvidersService} object
   */
  public ProvidersService impl() {
    return impl;
  }
}
