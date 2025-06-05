// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EnableExportNotebookPb {
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  @JsonProperty("setting_name")
  private String settingName;

  public EnableExportNotebookPb setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public EnableExportNotebookPb setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnableExportNotebookPb that = (EnableExportNotebookPb) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableExportNotebookPb.class)
        .add("booleanVal", booleanVal)
        .add("settingName", settingName)
        .toString();
  }
}
