// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.support.Generated;

/**
 * The Custom LLMs service manages state and powers the UI for the Custom LLM product.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface AiBuilderService {
  /** Cancel a Custom LLM Optimization Run. */
  void cancelOptimize(CancelCustomLlmOptimizationRunRequest cancelCustomLlmOptimizationRunRequest);

  /** Create a Custom LLM. */
  CustomLlm createCustomLlm(CreateCustomLlmRequest createCustomLlmRequest);

  /** Delete a Custom LLM. */
  void deleteCustomLlm(DeleteCustomLlmRequest deleteCustomLlmRequest);

  /** Get a Custom LLM. */
  CustomLlm getCustomLlm(GetCustomLlmRequest getCustomLlmRequest);

  /** Start a Custom LLM Optimization Run. */
  CustomLlm startOptimize(
      StartCustomLlmOptimizationRunRequest startCustomLlmOptimizationRunRequest);

  /** Update a Custom LLM. */
  CustomLlm updateCustomLlm(UpdateCustomLlmRequest updateCustomLlmRequest);
}
