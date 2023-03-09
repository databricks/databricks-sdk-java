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
public class RecipientsAPI implements RecipientsService {
    private final ApiClient apiClient;

    public RecipientsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a share recipient.
     * 
     * Creates a new recipient with the delta sharing authentication type in the
     * metastore. The caller must be a metastore admin or has the
     * **CREATE_RECIPIENT** privilege on the metastore.
     */
    @Override
    public RecipientInfo create(CreateRecipient request) {
        String path = "/api/2.1/unity-catalog/recipients";
        return apiClient.POST(path, request, RecipientInfo.class);
    }
    
	/**
     * Delete a share recipient.
     * 
     * Deletes the specified recipient from the metastore. The caller must be
     * the owner of the recipient.
     */
    @Override
    public void delete(DeleteRecipientRequest request) {
        String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a share recipient.
     * 
     * Gets a share recipient from the metastore if:
     * 
     * * the caller is the owner of the share recipient, or: * is a metastore
     * admin
     */
    @Override
    public RecipientInfo get(GetRecipientRequest request) {
        String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
        return apiClient.GET(path, request, RecipientInfo.class);
    }
    
	/**
     * List share recipients.
     * 
     * Gets an array of all share recipients within the current metastore where:
     * 
     * * the caller is a metastore admin, or * the caller is the owner. There is
     * no guarantee of a specific ordering of the elements in the array.
     */
    @Override
    public ListRecipientsResponse list(ListRecipientsRequest request) {
        String path = "/api/2.1/unity-catalog/recipients";
        return apiClient.GET(path, request, ListRecipientsResponse.class);
    }
    
	/**
     * Rotate a token.
     * 
     * Refreshes the specified recipient's delta sharing authentication token
     * with the provided token info. The caller must be the owner of the
     * recipient.
     */
    @Override
    public RecipientInfo rotateToken(RotateRecipientToken request) {
        String path = String.format("/api/2.1/unity-catalog/recipients/%s/rotate-token", request.getName());
        return apiClient.POST(path, request, RecipientInfo.class);
    }
    
	/**
     * Get recipient share permissions.
     * 
     * Gets the share permissions for the specified Recipient. The caller must
     * be a metastore admin or the owner of the Recipient.
     */
    @Override
    public GetRecipientSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
        String path = String.format("/api/2.1/unity-catalog/recipients/%s/share-permissions", request.getName());
        return apiClient.GET(path, request, GetRecipientSharePermissionsResponse.class);
    }
    
	/**
     * Update a share recipient.
     * 
     * Updates an existing recipient in the metastore. The caller must be a
     * metastore admin or the owner of the recipient. If the recipient name will
     * be updated, the user must be both a metastore admin and the owner of the
     * recipient.
     */
    @Override
    public void update(UpdateRecipient request) {
        String path = String.format("/api/2.1/unity-catalog/recipients/%s", request.getName());
        apiClient.PATCH(path, request, Void.class);
    }
    
}