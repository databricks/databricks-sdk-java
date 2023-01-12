// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * This API allows retrieving information about currently authenticated user or
 * service principal.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface CurrentUserService {
	/**
     * Get current user info.
     * 
     * Get details about the current method caller's identity.
     */
    User me();
    
}