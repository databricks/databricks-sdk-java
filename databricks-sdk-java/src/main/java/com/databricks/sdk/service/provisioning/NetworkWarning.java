// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>NetworkWarning class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NetworkWarning {
  /** Details of the warning. */
  @JsonProperty("warning_message")
  private String warningMessage;

  /** The AWS resource associated with this warning: a subnet or a security group. */
  @JsonProperty("warning_type")
  private WarningType warningType;

  /**
   * <p>Setter for the field <code>warningMessage</code>.</p>
   *
   * @param warningMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkWarning} object
   */
  public NetworkWarning setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>warningMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarningMessage() {
    return warningMessage;
  }

  /**
   * <p>Setter for the field <code>warningType</code>.</p>
   *
   * @param warningType a {@link com.databricks.sdk.service.provisioning.WarningType} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkWarning} object
   */
  public NetworkWarning setWarningType(WarningType warningType) {
    this.warningType = warningType;
    return this;
  }

  /**
   * <p>Getter for the field <code>warningType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.WarningType} object
   */
  public WarningType getWarningType() {
    return warningType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkWarning that = (NetworkWarning) o;
    return Objects.equals(warningMessage, that.warningMessage)
        && Objects.equals(warningType, that.warningType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(warningMessage, warningType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NetworkWarning.class)
        .add("warningMessage", warningMessage)
        .add("warningType", warningType)
        .toString();
  }
}
