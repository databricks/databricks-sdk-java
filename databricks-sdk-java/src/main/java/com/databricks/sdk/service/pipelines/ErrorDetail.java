// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ErrorDetail class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ErrorDetail {
  /** The exception thrown for this error, with its chain of cause. */
  @JsonProperty("exceptions")
  private Collection<SerializedException> exceptions;

  /** Whether this error is considered fatal, that is, unrecoverable. */
  @JsonProperty("fatal")
  private Boolean fatal;

  /**
   * <p>Setter for the field <code>exceptions</code>.</p>
   *
   * @param exceptions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.pipelines.ErrorDetail} object
   */
  public ErrorDetail setExceptions(Collection<SerializedException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * <p>Getter for the field <code>exceptions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<SerializedException> getExceptions() {
    return exceptions;
  }

  /**
   * <p>Setter for the field <code>fatal</code>.</p>
   *
   * @param fatal a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.pipelines.ErrorDetail} object
   */
  public ErrorDetail setFatal(Boolean fatal) {
    this.fatal = fatal;
    return this;
  }

  /**
   * <p>Getter for the field <code>fatal</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getFatal() {
    return fatal;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ErrorDetail that = (ErrorDetail) o;
    return Objects.equals(exceptions, that.exceptions) && Objects.equals(fatal, that.fatal);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(exceptions, fatal);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ErrorDetail.class)
        .add("exceptions", exceptions)
        .add("fatal", fatal)
        .toString();
  }
}
