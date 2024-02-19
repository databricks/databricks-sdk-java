// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalModel {
  /** AI21Labs Config. Only required if the provider is 'ai21labs'. */
  @JsonProperty("ai21labs_config")
  private Ai21LabsConfig ai21labsConfig;

  /** Anthropic Config. Only required if the provider is 'anthropic'. */
  @JsonProperty("anthropic_config")
  private AnthropicConfig anthropicConfig;

  /** AWS Bedrock Config. Only required if the provider is 'aws-bedrock'. */
  @JsonProperty("aws_bedrock_config")
  private AwsBedrockConfig awsBedrockConfig;

  /** Cohere Config. Only required if the provider is 'cohere'. */
  @JsonProperty("cohere_config")
  private CohereConfig cohereConfig;

  /**
   * Databricks Model Serving Config. Only required if the provider is 'databricks-model-serving'.
   */
  @JsonProperty("databricks_model_serving_config")
  private DatabricksModelServingConfig databricksModelServingConfig;

  /** The name of the external model. */
  @JsonProperty("name")
  private String name;

  /** OpenAI Config. Only required if the provider is 'openai'. */
  @JsonProperty("openai_config")
  private OpenAiConfig openaiConfig;

  /** PaLM Config. Only required if the provider is 'palm'. */
  @JsonProperty("palm_config")
  private PaLmConfig palmConfig;

  /**
   * The name of the provider for the external model. Currently, the supported providers are
   * 'ai21labs', 'anthropic', 'aws-bedrock', 'cohere', 'databricks-model-serving', 'openai', and
   * 'palm'.",
   */
  @JsonProperty("provider")
  private ExternalModelProvider provider;

  /** The task type of the external model. */
  @JsonProperty("task")
  private String task;

  public ExternalModel setAi21labsConfig(Ai21LabsConfig ai21labsConfig) {
    this.ai21labsConfig = ai21labsConfig;
    return this;
  }

  public Ai21LabsConfig getAi21labsConfig() {
    return ai21labsConfig;
  }

  public ExternalModel setAnthropicConfig(AnthropicConfig anthropicConfig) {
    this.anthropicConfig = anthropicConfig;
    return this;
  }

  public AnthropicConfig getAnthropicConfig() {
    return anthropicConfig;
  }

  public ExternalModel setAwsBedrockConfig(AwsBedrockConfig awsBedrockConfig) {
    this.awsBedrockConfig = awsBedrockConfig;
    return this;
  }

  public AwsBedrockConfig getAwsBedrockConfig() {
    return awsBedrockConfig;
  }

  public ExternalModel setCohereConfig(CohereConfig cohereConfig) {
    this.cohereConfig = cohereConfig;
    return this;
  }

  public CohereConfig getCohereConfig() {
    return cohereConfig;
  }

  public ExternalModel setDatabricksModelServingConfig(
      DatabricksModelServingConfig databricksModelServingConfig) {
    this.databricksModelServingConfig = databricksModelServingConfig;
    return this;
  }

  public DatabricksModelServingConfig getDatabricksModelServingConfig() {
    return databricksModelServingConfig;
  }

  public ExternalModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalModel setOpenaiConfig(OpenAiConfig openaiConfig) {
    this.openaiConfig = openaiConfig;
    return this;
  }

  public OpenAiConfig getOpenaiConfig() {
    return openaiConfig;
  }

  public ExternalModel setPalmConfig(PaLmConfig palmConfig) {
    this.palmConfig = palmConfig;
    return this;
  }

  public PaLmConfig getPalmConfig() {
    return palmConfig;
  }

  public ExternalModel setProvider(ExternalModelProvider provider) {
    this.provider = provider;
    return this;
  }

  public ExternalModelProvider getProvider() {
    return provider;
  }

  public ExternalModel setTask(String task) {
    this.task = task;
    return this;
  }

  public String getTask() {
    return task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalModel that = (ExternalModel) o;
    return Objects.equals(ai21labsConfig, that.ai21labsConfig)
        && Objects.equals(anthropicConfig, that.anthropicConfig)
        && Objects.equals(awsBedrockConfig, that.awsBedrockConfig)
        && Objects.equals(cohereConfig, that.cohereConfig)
        && Objects.equals(databricksModelServingConfig, that.databricksModelServingConfig)
        && Objects.equals(name, that.name)
        && Objects.equals(openaiConfig, that.openaiConfig)
        && Objects.equals(palmConfig, that.palmConfig)
        && Objects.equals(provider, that.provider)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ai21labsConfig,
        anthropicConfig,
        awsBedrockConfig,
        cohereConfig,
        databricksModelServingConfig,
        name,
        openaiConfig,
        palmConfig,
        provider,
        task);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModel.class)
        .add("ai21labsConfig", ai21labsConfig)
        .add("anthropicConfig", anthropicConfig)
        .add("awsBedrockConfig", awsBedrockConfig)
        .add("cohereConfig", cohereConfig)
        .add("databricksModelServingConfig", databricksModelServingConfig)
        .add("name", name)
        .add("openaiConfig", openaiConfig)
        .add("palmConfig", palmConfig)
        .add("provider", provider)
        .add("task", task)
        .toString();
  }
}
