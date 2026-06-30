// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateCustomLlmRequest {
  /**
   * This will soon be deprecated!! Optional: UC path for agent artifacts. If you are using a
   * dataset that you only have read permissions, please provide a destination path where you have
   * write permissions. Please provide this in catalog.schema format.
   */
  @JsonProperty("agent_artifact_path")
  private String agentArtifactPath;

  /**
   * Datasets used for training and evaluating the model, not for inference. Currently, only 1
   * dataset is accepted.
   */
  @JsonProperty("datasets")
  private Collection<Dataset> datasets;

  /** Guidelines for the custom LLM to adhere to */
  @JsonProperty("guidelines")
  private Collection<String> guidelines;

  /** Instructions for the custom LLM to follow */
  @JsonProperty("instructions")
  private String instructions;

  /** Name of the custom LLM. Only alphanumeric characters and dashes allowed. */
  @JsonProperty("name")
  private String name;

  public CreateCustomLlmRequest setAgentArtifactPath(String agentArtifactPath) {
    this.agentArtifactPath = agentArtifactPath;
    return this;
  }

  public String getAgentArtifactPath() {
    return agentArtifactPath;
  }

  public CreateCustomLlmRequest setDatasets(Collection<Dataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<Dataset> getDatasets() {
    return datasets;
  }

  public CreateCustomLlmRequest setGuidelines(Collection<String> guidelines) {
    this.guidelines = guidelines;
    return this;
  }

  public Collection<String> getGuidelines() {
    return guidelines;
  }

  public CreateCustomLlmRequest setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public CreateCustomLlmRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCustomLlmRequest that = (CreateCustomLlmRequest) o;
    return Objects.equals(agentArtifactPath, that.agentArtifactPath)
        && Objects.equals(datasets, that.datasets)
        && Objects.equals(guidelines, that.guidelines)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentArtifactPath, datasets, guidelines, instructions, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomLlmRequest.class)
        .add("agentArtifactPath", agentArtifactPath)
        .add("datasets", datasets)
        .add("guidelines", guidelines)
        .add("instructions", instructions)
        .add("name", name)
        .toString();
  }
}
