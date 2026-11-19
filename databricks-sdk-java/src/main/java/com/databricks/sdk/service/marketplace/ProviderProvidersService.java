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
  /** Creates a provider profile in the caller's account. Returns the ID of the new profile. */
  CreateProviderResponse create(CreateProviderRequest createProviderRequest);

  /** Deletes a provider profile and all of the listings that it owns. */
  void delete(DeleteProviderRequest deleteProviderRequest);

  /** Gets a provider profile by ID. */
  GetProviderResponse get(GetProviderRequest getProviderRequest);

  /** Lists the provider profiles in the caller's account. */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);

  /** Updates a provider profile. Send the full profile definition. */
  UpdateProviderResponse update(UpdateProviderRequest updateProviderRequest);
}
