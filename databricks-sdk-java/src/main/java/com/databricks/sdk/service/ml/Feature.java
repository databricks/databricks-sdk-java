// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Feature {
  /** Name of parent catalog. */
  @JsonProperty("catalog_name")
  private String catalogName;

  /** Time at which this feature was created. */
  @JsonProperty("created_at")
  private Timestamp createdAt;

  /** Username of the feature creator. */
  @JsonProperty("created_by")
  private String createdBy;

  /** The description of the feature. */
  @JsonProperty("description")
  private String description;

  /** The entity columns for the feature, used as aggregation keys and for query-time lookup. */
  @JsonProperty("entities")
  private Collection<EntityColumn> entities;

  /**
   * Deprecated: Use DeltaTableSource.filter_condition or KafkaSource.filter_condition instead. Kept
   * for backwards compatibility. The filter condition applied to the source data before
   * aggregation.
   */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /**
   * The full three-part name (catalog, schema, name) of the feature. This is the feature's resource
   * identifier; the catalog_name, schema_name, and name fields below are OUTPUT_ONLY decomposed
   * views of this value.
   */
  @JsonProperty("full_name")
  private String fullName;

  /** The function by which the feature is computed. */
  @JsonProperty("function")
  private Function function;

  /**
   * Deprecated: Use AggregationFunction.inputs instead. Kept for backwards compatibility. The input
   * columns from which the feature is computed.
   */
  @JsonProperty("inputs")
  private Collection<String> inputs;

  /**
   * Lineage context information for this feature. WARNING: This field is primarily intended for
   * internal use by Databricks systems and is automatically populated when features are created
   * through Databricks notebooks or jobs. Users should not manually set this field as incorrect
   * values may lead to inaccurate lineage tracking or unexpected behavior. This field will be set
   * by feature-engineering client and should be left unset by SDK and terraform users.
   */
  @JsonProperty("lineage_context")
  private LineageContext lineageContext;

  /** Name of the feature, extracted from the full three-part name (catalog.schema.name). */
  @JsonProperty("name")
  private String name;

  /** Name of parent schema relative to its parent catalog. */
  @JsonProperty("schema_name")
  private String schemaName;

  /** The data source of the feature. */
  @JsonProperty("source")
  private DataSource source;

  /**
   * Deprecated: Use Function.aggregation_function.time_window instead. Kept for backwards
   * compatibility. The time window in which the feature is computed.
   */
  @JsonProperty("time_window")
  private TimeWindow timeWindow;

  /** Column recording time, used for point-in-time joins, backfills, and aggregations. */
  @JsonProperty("timeseries_column")
  private TimeseriesColumn timeseriesColumn;

  public Feature setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public Feature setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public Feature setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Feature setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Feature setEntities(Collection<EntityColumn> entities) {
    this.entities = entities;
    return this;
  }

  public Collection<EntityColumn> getEntities() {
    return entities;
  }

  public Feature setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public Feature setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public Feature setFunction(Function function) {
    this.function = function;
    return this;
  }

  public Function getFunction() {
    return function;
  }

  public Feature setInputs(Collection<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public Collection<String> getInputs() {
    return inputs;
  }

  public Feature setLineageContext(LineageContext lineageContext) {
    this.lineageContext = lineageContext;
    return this;
  }

  public LineageContext getLineageContext() {
    return lineageContext;
  }

  public Feature setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Feature setSchemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public Feature setSource(DataSource source) {
    this.source = source;
    return this;
  }

  public DataSource getSource() {
    return source;
  }

  public Feature setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public Feature setTimeseriesColumn(TimeseriesColumn timeseriesColumn) {
    this.timeseriesColumn = timeseriesColumn;
    return this;
  }

  public TimeseriesColumn getTimeseriesColumn() {
    return timeseriesColumn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Feature that = (Feature) o;
    return Objects.equals(catalogName, that.catalogName)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(description, that.description)
        && Objects.equals(entities, that.entities)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(function, that.function)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(lineageContext, that.lineageContext)
        && Objects.equals(name, that.name)
        && Objects.equals(schemaName, that.schemaName)
        && Objects.equals(source, that.source)
        && Objects.equals(timeWindow, that.timeWindow)
        && Objects.equals(timeseriesColumn, that.timeseriesColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        catalogName,
        createdAt,
        createdBy,
        description,
        entities,
        filterCondition,
        fullName,
        function,
        inputs,
        lineageContext,
        name,
        schemaName,
        source,
        timeWindow,
        timeseriesColumn);
  }

  @Override
  public String toString() {
    return new ToStringer(Feature.class)
        .add("catalogName", catalogName)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("description", description)
        .add("entities", entities)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .add("function", function)
        .add("inputs", inputs)
        .add("lineageContext", lineageContext)
        .add("name", name)
        .add("schemaName", schemaName)
        .add("source", source)
        .add("timeWindow", timeWindow)
        .add("timeseriesColumn", timeseriesColumn)
        .toString();
  }
}
