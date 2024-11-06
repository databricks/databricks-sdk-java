// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls whether AI/BI published dashboard embedding is enabled, conditionally enabled, or
 * disabled at the workspace level. By default, this setting is conditionally enabled
 * (ALLOW_APPROVED_DOMAINS).
 */
@Generated
public class AibiDashboardEmbeddingAccessPolicyAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(AibiDashboardEmbeddingAccessPolicyAPI.class);

  private final AibiDashboardEmbeddingAccessPolicyService impl;

  /** Regular-use constructor */
  public AibiDashboardEmbeddingAccessPolicyAPI(ApiClient apiClient) {
    impl = new AibiDashboardEmbeddingAccessPolicyImpl(apiClient);
  }

  /** Constructor for mocks */
  public AibiDashboardEmbeddingAccessPolicyAPI(AibiDashboardEmbeddingAccessPolicyService mock) {
    impl = mock;
  }

  /**
   * Retrieve the AI/BI dashboard embedding access policy.
   *
   * <p>Retrieves the AI/BI dashboard embedding access policy. The default setting is
   * ALLOW_APPROVED_DOMAINS, permitting AI/BI dashboards to be embedded on approved domains.
   */
  public AibiDashboardEmbeddingAccessPolicySetting get(
      GetAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    return impl.get(request);
  }

  public AibiDashboardEmbeddingAccessPolicySetting update(
      boolean allowMissing, AibiDashboardEmbeddingAccessPolicySetting setting, String fieldMask) {
    return update(
        new UpdateAibiDashboardEmbeddingAccessPolicySettingRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /**
   * Update the AI/BI dashboard embedding access policy.
   *
   * <p>Updates the AI/BI dashboard embedding access policy at the workspace level.
   */
  public AibiDashboardEmbeddingAccessPolicySetting update(
      UpdateAibiDashboardEmbeddingAccessPolicySettingRequest request) {
    return impl.update(request);
  }

  public AibiDashboardEmbeddingAccessPolicyService impl() {
    return impl;
  }
}
