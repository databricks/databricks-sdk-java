// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A Spark Declarative Pipeline (SDP) data source. */
@Generated
public class SdpSource {
  /**
   * Schema of the resulting dataframe after transformations, in Spark StructType JSON format (from
   * df.schema.json()). Required if transformation_sql is specified. Example:
   * {"type":"struct","fields":[{"name":"col_a","type":"integer","nullable":true,"metadata":{}},{"name":"col_c","type":"integer","nullable":true,"metadata":{}}]}
   */
  @JsonProperty("dataframe_schema")
  private String dataframeSchema;

  /**
   * Single WHERE clause to filter the pipeline's output table before applying transformations. Will
   * be row-wise evaluated, so should only include conditionals and projections.
   */
  @JsonProperty("filter_condition")
  private String filterCondition;

  /**
   * The full three-part names of the tables the pipeline reads from. Required to materialize this
   * feature with a TableTrigger, which starts a run when these tables update. Each table must exist
   * when the feature is created. Feature Store doesn't confirm that the pipeline reads from these
   * tables. At most 100 tables.
   */
  @JsonProperty("input_tables")
  private Collection<String> inputTables;

  /**
   * The full three-part (catalog, schema, table) name of the pipeline's output table to read from.
   * The table doesn't need to exist until the pipeline first runs. Required.
   */
  @JsonProperty("output_table")
  private String outputTable;

  /**
   * The ID of the Spark Declarative Pipeline that Feature Store runs to produce this source, before
   * each materialization or backfill. The pipeline must already exist when the feature is created,
   * and you need CAN_RUN, CAN_MANAGE, or owner permission on it. It doesn't need to have run yet.
   * Deleting the feature doesn't delete the pipeline. If the pipeline is deleted, this field reads
   * back empty. Required.
   */
  @JsonProperty("pipeline_id")
  private String pipelineId;

  /**
   * State tracking pipeline execution and output table validation. PENDING until the pipeline has
   * run at least once and created the output table; then RESOLVED on success, or ERROR on failure.
   */
  @JsonProperty("pipeline_state")
  private SdpSourceState pipelineState;

  /**
   * A single SQL SELECT expression applied after filter_condition. Should contain all the columns
   * needed (eg. "SELECT *, col_a + col_b AS col_c FROM x.y.z WHERE col_a > 0" would have
   * `transformation_sql` "*, col_a + col_b AS col_c") If transformation_sql is not provided, all
   * columns of the pipeline's output table are present in the DataSource dataframe.
   */
  @JsonProperty("transformation_sql")
  private String transformationSql;

  public SdpSource setDataframeSchema(String dataframeSchema) {
    this.dataframeSchema = dataframeSchema;
    return this;
  }

  public String getDataframeSchema() {
    return dataframeSchema;
  }

  public SdpSource setFilterCondition(String filterCondition) {
    this.filterCondition = filterCondition;
    return this;
  }

  public String getFilterCondition() {
    return filterCondition;
  }

  public SdpSource setInputTables(Collection<String> inputTables) {
    this.inputTables = inputTables;
    return this;
  }

  public Collection<String> getInputTables() {
    return inputTables;
  }

  public SdpSource setOutputTable(String outputTable) {
    this.outputTable = outputTable;
    return this;
  }

  public String getOutputTable() {
    return outputTable;
  }

  public SdpSource setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  public String getPipelineId() {
    return pipelineId;
  }

  public SdpSource setPipelineState(SdpSourceState pipelineState) {
    this.pipelineState = pipelineState;
    return this;
  }

  public SdpSourceState getPipelineState() {
    return pipelineState;
  }

  public SdpSource setTransformationSql(String transformationSql) {
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
    SdpSource that = (SdpSource) o;
    return Objects.equals(dataframeSchema, that.dataframeSchema)
        && Objects.equals(filterCondition, that.filterCondition)
        && Objects.equals(inputTables, that.inputTables)
        && Objects.equals(outputTable, that.outputTable)
        && Objects.equals(pipelineId, that.pipelineId)
        && Objects.equals(pipelineState, that.pipelineState)
        && Objects.equals(transformationSql, that.transformationSql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataframeSchema,
        filterCondition,
        inputTables,
        outputTable,
        pipelineId,
        pipelineState,
        transformationSql);
  }

  @Override
  public String toString() {
    return new ToStringer(SdpSource.class)
        .add("dataframeSchema", dataframeSchema)
        .add("filterCondition", filterCondition)
        .add("inputTables", inputTables)
        .add("outputTable", outputTable)
        .add("pipelineId", pipelineId)
        .add("pipelineState", pipelineState)
        .add("transformationSql", transformationSql)
        .toString();
  }
}
