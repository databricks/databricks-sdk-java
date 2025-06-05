// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExternalModelPb {
  @JsonProperty("ai21labs_config")
  private Ai21LabsConfig ai21labsConfig;

  @JsonProperty("amazon_bedrock_config")
  private AmazonBedrockConfig amazonBedrockConfig;

  @JsonProperty("anthropic_config")
  private AnthropicConfig anthropicConfig;

  @JsonProperty("cohere_config")
  private CohereConfig cohereConfig;

  @JsonProperty("custom_provider_config")
  private CustomProviderConfig customProviderConfig;

  @JsonProperty("databricks_model_serving_config")
  private DatabricksModelServingConfig databricksModelServingConfig;

  @JsonProperty("google_cloud_vertex_ai_config")
  private GoogleCloudVertexAiConfig googleCloudVertexAiConfig;

  @JsonProperty("name")
  private String name;

  @JsonProperty("openai_config")
  private OpenAiConfig openaiConfig;

  @JsonProperty("palm_config")
  private PaLmConfig palmConfig;

  @JsonProperty("provider")
  private ExternalModelProvider provider;

  @JsonProperty("task")
  private String task;

  public ExternalModelPb setAi21labsConfig(Ai21LabsConfig ai21labsConfig) {
    this.ai21labsConfig = ai21labsConfig;
    return this;
  }

  public Ai21LabsConfig getAi21labsConfig() {
    return ai21labsConfig;
  }

  public ExternalModelPb setAmazonBedrockConfig(AmazonBedrockConfig amazonBedrockConfig) {
    this.amazonBedrockConfig = amazonBedrockConfig;
    return this;
  }

  public AmazonBedrockConfig getAmazonBedrockConfig() {
    return amazonBedrockConfig;
  }

  public ExternalModelPb setAnthropicConfig(AnthropicConfig anthropicConfig) {
    this.anthropicConfig = anthropicConfig;
    return this;
  }

  public AnthropicConfig getAnthropicConfig() {
    return anthropicConfig;
  }

  public ExternalModelPb setCohereConfig(CohereConfig cohereConfig) {
    this.cohereConfig = cohereConfig;
    return this;
  }

  public CohereConfig getCohereConfig() {
    return cohereConfig;
  }

  public ExternalModelPb setCustomProviderConfig(CustomProviderConfig customProviderConfig) {
    this.customProviderConfig = customProviderConfig;
    return this;
  }

  public CustomProviderConfig getCustomProviderConfig() {
    return customProviderConfig;
  }

  public ExternalModelPb setDatabricksModelServingConfig(
      DatabricksModelServingConfig databricksModelServingConfig) {
    this.databricksModelServingConfig = databricksModelServingConfig;
    return this;
  }

  public DatabricksModelServingConfig getDatabricksModelServingConfig() {
    return databricksModelServingConfig;
  }

  public ExternalModelPb setGoogleCloudVertexAiConfig(
      GoogleCloudVertexAiConfig googleCloudVertexAiConfig) {
    this.googleCloudVertexAiConfig = googleCloudVertexAiConfig;
    return this;
  }

  public GoogleCloudVertexAiConfig getGoogleCloudVertexAiConfig() {
    return googleCloudVertexAiConfig;
  }

  public ExternalModelPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExternalModelPb setOpenaiConfig(OpenAiConfig openaiConfig) {
    this.openaiConfig = openaiConfig;
    return this;
  }

  public OpenAiConfig getOpenaiConfig() {
    return openaiConfig;
  }

  public ExternalModelPb setPalmConfig(PaLmConfig palmConfig) {
    this.palmConfig = palmConfig;
    return this;
  }

  public PaLmConfig getPalmConfig() {
    return palmConfig;
  }

  public ExternalModelPb setProvider(ExternalModelProvider provider) {
    this.provider = provider;
    return this;
  }

  public ExternalModelProvider getProvider() {
    return provider;
  }

  public ExternalModelPb setTask(String task) {
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
    ExternalModelPb that = (ExternalModelPb) o;
    return Objects.equals(ai21labsConfig, that.ai21labsConfig)
        && Objects.equals(amazonBedrockConfig, that.amazonBedrockConfig)
        && Objects.equals(anthropicConfig, that.anthropicConfig)
        && Objects.equals(cohereConfig, that.cohereConfig)
        && Objects.equals(customProviderConfig, that.customProviderConfig)
        && Objects.equals(databricksModelServingConfig, that.databricksModelServingConfig)
        && Objects.equals(googleCloudVertexAiConfig, that.googleCloudVertexAiConfig)
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
        amazonBedrockConfig,
        anthropicConfig,
        cohereConfig,
        customProviderConfig,
        databricksModelServingConfig,
        googleCloudVertexAiConfig,
        name,
        openaiConfig,
        palmConfig,
        provider,
        task);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModelPb.class)
        .add("ai21labsConfig", ai21labsConfig)
        .add("amazonBedrockConfig", amazonBedrockConfig)
        .add("anthropicConfig", anthropicConfig)
        .add("cohereConfig", cohereConfig)
        .add("customProviderConfig", customProviderConfig)
        .add("databricksModelServingConfig", databricksModelServingConfig)
        .add("googleCloudVertexAiConfig", googleCloudVertexAiConfig)
        .add("name", name)
        .add("openaiConfig", openaiConfig)
        .add("palmConfig", palmConfig)
        .add("provider", provider)
        .add("task", task)
        .toString();
  }
}
