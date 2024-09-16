// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAlertRequest {
  /** */
  @JsonProperty("alert")
  private UpdateAlertRequestAlert alert;

  /** */
  @JsonIgnore private String id;

  /**
   * Field mask is required to be passed into the PATCH request. Field mask specifies which fields
   * of the setting payload will be updated. The field mask needs to be supplied as single string.
   * To specify multiple fields in the field mask, use comma as the separator (no space).
   */
  @JsonProperty("update_mask")
  private String updateMask;

  public UpdateAlertRequest setAlert(UpdateAlertRequestAlert alert) {
    this.alert = alert;
    return this;
  }

  public UpdateAlertRequestAlert getAlert() {
    return alert;
  }

  public UpdateAlertRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAlertRequest setUpdateMask(String updateMask) {
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
    UpdateAlertRequest that = (UpdateAlertRequest) o;
    return Objects.equals(alert, that.alert)
        && Objects.equals(id, that.id)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alert, id, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateAlertRequest.class)
        .add("alert", alert)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }
}
