// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Custom LLMs service manages state and powers the UI for the Custom LLM product. */
@Generated
public class AgentBricksAPI {
  private static final Logger LOG = LoggerFactory.getLogger(AgentBricksAPI.class);

  private final AgentBricksService impl;

  /** Regular-use constructor */
  public AgentBricksAPI(ApiClient apiClient) {
    impl = new AgentBricksImpl(apiClient);
  }

  /** Constructor for mocks */
  public AgentBricksAPI(AgentBricksService mock) {
    impl = mock;
  }

  /** Cancel a Custom LLM Optimization Run. */
  public void cancelOptimize(CancelCustomLlmOptimizationRunRequest request) {
    impl.cancelOptimize(request);
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

  /** Start a Custom LLM Optimization Run. */
  public CustomLlm startOptimize(StartCustomLlmOptimizationRunRequest request) {
    return impl.startOptimize(request);
  }

  /** Update a Custom LLM. */
  public CustomLlm updateCustomLlm(UpdateCustomLlmRequest request) {
    return impl.updateCustomLlm(request);
  }

  public AgentBricksService impl() {
    return impl;
  }
}
