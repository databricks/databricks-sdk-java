// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Controls whether AI/BI published dashboard embedding is enabled, conditionally enabled, or
 * disabled at the workspace level. By default, this setting is conditionally enabled
 * (ALLOW_APPROVED_DOMAINS).
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AibiDashboardEmbeddingAccessPolicyService {
  /**
   * Delete the AI/BI dashboard embedding access policy.
   *
   * <p>Delete the AI/BI dashboard embedding access policy, reverting back to the default.
   */
  DeleteAibiDashboardEmbeddingAccessPolicySettingResponse delete(
      DeleteAibiDashboardEmbeddingAccessPolicySettingRequest
          deleteAibiDashboardEmbeddingAccessPolicySettingRequest);

  /**
   * Retrieve the AI/BI dashboard embedding access policy.
   *
   * <p>Retrieves the AI/BI dashboard embedding access policy. The default setting is
   * ALLOW_APPROVED_DOMAINS, permitting AI/BI dashboards to be embedded on approved domains.
   */
  AibiDashboardEmbeddingAccessPolicySetting get(
      GetAibiDashboardEmbeddingAccessPolicySettingRequest
          getAibiDashboardEmbeddingAccessPolicySettingRequest);

  /**
   * Update the AI/BI dashboard embedding access policy.
   *
   * <p>Updates the AI/BI dashboard embedding access policy at the workspace level.
   */
  AibiDashboardEmbeddingAccessPolicySetting update(
      UpdateAibiDashboardEmbeddingAccessPolicySettingRequest
          updateAibiDashboardEmbeddingAccessPolicySettingRequest);
}
