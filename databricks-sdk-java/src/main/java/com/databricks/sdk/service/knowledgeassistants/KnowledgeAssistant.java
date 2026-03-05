// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.knowledgeassistants;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * Entity message that represents a knowledge assistant. Note: REQUIRED annotations below represent
 * create-time requirements. For updates, required fields are determined by the update mask.
 */
@Generated
public class KnowledgeAssistant {
  /** Creation timestamp. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** The creator of the Knowledge Assistant. */
  @JsonProperty("creator")
  private String creator;

  /**
   * Description of what this agent can do (user-facing). Required when creating a Knowledge
   * Assistant. When updating a Knowledge Assistant, optional unless included in update_mask.
   */
  @JsonProperty("description")
  private String description;

  /**
   * The display name of the Knowledge Assistant, unique at workspace level. Required when creating
   * a Knowledge Assistant. When updating a Knowledge Assistant, optional unless included in
   * update_mask.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** The name of the knowledge assistant agent endpoint. */
  @JsonProperty("endpoint_name")
  private String endpointName;

  /** Error details when the Knowledge Assistant is in FAILED state. */
  @JsonProperty("error_info")
  private String errorInfo;

  /** The MLflow experiment ID. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** The universally unique identifier (UUID) of the Knowledge Assistant. */
  @JsonProperty("id")
  private String id;

  /**
   * Additional global instructions on how the agent should generate answers. Optional on create and
   * update. When updating a Knowledge Assistant, include this field in update_mask to modify it.
   */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * The resource name of the Knowledge Assistant. Format:
   * knowledge-assistants/{knowledge_assistant_id}
   */
  @JsonProperty("name")
  private String name;

  /** State of the Knowledge Assistant. Not returned in List responses. */
  @JsonProperty("state")
  private KnowledgeAssistantState state;

  public KnowledgeAssistant setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public KnowledgeAssistant setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public KnowledgeAssistant setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public KnowledgeAssistant setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public KnowledgeAssistant setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public KnowledgeAssistant setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  public String getErrorInfo() {
    return errorInfo;
  }

  public KnowledgeAssistant setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public KnowledgeAssistant setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public KnowledgeAssistant setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public KnowledgeAssistant setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public KnowledgeAssistant setState(KnowledgeAssistantState state) {
    this.state = state;
    return this;
  }

  public KnowledgeAssistantState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KnowledgeAssistant that = (KnowledgeAssistant) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(endpointName, that.endpointName)
        && Objects.equals(errorInfo, that.errorInfo)
        && Objects.equals(experimentId, that.experimentId)
        && Objects.equals(id, that.id)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(name, that.name)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creator,
        description,
        displayName,
        endpointName,
        errorInfo,
        experimentId,
        id,
        instructions,
        name,
        state);
  }

  @Override
  public String toString() {
    return new ToStringer(KnowledgeAssistant.class)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("description", description)
        .add("displayName", displayName)
        .add("endpointName", endpointName)
        .add("errorInfo", errorInfo)
        .add("experimentId", experimentId)
        .add("id", id)
        .add("instructions", instructions)
        .add("name", name)
        .add("state", state)
        .toString();
  }
}
