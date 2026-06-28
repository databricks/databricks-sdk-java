// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListQueryObjectsResponseQuery {
  /** Whether to apply a 1000 row limit to the query result. */
  @JsonProperty("apply_auto_limit")
  private Boolean applyAutoLimit;

  /** Name of the catalog where this query will be executed. */
  @JsonProperty("catalog")
  private String catalog;

  /** Timestamp when this query was created. */
  @JsonProperty("create_time")
  private String createTime;

  /**
   * General description that conveys additional information about this query such as usage notes.
   */
  @JsonProperty("description")
  private String description;

  /**
   * Display name of the query that appears in list views, widget headings, and on the query page.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** UUID identifying the query. */
  @JsonProperty("id")
  private String id;

  /** Username of the user who last saved changes to this query. */
  @JsonProperty("last_modifier_user_name")
  private String lastModifierUserName;

  /** Indicates whether the query is trashed. */
  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  /** Username of the user that owns the query. */
  @JsonProperty("owner_user_name")
  private String ownerUserName;

  /** List of query parameter definitions. */
  @JsonProperty("parameters")
  private Collection<QueryParameter> parameters;

  /** Text of the query to be run. */
  @JsonProperty("query_text")
  private String queryText;

  /** Sets the "Run as" role for the object. */
  @JsonProperty("run_as_mode")
  private RunAsMode runAsMode;

  /** Name of the schema where this query will be executed. */
  @JsonProperty("schema")
  private String schema;

  /** */
  @JsonProperty("tags")
  private Collection<String> tags;

  /** Timestamp when this query was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  /** ID of the SQL warehouse attached to the query. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public ListQueryObjectsResponseQuery setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public ListQueryObjectsResponseQuery setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ListQueryObjectsResponseQuery setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListQueryObjectsResponseQuery setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ListQueryObjectsResponseQuery setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListQueryObjectsResponseQuery setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListQueryObjectsResponseQuery setLastModifierUserName(String lastModifierUserName) {
    this.lastModifierUserName = lastModifierUserName;
    return this;
  }

  public String getLastModifierUserName() {
    return lastModifierUserName;
  }

  public ListQueryObjectsResponseQuery setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListQueryObjectsResponseQuery setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListQueryObjectsResponseQuery setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public ListQueryObjectsResponseQuery setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public ListQueryObjectsResponseQuery setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public ListQueryObjectsResponseQuery setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public ListQueryObjectsResponseQuery setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public ListQueryObjectsResponseQuery setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public ListQueryObjectsResponseQuery setWarehouseId(String warehouseId) {
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
    ListQueryObjectsResponseQuery that = (ListQueryObjectsResponseQuery) o;
    return Objects.equals(applyAutoLimit, that.applyAutoLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id)
        && Objects.equals(lastModifierUserName, that.lastModifierUserName)
        && Objects.equals(lifecycleState, that.lifecycleState)
        && Objects.equals(ownerUserName, that.ownerUserName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(runAsMode, that.runAsMode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(tags, that.tags)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyAutoLimit,
        catalog,
        createTime,
        description,
        displayName,
        id,
        lastModifierUserName,
        lifecycleState,
        ownerUserName,
        parameters,
        queryText,
        runAsMode,
        schema,
        tags,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueryObjectsResponseQuery.class)
        .add("applyAutoLimit", applyAutoLimit)
        .add("catalog", catalog)
        .add("createTime", createTime)
        .add("description", description)
        .add("displayName", displayName)
        .add("id", id)
        .add("lastModifierUserName", lastModifierUserName)
        .add("lifecycleState", lifecycleState)
        .add("ownerUserName", ownerUserName)
        .add("parameters", parameters)
        .add("queryText", queryText)
        .add("runAsMode", runAsMode)
        .add("schema", schema)
        .add("tags", tags)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
