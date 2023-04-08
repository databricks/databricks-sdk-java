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
public class TokenManagementAPI {
    private final TokenManagementService impl;

    /** Regular-use constructor */
    public TokenManagementAPI(ApiClient apiClient) {
        impl = new TokenManagementImpl(apiClient);
    }

    /** Constructor for mocks */
    public TokenManagementAPI(TokenManagementService mock) {
        impl = mock;
    }
	
	/**
     * Create on-behalf token.
     * 
     * Creates a token on behalf of a service principal.
     */
    public CreateOboTokenResponse createOboToken(CreateOboTokenRequest request) {
        return impl.createOboToken(request);
    }
    
	/**
     * Delete a token.
     * 
     * Deletes a token, specified by its ID.
     */
    public void delete(Delete request) {
        impl.delete(request);
    }
    
	/**
     * Get token info.
     * 
     * Gets information about a token, specified by its ID.
     */
    public TokenInfo get(Get request) {
        return impl.get(request);
    }
    
	/**
     * List all tokens.
     * 
     * Lists all tokens associated with the specified workspace or user.
     */
    public ListTokensResponse list(List request) {
        return impl.list(request);
    }
    
    public TokenManagementService impl() {
        return impl;
    }
}