// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Request for Access enables users to request access for Unity Catalog securables.
 *
 * <p>These APIs provide a standardized way for securable owners (or users with MANAGE privileges)
 * to manage access request destinations.
 */
@Generated
public class RfaAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RfaAPI.class);

  private final RfaService impl;

  /** Regular-use constructor */
  public RfaAPI(ApiClient apiClient) {
    impl = new RfaImpl(apiClient);
  }

  /** Constructor for mocks */
  public RfaAPI(RfaService mock) {
    impl = mock;
  }

  /**
   * Creates access requests for Unity Catalog permissions for a specified principal on a securable
   * object. This Batch API can take in multiple principals, securable objects, and permissions as
   * the input and returns the access request destinations for each. Principals must be unique
   * across the API call.
   *
   * <p>The supported securable types are: "metastore", "catalog", "schema", "table",
   * "external_location", "connection", "credential", "function", "registered_model", and "volume".
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
   *
   * <p>The supported securable types are: "metastore", "catalog", "schema", "table",
   * "external_location", "connection", "credential", "function", "registered_model", and "volume".
   */
  public AccessRequestDestinations getAccessRequestDestinations(
      GetAccessRequestDestinationsRequest request) {
    return impl.getAccessRequestDestinations(request);
  }

  /**
   * Updates the access request destinations for the given securable. The caller must be a metastore
   * admin, the owner of the securable, or a user that has the **MANAGE** privilege on the securable
   * in order to assign destinations. Destinations cannot be updated for securables underneath
   * schemas (tables, volumes, functions, and models). For these securable types, destinations are
   * inherited from the parent securable. A maximum of 5 emails and 5 external notification
   * destinations (Slack, Microsoft Teams, and Generic Webhook destinations) can be assigned to a
   * securable. If a URL destination is assigned, no other destinations can be set.
   *
   * <p>The supported securable types are: "metastore", "catalog", "schema", "table",
   * "external_location", "connection", "credential", "function", "registered_model", and "volume".
   */
  public AccessRequestDestinations updateAccessRequestDestinations(
      UpdateAccessRequestDestinationsRequest request) {
    return impl.updateAccessRequestDestinations(request);
  }

  public RfaService impl() {
    return impl;
  }
}
