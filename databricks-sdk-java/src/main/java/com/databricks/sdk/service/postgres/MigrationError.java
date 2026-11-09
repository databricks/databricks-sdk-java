// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** An error that prevents migration progress. */
@Generated
public class MigrationError {
  /** A stable machine-readable error code. */
  @JsonProperty("code")
  private String code;

  /** A concise explanation of the failure. */
  @JsonProperty("message")
  private String message;

  public MigrationError setCode(String code) {
    this.code = code;
    return this;
  }

  public String getCode() {
    return code;
  }

  public MigrationError setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrationError that = (MigrationError) o;
    return Objects.equals(code, that.code) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrationError.class)
        .add("code", code)
        .add("message", message)
        .toString();
  }
}
