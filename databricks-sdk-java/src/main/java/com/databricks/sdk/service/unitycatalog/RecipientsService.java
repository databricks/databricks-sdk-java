// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

/**
 * Databricks Delta Sharing: Recipients REST API
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
public interface RecipientsService {
  /**
   * Create a share recipient.
   *
   * <p>Creates a new recipient with the delta sharing authentication type in the metastore. The
   * caller must be a metastore admin or has the **CREATE_RECIPIENT** privilege on the metastore.
   */
  RecipientInfo create(CreateRecipient createRecipient);

  /**
   * Delete a share recipient.
   *
   * <p>Deletes the specified recipient from the metastore. The caller must be the owner of the
   * recipient.
   */
  void delete(DeleteRecipientRequest deleteRecipientRequest);

  /**
   * Get a share recipient.
   *
   * <p>Gets a share recipient from the metastore if:
   *
   * <p>* the caller is the owner of the share recipient, or: * is a metastore admin
   */
  RecipientInfo get(GetRecipientRequest getRecipientRequest);

  /**
   * List share recipients.
   *
   * <p>Gets an array of all share recipients within the current metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  ListRecipientsResponse list(ListRecipientsRequest listRecipientsRequest);

  /**
   * Rotate a token.
   *
   * <p>Refreshes the specified recipient's delta sharing authentication token with the provided
   * token info. The caller must be the owner of the recipient.
   */
  RecipientInfo rotateToken(RotateRecipientToken rotateRecipientToken);

  /**
   * Get recipient share permissions.
   *
   * <p>Gets the share permissions for the specified Recipient. The caller must be a metastore admin
   * or the owner of the Recipient.
   */
  GetRecipientSharePermissionsResponse sharePermissions(
      SharePermissionsRequest sharePermissionsRequest);

  /**
   * Update a share recipient.
   *
   * <p>Updates an existing recipient in the metastore. The caller must be a metastore admin or the
   * owner of the recipient. If the recipient name will be updated, the user must be both a
   * metastore admin and the owner of the recipient.
   */
  void update(UpdateRecipient updateRecipient);
}
