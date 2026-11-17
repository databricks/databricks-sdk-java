// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;

/**
 * Token-based Lakeview APIs for embedding dashboards in external applications.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LakeviewEmbeddedService {
  /**
   * Get the OAuth scope and authorization details needed to mint a token that is scoped to viewing
   * the published dashboard, for example to embed it in an external application. Pass the response
   * fields, with `authorization_details` serialized as a JSON string, to the workspace OAuth token
   * endpoint with the `client_credentials` grant to mint the token. See [Embedding for external
   * users].
   *
   * <p>The caller must be a workspace user with one of the following entitlements: Workspace
   * access, Databricks SQL access, or Consumer access.
   *
   * <p>Account-level users who are not members of the workspace cannot call this endpoint, even if
   * the dashboard has been shared with them.
   *
   * <p>[Embedding for external users]:
   * https://docs.databricks.com/dashboards/share/embedding/external-embed
   */
  GetPublishedDashboardTokenInfoResponse getPublishedDashboardTokenInfo(
      GetPublishedDashboardTokenInfoRequest getPublishedDashboardTokenInfoRequest);
}
