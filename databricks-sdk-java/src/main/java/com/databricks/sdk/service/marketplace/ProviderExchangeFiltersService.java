// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Marketplace exchanges filters curate which groups can access an exchange.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderExchangeFiltersService {
  /** Add an exchange filter. */
  CreateExchangeFilterResponse create(CreateExchangeFilterRequest createExchangeFilterRequest);

  /** Delete an exchange filter */
  void delete(DeleteExchangeFilterRequest deleteExchangeFilterRequest);

  /** List exchange filter */
  ListExchangeFiltersResponse list(ListExchangeFiltersRequest listExchangeFiltersRequest);

  /** Update an exchange filter. */
  UpdateExchangeFilterResponse update(UpdateExchangeFilterRequest updateExchangeFilterRequest);
}
