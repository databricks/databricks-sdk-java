// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.logging.Logger;
import com.databricks.sdk.core.logging.LoggerFactory;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;

/**
 * A recipient is an object you create using :method:recipients/create to represent an organization
 * which you want to allow access shares. The way how sharing works differs depending on whether or
 * not your recipient has access to a Databricks workspace that is enabled for Unity Catalog:
 *
 * <ul>
 *   <li>For recipients with access to a Databricks workspace that is enabled for Unity Catalog, you
 *       can create a recipient object along with a unique sharing identifier you get from the
 *       recipient. The sharing identifier is the key identifier that enables the secure connection.
 *       This sharing mode is called <b>Databricks-to-Databricks sharing</b>.
 *   <li>For recipients without access to a Databricks workspace that is enabled for Unity Catalog,
 *       when you create a recipient object, Databricks generates an activation link you can send to
 *       the recipient. The recipient follows the activation link to download the credential file,
 *       and then uses the credential file to establish a secure connection to receive the shared
 *       data. This sharing mode is called <b>open sharing</b>.
 * </ul>
 */
@Generated
public class RecipientsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RecipientsAPI.class);

  private final RecipientsService impl;

  /** Regular-use constructor */
  public RecipientsAPI(ApiClient apiClient) {
    impl = new RecipientsImpl(apiClient);
  }

  /** Constructor for mocks */
  public RecipientsAPI(RecipientsService mock) {
    impl = mock;
  }

  /**
   * Creates a new recipient with the delta sharing authentication type in the metastore. The caller
   * must be a metastore admin or have the <b>CREATE_RECIPIENT</b> privilege on the metastore.
   */
  public RecipientInfo create(CreateRecipient request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteRecipientRequest().setName(name));
  }

  /**
   * Deletes the specified recipient from the metastore. The caller must be the owner of the
   * recipient.
   */
  public void delete(DeleteRecipientRequest request) {
    impl.delete(request);
  }

  public RecipientInfo get(String name) {
    return get(new GetRecipientRequest().setName(name));
  }

  /**
   * Gets a share recipient from the metastore. The caller must be one of:
   *
   * <ul>
   *   <li>A user with <b>USE_RECIPIENT</b> privilege on the metastore
   *   <li>The owner of the share recipient
   *   <li>A metastore admin
   * </ul>
   */
  public RecipientInfo get(GetRecipientRequest request) {
    return impl.get(request);
  }

  /**
   * Gets an array of all share recipients within the current metastore where:
   *
   * <ul>
   *   <li>the caller is a metastore admin, or
   *   <li>the caller is the owner. There is no guarantee of a specific ordering of the elements in
   *       the array.
   * </ul>
   */
  public Iterable<RecipientInfo> list(ListRecipientsRequest request) {

    if (request.getMaxResults() == null) {
      request.setMaxResults(0L);
    }
    return Paginator.newTokenPagination(
        request,
        impl::list,
        ListRecipientsResponse::getRecipients,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Refreshes the specified recipient's delta sharing authentication token with the provided token
   * info. The caller must be the owner of the recipient.
   */
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    return impl.rotateToken(request);
  }

  public GetRecipientSharePermissionsResponse sharePermissions(String name) {
    return sharePermissions(new SharePermissionsRequest().setName(name));
  }

  /**
   * Gets the share permissions for the specified Recipient. The caller must have the
   * <b>USE_RECIPIENT</b> privilege on the metastore or be the owner of the Recipient.
   */
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    return impl.sharePermissions(request);
  }

  /**
   * Updates an existing recipient in the metastore. The caller must be a metastore admin or the
   * owner of the recipient. If the recipient name will be updated, the user must be both a
   * metastore admin and the owner of the recipient.
   */
  public RecipientInfo update(UpdateRecipient request) {
    return impl.update(request);
  }

  public RecipientsService impl() {
    return impl;
  }
}
