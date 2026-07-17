// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A Stream entity used as a data source for a feature. */
@Generated
public class StreamSource {
  /**
   * Schema of the resulting dataframe after transformations, in Spark StructType JSON format (from
   * df.schema.json()). Any subsequent functions operate against this dataframe.
   */
  @JsonProperty("dataframe_schema")
  private String dataframeSchema;

  /** The filter condition applied to the source data before aggregation. */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /** Three-part full name of the Stream (catalog.schema.stream). */
  @JsonProperty("full_name")
  private String fullName;

  /**
   * The pipeline runs these SQL statements immediately after conversion into the schema specified
   * on the Stream object.
   */
  @JsonProperty("transformation_sql")
  private String transformationSql;

  public StreamSource setDataframeSchema(String dataframeSchema) {
    this.dataframeSchema = dataframeSchema;
    return this;
  }

  public String getDataframeSchema() {
    return dataframeSchema;
  }

  public StreamSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public StreamSource setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public StreamSource setTransformationSql(String transformationSql) {
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
    StreamSource that = (StreamSource) o;
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
    return new ToStringer(StreamSource.class)
        .add("dataframeSchema", dataframeSchema)
        .add("filterCondition", filterCondition)
        .add("fullName", fullName)
        .add("transformationSql", transformationSql)
        .toString();
  }
}
