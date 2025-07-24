// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Request for Access enables customers to request access to and manage access request destinations
 * for Unity Catalog securables.
 *
 * <p>These APIs provide a standardized way to update, get, and request to access request
 * destinations. Fine-grained authorization ensures that only users with appropriate permissions can
 * manage access request destinations.
 */
@Generated
public class RequestForAccessAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RequestForAccessAPI.class);

  private final RequestForAccessService impl;

  /** Regular-use constructor */
  public RequestForAccessAPI(ApiClient apiClient) {
    impl = new RequestForAccessImpl(apiClient);
  }

  /** Constructor for mocks */
  public RequestForAccessAPI(RequestForAccessService mock) {
    impl = mock;
  }

  /**
   * Creates an access request for a Unity Catalog permissions for a specified principal on a
   * securable object. This Batch API can take in multiple principals, securable objects, and
   * permissions as the input and returns the access request destinations for each.
   */
  public BatchCreateAccessRequestsResponse batchCreateAccessRequests(
      BatchCreateAccessRequestsRequest request) {
    return impl.batchCreateAccessRequests(request);
  }

  public AccessRequestDestinations getAccessRequestDestinations(
      String securableType, String fullName) {
    return getAccessRequestDestinations(
        new GetAccessRequestDestinationsRequest()
            .setSecurableType(securableType)
            .setFullName(fullName));
  }

  /**
   * Gets an array of access request destinations for the specified securable. Any caller can see
   * URL destinations or the destinations on the metastore. Otherwise, only those with **BROWSE**
   * permissions on the securable can see destinations.
   */
  public AccessRequestDestinations getAccessRequestDestinations(
      GetAccessRequestDestinationsRequest request) {
    return impl.getAccessRequestDestinations(request);
  }

  /**
   * Updates the access request destinations for the given securable. The caller must be a metastore
   * admin, the owner of the securable, or a user that has the **MANAGE** privilege on the securable
   * in order to assign destinations.
   */
  public AccessRequestDestinations updateAccessRequestDestinations(
      UpdateAccessRequestDestinationsRequest request) {
    return impl.updateAccessRequestDestinations(request);
  }

  public RequestForAccessService impl() {
    return impl;
  }
}
