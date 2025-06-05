// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SparkJarTaskPb {
  @JsonProperty("jar_uri")
  private String jarUri;

  @JsonProperty("main_class_name")
  private String mainClassName;

  @JsonProperty("parameters")
  private Collection<String> parameters;

  @JsonProperty("run_as_repl")
  private Boolean runAsRepl;

  public SparkJarTaskPb setJarUri(String jarUri) {
    this.jarUri = jarUri;
    return this;
  }

  public String getJarUri() {
    return jarUri;
  }

  public SparkJarTaskPb setMainClassName(String mainClassName) {
    this.mainClassName = mainClassName;
    return this;
  }

  public String getMainClassName() {
    return mainClassName;
  }

  public SparkJarTaskPb setParameters(Collection<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Collection<String> getParameters() {
    return parameters;
  }

  public SparkJarTaskPb setRunAsRepl(Boolean runAsRepl) {
    this.runAsRepl = runAsRepl;
    return this;
  }

  public Boolean getRunAsRepl() {
    return runAsRepl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparkJarTaskPb that = (SparkJarTaskPb) o;
    return Objects.equals(jarUri, that.jarUri)
        && Objects.equals(mainClassName, that.mainClassName)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(runAsRepl, that.runAsRepl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jarUri, mainClassName, parameters, runAsRepl);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkJarTaskPb.class)
        .add("jarUri", jarUri)
        .add("mainClassName", mainClassName)
        .add("parameters", parameters)
        .add("runAsRepl", runAsRepl)
        .toString();
  }
}
