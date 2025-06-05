// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class LlmProxyPartnerPoweredWorkspacePb {
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public LlmProxyPartnerPoweredWorkspacePb setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public LlmProxyPartnerPoweredWorkspacePb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public LlmProxyPartnerPoweredWorkspacePb setSettingName(String settingName) {
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
    LlmProxyPartnerPoweredWorkspacePb that = (LlmProxyPartnerPoweredWorkspacePb) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanVal, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(LlmProxyPartnerPoweredWorkspacePb.class)
        .add("booleanVal", booleanVal)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
