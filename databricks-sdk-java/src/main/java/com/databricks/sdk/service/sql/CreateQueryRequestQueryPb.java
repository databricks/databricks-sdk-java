// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateQueryRequestQueryPb {
  @JsonProperty("apply_auto_limit")
  private Boolean applyAutoLimit;

  @JsonProperty("catalog")
  private String catalog;

  @JsonProperty("description")
  private String description;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("parameters")
  private Collection<QueryParameter> parameters;

  @JsonProperty("parent_path")
  private String parentPath;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("run_as_mode")
  private RunAsMode runAsMode;

  @JsonProperty("schema")
  private String schema;

  @JsonProperty("tags")
  private Collection<String> tags;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public CreateQueryRequestQueryPb setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public CreateQueryRequestQueryPb setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public CreateQueryRequestQueryPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateQueryRequestQueryPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateQueryRequestQueryPb setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public CreateQueryRequestQueryPb setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public CreateQueryRequestQueryPb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public CreateQueryRequestQueryPb setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public CreateQueryRequestQueryPb setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public CreateQueryRequestQueryPb setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public CreateQueryRequestQueryPb setWarehouseId(String warehouseId) {
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
    CreateQueryRequestQueryPb that = (CreateQueryRequestQueryPb) o;
    return Objects.equals(applyAutoLimit, that.applyAutoLimit)
        && Objects.equals(catalog, that.catalog)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(runAsMode, that.runAsMode)
        && Objects.equals(schema, that.schema)
        && Objects.equals(tags, that.tags)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applyAutoLimit,
        catalog,
        description,
        displayName,
        parameters,
        parentPath,
        queryText,
        runAsMode,
        schema,
        tags,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateQueryRequestQueryPb.class)
        .add("applyAutoLimit", applyAutoLimit)
        .add("catalog", catalog)
        .add("description", description)
        .add("displayName", displayName)
        .add("parameters", parameters)
        .add("parentPath", parentPath)
        .add("queryText", queryText)
        .add("runAsMode", runAsMode)
        .add("schema", schema)
        .add("tags", tags)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
