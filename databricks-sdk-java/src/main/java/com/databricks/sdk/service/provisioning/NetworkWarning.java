// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NetworkWarning {
  /** Details of the warning. */
  @JsonProperty("warning_message")
  private String warningMessage;

  /** */
  @JsonProperty("warning_type")
  private WarningType warningType;

  public NetworkWarning setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

  public String getWarningMessage() {
    return warningMessage;
  }

  public NetworkWarning setWarningType(WarningType warningType) {
    this.warningType = warningType;
    return this;
  }

  public WarningType getWarningType() {
    return warningType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkWarning that = (NetworkWarning) o;
    return Objects.equals(warningMessage, that.warningMessage)
        && Objects.equals(warningType, that.warningType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningMessage, warningType);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkWarning.class)
        .add("warningMessage", warningMessage)
        .add("warningType", warningType)
        .toString();
  }
}
