// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Custom LLMs service manages state and powers the UI for the Custom LLM product. */
@Generated
public class AiBuilderAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AiBuilderAPI.class);

  private final AiBuilderService impl;

  /** Regular-use constructor */
  public AiBuilderAPI(ApiClient apiClient) {
    impl = new AiBuilderImpl(apiClient);
  }

  /** Constructor for mocks */
  public AiBuilderAPI(AiBuilderService mock) {
    impl = mock;
  }

  public void cancelOptimize(String id) {
    cancelOptimize(new CancelCustomLlmOptimizationRunRequest().setId(id));
  }

  /** Cancel a Custom LLM Optimization Run. */
  public void cancelOptimize(CancelCustomLlmOptimizationRunRequest request) {
    impl.cancelOptimize(request);
  }

  public CustomLlm createCustomLlm(String name, String instructions) {
    return createCustomLlm(
        new CreateCustomLlmRequest().setName(name).setInstructions(instructions));
  }

  /** Create a Custom LLM. */
  public CustomLlm createCustomLlm(CreateCustomLlmRequest request) {
    return impl.createCustomLlm(request);
  }

  public void deleteCustomLlm(String id) {
    deleteCustomLlm(new DeleteCustomLlmRequest().setId(id));
  }

  /** Delete a Custom LLM. */
  public void deleteCustomLlm(DeleteCustomLlmRequest request) {
    impl.deleteCustomLlm(request);
  }

  public CustomLlm getCustomLlm(String id) {
    return getCustomLlm(new GetCustomLlmRequest().setId(id));
  }

  /** Get a Custom LLM. */
  public CustomLlm getCustomLlm(GetCustomLlmRequest request) {
    return impl.getCustomLlm(request);
  }

  public CustomLlm startOptimize(String id) {
    return startOptimize(new StartCustomLlmOptimizationRunRequest().setId(id));
  }

  /** Start a Custom LLM Optimization Run. */
  public CustomLlm startOptimize(StartCustomLlmOptimizationRunRequest request) {
    return impl.startOptimize(request);
  }

  public CustomLlm updateCustomLlm(String id, CustomLlm customLlm, String updateMask) {
    return updateCustomLlm(
        new UpdateCustomLlmRequest().setId(id).setCustomLlm(customLlm).setUpdateMask(updateMask));
  }

  /** Update a Custom LLM. */
  public CustomLlm updateCustomLlm(UpdateCustomLlmRequest request) {
    return impl.updateCustomLlm(request);
  }

  public AiBuilderService impl() {
    return impl;
  }
}
