// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

/**
 * This API allows retrieving information about currently authenticated user or service principal.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface CurrentUserService {
  /**
   * Get current user info.
   *
   * <p>Get details about the current method caller's identity.
   *
   * @return a {@link com.databricks.sdk.service.iam.User} object
   */
  User me();
}
