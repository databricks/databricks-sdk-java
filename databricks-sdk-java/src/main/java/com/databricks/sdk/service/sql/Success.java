// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Success {
  /**
   
   */
  @JsonProperty("message")
  private SuccessMessage message;
  
  public Success setMessage(SuccessMessage message) {
    this.message = message;
    return this;
  }

  public SuccessMessage getMessage() {
    return message;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Success that = (Success) o;
    return Objects.equals(message, that.message)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(Success.class)
      .add("message", message).toString();
  }
}
