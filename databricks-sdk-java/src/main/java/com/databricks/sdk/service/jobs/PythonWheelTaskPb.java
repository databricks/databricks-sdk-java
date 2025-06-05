// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class PythonWheelTaskPb {
  @JsonProperty("entry_point")
  private String entryPoint;

  @JsonProperty("named_parameters")
  private Map<String, String> namedParameters;

  @JsonProperty("package_name")
  private String packageName;

  @JsonProperty("parameters")
  private Collection<String> parameters;

  public PythonWheelTaskPb setEntryPoint(String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  public String getEntryPoint() {
    return entryPoint;
  }

  public PythonWheelTaskPb setNamedParameters(Map<String, String> namedParameters) {
    this.namedParameters = namedParameters;
    return this;
  }

  public Map<String, String> getNamedParameters() {
    return namedParameters;
  }

  public PythonWheelTaskPb setPackageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  public String getPackageName() {
    return packageName;
  }

  public PythonWheelTaskPb setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PythonWheelTaskPb that = (PythonWheelTaskPb) o;
    return Objects.equals(entryPoint, that.entryPoint)
        && Objects.equals(namedParameters, that.namedParameters)
        && Objects.equals(packageName, that.packageName)
        && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, namedParameters, packageName, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonWheelTaskPb.class)
        .add("entryPoint", entryPoint)
        .add("namedParameters", namedParameters)
        .add("packageName", packageName)
        .add("parameters", parameters)
        .toString();
  }
}
