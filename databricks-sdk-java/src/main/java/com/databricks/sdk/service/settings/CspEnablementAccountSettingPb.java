// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CspEnablementAccountSettingPb {
  @JsonProperty("csp_enablement_account")
  private CspEnablementAccount cspEnablementAccount;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public CspEnablementAccountSettingPb setCspEnablementAccount(
      CspEnablementAccount cspEnablementAccount) {
    this.cspEnablementAccount = cspEnablementAccount;
    return this;
  }

  public CspEnablementAccount getCspEnablementAccount() {
    return cspEnablementAccount;
  }

  public CspEnablementAccountSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CspEnablementAccountSettingPb setSettingName(String settingName) {
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
    CspEnablementAccountSettingPb that = (CspEnablementAccountSettingPb) o;
    return Objects.equals(cspEnablementAccount, that.cspEnablementAccount)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cspEnablementAccount, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementAccountSettingPb.class)
        .add("cspEnablementAccount", cspEnablementAccount)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
