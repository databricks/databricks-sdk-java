// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDetail {
  /** The exception thrown for this error, with its chain of cause. */
  @JsonProperty("exceptions")
  private java.util.List<SerializedException> exceptions;

  /** Whether this error is considered fatal, that is, unrecoverable. */
  @JsonProperty("fatal")
  private Boolean fatal;

  public ErrorDetail setExceptions(java.util.List<SerializedException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public java.util.List<SerializedException> getExceptions() {
    return exceptions;
  }

  public ErrorDetail setFatal(Boolean fatal) {
    this.fatal = fatal;
    return this;
  }

  public Boolean getFatal() {
    return fatal;
  }
}
