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
   * Get a required authorization details and scopes of a published dashboard to mint an OAuth
   * token.
   */
  GetPublishedDashboardTokenInfoResponse getPublishedDashboardTokenInfo(
      GetPublishedDashboardTokenInfoRequest getPublishedDashboardTokenInfoRequest);
}
