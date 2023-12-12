// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExternalModel {
  /** The config for the external model, which must match the provider. */
  @JsonProperty("config")
  private ExternalModelConfig config;

  /** The name of the external model. */
  @JsonProperty("name")
  private String name;

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

  public ExternalModel setConfig(ExternalModelConfig config) {
    this.config = config;
    return this;
  }

  public ExternalModelConfig getConfig() {
    return config;
  }

  public ExternalModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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
    return Objects.equals(config, that.config)
        && Objects.equals(name, that.name)
        && Objects.equals(provider, that.provider)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, provider, task);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalModel.class)
        .add("config", config)
        .add("name", name)
        .add("provider", provider)
        .add("task", task)
        .toString();
  }
}
