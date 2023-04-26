// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>NotebookTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>baseParameters</code>.</p>
   *
   * @param baseParameters a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.NotebookTask} object
   */
  public NotebookTask setBaseParameters(Map<String, String> baseParameters) {
    this.baseParameters = baseParameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>baseParameters</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getBaseParameters() {
    return baseParameters;
  }

  /**
   * <p>Setter for the field <code>notebookPath</code>.</p>
   *
   * @param notebookPath a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.NotebookTask} object
   */
  public NotebookTask setNotebookPath(String notebookPath) {
    this.notebookPath = notebookPath;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebookPath</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNotebookPath() {
    return notebookPath;
  }

  /**
   * <p>Setter for the field <code>source</code>.</p>
   *
   * @param source a {@link com.databricks.sdk.service.jobs.NotebookTaskSource} object
   * @return a {@link com.databricks.sdk.service.jobs.NotebookTask} object
   */
  public NotebookTask setSource(NotebookTaskSource source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Getter for the field <code>source</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.NotebookTaskSource} object
   */
  public NotebookTaskSource getSource() {
    return source;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookTask that = (NotebookTask) o;
    return Objects.equals(baseParameters, that.baseParameters)
        && Objects.equals(notebookPath, that.notebookPath)
        && Objects.equals(source, that.source);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(baseParameters, notebookPath, source);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NotebookTask.class)
        .add("baseParameters", baseParameters)
        .add("notebookPath", notebookPath)
        .add("source", source)
        .toString();
  }
}
