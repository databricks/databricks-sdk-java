// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateAlertV2Request {
  /** */
  @JsonProperty("alert")
  private AlertV2 alert;

  /** The canonical identifier of the alert to retrieve information about. */
  @JsonIgnore private String id;

  /**
   * Comma-separated list of the alert fields to update, for example `display_name,query_text` or
   * `schedule.pause_status`. Only the listed fields are changed; all other fields keep their
   * current values. `parent_path` cannot be updated.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateAlertV2Request setAlert(AlertV2 alert) {
    this.alert = alert;
    return this;
  }

  public AlertV2 getAlert() {
    return alert;
  }

  public UpdateAlertV2Request setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateAlertV2Request setUpdateMask(String updateMask) {
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
    UpdateAlertV2Request that = (UpdateAlertV2Request) o;
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
    return new ToStringer(UpdateAlertV2Request.class)
        .add("alert", alert)
        .add("id", id)
        .add("updateMask", updateMask)
        .toString();
  }
}
