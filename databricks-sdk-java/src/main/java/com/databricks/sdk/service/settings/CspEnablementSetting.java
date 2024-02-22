// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CspEnablementSetting {
  /**
   * Compliance Security Profile (CSP) - one of the features in ESC product Tracks if the feature is
   * enabled.
   */
  @JsonProperty("csp_enablement_workspace")
  private CspEnablement cspEnablementWorkspace;

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

  public CspEnablementSetting setCspEnablementWorkspace(CspEnablement cspEnablementWorkspace) {
    this.cspEnablementWorkspace = cspEnablementWorkspace;
    return this;
  }

  public CspEnablement getCspEnablementWorkspace() {
    return cspEnablementWorkspace;
  }

  public CspEnablementSetting setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CspEnablementSetting setSettingName(String settingName) {
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
    CspEnablementSetting that = (CspEnablementSetting) o;
    return Objects.equals(cspEnablementWorkspace, that.cspEnablementWorkspace)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cspEnablementWorkspace, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(CspEnablementSetting.class)
        .add("cspEnablementWorkspace", cspEnablementWorkspace)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
