// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SparkPythonTaskPb {
  @JsonProperty("parameters")
  private Collection<String> parameters;

  @JsonProperty("python_file")
  private String pythonFile;

  @JsonProperty("source")
  private Source source;

  public SparkPythonTaskPb setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  public SparkPythonTaskPb setPythonFile(String pythonFile) {
    this.pythonFile = pythonFile;
    return this;
  }

  public String getPythonFile() {
    return pythonFile;
  }

  public SparkPythonTaskPb setSource(Source source) {
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
    SparkPythonTaskPb that = (SparkPythonTaskPb) o;
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
    return new ToStringer(SparkPythonTaskPb.class)
        .add("parameters", parameters)
        .add("pythonFile", pythonFile)
        .add("source", source)
        .toString();
  }
}
