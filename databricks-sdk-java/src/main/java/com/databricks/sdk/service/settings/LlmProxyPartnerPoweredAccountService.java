// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;

/**
 * Determines if partner powered models are enabled or not for a specific account
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface LlmProxyPartnerPoweredAccountService {
  /** Gets the enable partner powered AI features account setting. */
  LlmProxyPartnerPoweredAccount get(
      GetLlmProxyPartnerPoweredAccountRequest getLlmProxyPartnerPoweredAccountRequest);

  /** Updates the enable partner powered AI features account setting. */
  LlmProxyPartnerPoweredAccount update(
      UpdateLlmProxyPartnerPoweredAccountRequest updateLlmProxyPartnerPoweredAccountRequest);
}
