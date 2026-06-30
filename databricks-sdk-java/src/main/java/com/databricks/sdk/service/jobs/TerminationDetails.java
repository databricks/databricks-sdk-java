// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TerminationDetails {
  /** */
  @JsonProperty("code")
  private TerminationCodeCode code;

  /**
   * A descriptive message with the termination details. This field is unstructured and the format
   * might change.
   */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("type")
  private TerminationTypeType typeValue;

  public TerminationDetails setCode(TerminationCodeCode code) {
    this.code = code;
    return this;
  }

  public TerminationCodeCode getCode() {
    return code;
  }

  public TerminationDetails setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public TerminationDetails setType(TerminationTypeType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TerminationTypeType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TerminationDetails that = (TerminationDetails) o;
    return Objects.equals(code, that.code)
        && Objects.equals(message, that.message)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TerminationDetails.class)
        .add("code", code)
        .add("message", message)
        .add("typeValue", typeValue)
        .toString();
  }
}
