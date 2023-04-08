// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

public class TerminationReason {
  /** status code indicating why the cluster was terminated */
  @JsonProperty("code")
  private TerminationReasonCode code;

  /** list of parameters that provide additional information about why the cluster was terminated */
  @JsonProperty("parameters")
  private Map<String, String> parameters;

  /** type of the termination */
  @JsonProperty("type")
  private TerminationReasonType typeValue;

  public TerminationReason setCode(TerminationReasonCode code) {
    this.code = code;
    return this;
  }

  public TerminationReasonCode getCode() {
    return code;
  }

  public TerminationReason setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public TerminationReason setType(TerminationReasonType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public TerminationReasonType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TerminationReason that = (TerminationReason) o;
    return Objects.equals(code, that.code)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, parameters, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TerminationReason.class)
        .add("code", code)
        .add("parameters", parameters)
        .add("typeValue", typeValue)
        .toString();
  }
}
