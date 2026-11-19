// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;

/**
 * Personalization requests are an alternate to instantly available listings. Control the lifecycle
 * of personalized solutions.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface ProviderPersonalizationRequestsService {
  /**
   * List personalization requests to this provider. This will return all personalization requests,
   * regardless of which listing they are for.
   */
  ListAllPersonalizationRequestsResponse list(
      ListAllPersonalizationRequestsRequest listAllPersonalizationRequestsRequest);

  /**
   * Updates the status of a personalization request; other properties of the request cannot be
   * changed. Fulfilling a request grants the consumer access to the share, and denying a fulfilled
   * request revokes that access. The listing must be published.
   */
  UpdatePersonalizationRequestResponse update(
      UpdatePersonalizationRequestRequest updatePersonalizationRequestRequest);
}
