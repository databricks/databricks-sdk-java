// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A Unity Catalog managed or foreign Iceberg table, in Iceberg v2 or v3 format. Table identity,
 * format, schema, and permissions are resolved through Unity Catalog.
 */
@Generated
public class IcebergTableSource {
  /**
   * Schema of the resulting dataframe after transformations, in Spark StructType JSON format (from
   * df.schema.json()). Required if transformation_sql is specified. Example:
   * {"type":"struct","fields":[{"name":"col_a","type":"integer","nullable":true,"metadata":{}},{"name":"col_c","type":"integer","nullable":true,"metadata":{}}]}
   */
  @JsonProperty("dataframe_schema")
  private String dataframeSchema;

  /**
   * A single WHERE clause to filter the Iceberg table before applying transformations. The
   * predicate is evaluated for each row.
   */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /** Full three-part name of the source table. May be omitted on reads when inaccessible. */
  @JsonProperty("full_name")
  private String fullName;

  /**
   * A single SQL SELECT expression applied after filter_condition. The expression must contain all
   * required columns (e.g., "*, col_a + col_b AS col_c"). If transformation_sql is not provided,
   * all columns of the Iceberg table are present in the DataSource dataframe.
   */
  @JsonProperty("transformation_sql")
  private String transformationSql;

  public IcebergTableSource setDataframeSchema(String dataframeSchema) {
    this.dataframeSchema = dataframeSchema;
    return this;
  }

  public String getDataframeSchema() {
    return dataframeSchema;
  }

  public IcebergTableSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public IcebergTableSource setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public IcebergTableSource setTransformationSql(String transformationSql) {
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
    IcebergTableSource that = (IcebergTableSource) o;
    return Objects.equals(dataframeSchema, that.dataframeSchema)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(transformationSql, that.transformationSql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataframeSchema, filterCondition, fullName, transformationSql);
  }

  @Override
  public String toString() {
    return new ToStringer(IcebergTableSource.class)
        .add("dataframeSchema", dataframeSchema)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .add("transformationSql", transformationSql)
        .toString();
  }
}
