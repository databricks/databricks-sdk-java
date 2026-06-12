// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class NotebookTask {
  /**
   * Base parameters to be used for each run of this job. If the run is initiated by a call to
   * :method:jobs/run Now with parameters specified, the two parameters maps are merged. If the same
   * key is specified in {@code base_parameters} and in {@code run-now}, the value from {@code
   * run-now} is used. Use <a href="https://docs.databricks.com/jobs.html#parameter-variables">Task
   * parameter variables</a> to set parameters containing information about job runs.
   *
   * <p>If the notebook takes a parameter that is not specified in the job’s {@code base_parameters}
   * or the {@code run-now} override parameters, the default value from the notebook is used.
   *
   * <p>Retrieve these parameters in a notebook using <a
   * href="https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-widgets">dbutils.widgets.get</a>.
   *
   * <p>The JSON representation of this field cannot exceed 1MB.
   */
  @JsonProperty("base_parameters")
  private Map<String, String> baseParameters;

  /**
   * The path of the notebook to be run in the Databricks workspace or remote repository. For
   * notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash.
   * For notebooks stored in a remote repository, the path must be relative. This field is required.
   */
  @JsonProperty("notebook_path")
  private String notebookPath;

  /**
   * Optional location type of the notebook. When set to {@code WORKSPACE}, the notebook will be
   * retrieved from the local Databricks workspace. When set to {@code GIT}, the notebook will be
   * retrieved from a Git repository defined in {@code git_source}. If the value is empty, the task
   * will use {@code GIT} if {@code git_source} is defined and {@code WORKSPACE} otherwise.
   *
   * <ul>
   *   <li>{@code WORKSPACE}: Notebook is located in Databricks workspace.
   *   <li>{@code GIT}: Notebook is located in cloud Git provider.
   * </ul>
   */
  @JsonProperty("source")
  private Source source;

  /**
   * Optional {@code warehouse_id} to run the notebook on a SQL warehouse. Classic SQL warehouses
   * are NOT supported, please use serverless or pro SQL warehouses.
   *
   * <p>Note that SQL warehouses only support SQL cells; if the notebook contains non-SQL cells, the
   * run will fail.
   */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public NotebookTask setBaseParameters(Map<String, String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  public Map<String, String> getBaseParameters() {
    return baseParameters;
  }

  public NotebookTask setNotebookPath(String notebookPath) {
    this.notebookPath = notebookPath;
    return this;
  }

  public String getNotebookPath() {
    return notebookPath;
  }

  public NotebookTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
    return source;
  }

  public NotebookTask setWarehouseId(String warehouseId) {
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
    NotebookTask that = (NotebookTask) o;
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
    return new ToStringer(NotebookTask.class)
        .add("baseParameters", baseParameters)
        .add("notebookPath", notebookPath)
        .add("source", source)
        .add("warehouseId", warehouseId)
        .toString();
  }
}
