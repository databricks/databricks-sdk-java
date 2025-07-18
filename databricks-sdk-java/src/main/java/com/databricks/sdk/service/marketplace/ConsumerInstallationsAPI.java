// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Installations are entities that allow consumers to interact with Databricks Marketplace listings.
 */
@Generated
public class ConsumerInstallationsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(ConsumerInstallationsAPI.class);

  private final ConsumerInstallationsService impl;

  /** Regular-use constructor */
  public ConsumerInstallationsAPI(ApiClient apiClient) {
    impl = new ConsumerInstallationsImpl(apiClient);
  }

  /** Constructor for mocks */
  public ConsumerInstallationsAPI(ConsumerInstallationsService mock) {
    impl = mock;
  }

  /** Install payload associated with a Databricks Marketplace listing. */
  public Installation create(CreateInstallationRequest request) {
    return impl.create(request);
  }

  public void delete(String listingId, String installationId) {
    delete(
        new DeleteInstallationRequest().setListingId(listingId).setInstallationId(installationId));
  }

  /** Uninstall an installation associated with a Databricks Marketplace listing. */
  public void delete(DeleteInstallationRequest request) {
    impl.delete(request);
  }

  /** List all installations across all listings. */
  public Iterable<InstallationDetail> list(ListAllInstallationsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListAllInstallationsResponse::getInstallations,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public Iterable<InstallationDetail> listListingInstallations(String listingId) {
    return listListingInstallations(new ListInstallationsRequest().setListingId(listingId));
  }

  /** List all installations for a particular listing. */
  public Iterable<InstallationDetail> listListingInstallations(ListInstallationsRequest request) {
    return new Paginator<>(
        request,
        impl::listListingInstallations,
        ListInstallationsResponse::getInstallations,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * This is a update API that will update the part of the fields defined in the installation table
   * as well as interact with external services according to the fields not included in the
   * installation table 1. the token will be rotate if the rotateToken flag is true 2. the token
   * will be forcibly rotate if the rotateToken flag is true and the tokenInfo field is empty
   */
  public UpdateInstallationResponse update(UpdateInstallationRequest request) {
    return impl.update(request);
  }

  public ConsumerInstallationsService impl() {
    return impl;
  }
}
