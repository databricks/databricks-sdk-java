// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Custom LLMs service manages state and powers the UI for the Custom LLM product. */
@Generated
public class CustomLlmsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(CustomLlmsAPI.class);

  private final CustomLlmsService impl;

  /** Regular-use constructor */
  public CustomLlmsAPI(ApiClient apiClient) {
    impl = new CustomLlmsImpl(apiClient);
  }

  /** Constructor for mocks */
  public CustomLlmsAPI(CustomLlmsService mock) {
    impl = mock;
  }

  public void cancel(String id) {
    cancel(new CancelCustomLlmOptimizationRunRequest().setId(id));
  }

  public void cancel(CancelCustomLlmOptimizationRunRequest request) {
    impl.cancel(request);
  }

  public CustomLlm create(String id) {
    return create(new StartCustomLlmOptimizationRunRequest().setId(id));
  }

  public CustomLlm create(StartCustomLlmOptimizationRunRequest request) {
    return impl.create(request);
  }

  public CustomLlm get(String id) {
    return get(new GetCustomLlmRequest().setId(id));
  }

  public CustomLlm get(GetCustomLlmRequest request) {
    return impl.get(request);
  }

  public CustomLlm update(String id, CustomLlm customLlm, String updateMask) {
    return update(
        new UpdateCustomLlmRequest().setId(id).setCustomLlm(customLlm).setUpdateMask(updateMask));
  }

  public CustomLlm update(UpdateCustomLlmRequest request) {
    return impl.update(request);
  }

  public CustomLlmsService impl() {
    return impl;
  }
}
