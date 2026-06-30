// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MessageError {
  /** */
  @JsonProperty("error")
  private String error;

  /** */
  @JsonProperty("type")
  private MessageErrorType typeValue;

  public MessageError setError(String error) {
    this.error = error;
    return this;
  }

  public String getError() {
    return error;
  }

  public MessageError setType(MessageErrorType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public MessageErrorType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MessageError that = (MessageError) o;
    return Objects.equals(error, that.error) && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(MessageError.class)
        .add("error", error)
        .add("typeValue", typeValue)
        .toString();
  }
}
