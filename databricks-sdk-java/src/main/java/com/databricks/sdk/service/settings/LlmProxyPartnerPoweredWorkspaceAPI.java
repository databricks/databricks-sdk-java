// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Determines if partner powered models are enabled or not for a specific workspace */
@Generated
public class LlmProxyPartnerPoweredWorkspaceAPI {
  private static final Logger LOG =
      LoggerFactory.getLogger(LlmProxyPartnerPoweredWorkspaceAPI.class);

  private final LlmProxyPartnerPoweredWorkspaceService impl;

  /** Regular-use constructor */
  public LlmProxyPartnerPoweredWorkspaceAPI(ApiClient apiClient) {
    impl = new LlmProxyPartnerPoweredWorkspaceImpl(apiClient);
  }

  /** Constructor for mocks */
  public LlmProxyPartnerPoweredWorkspaceAPI(LlmProxyPartnerPoweredWorkspaceService mock) {
    impl = mock;
  }

  /** Reverts the enable partner powered AI features workspace setting to its default value. */
  public DeleteLlmProxyPartnerPoweredWorkspaceResponse delete(
      DeleteLlmProxyPartnerPoweredWorkspaceRequest request) {
    return impl.delete(request);
  }

  /** Gets the enable partner powered AI features workspace setting. */
  public LlmProxyPartnerPoweredWorkspace get(GetLlmProxyPartnerPoweredWorkspaceRequest request) {
    return impl.get(request);
  }

  public LlmProxyPartnerPoweredWorkspace update(
      boolean allowMissing, LlmProxyPartnerPoweredWorkspace setting, String fieldMask) {
    return update(
        new UpdateLlmProxyPartnerPoweredWorkspaceRequest()
            .setAllowMissing(allowMissing)
            .setSetting(setting)
            .setFieldMask(fieldMask));
  }

  /** Updates the enable partner powered AI features workspace setting. */
  public LlmProxyPartnerPoweredWorkspace update(
      UpdateLlmProxyPartnerPoweredWorkspaceRequest request) {
    return impl.update(request);
  }

  public LlmProxyPartnerPoweredWorkspaceService impl() {
    return impl;
  }
}
