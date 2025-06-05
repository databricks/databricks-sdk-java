// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Details required to update a setting. */
@Generated
class UpdateEnableNotebookTableClipboardRequestPb {
  @JsonProperty("allow_missing")
  private Boolean allowMissing;

  @JsonProperty("field_mask")
  private String fieldMask;

  @JsonProperty("setting")
  private EnableNotebookTableClipboard setting;

  public UpdateEnableNotebookTableClipboardRequestPb setAllowMissing(Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  public Boolean getAllowMissing() {
    return allowMissing;
  }

  public UpdateEnableNotebookTableClipboardRequestPb setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public UpdateEnableNotebookTableClipboardRequestPb setSetting(
      EnableNotebookTableClipboard setting) {
    this.setting = setting;
    return this;
  }

  public EnableNotebookTableClipboard getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateEnableNotebookTableClipboardRequestPb that =
        (UpdateEnableNotebookTableClipboardRequestPb) o;
    return Objects.equals(allowMissing, that.allowMissing)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowMissing, fieldMask, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateEnableNotebookTableClipboardRequestPb.class)
        .add("allowMissing", allowMissing)
        .add("fieldMask", fieldMask)
        .add("setting", setting)
        .toString();
  }
}
