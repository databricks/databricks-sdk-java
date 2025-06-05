// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class EsmEnablementAccountSettingPb {
  @JsonProperty("esm_enablement_account")
  private EsmEnablementAccount esmEnablementAccount;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public EsmEnablementAccountSettingPb setEsmEnablementAccount(
      EsmEnablementAccount esmEnablementAccount) {
    this.esmEnablementAccount = esmEnablementAccount;
    return this;
  }

  public EsmEnablementAccount getEsmEnablementAccount() {
    return esmEnablementAccount;
  }

  public EsmEnablementAccountSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public EsmEnablementAccountSettingPb setSettingName(String settingName) {
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
    EsmEnablementAccountSettingPb that = (EsmEnablementAccountSettingPb) o;
    return Objects.equals(esmEnablementAccount, that.esmEnablementAccount)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esmEnablementAccount, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(EsmEnablementAccountSettingPb.class)
        .add("esmEnablementAccount", esmEnablementAccount)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
