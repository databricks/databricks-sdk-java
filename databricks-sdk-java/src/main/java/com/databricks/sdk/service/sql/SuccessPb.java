// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SuccessPb {
  @JsonProperty("message")
  private SuccessMessage message;

  public SuccessPb setMessage(SuccessMessage message) {
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
    SuccessPb that = (SuccessPb) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(SuccessPb.class).add("message", message).toString();
  }
}
