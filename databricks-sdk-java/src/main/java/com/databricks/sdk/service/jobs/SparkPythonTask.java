// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SparkPythonTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SparkPythonTask {
  /**
   * Command line parameters passed to the Python file.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;

  /**
   * The Python file to be executed. Cloud file URIs (such as dbfs:/, s3:/, adls:/, gcs:/) and
   * workspace paths are supported. For python files stored in the Databricks workspace, the path
   * must be absolute and begin with `/`. For files stored in a remote repository, the path must be
   * relative. This field is required.
   */
  @JsonProperty("python_file")
  private String pythonFile;

  /** This describes an enum */
  @JsonProperty("source")
  private SparkPythonTaskSource source;

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkPythonTask} object
   */
  public SparkPythonTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameters</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getParameters() {
    return parameters;
  }

  /**
   * <p>Setter for the field <code>pythonFile</code>.</p>
   *
   * @param pythonFile a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkPythonTask} object
   */
  public SparkPythonTask setPythonFile(String pythonFile) {
    this.pythonFile = pythonFile;
    return this;
  }

  /**
   * <p>Getter for the field <code>pythonFile</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPythonFile() {
    return pythonFile;
  }

  /**
   * <p>Setter for the field <code>source</code>.</p>
   *
   * @param source a {@link com.databricks.sdk.service.jobs.SparkPythonTaskSource} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkPythonTask} object
   */
  public SparkPythonTask setSource(SparkPythonTaskSource source) {
    this.source = source;
    return this;
  }

  /**
   * <p>Getter for the field <code>source</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.SparkPythonTaskSource} object
   */
  public SparkPythonTaskSource getSource() {
    return source;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkPythonTask that = (SparkPythonTask) o;
    return Objects.equals(parameters, that.parameters)
        && Objects.equals(pythonFile, that.pythonFile)
        && Objects.equals(source, that.source);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(parameters, pythonFile, source);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkPythonTask.class)
        .add("parameters", parameters)
        .add("pythonFile", pythonFile)
        .add("source", source)
        .toString();
  }
}
