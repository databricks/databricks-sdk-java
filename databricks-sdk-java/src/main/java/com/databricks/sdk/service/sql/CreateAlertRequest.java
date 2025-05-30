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

  /**
   * If true, automatically resolve alert display name conflicts. Otherwise, fail the request if the
   * alert's display name conflicts with an existing alert's display name.
   */
  @JsonProperty("auto_resolve_display_name")
  private Boolean autoResolveDisplayName;

  public CreateAlertRequest setAlert(CreateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public CreateAlertRequestAlert getAlert() {
    return alert;
  }

  public CreateAlertRequest setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAlertRequest that = (CreateAlertRequest) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, autoResolveDisplayName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAlertRequest.class)
        .add("alert", alert)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .toString();
  }
}
