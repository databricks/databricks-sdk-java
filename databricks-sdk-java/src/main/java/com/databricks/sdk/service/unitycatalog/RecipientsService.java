// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Databricks Delta Sharing: Recipients REST API
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface RecipientsService {
	/**
     * Create a share recipient.
     * 
     * Creates a new recipient with the delta sharing authentication type in the
     * Metastore. The caller must be a Metastore admin or has the
     * CREATE_RECIPIENT privilege on the Metastore.
     */
    RecipientInfo create(CreateRecipient createRecipient);
    
	/**
     * Delete a share recipient.
     * 
     * Deletes the specified recipient from the Metastore. The caller must be
     * the owner of the recipient.
     */
    void delete(DeleteRecipientRequest deleteRecipientRequest);
    
	/**
     * Get a share recipient.
     * 
     * Gets a share recipient from the Metastore if:
     * 
     * * the caller is the owner of the share recipient, or: * is a Metastore
     * admin
     */
    RecipientInfo get(GetRecipientRequest getRecipientRequest);
    
	/**
     * List share recipients.
     * 
     * Gets an array of all share recipients within the current Metastore where:
     * 
     * * the caller is a Metastore admin, or * the caller is the owner.
     */
    ListRecipientsResponse list(ListRecipientsRequest listRecipientsRequest);
    
	/**
     * Rotate a token.
     * 
     * Refreshes the specified recipient's delta sharing authentication token
     * with the provided token info. The caller must be the owner of the
     * recipient.
     */
    RecipientInfo rotateToken(RotateRecipientToken rotateRecipientToken);
    
	/**
     * Get share permissions.
     * 
     * Gets the share permissions for the specified Recipient. The caller must
     * be a Metastore admin or the owner of the Recipient.
     */
    GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest sharePermissionsRequest);
    
	/**
     * Update a share recipient.
     * 
     * Updates an existing recipient in the Metastore. The caller must be a
     * Metastore admin or the owner of the recipient. If the recipient name will
     * be updated, the user must be both a Metastore admin and the owner of the
     * recipient.
     */
    void update(UpdateRecipient updateRecipient);
    
}