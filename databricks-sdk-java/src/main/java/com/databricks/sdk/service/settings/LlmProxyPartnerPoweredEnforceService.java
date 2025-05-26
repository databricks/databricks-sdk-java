// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Determines if the account-level partner-powered setting value is enforced upon the
 * workspace-level partner-powered setting
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LlmProxyPartnerPoweredEnforceService {
  /**
   * Get the enforcement status of partner powered AI features account setting.
   *
   * <p>Gets the enforcement status of partner powered AI features account setting.
   */
  LlmProxyPartnerPoweredEnforce get(
      GetLlmProxyPartnerPoweredEnforceRequest getLlmProxyPartnerPoweredEnforceRequest);

  /**
   * Update the enforcement status of partner powered AI features account setting.
   *
   * <p>Updates the enable enforcement status of partner powered AI features account setting.
   */
  LlmProxyPartnerPoweredEnforce update(
      UpdateLlmProxyPartnerPoweredEnforceRequest updateLlmProxyPartnerPoweredEnforceRequest);
}
