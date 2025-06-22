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

  void cancel(CancelCustomLlmOptimizationRunRequest cancelCustomLlmOptimizationRunRequest);

  CustomLlm create(StartCustomLlmOptimizationRunRequest startCustomLlmOptimizationRunRequest);

  CustomLlm get(GetCustomLlmRequest getCustomLlmRequest);

  CustomLlm update(UpdateCustomLlmRequest updateCustomLlmRequest);
}
