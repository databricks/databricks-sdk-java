// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SparkPythonTask {
  /**
   * Command line parameters passed to the Python file.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("parameters")
  private java.util.List<String> parameters;

  /** */
  @JsonProperty("python_file")
  private String pythonFile;

  public SparkPythonTask setParameters(java.util.List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public java.util.List<String> getParameters() {
    return parameters;
  }

  public SparkPythonTask setPythonFile(String pythonFile) {
    this.pythonFile = pythonFile;
    return this;
  }

  public String getPythonFile() {
    return pythonFile;
  }
}
