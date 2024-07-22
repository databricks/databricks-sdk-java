// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The name of the provider for the external model. Currently, the supported providers are
 * 'ai21labs', 'anthropic', 'amazon-bedrock', 'cohere', 'databricks-model-serving',
 * 'google-cloud-vertex-ai', 'openai', and 'palm'.",
 */
@Generated
public enum ExternalModelProvider {
  @JsonProperty("ai21labs")
  AI21LABS,

  @JsonProperty("amazon-bedrock")
  AMAZON_BEDROCK,

  @JsonProperty("anthropic")
  ANTHROPIC,

  @JsonProperty("cohere")
  COHERE,

  @JsonProperty("databricks-model-serving")
  DATABRICKS_MODEL_SERVING,

  @JsonProperty("google-cloud-vertex-ai")
  GOOGLE_CLOUD_VERTEX_AI,

  @JsonProperty("openai")
  OPENAI,

  @JsonProperty("palm")
  PALM,
}
