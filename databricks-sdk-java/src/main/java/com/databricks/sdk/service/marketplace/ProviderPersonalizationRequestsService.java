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
   * Update personalization request. This method only permits updating the status of the request.
   */
  UpdatePersonalizationRequestResponse update(
      UpdatePersonalizationRequestRequest updatePersonalizationRequestRequest);
}
