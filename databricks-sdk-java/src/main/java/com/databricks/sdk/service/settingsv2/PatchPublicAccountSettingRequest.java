// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PatchPublicAccountSettingRequest {
  /** */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("setting")
  private Setting setting;

  public PatchPublicAccountSettingRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PatchPublicAccountSettingRequest setSetting(Setting setting) {
    this.setting = setting;
    return this;
  }

  public Setting getSetting() {
    return setting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchPublicAccountSettingRequest that = (PatchPublicAccountSettingRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(setting, that.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, setting);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchPublicAccountSettingRequest.class)
        .add("name", name)
        .add("setting", setting)
        .toString();
  }
}
