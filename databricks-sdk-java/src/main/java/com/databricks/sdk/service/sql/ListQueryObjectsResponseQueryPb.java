// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListQueryObjectsResponseQueryPb {
  @JsonProperty("apply_auto_limit")
  private Boolean applyAutoLimit;

  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("description")
  private String description;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_modifier_user_name")
  private String lastModifierUserName;

  @JsonProperty("lifecycle_state")
  private LifecycleState lifecycleState;

  @JsonProperty("owner_user_name")
  private String ownerUserName;

  @JsonProperty("parameters")
  private Collection<QueryParameter> parameters;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("run_as_mode")
  private RunAsMode runAsMode;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("tags")
  private Collection<String> tags;

  @JsonProperty("update_time")
  private String updateTime;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public ListQueryObjectsResponseQueryPb setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public ListQueryObjectsResponseQueryPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public ListQueryObjectsResponseQueryPb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public ListQueryObjectsResponseQueryPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ListQueryObjectsResponseQueryPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ListQueryObjectsResponseQueryPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListQueryObjectsResponseQueryPb setLastModifierUserName(String lastModifierUserName) {
    this.lastModifierUserName = lastModifierUserName;
    return this;
  }

  public String getLastModifierUserName() {
    return lastModifierUserName;
  }

  public ListQueryObjectsResponseQueryPb setLifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  public LifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public ListQueryObjectsResponseQueryPb setOwnerUserName(String ownerUserName) {
    this.ownerUserName = ownerUserName;
    return this;
  }

  public String getOwnerUserName() {
    return ownerUserName;
  }

  public ListQueryObjectsResponseQueryPb setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public ListQueryObjectsResponseQueryPb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public ListQueryObjectsResponseQueryPb setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public ListQueryObjectsResponseQueryPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public ListQueryObjectsResponseQueryPb setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public ListQueryObjectsResponseQueryPb setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public ListQueryObjectsResponseQueryPb setWarehouseId(String warehouseId) {
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
    ListQueryObjectsResponseQueryPb that = (ListQueryObjectsResponseQueryPb) o;
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
    return new ToStringer(ListQueryObjectsResponseQueryPb.class)
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
