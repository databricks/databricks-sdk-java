// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateAlertRequestPb {
  @JsonProperty("alert")
  private UpdateAlertRequestAlert alert;

  @JsonProperty("auto_resolve_display_name")
  private Boolean autoResolveDisplayName;

  @JsonIgnore private String id;

  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateAlertRequestPb setAlert(UpdateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public UpdateAlertRequestAlert getAlert() {
    return alert;
  }

  public UpdateAlertRequestPb setAutoResolveDisplayName(Boolean autoResolveDisplayName) {
    this.autoResolveDisplayName = autoResolveDisplayName;
    return this;
  }

  public Boolean getAutoResolveDisplayName() {
    return autoResolveDisplayName;
  }

  public UpdateAlertRequestPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAlertRequestPb setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateAlertRequestPb that = (UpdateAlertRequestPb) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(autoResolveDisplayName, that.autoResolveDisplayName)
        && Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, autoResolveDisplayName, id, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAlertRequestPb.class)
        .add("alert", alert)
        .add("autoResolveDisplayName", autoResolveDisplayName)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }
}
