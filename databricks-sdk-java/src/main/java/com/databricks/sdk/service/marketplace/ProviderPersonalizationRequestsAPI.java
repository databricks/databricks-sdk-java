// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Personalization requests are an alternate to instantly available listings. Control the lifecycle
 * of personalized solutions.
 */
@Generated
public class ProviderPersonalizationRequestsAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(ProviderPersonalizationRequestsAPI.class);

  private final ProviderPersonalizationRequestsService impl;

  /** Regular-use constructor */
  public ProviderPersonalizationRequestsAPI(ApiClient apiClient) {
    impl = new ProviderPersonalizationRequestsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ProviderPersonalizationRequestsAPI(ProviderPersonalizationRequestsService mock) {
    impl = mock;
  }

  /**
   * List personalization requests to this provider. This will return all personalization requests,
   * regardless of which listing they are for.
   */
  public Iterable<PersonalizationRequest> list(ListAllPersonalizationRequestsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListAllPersonalizationRequestsResponse::getPersonalizationRequests,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public UpdatePersonalizationRequestResponse update(
      String listingId, String requestId, PersonalizationRequestStatus status) {
    return update(
        new UpdatePersonalizationRequestRequest()
            .setListingId(listingId)
            .setRequestId(requestId)
            .setStatus(status));
  }

  /**
   * Update personalization request. This method only permits updating the status of the request.
   */
  public UpdatePersonalizationRequestResponse update(UpdatePersonalizationRequestRequest request) {
    return impl.update(request);
  }

  public ProviderPersonalizationRequestsService impl() {
    return impl;
  }
}
