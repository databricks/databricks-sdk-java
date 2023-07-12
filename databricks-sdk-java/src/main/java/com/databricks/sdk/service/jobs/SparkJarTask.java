// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class SparkJarTask {
  /**
   * Deprecated since 04/2016. Provide a `jar` through the `libraries` field
   * instead. For an example, see :method:jobs/create.
   */
  @JsonProperty("jar_uri")
  private String jarUri;
  
  /**
   * The full name of the class containing the main method to be executed. This
   * class must be contained in a JAR provided as a library.
   * 
   * The code must use `SparkContext.getOrCreate` to obtain a Spark context;
   * otherwise, runs of the job fail.
   */
  @JsonProperty("main_class_name")
  private String mainClassName;
  
  /**
   * Parameters passed to the main method.
   * 
   * Use [Task parameter variables] to set parameters containing information
   * about job runs.
   * 
   * [Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;
  
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
  
  public SparkJarTask setParameters(Collection<String> parameters) {
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
    SparkJarTask that = (SparkJarTask) o;
    return Objects.equals(jarUri, that.jarUri)
    && Objects.equals(mainClassName, that.mainClassName)
    && Objects.equals(parameters, that.parameters)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jarUri, mainClassName, parameters);
  }

  @Override
  public String toString() {
    return new ToStringer(SparkJarTask.class)
      .add("jarUri", jarUri)
      .add("mainClassName", mainClassName)
      .add("parameters", parameters).toString();
  }
}
