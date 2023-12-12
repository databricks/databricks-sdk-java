// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The name of the provider for the external model. Currently, the supported providers are
 * 'ai21labs', 'anthropic', 'aws-bedrock', 'cohere', 'databricks-model-serving', 'openai', and
 * 'palm'.",
 */
@Generated
public enum ExternalModelProvider {
  @JsonProperty("ai21labs")
  AI21LABS,

  @JsonProperty("anthropic")
  ANTHROPIC,

  @JsonProperty("aws-bedrock")
  AWS_BEDROCK,

  @JsonProperty("cohere")
  COHERE,

  @JsonProperty("databricks-model-serving")
  DATABRICKS_MODEL_SERVING,

  @JsonProperty("openai")
  OPENAI,

  @JsonProperty("palm")
  PALM,
}
