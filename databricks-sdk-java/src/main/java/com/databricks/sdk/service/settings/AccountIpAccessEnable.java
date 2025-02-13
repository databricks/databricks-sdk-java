// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountIpAccessEnable {
  /** */
  @JsonProperty("acct_ip_acl_enable")
  private BooleanMessage acctIpAclEnable;

  /**
   * etag used for versioning. The response is at least as fresh as the eTag provided. This is used
   * for optimistic concurrency control as a way to help prevent simultaneous writes of a setting
   * overwriting each other. It is strongly suggested that systems make use of the etag in the read
   * -> update pattern to perform setting updates in order to avoid race conditions. That is, get an
   * etag from a GET request, and pass it with the PATCH request to identify the setting version you
   * are updating.
   */
  @JsonProperty("etag")
  private String etag;

  /**
   * Name of the corresponding setting. This field is populated in the response, but it will not be
   * respected even if it's set in the request body. The setting name in the path parameter will be
   * respected instead. Setting name is required to be 'default' if the setting only has one
   * instance per workspace.
   */
  @JsonProperty("setting_name")
  private String settingName;

  public AccountIpAccessEnable setAcctIpAclEnable(BooleanMessage acctIpAclEnable) {
    this.acctIpAclEnable = acctIpAclEnable;
    return this;
  }

  public BooleanMessage getAcctIpAclEnable() {
    return acctIpAclEnable;
  }

  public AccountIpAccessEnable setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AccountIpAccessEnable setSettingName(String settingName) {
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
    AccountIpAccessEnable that = (AccountIpAccessEnable) o;
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
    return new ToStringer(AccountIpAccessEnable.class)
        .add("acctIpAclEnable", acctIpAclEnable)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
