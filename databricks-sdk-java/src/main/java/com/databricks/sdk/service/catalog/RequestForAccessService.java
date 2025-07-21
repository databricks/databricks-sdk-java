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
public interface RequestForAccessService {
  /**
   * Creates an access request for a Unity Catalog permissions for a specified principal on a
   * securable object. This Batch API can take in multiple principals, securable objects, and
   * permissions as the input and returns the access request destinations for each.
   */
  BatchCreateAccessRequestsResponse batchCreateAccessRequests(
      BatchCreateAccessRequestsRequest batchCreateAccessRequestsRequest);

  /**
   * Gets an array of access request destinations for the specified securable. Any caller can see
   * URL destinations or the destinations on the metastore. Otherwise, only those with **BROWSE**
   * permissions on the securable can see destinations.
   */
  AccessRequestDestinations getAccessRequestDestinations(
      GetAccessRequestDestinationsRequest getAccessRequestDestinationsRequest);

  /**
   * Updates the access request destinations for the given securable. The caller must be a metastore
   * admin, the owner of the securable, or a user that has the **MANAGE** privilege on the securable
   * in order to assign destinations.
   */
  AccessRequestDestinations updateAccessRequestDestinations(
      UpdateAccessRequestDestinationsRequest updateAccessRequestDestinationsRequest);
}
