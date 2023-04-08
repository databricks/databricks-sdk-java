// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class ErrorDetail {
  /** The exception thrown for this error, with its chain of cause. */
  @JsonProperty("exceptions")
  private Collection<SerializedException> exceptions;

  /** Whether this error is considered fatal, that is, unrecoverable. */
  @JsonProperty("fatal")
  private Boolean fatal;

  public ErrorDetail setExceptions(Collection<SerializedException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Collection<SerializedException> getExceptions() {
    return exceptions;
  }

  public ErrorDetail setFatal(Boolean fatal) {
    this.fatal = fatal;
    return this;
  }

  public Boolean getFatal() {
    return fatal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ErrorDetail that = (ErrorDetail) o;
    return Objects.equals(exceptions, that.exceptions) && Objects.equals(fatal, that.fatal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, fatal);
  }

  @Override
  public String toString() {
    return new ToStringer(ErrorDetail.class)
        .add("exceptions", exceptions)
        .add("fatal", fatal)
        .toString();
  }
}
