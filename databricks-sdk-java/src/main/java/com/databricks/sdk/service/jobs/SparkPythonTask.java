// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
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

  public SparkPythonTask setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  public SparkPythonTask setPythonFile(String pythonFile) {
    this.pythonFile = pythonFile;
    return this;
  }

  public String getPythonFile() {
    return pythonFile;
  }

  public SparkPythonTask setSource(SparkPythonTaskSource source) {
    this.source = source;
    return this;
  }

  public SparkPythonTaskSource getSource() {
    return source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkPythonTask that = (SparkPythonTask) o;
    return Objects.equals(parameters, that.parameters)
        && Objects.equals(pythonFile, that.pythonFile)
        && Objects.equals(source, that.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, pythonFile, source);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkPythonTask.class)
        .add("parameters", parameters)
        .add("pythonFile", pythonFile)
        .add("source", source)
        .toString();
  }
}
