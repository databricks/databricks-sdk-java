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
  /** Create a provider */
  CreateProviderResponse create(CreateProviderRequest createProviderRequest);

  /** Delete provider */
  void delete(DeleteProviderRequest deleteProviderRequest);

  /** Get provider profile */
  GetProviderResponse get(GetProviderRequest getProviderRequest);

  /** List provider profiles for account. */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /** Update provider profile */
  UpdateProviderResponse update(UpdateProviderRequest updateProviderRequest);
}
