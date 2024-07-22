// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAlertRequest {
  /** */
  @JsonProperty("alert")
  private CreateAlertRequestAlert alert;

  public CreateAlertRequest setAlert(CreateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public CreateAlertRequestAlert getAlert() {
    return alert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertRequest that = (CreateAlertRequest) o;
    return Objects.equals(alert, that.alert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertRequest.class).add("alert", alert).toString();
  }
}
