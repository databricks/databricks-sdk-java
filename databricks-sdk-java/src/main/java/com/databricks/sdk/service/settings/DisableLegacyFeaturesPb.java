// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class DisableLegacyFeaturesPb {
  @JsonProperty("disable_legacy_features")
  private BooleanMessage disableLegacyFeatures;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public DisableLegacyFeaturesPb setDisableLegacyFeatures(BooleanMessage disableLegacyFeatures) {
    this.disableLegacyFeatures = disableLegacyFeatures;
    return this;
  }

  public BooleanMessage getDisableLegacyFeatures() {
    return disableLegacyFeatures;
  }

  public DisableLegacyFeaturesPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DisableLegacyFeaturesPb setSettingName(String settingName) {
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
    DisableLegacyFeaturesPb that = (DisableLegacyFeaturesPb) o;
    return Objects.equals(disableLegacyFeatures, that.disableLegacyFeatures)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableLegacyFeatures, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(DisableLegacyFeaturesPb.class)
        .add("disableLegacyFeatures", disableLegacyFeatures)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
