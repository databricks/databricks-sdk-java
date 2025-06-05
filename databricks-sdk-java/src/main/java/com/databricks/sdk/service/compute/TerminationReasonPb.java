// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class TerminationReasonPb {
  @JsonProperty("code")
  private TerminationReasonCode code;

  @JsonProperty("parameters")
  private Map<String, String> parameters;

  @JsonProperty("type")
  private TerminationReasonType typeValue;

  public TerminationReasonPb setCode(TerminationReasonCode code) {
    this.code = code;
    return this;
  }

  public TerminationReasonCode getCode() {
    return code;
  }

  public TerminationReasonPb setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Map<String, String> getParameters() {
    return parameters;
  }

  public TerminationReasonPb setType(TerminationReasonType typeValue) {
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
    TerminationReasonPb that = (TerminationReasonPb) o;
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
    return new ToStringer(TerminationReasonPb.class)
        .add("code", code)
        .add("parameters", parameters)
        .add("typeValue", typeValue)
        .toString();
  }
}
