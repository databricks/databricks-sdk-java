// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls the list of domains approved to host the embedded AI/BI dashboards. The approved domains
 * list can't be mutated when the current access policy is not set to ALLOW_APPROVED_DOMAINS.
 */
@Generated
public class AibiDashboardEmbeddingApprovedDomainsAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(AibiDashboardEmbeddingApprovedDomainsAPI.class);

  private final AibiDashboardEmbeddingApprovedDomainsService impl;

  /** Regular-use constructor */
  public AibiDashboardEmbeddingApprovedDomainsAPI(ApiClient apiClient) {
    impl = new AibiDashboardEmbeddingApprovedDomainsImpl(apiClient);
  }

  /** Constructor for mocks */
  public AibiDashboardEmbeddingApprovedDomainsAPI(
      AibiDashboardEmbeddingApprovedDomainsService mock) {
    impl = mock;
  }

  /**
   * Delete the list of domains approved to host embedded AI/BI dashboards, reverting back to the
   * default empty list.
   */
  public DeleteAibiDashboardEmbeddingApprovedDomainsSettingResponse delete(
      DeleteAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    return impl.delete(request);
  }

  /** Retrieves the list of domains approved to host embedded AI/BI dashboards. */
  public AibiDashboardEmbeddingApprovedDomainsSetting get(
      GetAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    return impl.get(request);
  }

  public AibiDashboardEmbeddingApprovedDomainsSetting update(
      boolean allowMissing,
      AibiDashboardEmbeddingApprovedDomainsSetting setting,
      String fieldMask) {
    return update(
        new UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Updates the list of domains approved to host embedded AI/BI dashboards. This update will fail
   * if the current workspace access policy is not ALLOW_APPROVED_DOMAINS.
   */
  public AibiDashboardEmbeddingApprovedDomainsSetting update(
      UpdateAibiDashboardEmbeddingApprovedDomainsSettingRequest request) {
    return impl.update(request);
  }

  public AibiDashboardEmbeddingApprovedDomainsService impl() {
    return impl;
  }
}
