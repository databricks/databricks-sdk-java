// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Request for Access enables customers to request access to and manage access request destinations
 * for Unity Catalog securables.
 *
 * <p>These APIs provide a standardized way to update, get, and request to access request
 * destinations. Fine-grained authorization ensures that only users with appropriate permissions can
 * manage access request destinations.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface RfaService {
  /**
   * Creates access requests for Unity Catalog permissions for a specified principal on a securable
   * object. This Batch API can take in multiple principals, securable objects, and permissions as
   * the input and returns the access request destinations for each. Principals must be unique
   * across the API call.
   *
   * <p>The supported securable types are: "metastore", "catalog", "schema", "table",
   * "external_location", "connection", "credential", "function", "registered_model", and "volume".
   */
  BatchCreateAccessRequestsResponse batchCreateAccessRequests(
      BatchCreateAccessRequestsRequest batchCreateAccessRequestsRequest);

  /**
   * Gets an array of access request destinations for the specified securable. Any caller can see
   * URL destinations or the destinations on the metastore. Otherwise, only those with **BROWSE**
   * permissions on the securable can see destinations.
   *
   * <p>The supported securable types are: "metastore", "catalog", "schema", "table",
   * "external_location", "connection", "credential", "function", "registered_model", and "volume".
   */
  AccessRequestDestinations getAccessRequestDestinations(
      GetAccessRequestDestinationsRequest getAccessRequestDestinationsRequest);

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
  AccessRequestDestinations updateAccessRequestDestinations(
      UpdateAccessRequestDestinationsRequest updateAccessRequestDestinationsRequest);
}
