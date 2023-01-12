// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.tokenmanagement;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Enables administrators to get all tokens and delete tokens for other users.
 * Admins can either get every token, get a specific token by ID, or get all
 * tokens for a particular user.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface TokenManagementService {
	/**
     * Create on-behalf token.
     * 
     * Creates a token on behalf of a service principal.
     */
    CreateOboTokenResponse createOboToken(CreateOboTokenRequest createOboTokenRequest);
    
	/**
     * Delete a token.
     * 
     * Deletes a token, specified by its ID.
     */
    void delete(Delete delete);
    
	/**
     * Get token info.
     * 
     * Gets information about a token, specified by its ID.
     */
    TokenInfo get(Get get);
    
	/**
     * List all tokens.
     * 
     * Lists all tokens associated with the specified workspace or user.
     */
    ListTokensResponse list(List list);
    
}