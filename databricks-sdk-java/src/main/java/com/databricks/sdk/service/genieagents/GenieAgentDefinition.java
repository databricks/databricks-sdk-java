// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The definition of a Genie Agent. */
@Generated
public class GenieAgentDefinition {
  /** Benchmarks for evaluating the quality of the Genie Agent's answers. */
  @JsonProperty("benchmarks")
  private GenieAgentBenchmarks benchmarks;

  /** General settings of the Genie Agent. */
  @JsonProperty("config")
  private GenieAgentConfig config;

  /** Instructions and SQL that guide how the Genie Agent answers questions. */
  @JsonProperty("instructions")
  private GenieAgentInstructions instructions;

  /** The resources the Genie Agent can use: data, SQL functions, connections, and sub-agents. */
  @JsonProperty("resources")
  private GenieAgentResources resources;

  public GenieAgentDefinition setBenchmarks(GenieAgentBenchmarks benchmarks) {
    this.benchmarks = benchmarks;
    return this;
  }

  public GenieAgentBenchmarks getBenchmarks() {
    return benchmarks;
  }

  public GenieAgentDefinition setConfig(GenieAgentConfig config) {
    this.config = config;
    return this;
  }

  public GenieAgentConfig getConfig() {
    return config;
  }

  public GenieAgentDefinition setInstructions(GenieAgentInstructions instructions) {
    this.instructions = instructions;
    return this;
  }

  public GenieAgentInstructions getInstructions() {
    return instructions;
  }

  public GenieAgentDefinition setResources(GenieAgentResources resources) {
    this.resources = resources;
    return this;
  }

  public GenieAgentResources getResources() {
    return resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentDefinition that = (GenieAgentDefinition) o;
    return Objects.equals(benchmarks, that.benchmarks)
        && Objects.equals(config, that.config)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(resources, that.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarks, config, instructions, resources);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentDefinition.class)
        .add("benchmarks", benchmarks)
        .add("config", config)
        .add("instructions", instructions)
        .add("resources", resources)
        .toString();
  }
}
