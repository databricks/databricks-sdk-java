// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalModelConfig {
  /** AI21Labs Config */
  @JsonProperty("ai21labs_config")
  private Ai21LabsConfig ai21labsConfig;

  /** Anthropic Config */
  @JsonProperty("anthropic_config")
  private AnthropicConfig anthropicConfig;

  /** AWS Bedrock Config */
  @JsonProperty("aws_bedrock_config")
  private AwsBedrockConfig awsBedrockConfig;

  /** Cohere Config */
  @JsonProperty("cohere_config")
  private CohereConfig cohereConfig;

  /** Databricks Model Serving Config */
  @JsonProperty("databricks_model_serving_config")
  private DatabricksModelServingConfig databricksModelServingConfig;

  /** OpenAI Config */
  @JsonProperty("openai_config")
  private OpenAiConfig openaiConfig;

  /** PaLM Config */
  @JsonProperty("palm_config")
  private PaLmConfig palmConfig;

  public ExternalModelConfig setAi21labsConfig(Ai21LabsConfig ai21labsConfig) {
    this.ai21labsConfig = ai21labsConfig;
    return this;
  }

  public Ai21LabsConfig getAi21labsConfig() {
    return ai21labsConfig;
  }

  public ExternalModelConfig setAnthropicConfig(AnthropicConfig anthropicConfig) {
    this.anthropicConfig = anthropicConfig;
    return this;
  }

  public AnthropicConfig getAnthropicConfig() {
    return anthropicConfig;
  }

  public ExternalModelConfig setAwsBedrockConfig(AwsBedrockConfig awsBedrockConfig) {
    this.awsBedrockConfig = awsBedrockConfig;
    return this;
  }

  public AwsBedrockConfig getAwsBedrockConfig() {
    return awsBedrockConfig;
  }

  public ExternalModelConfig setCohereConfig(CohereConfig cohereConfig) {
    this.cohereConfig = cohereConfig;
    return this;
  }

  public CohereConfig getCohereConfig() {
    return cohereConfig;
  }

  public ExternalModelConfig setDatabricksModelServingConfig(
      DatabricksModelServingConfig databricksModelServingConfig) {
    this.databricksModelServingConfig = databricksModelServingConfig;
    return this;
  }

  public DatabricksModelServingConfig getDatabricksModelServingConfig() {
    return databricksModelServingConfig;
  }

  public ExternalModelConfig setOpenaiConfig(OpenAiConfig openaiConfig) {
    this.openaiConfig = openaiConfig;
    return this;
  }

  public OpenAiConfig getOpenaiConfig() {
    return openaiConfig;
  }

  public ExternalModelConfig setPalmConfig(PaLmConfig palmConfig) {
    this.palmConfig = palmConfig;
    return this;
  }

  public PaLmConfig getPalmConfig() {
    return palmConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalModelConfig that = (ExternalModelConfig) o;
    return Objects.equals(ai21labsConfig, that.ai21labsConfig)
        && Objects.equals(anthropicConfig, that.anthropicConfig)
        && Objects.equals(awsBedrockConfig, that.awsBedrockConfig)
        && Objects.equals(cohereConfig, that.cohereConfig)
        && Objects.equals(databricksModelServingConfig, that.databricksModelServingConfig)
        && Objects.equals(openaiConfig, that.openaiConfig)
        && Objects.equals(palmConfig, that.palmConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ai21labsConfig,
        anthropicConfig,
        awsBedrockConfig,
        cohereConfig,
        databricksModelServingConfig,
        openaiConfig,
        palmConfig);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModelConfig.class)
        .add("ai21labsConfig", ai21labsConfig)
        .add("anthropicConfig", anthropicConfig)
        .add("awsBedrockConfig", awsBedrockConfig)
        .add("cohereConfig", cohereConfig)
        .add("databricksModelServingConfig", databricksModelServingConfig)
        .add("openaiConfig", openaiConfig)
        .add("palmConfig", palmConfig)
        .toString();
  }
}
