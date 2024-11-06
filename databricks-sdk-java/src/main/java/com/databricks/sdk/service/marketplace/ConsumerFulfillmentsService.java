// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Fulfillments are entities that allow consumers to preview installations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ConsumerFulfillmentsService {
  /**
   * Get listing content metadata.
   *
   * <p>Get a high level preview of the metadata of listing installable content.
   */
  GetListingContentMetadataResponse get(
      GetListingContentMetadataRequest getListingContentMetadataRequest);

  /**
   * List all listing fulfillments.
   *
   * <p>Get all listings fulfillments associated with a listing. A _fulfillment_ is a potential
   * installation. Standard installations contain metadata about the attached share or git repo.
   * Only one of these fields will be present. Personalized installations contain metadata about the
   * attached share or git repo, as well as the Delta Sharing recipient type.
   */
  ListFulfillmentsResponse list(ListFulfillmentsRequest listFulfillmentsRequest);
}
