// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertTaskOutput {
  /** */
  @JsonProperty("alert_state")
  private AlertEvaluationState alertState;

  public AlertTaskOutput setAlertState(AlertEvaluationState alertState) {
    this.alertState = alertState;
    return this;
  }

  public AlertEvaluationState getAlertState() {
    return alertState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertTaskOutput that = (AlertTaskOutput) o;
    return Objects.equals(alertState, that.alertState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertState);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertTaskOutput.class).add("alertState", alertState).toString();
  }
}
