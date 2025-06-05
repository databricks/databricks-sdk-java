// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = ExternalModel.ExternalModelSerializer.class)
@JsonDeserialize(using = ExternalModel.ExternalModelDeserializer.class)
public class ExternalModel {
  /** AI21Labs Config. Only required if the provider is 'ai21labs'. */
  private Ai21LabsConfig ai21labsConfig;

  /** Amazon Bedrock Config. Only required if the provider is 'amazon-bedrock'. */
  private AmazonBedrockConfig amazonBedrockConfig;

  /** Anthropic Config. Only required if the provider is 'anthropic'. */
  private AnthropicConfig anthropicConfig;

  /** Cohere Config. Only required if the provider is 'cohere'. */
  private CohereConfig cohereConfig;

  /** Custom Provider Config. Only required if the provider is 'custom'. */
  private CustomProviderConfig customProviderConfig;

  /**
   * Databricks Model Serving Config. Only required if the provider is 'databricks-model-serving'.
   */
  private DatabricksModelServingConfig databricksModelServingConfig;

  /** Google Cloud Vertex AI Config. Only required if the provider is 'google-cloud-vertex-ai'. */
  private GoogleCloudVertexAiConfig googleCloudVertexAiConfig;

  /** The name of the external model. */
  private String name;

  /** OpenAI Config. Only required if the provider is 'openai'. */
  private OpenAiConfig openaiConfig;

  /** PaLM Config. Only required if the provider is 'palm'. */
  private PaLmConfig palmConfig;

  /**
   * The name of the provider for the external model. Currently, the supported providers are
   * 'ai21labs', 'anthropic', 'amazon-bedrock', 'cohere', 'databricks-model-serving',
   * 'google-cloud-vertex-ai', 'openai', 'palm', and 'custom'.
   */
  private ExternalModelProvider provider;

  /** The task type of the external model. */
  private String task;

  public ExternalModel setAi21labsConfig(Ai21LabsConfig ai21labsConfig) {
    this.ai21labsConfig = ai21labsConfig;
    return this;
  }

  public Ai21LabsConfig getAi21labsConfig() {
    return ai21labsConfig;
  }

  public ExternalModel setAmazonBedrockConfig(AmazonBedrockConfig amazonBedrockConfig) {
    this.amazonBedrockConfig = amazonBedrockConfig;
    return this;
  }

  public AmazonBedrockConfig getAmazonBedrockConfig() {
    return amazonBedrockConfig;
  }

  public ExternalModel setAnthropicConfig(AnthropicConfig anthropicConfig) {
    this.anthropicConfig = anthropicConfig;
    return this;
  }

  public AnthropicConfig getAnthropicConfig() {
    return anthropicConfig;
  }

  public ExternalModel setCohereConfig(CohereConfig cohereConfig) {
    this.cohereConfig = cohereConfig;
    return this;
  }

  public CohereConfig getCohereConfig() {
    return cohereConfig;
  }

  public ExternalModel setCustomProviderConfig(CustomProviderConfig customProviderConfig) {
    this.customProviderConfig = customProviderConfig;
    return this;
  }

  public CustomProviderConfig getCustomProviderConfig() {
    return customProviderConfig;
  }

  public ExternalModel setDatabricksModelServingConfig(
      DatabricksModelServingConfig databricksModelServingConfig) {
    this.databricksModelServingConfig = databricksModelServingConfig;
    return this;
  }

  public DatabricksModelServingConfig getDatabricksModelServingConfig() {
    return databricksModelServingConfig;
  }

  public ExternalModel setGoogleCloudVertexAiConfig(
      GoogleCloudVertexAiConfig googleCloudVertexAiConfig) {
    this.googleCloudVertexAiConfig = googleCloudVertexAiConfig;
    return this;
  }

  public GoogleCloudVertexAiConfig getGoogleCloudVertexAiConfig() {
    return googleCloudVertexAiConfig;
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
    return new ToStringer(ExternalModel.class)
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

  ExternalModelPb toPb() {
    ExternalModelPb pb = new ExternalModelPb();
    pb.setAi21labsConfig(ai21labsConfig);
    pb.setAmazonBedrockConfig(amazonBedrockConfig);
    pb.setAnthropicConfig(anthropicConfig);
    pb.setCohereConfig(cohereConfig);
    pb.setCustomProviderConfig(customProviderConfig);
    pb.setDatabricksModelServingConfig(databricksModelServingConfig);
    pb.setGoogleCloudVertexAiConfig(googleCloudVertexAiConfig);
    pb.setName(name);
    pb.setOpenaiConfig(openaiConfig);
    pb.setPalmConfig(palmConfig);
    pb.setProvider(provider);
    pb.setTask(task);

    return pb;
  }

  static ExternalModel fromPb(ExternalModelPb pb) {
    ExternalModel model = new ExternalModel();
    model.setAi21labsConfig(pb.getAi21labsConfig());
    model.setAmazonBedrockConfig(pb.getAmazonBedrockConfig());
    model.setAnthropicConfig(pb.getAnthropicConfig());
    model.setCohereConfig(pb.getCohereConfig());
    model.setCustomProviderConfig(pb.getCustomProviderConfig());
    model.setDatabricksModelServingConfig(pb.getDatabricksModelServingConfig());
    model.setGoogleCloudVertexAiConfig(pb.getGoogleCloudVertexAiConfig());
    model.setName(pb.getName());
    model.setOpenaiConfig(pb.getOpenaiConfig());
    model.setPalmConfig(pb.getPalmConfig());
    model.setProvider(pb.getProvider());
    model.setTask(pb.getTask());

    return model;
  }

  public static class ExternalModelSerializer extends JsonSerializer<ExternalModel> {
    @Override
    public void serialize(ExternalModel value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalModelPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalModelDeserializer extends JsonDeserializer<ExternalModel> {
    @Override
    public ExternalModel deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalModelPb pb = mapper.readValue(p, ExternalModelPb.class);
      return ExternalModel.fromPb(pb);
    }
  }
}
