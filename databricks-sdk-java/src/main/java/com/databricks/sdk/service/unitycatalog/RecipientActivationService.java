// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Databricks Delta Sharing: Recipient Activation REST API
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface RecipientActivationService {
	/**
     * Get a share activation URL.
     * 
     * Gets information about an Activation URL.
     */
    void getActivationUrlInfo(GetActivationUrlInfoRequest getActivationUrlInfoRequest);
    
	/**
     * Get an access token.
     * 
     * RPC to retrieve access token with an activation token. This is a public
     * API without any authentication.
     */
    RetrieveTokenResponse retrieveToken(RetrieveTokenRequest retrieveTokenRequest);
    
}