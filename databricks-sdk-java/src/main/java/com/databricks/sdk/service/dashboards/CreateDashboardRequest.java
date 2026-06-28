// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDashboardRequest {
  /** */
  @JsonProperty("dashboard")
  private Dashboard dashboard;

  /**
   * Sets the default catalog for all datasets in this dashboard. Does not impact table references
   * that use fully qualified catalog names (ex: samples.nyctaxi.trips). Leave blank to keep each
   * dataset’s existing configuration.
   */
  @JsonIgnore
  @QueryParam("dataset_catalog")
  private String datasetCatalog;

  /**
   * Sets the default schema for all datasets in this dashboard. Does not impact table references
   * that use fully qualified schema names (ex: nyctaxi.trips). Leave blank to keep each dataset’s
   * existing configuration.
   */
  @JsonIgnore
  @QueryParam("dataset_schema")
  private String datasetSchema;

  public CreateDashboardRequest setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  public CreateDashboardRequest setDatasetCatalog(String datasetCatalog) {
    this.datasetCatalog = datasetCatalog;
    return this;
  }

  public String getDatasetCatalog() {
    return datasetCatalog;
  }

  public CreateDashboardRequest setDatasetSchema(String datasetSchema) {
    this.datasetSchema = datasetSchema;
    return this;
  }

  public String getDatasetSchema() {
    return datasetSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDashboardRequest that = (CreateDashboardRequest) o;
    return Objects.equals(dashboard, that.dashboard)
        && Objects.equals(datasetCatalog, that.datasetCatalog)
        && Objects.equals(datasetSchema, that.datasetSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard, datasetCatalog, datasetSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDashboardRequest.class)
        .add("dashboard", dashboard)
        .add("datasetCatalog", datasetCatalog)
        .add("datasetSchema", datasetSchema)
        .toString();
  }
}
