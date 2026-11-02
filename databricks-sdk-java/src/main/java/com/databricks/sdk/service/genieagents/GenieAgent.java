// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.genieagents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A Genie Agent resource. */
@Generated
public class GenieAgent {
  /** Time when the Genie Agent was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * The definition of the Genie Agent: its sample questions, data sources, instructions, and
   * benchmarks. Must set at least one field. Returned on get and on list with
   * `GENIE_AGENT_VIEW_FULL`. Create and update return a submitted definition unchanged; one the
   * service would store differently, or with a column config the workspace can't keep (unknown
   * column, or a display name while those are disabled), is rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("definition")
  private GenieAgentDefinition definition;

  /**
   * Description of the Genie Agent.
   *
   * <p>The maximum length is 4,096 characters. Requests with a longer value are rejected with
   * INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Display name of the Genie Agent. Must be unique within its folder (effective_parent_path): a
   * create, rename, or move that would collide with an existing Genie Agent's name in the target
   * folder is rejected with ALREADY_EXISTS.
   *
   * <p>The maximum length is 63 characters. Requests with a longer value are rejected with
   * INVALID_PARAMETER_VALUE.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** The workspace folder that contains the Genie Agent. */
  @JsonProperty("effective_parent_path")
  private String effectiveParentPath;

  /**
   * Weak etag of `definition` only; metadata changes do not affect it. Send it on update or delete
   * to detect concurrent definition changes.
   */
  @JsonProperty("etag")
  private String etag;

  /**
   * The resource name of the Genie Agent, in the form `agents/{genie_agent_id}`. Ignored on create.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The workspace folder to create the Genie Agent in. If omitted, the caller's home folder is
   * used. Returned exactly as submitted; see `effective_parent_path` for the current folder. On
   * update, setting it moves the Genie Agent and clearing it does not. At most 4,096 characters.
   */
  @JsonProperty("parent_path")
  private String parentPath;

  /** Time when the Genie Agent was last modified. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Warehouse associated with the Genie Agent. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public GenieAgent setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public GenieAgent setDefinition(GenieAgentDefinition definition) {
    this.definition = definition;
    return this;
  }

  public GenieAgentDefinition getDefinition() {
    return definition;
  }

  public GenieAgent setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public GenieAgent setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public GenieAgent setEffectiveParentPath(String effectiveParentPath) {
    this.effectiveParentPath = effectiveParentPath;
    return this;
  }

  public String getEffectiveParentPath() {
    return effectiveParentPath;
  }

  public GenieAgent setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public GenieAgent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GenieAgent setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public GenieAgent setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public GenieAgent setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAgent that = (GenieAgent) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(definition, that.definition)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(effectiveParentPath, that.effectiveParentPath)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        definition,
        description,
        displayName,
        effectiveParentPath,
        etag,
        name,
        parentPath,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAgent.class)
        .add("createTime", createTime)
        .add("definition", definition)
        .add("description", description)
        .add("displayName", displayName)
        .add("effectiveParentPath", effectiveParentPath)
        .add("etag", etag)
        .add("name", name)
        .add("parentPath", parentPath)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
