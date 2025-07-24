// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Determines if partner powered models are enabled or not for a specific account */
@Generated
public class LlmProxyPartnerPoweredAccountAPI {
  private static final Logger LOG = LoggerFactory.getLogger(LlmProxyPartnerPoweredAccountAPI.class);

  private final LlmProxyPartnerPoweredAccountService impl;

  /** Regular-use constructor */
  public LlmProxyPartnerPoweredAccountAPI(ApiClient apiClient) {
    impl = new LlmProxyPartnerPoweredAccountImpl(apiClient);
  }

  /** Constructor for mocks */
  public LlmProxyPartnerPoweredAccountAPI(LlmProxyPartnerPoweredAccountService mock) {
    impl = mock;
  }

  /** Gets the enable partner powered AI features account setting. */
  public LlmProxyPartnerPoweredAccount get(GetLlmProxyPartnerPoweredAccountRequest request) {
    return impl.get(request);
  }

  /** Updates the enable partner powered AI features account setting. */
  public LlmProxyPartnerPoweredAccount update(UpdateLlmProxyPartnerPoweredAccountRequest request) {
    return impl.update(request);
  }

  public LlmProxyPartnerPoweredAccountService impl() {
    return impl;
  }
}
