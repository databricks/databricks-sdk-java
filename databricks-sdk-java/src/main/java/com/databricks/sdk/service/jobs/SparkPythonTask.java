// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

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

  /** */
  @JsonProperty("python_file")
  private String pythonFile;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkPythonTask that = (SparkPythonTask) o;
    return Objects.equals(parameters, that.parameters)
        && Objects.equals(pythonFile, that.pythonFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, pythonFile);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkPythonTask.class)
        .add("parameters", parameters)
        .add("pythonFile", pythonFile)
        .toString();
  }
}
