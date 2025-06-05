// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RestrictWorkspaceAdminsSettingPb {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("restrict_workspace_admins")
  private RestrictWorkspaceAdminsMessage restrictWorkspaceAdmins;

  @JsonProperty("setting_name")
  private String settingName;

  public RestrictWorkspaceAdminsSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public RestrictWorkspaceAdminsSettingPb setRestrictWorkspaceAdmins(
      RestrictWorkspaceAdminsMessage restrictWorkspaceAdmins) {
    this.restrictWorkspaceAdmins = restrictWorkspaceAdmins;
    return this;
  }

  public RestrictWorkspaceAdminsMessage getRestrictWorkspaceAdmins() {
    return restrictWorkspaceAdmins;
  }

  public RestrictWorkspaceAdminsSettingPb setSettingName(String settingName) {
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
    RestrictWorkspaceAdminsSettingPb that = (RestrictWorkspaceAdminsSettingPb) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(restrictWorkspaceAdmins, that.restrictWorkspaceAdmins)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, restrictWorkspaceAdmins, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(RestrictWorkspaceAdminsSettingPb.class)
        .add("etag", etag)
        .add("restrictWorkspaceAdmins", restrictWorkspaceAdmins)
        .add("settingName", settingName)
        .toString();
  }
}
