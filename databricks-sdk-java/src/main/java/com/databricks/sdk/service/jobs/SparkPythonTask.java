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
   * <p>Use <a href="https://docs.databricks.com/jobs.html#parameter-variables">Task parameter
   * variables</a> to set parameters containing information about job runs.
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;

  /**
   * The Python file to be executed. Cloud file URIs (such as dbfs:/, s3:/, adls:/, gcs:/) and
   * workspace paths are supported. For python files stored in the Databricks workspace, the path
   * must be absolute and begin with {@code /}. For files stored in a remote repository, the path
   * must be relative. This field is required.
   */
  @JsonProperty("python_file")
  private String pythonFile;

  /**
   * Optional location type of the Python file. When set to {@code WORKSPACE} or not specified, the
   * file will be retrieved from the local Databricks workspace or cloud location (if the {@code
   * python_file} has a URI format). When set to {@code GIT}, the Python file will be retrieved from
   * a Git repository defined in {@code git_source}.
   *
   * <ul>
   *   <li>{@code WORKSPACE}: The Python file is located in a Databricks workspace or at a cloud
   *       filesystem URI.
   *   <li>{@code GIT}: The Python file is located in a remote Git repository.
   * </ul>
   */
  @JsonProperty("source")
  private Source source;

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

  public SparkPythonTask setSource(Source source) {
    this.source = source;
    return this;
  }

  public Source getSource() {
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
