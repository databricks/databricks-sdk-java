// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Databricks Delta Sharing: Recipients REST API */
public class RecipientsAPI {
  private final RecipientsService impl;

  /** Regular-use constructor */
  public RecipientsAPI(ApiClient apiClient) {
    impl = new RecipientsImpl(apiClient);
  }

  /** Constructor for mocks */
  public RecipientsAPI(RecipientsService mock) {
    impl = mock;
  }

  public RecipientInfo create(String name, AuthenticationType authenticationType) {
    return create(new CreateRecipient().setName(name).setAuthenticationType(authenticationType));
  }

  /**
   * Create a share recipient.
   *
   * <p>Creates a new recipient with the delta sharing authentication type in the metastore. The
   * caller must be a metastore admin or has the **CREATE_RECIPIENT** privilege on the metastore.
   */
  public RecipientInfo create(CreateRecipient request) {
    return impl.create(request);
  }

  public void delete(String name) {
    delete(new DeleteRecipientRequest().setName(name));
  }

  /**
   * Delete a share recipient.
   *
   * <p>Deletes the specified recipient from the metastore. The caller must be the owner of the
   * recipient.
   */
  public void delete(DeleteRecipientRequest request) {
    impl.delete(request);
  }

  public RecipientInfo get(String name) {
    return get(new GetRecipientRequest().setName(name));
  }

  /**
   * Get a share recipient.
   *
   * <p>Gets a share recipient from the metastore if:
   *
   * <p>* the caller is the owner of the share recipient, or: * is a metastore admin
   */
  public RecipientInfo get(GetRecipientRequest request) {
    return impl.get(request);
  }

  /**
   * List share recipients.
   *
   * <p>Gets an array of all share recipients within the current metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  public ListRecipientsResponse list(ListRecipientsRequest request) {
    return impl.list(request);
  }

  public RecipientInfo rotateToken(long existingTokenExpireInSeconds, String name) {
    return rotateToken(
        new RotateRecipientToken()
            .setExistingTokenExpireInSeconds(existingTokenExpireInSeconds)
            .setName(name));
  }

  /**
   * Rotate a token.
   *
   * <p>Refreshes the specified recipient's delta sharing authentication token with the provided
   * token info. The caller must be the owner of the recipient.
   */
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    return impl.rotateToken(request);
  }

  public GetRecipientSharePermissionsResponse sharePermissions(String name) {
    return sharePermissions(new SharePermissionsRequest().setName(name));
  }

  /**
   * Get recipient share permissions.
   *
   * <p>Gets the share permissions for the specified Recipient. The caller must be a metastore admin
   * or the owner of the Recipient.
   */
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    return impl.sharePermissions(request);
  }

  public void update(String name) {
    update(new UpdateRecipient().setName(name));
  }

  /**
   * Update a share recipient.
   *
   * <p>Updates an existing recipient in the metastore. The caller must be a metastore admin or the
   * owner of the recipient. If the recipient name will be updated, the user must be both a
   * metastore admin and the owner of the recipient.
   */
  public void update(UpdateRecipient request) {
    impl.update(request);
  }

  public RecipientsService impl() {
    return impl;
  }
}
