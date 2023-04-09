// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

public class NotebookTask {
  /**
   * Base parameters to be used for each run of this job. If the run is initiated by a call to
   * :method:jobs/runNow with parameters specified, the two parameters maps are merged. If the same
   * key is specified in `base_parameters` and in `run-now`, the value from `run-now` is used.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>If the notebook takes a parameter that is not specified in the job’s `base_parameters` or
   * the `run-now` override parameters, the default value from the notebook is used.
   *
   * <p>Retrieve these parameters in a notebook using [dbutils.widgets.get].
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   * [dbutils.widgets.get]:
   * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-widgets
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

  /** This describes an enum */
  @JsonProperty("source")
  private NotebookTaskSource source;

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

  public NotebookTask setSource(NotebookTaskSource source) {
    this.source = source;
    return this;
  }

  public NotebookTaskSource getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookTask that = (NotebookTask) o;
    return Objects.equals(baseParameters, that.baseParameters)
        && Objects.equals(notebookPath, that.notebookPath)
        && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseParameters, notebookPath, source);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookTask.class)
        .add("baseParameters", baseParameters)
        .add("notebookPath", notebookPath)
        .add("source", source)
        .toString();
  }
}
