// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DisableLegacyAccessPb {
  @JsonProperty("disable_legacy_access")
  private BooleanMessage disableLegacyAccess;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public DisableLegacyAccessPb setDisableLegacyAccess(BooleanMessage disableLegacyAccess) {
    this.disableLegacyAccess = disableLegacyAccess;
    return this;
  }

  public BooleanMessage getDisableLegacyAccess() {
    return disableLegacyAccess;
  }

  public DisableLegacyAccessPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DisableLegacyAccessPb setSettingName(String settingName) {
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
    DisableLegacyAccessPb that = (DisableLegacyAccessPb) o;
    return Objects.equals(disableLegacyAccess, that.disableLegacyAccess)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableLegacyAccess, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableLegacyAccessPb.class)
        .add("disableLegacyAccess", disableLegacyAccess)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
