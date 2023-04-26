// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>NotebookOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NotebookOutput {
  /**
   * The value passed to
   * [dbutils.notebook.exit()](/notebooks/notebook-workflows.html#notebook-workflows-exit).
   * Databricks restricts this API to return the first 5 MB of the value. For a larger result, your
   * job can store the results in a cloud storage service. This field is absent if
   * `dbutils.notebook.exit()` was never called.
   */
  @JsonProperty("result")
  private String result;

  /** Whether or not the result was truncated. */
  @JsonProperty("truncated")
  private Boolean truncated;

  /**
   * <p>Setter for the field <code>result</code>.</p>
   *
   * @param result a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.NotebookOutput} object
   */
  public NotebookOutput setResult(String result) {
    this.result = result;
    return this;
  }

  /**
   * <p>Getter for the field <code>result</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getResult() {
    return result;
  }

  /**
   * <p>Setter for the field <code>truncated</code>.</p>
   *
   * @param truncated a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.NotebookOutput} object
   */
  public NotebookOutput setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  /**
   * <p>Getter for the field <code>truncated</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getTruncated() {
    return truncated;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookOutput that = (NotebookOutput) o;
    return Objects.equals(result, that.result) && Objects.equals(truncated, that.truncated);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(result, truncated);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NotebookOutput.class)
        .add("result", result)
        .add("truncated", truncated)
        .toString();
  }
}
