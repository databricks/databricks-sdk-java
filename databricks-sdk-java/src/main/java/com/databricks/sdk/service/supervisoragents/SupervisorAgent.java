// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A Supervisor Agent coordinates tools and subagents, such as Genie Agents, Knowledge Assistants,
 * Unity Catalog functions, MCP servers and agent endpoints, to answer requests that span several
 * domains. It is served through its own serving endpoint. Tools and subagents are managed through
 * the Tool resource. See
 * https://docs.databricks.com/aws/en/generative-ai/agent-bricks/multi-agent-supervisor for the
 * product documentation.
 */
@Generated
public class SupervisorAgent {
  /** The time at which the Supervisor Agent was created, as an RFC 3339 timestamp. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The email address of the user who created the Supervisor Agent. */
  @JsonProperty("creator")
  private String creator;

  /** A summary of what the agent does. It is shown to users of the agent. */
  @JsonProperty("description")
  private String description;

  /**
   * The display name of the Supervisor Agent. It must be unique among the agents in the workspace.
   * Creating an agent with a display name that is already in use fails with ALREADY_EXISTS.
   */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The name of the Model Serving endpoint that serves the Supervisor Agent. Query this endpoint to
   * chat with the agent.
   */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** The ID of the MLflow experiment that is created together with the Supervisor Agent. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** Deprecated: Use supervisor_agent_id instead. This field is no longer populated. */
  @JsonProperty("id")
  private String id;

  /**
   * Natural-language guidelines for how the supervisor should respond and how it should delegate
   * requests to its tools and subagents.
   */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * The resource name of the Supervisor Agent. Format: supervisor-agents/{supervisor_agent_id} The
   * server assigns the name when the agent is created.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The universally unique identifier (UUID) of the Supervisor Agent. It is the last segment of
   * `name`.
   */
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
