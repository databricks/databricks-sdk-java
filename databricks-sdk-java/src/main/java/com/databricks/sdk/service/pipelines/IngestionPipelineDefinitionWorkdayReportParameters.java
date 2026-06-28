// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class IngestionPipelineDefinitionWorkdayReportParameters {
  /**
   * (Optional) Marks the report as incremental. This field is deprecated and should not be used.
   * Use `parameters` instead. The incremental behavior is now controlled by the `parameters` field.
   */
  @JsonProperty("incremental")
  private Boolean incremental;

  /**
   * Parameters for the Workday report. Each key represents the parameter name (e.g., "start_date",
   * "end_date"), and the corresponding value is a SQL-like expression used to compute the parameter
   * value at runtime. Example: { "start_date": "{ coalesce(current_offset(), date(\"2025-02-01\"))
   * }", "end_date": "{ current_date() - INTERVAL 1 DAY }" }
   */
  @JsonProperty("parameters")
  private Map<String, String> parameters;

  /**
   * (Optional) Additional custom parameters for Workday Report This field is deprecated and should
   * not be used. Use `parameters` instead.
   */
  @JsonProperty("report_parameters")
  private Collection<IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue>
      reportParameters;

  public IngestionPipelineDefinitionWorkdayReportParameters setIncremental(Boolean incremental) {
    this.incremental = incremental;
    return this;
  }

  public Boolean getIncremental() {
    return incremental;
  }

  public IngestionPipelineDefinitionWorkdayReportParameters setParameters(
      Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public IngestionPipelineDefinitionWorkdayReportParameters setReportParameters(
      Collection<IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue>
          reportParameters) {
    this.reportParameters = reportParameters;
    return this;
  }

  public Collection<IngestionPipelineDefinitionWorkdayReportParametersQueryKeyValue>
      getReportParameters() {
    return reportParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IngestionPipelineDefinitionWorkdayReportParameters that =
        (IngestionPipelineDefinitionWorkdayReportParameters) o;
    return Objects.equals(incremental, that.incremental)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(reportParameters, that.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incremental, parameters, reportParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(IngestionPipelineDefinitionWorkdayReportParameters.class)
        .add("incremental", incremental)
        .add("parameters", parameters)
        .add("reportParameters", reportParameters)
        .toString();
  }
}
