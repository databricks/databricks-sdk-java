// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Update an alert */
@Generated
public class UpdateAlertV2Request {
  /** */
  @JsonProperty("alert")
  private AlertV2 alert;

  /** UUID identifying the alert. */
  @JsonIgnore private String id;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
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
