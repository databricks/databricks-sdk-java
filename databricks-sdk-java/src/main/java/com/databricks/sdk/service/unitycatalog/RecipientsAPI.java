// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Databricks Delta Sharing: Recipients REST API
 */
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
	
	/**
     * Create a share recipient.
     * 
     * Creates a new recipient with the delta sharing authentication type in the
     * metastore. The caller must be a metastore admin or has the
     * **CREATE_RECIPIENT** privilege on the metastore.
     */
    public RecipientInfo create(CreateRecipient request) {
        return impl.create(request);
    }
    
	/**
     * Delete a share recipient.
     * 
     * Deletes the specified recipient from the metastore. The caller must be
     * the owner of the recipient.
     */
    public void delete(DeleteRecipientRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get a share recipient.
     * 
     * Gets a share recipient from the metastore if:
     * 
     * * the caller is the owner of the share recipient, or: * is a metastore
     * admin
     */
    public RecipientInfo get(GetRecipientRequest request) {
        return impl.get(request);
    }
    
	/**
     * List share recipients.
     * 
     * Gets an array of all share recipients within the current metastore where:
     * 
     * * the caller is a metastore admin, or * the caller is the owner. There is
     * no guarantee of a specific ordering of the elements in the array.
     */
    public ListRecipientsResponse list(ListRecipientsRequest request) {
        return impl.list(request);
    }
    
	/**
     * Rotate a token.
     * 
     * Refreshes the specified recipient's delta sharing authentication token
     * with the provided token info. The caller must be the owner of the
     * recipient.
     */
    public RecipientInfo rotateToken(RotateRecipientToken request) {
        return impl.rotateToken(request);
    }
    
	/**
     * Get recipient share permissions.
     * 
     * Gets the share permissions for the specified Recipient. The caller must
     * be a metastore admin or the owner of the Recipient.
     */
    public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
        return impl.sharePermissions(request);
    }
    
	/**
     * Update a share recipient.
     * 
     * Updates an existing recipient in the metastore. The caller must be a
     * metastore admin or the owner of the recipient. If the recipient name will
     * be updated, the user must be both a metastore admin and the owner of the
     * recipient.
     */
    public void update(UpdateRecipient request) {
        impl.update(request);
    }
    
    public RecipientsService impl() {
        return impl;
    }
}