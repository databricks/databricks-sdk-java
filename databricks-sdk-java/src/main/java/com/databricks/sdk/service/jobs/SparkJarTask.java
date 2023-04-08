// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SparkJarTask {
  /**
   * Deprecated since 04/2016\\. Provide a `jar` through the `libraries` field instead. For an
   * example, see :method:jobs/create.
   */
  @JsonProperty("jar_uri")
  private String jarUri;

  /**
   * The full name of the class containing the main method to be executed. This class must be
   * contained in a JAR provided as a library.
   *
   * <p>The code must use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of
   * the job fail.
   */
  @JsonProperty("main_class_name")
  private String mainClassName;

  /**
   * Parameters passed to the main method.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("parameters")
  private java.util.List<String> parameters;

  public SparkJarTask setJarUri(String jarUri) {
    this.jarUri = jarUri;
    return this;
  }

  public String getJarUri() {
    return jarUri;
  }

  public SparkJarTask setMainClassName(String mainClassName) {
    this.mainClassName = mainClassName;
    return this;
  }

  public String getMainClassName() {
    return mainClassName;
  }

  public SparkJarTask setParameters(java.util.List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public java.util.List<String> getParameters() {
    return parameters;
  }
}
