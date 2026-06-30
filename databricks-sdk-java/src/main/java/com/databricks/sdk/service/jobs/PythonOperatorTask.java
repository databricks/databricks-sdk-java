// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PythonOperatorTask {
  /**
   * Fully qualified name of the main class or function. For example, `my_project.my_function` or
   * `my_project.MyOperator`.
   */
  @JsonProperty("main")
  private String main;

  /** An ordered list of task parameters. TODO(JOBS-30885): Add limits for parameters. */
  @JsonProperty("parameters")
  private Collection<PythonOperatorTaskParameter> parameters;

  public PythonOperatorTask setMain(String main) {
    this.main = main;
    return this;
  }

  public String getMain() {
    return main;
  }

  public PythonOperatorTask setParameters(Collection<PythonOperatorTaskParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<PythonOperatorTaskParameter> getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PythonOperatorTask that = (PythonOperatorTask) o;
    return Objects.equals(main, that.main) && Objects.equals(parameters, that.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(main, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonOperatorTask.class)
        .add("main", main)
        .add("parameters", parameters)
        .toString();
  }
}
