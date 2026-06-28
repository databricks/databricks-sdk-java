// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.support.Generated;

/**
 * These APIs enable administrators to view all the available published OAuth applications in
 * Databricks. Administrators can add the published OAuth applications to their account through the
 * OAuth Published App Integration APIs.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface OAuthPublishedAppsService {
  /** Get all the available published OAuth apps in Databricks. */
  GetPublishedAppsOutput list(ListOAuthPublishedAppsRequest listOAuthPublishedAppsRequest);
}
