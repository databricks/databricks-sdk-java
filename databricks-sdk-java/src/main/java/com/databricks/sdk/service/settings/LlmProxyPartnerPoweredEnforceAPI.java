// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Determines if the account-level partner-powered setting value is enforced upon the
 * workspace-level partner-powered setting
 */
@Generated
public class LlmProxyPartnerPoweredEnforceAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LlmProxyPartnerPoweredEnforceAPI.class);

  private final LlmProxyPartnerPoweredEnforceService impl;

  /** Regular-use constructor */
  public LlmProxyPartnerPoweredEnforceAPI(ApiClient apiClient) {
    impl = new LlmProxyPartnerPoweredEnforceImpl(apiClient);
  }

  /** Constructor for mocks */
  public LlmProxyPartnerPoweredEnforceAPI(LlmProxyPartnerPoweredEnforceService mock) {
    impl = mock;
  }

  /** Gets the enforcement status of partner powered AI features account setting. */
  public LlmProxyPartnerPoweredEnforce get(GetLlmProxyPartnerPoweredEnforceRequest request) {
    return impl.get(request);
  }

  public LlmProxyPartnerPoweredEnforce update(
      boolean allowMissing, LlmProxyPartnerPoweredEnforce setting, String fieldMask) {
    return update(
        new UpdateLlmProxyPartnerPoweredEnforceRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /** Updates the enable enforcement status of partner powered AI features account setting. */
  public LlmProxyPartnerPoweredEnforce update(UpdateLlmProxyPartnerPoweredEnforceRequest request) {
    return impl.update(request);
  }

  public LlmProxyPartnerPoweredEnforceService impl() {
    return impl;
  }
}
