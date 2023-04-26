// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Databricks Recipients REST API
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RecipientsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(RecipientsAPI.class);

  private final RecipientsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public RecipientsAPI(ApiClient apiClient) {
    impl = new RecipientsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.sharing.RecipientsService} object
   */
  public RecipientsAPI(RecipientsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param name a {@link java.lang.String} object
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo create(String name, AuthenticationType authenticationType) {
    return create(new CreateRecipient().setName(name).setAuthenticationType(authenticationType));
  }

  /**
   * Create a share recipient.
   *
   * <p>Creates a new recipient with the delta sharing authentication type in the metastore. The
   * caller must be a metastore admin or has the **CREATE_RECIPIENT** privilege on the metastore.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo create(CreateRecipient request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void delete(String name) {
    delete(new DeleteRecipientRequest().setName(name));
  }

  /**
   * Delete a share recipient.
   *
   * <p>Deletes the specified recipient from the metastore. The caller must be the owner of the
   * recipient.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.DeleteRecipientRequest} object
   */
  public void delete(DeleteRecipientRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo get(String name) {
    return get(new GetRecipientRequest().setName(name));
  }

  /**
   * Get a share recipient.
   *
   * <p>Gets a share recipient from the metastore if:
   *
   * <p>* the caller is the owner of the share recipient, or: * is a metastore admin
   *
   * @param request a {@link com.databricks.sdk.service.sharing.GetRecipientRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
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
   *
   * @param request a {@link com.databricks.sdk.service.sharing.ListRecipientsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<RecipientInfo> list(ListRecipientsRequest request) {
    return impl.list(request).getRecipients();
  }

  /**
   * <p>rotateToken.</p>
   *
   * @param existingTokenExpireInSeconds a long
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
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
   *
   * @param request a {@link com.databricks.sdk.service.sharing.RotateRecipientToken} object
   * @return a {@link com.databricks.sdk.service.sharing.RecipientInfo} object
   */
  public RecipientInfo rotateToken(RotateRecipientToken request) {
    return impl.rotateToken(request);
  }

  /**
   * <p>sharePermissions.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.GetRecipientSharePermissionsResponse} object
   */
  public GetRecipientSharePermissionsResponse sharePermissions(String name) {
    return sharePermissions(new SharePermissionsRequest().setName(name));
  }

  /**
   * Get recipient share permissions.
   *
   * <p>Gets the share permissions for the specified Recipient. The caller must be a metastore admin
   * or the owner of the Recipient.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.SharePermissionsRequest} object
   * @return a {@link com.databricks.sdk.service.sharing.GetRecipientSharePermissionsResponse} object
   */
  public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
    return impl.sharePermissions(request);
  }

  /**
   * <p>update.</p>
   *
   * @param name a {@link java.lang.String} object
   */
  public void update(String name) {
    update(new UpdateRecipient().setName(name));
  }

  /**
   * Update a share recipient.
   *
   * <p>Updates an existing recipient in the metastore. The caller must be a metastore admin or the
   * owner of the recipient. If the recipient name will be updated, the user must be both a
   * metastore admin and the owner of the recipient.
   *
   * @param request a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public void update(UpdateRecipient request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.RecipientsService} object
   */
  public RecipientsService impl() {
    return impl;
  }
}
