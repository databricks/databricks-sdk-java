// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

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
}
