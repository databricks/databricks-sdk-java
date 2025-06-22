// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Personalization Requests allow customers to interact with the individualized Marketplace listing
 * flow.
 */
@Generated
public class ConsumerPersonalizationRequestsAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(ConsumerPersonalizationRequestsAPI.class);

  private final ConsumerPersonalizationRequestsService impl;

  /** Regular-use constructor */
  public ConsumerPersonalizationRequestsAPI(ApiClient apiClient) {
    impl = new ConsumerPersonalizationRequestsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConsumerPersonalizationRequestsAPI(ConsumerPersonalizationRequestsService mock) {
    impl = mock;
  }

  public CreatePersonalizationRequestResponse create(
      String listingId, String intendedUse, ConsumerTerms acceptedConsumerTerms) {
    return create(
        new CreatePersonalizationRequest()
            .setListingId(listingId)
            .setIntendedUse(intendedUse)
            .setAcceptedConsumerTerms(acceptedConsumerTerms));
  }

  /** Create a personalization request for a listing. */
  public CreatePersonalizationRequestResponse create(CreatePersonalizationRequest request) {
    return impl.create(request);
  }

  public GetPersonalizationRequestResponse get(String listingId) {
    return get(new GetPersonalizationRequestRequest().setListingId(listingId));
  }

  /**
   * Get the personalization request for a listing. Each consumer can make at *most* one
   * personalization request for a listing.
   */
  public GetPersonalizationRequestResponse get(GetPersonalizationRequestRequest request) {
    return impl.get(request);
  }

  /** List personalization requests for a consumer across all listings. */
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

  public ConsumerPersonalizationRequestsService impl() {
    return impl;
  }
}
