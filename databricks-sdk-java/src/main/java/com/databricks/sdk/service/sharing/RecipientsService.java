// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;

/**
 * A recipient is an object you create using :method:recipients/create to represent an organization
 * which you want to allow access shares. The way how sharing works differs depending on whether or
 * not your recipient has access to a Databricks workspace that is enabled for Unity Catalog:
 *
 * <p>- For recipients with access to a Databricks workspace that is enabled for Unity Catalog, you
 * can create a recipient object along with a unique sharing identifier you get from the recipient.
 * The sharing identifier is the key identifier that enables the secure connection. This sharing
 * mode is called **Databricks-to-Databricks sharing**.
 *
 * <p>- For recipients without access to a Databricks workspace that is enabled for Unity Catalog,
 * when you create a recipient object, Databricks generates an activation link you can send to the
 * recipient. The recipient follows the activation link to download the credential file, and then
 * uses the credential file to establish a secure connection to receive the shared data. This
 * sharing mode is called **open sharing**.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface RecipientsService {
  /**
   * Creates a new recipient with the delta sharing authentication type in the metastore. The caller
   * must be a metastore admin or have the **CREATE_RECIPIENT** privilege on the metastore.
   */
  RecipientInfo create(CreateRecipient createRecipient);

  /**
   * Deletes the specified recipient from the metastore. The caller must be the owner of the
   * recipient.
   */
  void delete(DeleteRecipientRequest deleteRecipientRequest);

  /**
   * Gets a share recipient from the metastore if:
   *
   * <p>* the caller is the owner of the share recipient, or: * is a metastore admin
   */
  RecipientInfo get(GetRecipientRequest getRecipientRequest);

  /**
   * Gets an array of all share recipients within the current metastore where:
   *
   * <p>* the caller is a metastore admin, or * the caller is the owner. There is no guarantee of a
   * specific ordering of the elements in the array.
   */
  ListRecipientsResponse list(ListRecipientsRequest listRecipientsRequest);

  /**
   * Refreshes the specified recipient's delta sharing authentication token with the provided token
   * info. The caller must be the owner of the recipient.
   */
  RecipientInfo rotateToken(RotateRecipientToken rotateRecipientToken);

  /**
   * Gets the share permissions for the specified Recipient. The caller must have the USE_RECIPIENT
   * privilege on the metastore or be the owner of the Recipient.
   */
  GetRecipientSharePermissionsResponse sharePermissions(
      SharePermissionsRequest sharePermissionsRequest);

  /**
   * Updates an existing recipient in the metastore. The caller must be a metastore admin or the
   * owner of the recipient. If the recipient name will be updated, the user must be both a
   * metastore admin and the owner of the recipient.
   */
  RecipientInfo update(UpdateRecipient updateRecipient);
}
