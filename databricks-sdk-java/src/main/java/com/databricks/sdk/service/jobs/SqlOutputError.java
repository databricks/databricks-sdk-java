// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>SqlOutputError class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SqlOutputError {
  /** The error message when execution fails. */
  @JsonProperty("message")
  private String message;

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.SqlOutputError} object
   */
  public SqlOutputError setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlOutputError that = (SqlOutputError) o;
    return Objects.equals(message, that.message);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(SqlOutputError.class).add("message", message).toString();
  }
}
