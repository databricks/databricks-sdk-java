// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Personalization Requests allow customers to interact with the individualized Marketplace listing
 * flow.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ConsumerPersonalizationRequestsService {
  /**
   * Create a personalization request.
   *
   * <p>Create a personalization request for a listing.
   */
  CreatePersonalizationRequestResponse create(
      CreatePersonalizationRequest createPersonalizationRequest);

  /**
   * Get the personalization request for a listing.
   *
   * <p>Get the personalization request for a listing. Each consumer can make at *most* one
   * personalization request for a listing.
   */
  GetPersonalizationRequestResponse get(
      GetPersonalizationRequestRequest getPersonalizationRequestRequest);

  /**
   * List all personalization requests.
   *
   * <p>List personalization requests for a consumer across all listings.
   */
  ListAllPersonalizationRequestsResponse list(
      ListAllPersonalizationRequestsRequest listAllPersonalizationRequestsRequest);
}
