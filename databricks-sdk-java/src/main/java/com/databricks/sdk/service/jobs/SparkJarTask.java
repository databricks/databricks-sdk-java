// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SparkJarTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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
  private Collection<String> parameters;

  /**
   * <p>Setter for the field <code>jarUri</code>.</p>
   *
   * @param jarUri a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   */
  public SparkJarTask setJarUri(String jarUri) {
    this.jarUri = jarUri;
    return this;
  }

  /**
   * <p>Getter for the field <code>jarUri</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJarUri() {
    return jarUri;
  }

  /**
   * <p>Setter for the field <code>mainClassName</code>.</p>
   *
   * @param mainClassName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   */
  public SparkJarTask setMainClassName(String mainClassName) {
    this.mainClassName = mainClassName;
    return this;
  }

  /**
   * <p>Getter for the field <code>mainClassName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMainClassName() {
    return mainClassName;
  }

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkJarTask} object
   */
  public SparkJarTask setParameters(Collection<String> parameters) {
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
    SparkJarTask that = (SparkJarTask) o;
    return Objects.equals(jarUri, that.jarUri)
        && Objects.equals(mainClassName, that.mainClassName)
        && Objects.equals(parameters, that.parameters);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(jarUri, mainClassName, parameters);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkJarTask.class)
        .add("jarUri", jarUri)
        .add("mainClassName", mainClassName)
        .add("parameters", parameters)
        .toString();
  }
}
