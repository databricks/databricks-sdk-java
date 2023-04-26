// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SparkSubmitTask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SparkSubmitTask {
  /**
   * Command-line parameters passed to spark submit.
   *
   * <p>Use [Task parameter variables] to set parameters containing information about job runs.
   *
   * <p>[Task parameter variables]: https://docs.databricks.com/jobs.html#parameter-variables
   */
  @JsonProperty("parameters")
  private Collection<String> parameters;

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.jobs.SparkSubmitTask} object
   */
  public SparkSubmitTask setParameters(Collection<String> parameters) {
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
    SparkSubmitTask that = (SparkSubmitTask) o;
    return Objects.equals(parameters, that.parameters);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SparkSubmitTask.class).add("parameters", parameters).toString();
  }
}
