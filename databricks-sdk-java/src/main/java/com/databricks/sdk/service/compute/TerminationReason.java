// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>TerminationReason class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>code</code>.</p>
   *
   * @param code a {@link com.databricks.sdk.service.compute.TerminationReasonCode} object
   * @return a {@link com.databricks.sdk.service.compute.TerminationReason} object
   */
  public TerminationReason setCode(TerminationReasonCode code) {
    this.code = code;
    return this;
  }

  /**
   * <p>Getter for the field <code>code</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.TerminationReasonCode} object
   */
  public TerminationReasonCode getCode() {
    return code;
  }

  /**
   * <p>Setter for the field <code>parameters</code>.</p>
   *
   * @param parameters a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.compute.TerminationReason} object
   */
  public TerminationReason setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>parameters</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getParameters() {
    return parameters;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link com.databricks.sdk.service.compute.TerminationReasonType} object
   * @return a {@link com.databricks.sdk.service.compute.TerminationReason} object
   */
  public TerminationReason setType(TerminationReasonType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.TerminationReasonType} object
   */
  public TerminationReasonType getType() {
    return typeValue;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TerminationReason that = (TerminationReason) o;
    return Objects.equals(code, that.code)
        && Objects.equals(parameters, that.parameters)
        && Objects.equals(typeValue, that.typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(code, parameters, typeValue);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TerminationReason.class)
        .add("code", code)
        .add("parameters", parameters)
        .add("typeValue", typeValue)
        .toString();
  }
}
