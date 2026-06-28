// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

@Generated
public class SupervisorAgent {
  /** Creation timestamp. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The creator of the Supervisor Agent. */
  @JsonProperty("creator")
  private String creator;

  /** Description of what this agent can do (user-facing). */
  @JsonProperty("description")
  private String description;

  /** The display name of the Supervisor Agent, unique at workspace level. */
  @JsonProperty("display_name")
  private String displayName;

  /** The name of the supervisor agent's serving endpoint. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** The MLflow experiment ID. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Deprecated: Use supervisor_agent_id instead. */
  @JsonProperty("id")
  private String id;

  /** Optional natural-language instructions for the supervisor agent. */
  @JsonProperty("instructions")
  private String instructions;

  /** The resource name of the SupervisorAgent. Format: supervisor-agents/{supervisor_agent_id} */
  @JsonProperty("name")
  private String name;

  /** The universally unique identifier (UUID) of the Supervisor Agent. */
  @JsonProperty("supervisor_agent_id")
  private String supervisorAgentId;

  public SupervisorAgent setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SupervisorAgent setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public SupervisorAgent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SupervisorAgent setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public SupervisorAgent setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public SupervisorAgent setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public SupervisorAgent setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public SupervisorAgent setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public SupervisorAgent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SupervisorAgent setSupervisorAgentId(String supervisorAgentId) {
    this.supervisorAgentId = supervisorAgentId;
    return this;
  }

  public String getSupervisorAgentId() {
    return supervisorAgentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SupervisorAgent that = (SupervisorAgent) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(id, that.id)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(name, that.name)
        && Objects.equals(supervisorAgentId, that.supervisorAgentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creator,
        description,
        displayName,
        endpointName,
        experimentId,
        id,
        instructions,
        name,
        supervisorAgentId);
  }

  @Override
  public String toString() {
    return new ToStringer(SupervisorAgent.class)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("description", description)
        .add("displayName", displayName)
        .add("endpointName", endpointName)
        .add("experimentId", experimentId)
        .add("id", id)
        .add("instructions", instructions)
        .add("name", name)
        .add("supervisorAgentId", supervisorAgentId)
        .toString();
  }
}
