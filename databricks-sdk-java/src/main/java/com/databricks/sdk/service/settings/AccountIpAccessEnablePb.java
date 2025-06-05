// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountIpAccessEnablePb {
  @JsonProperty("acct_ip_acl_enable")
  private BooleanMessage acctIpAclEnable;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public AccountIpAccessEnablePb setAcctIpAclEnable(BooleanMessage acctIpAclEnable) {
    this.acctIpAclEnable = acctIpAclEnable;
    return this;
  }

  public BooleanMessage getAcctIpAclEnable() {
    return acctIpAclEnable;
  }

  public AccountIpAccessEnablePb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AccountIpAccessEnablePb setSettingName(String settingName) {
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
    AccountIpAccessEnablePb that = (AccountIpAccessEnablePb) o;
    return Objects.equals(acctIpAclEnable, that.acctIpAclEnable)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acctIpAclEnable, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountIpAccessEnablePb.class)
        .add("acctIpAclEnable", acctIpAclEnable)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
