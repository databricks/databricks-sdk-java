// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomLlm {
  /** */
  @JsonProperty("agent_artifact_path")
  private String agentArtifactPath;

  /** Creation timestamp of the custom LLM */
  @JsonProperty("creation_time")
  private String creationTime;

  /** Creator of the custom LLM */
  @JsonProperty("creator")
  private String creator;

  /** Datasets used for training and evaluating the model, not for inference */
  @JsonProperty("datasets")
  private Collection<Dataset> datasets;

  /** Name of the endpoint that will be used to serve the custom LLM */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** Guidelines for the custom LLM to adhere to */
  @JsonProperty("guidelines")
  private Collection<String> guidelines;

  /** */
  @JsonProperty("id")
  private String id;

  /** Instructions for the custom LLM to follow */
  @JsonProperty("instructions")
  private String instructions;

  /** Name of the custom LLM */
  @JsonProperty("name")
  private String name;

  /** If optimization is kicked off, tracks the state of the custom LLM */
  @JsonProperty("optimization_state")
  private State optimizationState;

  public CustomLlm setAgentArtifactPath(String agentArtifactPath) {
    this.agentArtifactPath = agentArtifactPath;
    return this;
  }

  public String getAgentArtifactPath() {
    return agentArtifactPath;
  }

  public CustomLlm setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public CustomLlm setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public CustomLlm setDatasets(Collection<Dataset> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<Dataset> getDatasets() {
    return datasets;
  }

  public CustomLlm setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public CustomLlm setGuidelines(Collection<String> guidelines) {
    this.guidelines = guidelines;
    return this;
  }

  public Collection<String> getGuidelines() {
    return guidelines;
  }

  public CustomLlm setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public CustomLlm setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public CustomLlm setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CustomLlm setOptimizationState(State optimizationState) {
    this.optimizationState = optimizationState;
    return this;
  }

  public State getOptimizationState() {
    return optimizationState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomLlm that = (CustomLlm) o;
    return Objects.equals(agentArtifactPath, that.agentArtifactPath)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(datasets, that.datasets)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(guidelines, that.guidelines)
        && Objects.equals(id, that.id)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(name, that.name)
        && Objects.equals(optimizationState, that.optimizationState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentArtifactPath,
        creationTime,
        creator,
        datasets,
        endpointName,
        guidelines,
        id,
        instructions,
        name,
        optimizationState);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomLlm.class)
        .add("agentArtifactPath", agentArtifactPath)
        .add("creationTime", creationTime)
        .add("creator", creator)
        .add("datasets", datasets)
        .add("endpointName", endpointName)
        .add("guidelines", guidelines)
        .add("id", id)
        .add("instructions", instructions)
        .add("name", name)
        .add("optimizationState", optimizationState)
        .toString();
  }
}
