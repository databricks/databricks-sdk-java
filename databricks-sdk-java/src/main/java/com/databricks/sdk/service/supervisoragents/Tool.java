// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Tool {
  /** */
  @JsonProperty("app")
  private App app;

  /** Description of what this tool does (user-facing). */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("genie_space")
  private GenieSpace genieSpace;

  /** Deprecated: Use tool_id instead. */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("knowledge_assistant")
  private KnowledgeAssistant knowledgeAssistant;

  /** Full resource name: supervisor-agents/{supervisor_agent_id}/tools/{tool_id} */
  @JsonProperty("name")
  private String name;

  /** User specified id of the Tool. */
  @JsonProperty("tool_id")
  private String toolId;

  /**
   * Tool type. Must be one of: "genie_space", "knowledge_assistant", "uc_function",
   * "uc_connection", "app", "volume", "lakeview_dashboard", "serving_endpoint", "uc_table",
   * "vector_search_index".
   */
  @JsonProperty("tool_type")
  private String toolType;

  /** */
  @JsonProperty("uc_connection")
  private UcConnection ucConnection;

  /** */
  @JsonProperty("uc_function")
  private UcFunction ucFunction;

  /** */
  @JsonProperty("volume")
  private Volume volume;

  public Tool setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public Tool setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Tool setGenieSpace(GenieSpace genieSpace) {
    this.genieSpace = genieSpace;
    return this;
  }

  public GenieSpace getGenieSpace() {
    return genieSpace;
  }

  public Tool setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Tool setKnowledgeAssistant(KnowledgeAssistant knowledgeAssistant) {
    this.knowledgeAssistant = knowledgeAssistant;
    return this;
  }

  public KnowledgeAssistant getKnowledgeAssistant() {
    return knowledgeAssistant;
  }

  public Tool setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Tool setToolId(String toolId) {
    this.toolId = toolId;
    return this;
  }

  public String getToolId() {
    return toolId;
  }

  public Tool setToolType(String toolType) {
    this.toolType = toolType;
    return this;
  }

  public String getToolType() {
    return toolType;
  }

  public Tool setUcConnection(UcConnection ucConnection) {
    this.ucConnection = ucConnection;
    return this;
  }

  public UcConnection getUcConnection() {
    return ucConnection;
  }

  public Tool setUcFunction(UcFunction ucFunction) {
    this.ucFunction = ucFunction;
    return this;
  }

  public UcFunction getUcFunction() {
    return ucFunction;
  }

  public Tool setVolume(Volume volume) {
    this.volume = volume;
    return this;
  }

  public Volume getVolume() {
    return volume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tool that = (Tool) o;
    return Objects.equals(app, that.app)
        && Objects.equals(description, that.description)
        && Objects.equals(genieSpace, that.genieSpace)
        && Objects.equals(id, that.id)
        && Objects.equals(knowledgeAssistant, that.knowledgeAssistant)
        && Objects.equals(name, that.name)
        && Objects.equals(toolId, that.toolId)
        && Objects.equals(toolType, that.toolType)
        && Objects.equals(ucConnection, that.ucConnection)
        && Objects.equals(ucFunction, that.ucFunction)
        && Objects.equals(volume, that.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        app,
        description,
        genieSpace,
        id,
        knowledgeAssistant,
        name,
        toolId,
        toolType,
        ucConnection,
        ucFunction,
        volume);
  }

  @Override
  public String toString() {
    return new ToStringer(Tool.class)
        .add("app", app)
        .add("description", description)
        .add("genieSpace", genieSpace)
        .add("id", id)
        .add("knowledgeAssistant", knowledgeAssistant)
        .add("name", name)
        .add("toolId", toolId)
        .add("toolType", toolType)
        .add("ucConnection", ucConnection)
        .add("ucFunction", ucFunction)
        .add("volume", volume)
        .toString();
  }
}
