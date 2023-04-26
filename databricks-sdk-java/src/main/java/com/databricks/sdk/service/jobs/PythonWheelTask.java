// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * <p>PythonWheelTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PythonWheelTask {
  /**
   * Named entry point to use, if it does not exist in the metadata of the package it executes the
   * function from the package directly using `$packageName.$entryPoint()`
   */
  @JsonProperty("entry_point")
  private String entryPoint;

  /**
   * Command-line parameters passed to Python wheel task in the form of `["--name=task",
   * "--data=dbfs:/path/to/data.json"]`. Leave it empty if `parameters` is not null.
   */
  @JsonProperty("named_parameters")
  private Map<String, String> namedParameters;

  /** Name of the package to execute */
  @JsonProperty("package_name")
  private String packageName;

  /**
   * Command-line parameters passed to Python wheel task. Leave it empty if `named_parameters` is
   * not null.
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;

  /**
   * <p>Setter for the field <code>entryPoint</code>.</p>
   *
   * @param entryPoint a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   */
  public PythonWheelTask setEntryPoint(String entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * <p>Getter for the field <code>entryPoint</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEntryPoint() {
    return entryPoint;
  }

  /**
   * <p>Setter for the field <code>namedParameters</code>.</p>
   *
   * @param namedParameters a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   */
  public PythonWheelTask setNamedParameters(Map<String, String> namedParameters) {
    this.namedParameters = namedParameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>namedParameters</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getNamedParameters() {
    return namedParameters;
  }

  /**
   * <p>Setter for the field <code>packageName</code>.</p>
   *
   * @param packageName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   */
  public PythonWheelTask setPackageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * <p>Getter for the field <code>packageName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPackageName() {
    return packageName;
  }

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.PythonWheelTask} object
   */
  public PythonWheelTask setParameters(Collection<String> parameters) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PythonWheelTask that = (PythonWheelTask) o;
    return Objects.equals(entryPoint, that.entryPoint)
        && Objects.equals(namedParameters, that.namedParameters)
        && Objects.equals(packageName, that.packageName)
        && Objects.equals(parameters, that.parameters);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, namedParameters, packageName, parameters);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PythonWheelTask.class)
        .add("entryPoint", entryPoint)
        .add("namedParameters", namedParameters)
        .add("packageName", packageName)
        .add("parameters", parameters)
        .toString();
  }
}
