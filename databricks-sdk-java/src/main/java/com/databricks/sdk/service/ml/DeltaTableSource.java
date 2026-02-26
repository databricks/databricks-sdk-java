// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeltaTableSource {
  /**
   * Schema of the resulting dataframe after transformations, in Spark StructType JSON format (from
   * df.schema.json()). Required if transformation_sql is specified. Example:
   * {"type":"struct","fields":[{"name":"col_a","type":"integer","nullable":true,"metadata":{}},{"name":"col_c","type":"integer","nullable":true,"metadata":{}}]}
   */
  @JsonProperty("dataframe_schema")
  private String dataframeSchema;

  /** The entity columns of the Delta table. */
  @JsonProperty("entity_columns")
  private Collection<String> entityColumns;

  /**
   * Single WHERE clause to filter delta table before applying transformations. Will be row-wise
   * evaluated, so should only include conditionals and projections.
   */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /** The full three-part (catalog, schema, table) name of the Delta table. */
  @JsonProperty("full_name")
  private String fullName;

  /** The timeseries column of the Delta table. */
  @JsonProperty("timeseries_column")
  private String timeseriesColumn;

  /**
   * A single SQL SELECT expression applied after filter_condition. Should contains all the columns
   * needed (eg. "SELECT *, col_a + col_b AS col_c FROM x.y.z WHERE col_a > 0" would have
   * `transformation_sql` "*, col_a + col_b AS col_c") If transformation_sql is not provided, all
   * columns of the delta table are present in the DataSource dataframe.
   */
  @JsonProperty("transformation_sql")
  private String transformationSql;

  public DeltaTableSource setDataframeSchema(String dataframeSchema) {
    this.dataframeSchema = dataframeSchema;
    return this;
  }

  public String getDataframeSchema() {
    return dataframeSchema;
  }

  public DeltaTableSource setEntityColumns(Collection<String> entityColumns) {
    this.entityColumns = entityColumns;
    return this;
  }

  public Collection<String> getEntityColumns() {
    return entityColumns;
  }

  public DeltaTableSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public DeltaTableSource setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public DeltaTableSource setTimeseriesColumn(String timeseriesColumn) {
    this.timeseriesColumn = timeseriesColumn;
    return this;
  }

  public String getTimeseriesColumn() {
    return timeseriesColumn;
  }

  public DeltaTableSource setTransformationSql(String transformationSql) {
    this.transformationSql = transformationSql;
    return this;
  }

  public String getTransformationSql() {
    return transformationSql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaTableSource that = (DeltaTableSource) o;
    return Objects.equals(dataframeSchema, that.dataframeSchema)
        && Objects.equals(entityColumns, that.entityColumns)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(timeseriesColumn, that.timeseriesColumn)
        && Objects.equals(transformationSql, that.transformationSql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataframeSchema,
        entityColumns,
        filterCondition,
        fullName,
        timeseriesColumn,
        transformationSql);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaTableSource.class)
        .add("dataframeSchema", dataframeSchema)
        .add("entityColumns", entityColumns)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .add("timeseriesColumn", timeseriesColumn)
        .add("transformationSql", transformationSql)
        .toString();
  }
}
