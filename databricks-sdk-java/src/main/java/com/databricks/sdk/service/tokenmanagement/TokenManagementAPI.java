// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tokenmanagement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Enables administrators to get all tokens and delete tokens for other users.
 * Admins can either get every token, get a specific token by ID, or get all
 * tokens for a particular user.
 */
public class TokenManagementAPI implements TokenManagementService {
    private final ApiClient apiClient;

    public TokenManagementAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create on-behalf token.
     * 
     * Creates a token on behalf of a service principal.
     */
    @Override
    public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
        String path = "/api/2.0/token-management/on-behalf-of/tokens";
        return apiClient.POST(path, request, CreateOboTokenResponse.class);
    }
    
	/**
     * Delete a token.
     * 
     * Deletes a token, specified by its ID.
     */
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get token info.
     * 
     * Gets information about a token, specified by its ID.
     */
    @Override
    public TokenInfo get(Get request) {
        String path = String.format("/api/2.0/token-management/tokens/%s", request.getTokenId());
        return apiClient.GET(path, request, TokenInfo.class);
    }
    
	/**
     * List all tokens.
     * 
     * Lists all tokens associated with the specified workspace or user.
     */
    @Override
    public ListTokensResponse list(List request) {
        String path = "/api/2.0/token-management/tokens";
        return apiClient.GET(path, request, ListTokensResponse.class);
    }
    
}