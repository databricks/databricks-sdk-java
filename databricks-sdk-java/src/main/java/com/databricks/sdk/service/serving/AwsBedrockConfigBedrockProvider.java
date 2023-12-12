// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The underlying provider in AWS Bedrock. Supported values (case insensitive) include: Anthropic,
 * Cohere, AI21Labs, Amazon.
 */
@Generated
public enum AwsBedrockConfigBedrockProvider {
  @JsonProperty("ai21labs")
  AI21LABS,

  @JsonProperty("amazon")
  AMAZON,

  @JsonProperty("anthropic")
  ANTHROPIC,

  @JsonProperty("cohere")
  COHERE,
}
