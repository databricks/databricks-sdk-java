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
public interface CustomLlmsService {
  /** Cancel a Custom LLM Optimization Run. */
  void cancel(CancelCustomLlmOptimizationRunRequest cancelCustomLlmOptimizationRunRequest);

  /** Start a Custom LLM Optimization Run. */
  CustomLlm create(StartCustomLlmOptimizationRunRequest startCustomLlmOptimizationRunRequest);

  /** Get a Custom LLM. */
  CustomLlm get(GetCustomLlmRequest getCustomLlmRequest);

  /** Update a Custom LLM. */
  CustomLlm update(UpdateCustomLlmRequest updateCustomLlmRequest);
}
