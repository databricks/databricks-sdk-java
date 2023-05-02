// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete an alert */
@Generated
public class DeleteAlertRequest {
  /** */
  private String alertId;

  public DeleteAlertRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAlertRequest that = (DeleteAlertRequest) o;
    return Objects.equals(alertId, that.alertId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAlertRequest.class).add("alertId", alertId).toString();
  }
}
