// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class NotebookTaskPb {
  @JsonProperty("base_parameters")
  private Map<String, String> baseParameters;

  @JsonProperty("notebook_path")
  private String notebookPath;

  @JsonProperty("source")
  private Source source;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public NotebookTaskPb setBaseParameters(Map<String, String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  public Map<String, String> getBaseParameters() {
    return baseParameters;
  }

  public NotebookTaskPb setNotebookPath(String notebookPath) {
    this.notebookPath = notebookPath;
    return this;
  }

  public String getNotebookPath() {
    return notebookPath;
  }

  public NotebookTaskPb setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public NotebookTaskPb setWarehouseId(String warehouseId) {
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
    NotebookTaskPb that = (NotebookTaskPb) o;
    return Objects.equals(baseParameters, that.baseParameters)
        && Objects.equals(notebookPath, that.notebookPath)
        && Objects.equals(source, that.source)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseParameters, notebookPath, source, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookTaskPb.class)
        .add("baseParameters", baseParameters)
        .add("notebookPath", notebookPath)
        .add("source", source)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
