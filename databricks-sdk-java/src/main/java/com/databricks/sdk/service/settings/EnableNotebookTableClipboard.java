// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class EnableNotebookTableClipboard {
  /** */
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  @JsonProperty("setting_name")
  private String settingName;

  public EnableNotebookTableClipboard setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public EnableNotebookTableClipboard setSettingName(String settingName) {
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
    EnableNotebookTableClipboard that = (EnableNotebookTableClipboard) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EnableNotebookTableClipboard.class)
        .add("booleanVal", booleanVal)
        .add("settingName", settingName)
        .toString();
  }
}
