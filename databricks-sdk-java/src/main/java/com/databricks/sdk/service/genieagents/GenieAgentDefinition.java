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

  /** The data the Genie Agent can access. */
  @JsonProperty("data_sources")
  private GenieAgentDataSources dataSources;

  /** Instructions and SQL that guide how the Genie Agent answers questions. */
  @JsonProperty("instructions")
  private GenieAgentInstructions instructions;

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

  public GenieAgentDefinition setDataSources(GenieAgentDataSources dataSources) {
    this.dataSources = dataSources;
    return this;
  }

  public GenieAgentDataSources getDataSources() {
    return dataSources;
  }

  public GenieAgentDefinition setInstructions(GenieAgentInstructions instructions) {
    this.instructions = instructions;
    return this;
  }

  public GenieAgentInstructions getInstructions() {
    return instructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgentDefinition that = (GenieAgentDefinition) o;
    return Objects.equals(benchmarks, that.benchmarks)
        && Objects.equals(config, that.config)
        && Objects.equals(dataSources, that.dataSources)
        && Objects.equals(instructions, that.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmarks, config, dataSources, instructions);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgentDefinition.class)
        .add("benchmarks", benchmarks)
        .add("config", config)
        .add("dataSources", dataSources)
        .add("instructions", instructions)
        .toString();
  }
}
