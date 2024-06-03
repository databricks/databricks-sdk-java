// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Providers are the entities that publish listings to the Marketplace.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ConsumerProvidersService {
  /**
   * Get one batch of providers. One may specify up to 50 IDs per request.
   *
   * <p>Batch get a provider in the Databricks Marketplace with at least one visible listing.
   */
  BatchGetProvidersResponse batchGet(BatchGetProvidersRequest batchGetProvidersRequest);

  /**
   * Get a provider.
   *
   * <p>Get a provider in the Databricks Marketplace with at least one visible listing.
   */
  GetProviderResponse get(GetProviderRequest getProviderRequest);

  /**
   * List providers.
   *
   * <p>List all providers in the Databricks Marketplace with at least one visible listing.
   */
  ListProvidersResponse list(ListProvidersRequest listProvidersRequest);
}
