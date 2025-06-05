// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Create an alert */
@Generated
class CreateAlertV2RequestPb {
  @JsonProperty("alert")
  private AlertV2 alert;

  public CreateAlertV2RequestPb setAlert(AlertV2 alert) {
    this.alert = alert;
    return this;
  }

  public AlertV2 getAlert() {
    return alert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertV2RequestPb that = (CreateAlertV2RequestPb) o;
    return Objects.equals(alert, that.alert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertV2RequestPb.class).add("alert", alert).toString();
  }
}
