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
public class SqlOutputError {
  /**
   * The error message when execution fails.
   */
  @JsonProperty("message")
  private String message;
  
  public SqlOutputError setMessage(String message) {
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
    SqlOutputError that = (SqlOutputError) o;
    return Objects.equals(message, that.message)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlOutputError.class)
      .add("message", message).toString();
  }
}
