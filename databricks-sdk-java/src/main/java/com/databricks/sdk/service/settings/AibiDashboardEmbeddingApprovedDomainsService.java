// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls the list of domains approved to host the embedded AI/BI dashboards. The approved domains
 * list can't be mutated when the current access policy is not set to ALLOW_APPROVED_DOMAINS.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AibiDashboardEmbeddingApprovedDomainsService {
  /**
   * Retrieve the list of domains approved to host embedded AI/BI dashboards.
   *
   * <p>Retrieves the list of domains approved to host embedded AI/BI dashboards.
   */
  AibiDashboardEmbeddingApprovedDomainsSetting get(
      GetAibiDashboardEmbeddingApprovedDomainsSettingRequest
          getAibiDashboardEmbeddingApprovedDomainsSettingRequest);

  /**
   * Update the list of domains approved to host embedded AI/BI dashboards.
   *
   * <p>Updates the list of domains approved to host embedded AI/BI dashboards. This update will
   * fail if the current workspace access policy is not ALLOW_APPROVED_DOMAINS.
   */
  AibiDashboardEmbeddingApprovedDomainsSetting update(
      UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest
          updateAibiDashboardEmbeddingApprovedDomainsSettingRequest);
}
