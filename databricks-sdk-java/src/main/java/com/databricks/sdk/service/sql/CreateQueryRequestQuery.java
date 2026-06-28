// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateQueryRequestQuery {
  /** Whether to apply a 1000 row limit to the query result. */
  @JsonProperty("apply_auto_limit")
  private Boolean applyAutoLimit;

  /** Name of the catalog where this query will be executed. */
  @JsonProperty("catalog")
  private String catalog;

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

  /** List of query parameter definitions. */
  @JsonProperty("parameters")
  private Collection<QueryParameter> parameters;

  /** Workspace path of the workspace folder containing the object. */
  @JsonProperty("parent_path")
  private String parentPath;

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

  /** ID of the SQL warehouse attached to the query. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public CreateQueryRequestQuery setApplyAutoLimit(Boolean applyAutoLimit) {
    this.applyAutoLimit = applyAutoLimit;
    return this;
  }

  public Boolean getApplyAutoLimit() {
    return applyAutoLimit;
  }

  public CreateQueryRequestQuery setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public CreateQueryRequestQuery setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateQueryRequestQuery setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateQueryRequestQuery setParameters(Collection<QueryParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<QueryParameter> getParameters() {
    return parameters;
  }

  public CreateQueryRequestQuery setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public CreateQueryRequestQuery setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public CreateQueryRequestQuery setRunAsMode(RunAsMode runAsMode) {
    this.runAsMode = runAsMode;
    return this;
  }

  public RunAsMode getRunAsMode() {
    return runAsMode;
  }

  public CreateQueryRequestQuery setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public CreateQueryRequestQuery setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  public CreateQueryRequestQuery setWarehouseId(String warehouseId) {
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
    CreateQueryRequestQuery that = (CreateQueryRequestQuery) o;
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
    return new ToStringer(CreateQueryRequestQuery.class)
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
