// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.support.Generated;

/**
 * This API allows retrieving information about currently authenticated user or
 * service principal.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface CurrentUserService {
	/**
   * Get current user info.
   * 
   * Get details about the current method caller's identity.
   */
  User me();
  
}