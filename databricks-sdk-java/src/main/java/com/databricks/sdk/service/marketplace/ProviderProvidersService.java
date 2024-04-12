// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Providers are entities that manage assets in Marketplace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderProvidersService {
  /**
   * Create a provider.
   *
   * <p>Create a provider
   */
  CreateProviderResponse create(CreateProviderRequest createProviderRequest);

  /**
   * Delete provider.
   *
   * <p>Delete provider
   */
  void delete(DeleteProviderRequest deleteProviderRequest);

  /**
   * Get provider.
   *
   * <p>Get provider profile
   */
  GetProviderResponse get(GetProviderRequest getProviderRequest);

  /**
   * List providers.
   *
   * <p>List provider profiles for account.
   */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /**
   * Update provider.
   *
   * <p>Update provider profile
   */
  UpdateProviderResponse update(UpdateProviderRequest updateProviderRequest);
}
