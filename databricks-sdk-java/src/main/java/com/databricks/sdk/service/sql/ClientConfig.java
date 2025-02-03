// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ClientConfig {
  /** */
  @JsonProperty("allow_custom_js_visualizations")
  private Boolean allowCustomJsVisualizations;

  /** */
  @JsonProperty("allow_downloads")
  private Boolean allowDownloads;

  /** */
  @JsonProperty("allow_external_shares")
  private Boolean allowExternalShares;

  /** */
  @JsonProperty("allow_subscriptions")
  private Boolean allowSubscriptions;

  /** */
  @JsonProperty("date_format")
  private String dateFormat;

  /** */
  @JsonProperty("date_time_format")
  private String dateTimeFormat;

  /** */
  @JsonProperty("disable_publish")
  private Boolean disablePublish;

  /** */
  @JsonProperty("enable_legacy_autodetect_types")
  private Boolean enableLegacyAutodetectTypes;

  /** */
  @JsonProperty("feature_show_permissions_control")
  private Boolean featureShowPermissionsControl;

  /** */
  @JsonProperty("hide_plotly_mode_bar")
  private Boolean hidePlotlyModeBar;

  public ClientConfig setAllowCustomJsVisualizations(Boolean allowCustomJsVisualizations) {
    this.allowCustomJsVisualizations = allowCustomJsVisualizations;
    return this;
  }

  public Boolean getAllowCustomJsVisualizations() {
    return allowCustomJsVisualizations;
  }

  public ClientConfig setAllowDownloads(Boolean allowDownloads) {
    this.allowDownloads = allowDownloads;
    return this;
  }

  public Boolean getAllowDownloads() {
    return allowDownloads;
  }

  public ClientConfig setAllowExternalShares(Boolean allowExternalShares) {
    this.allowExternalShares = allowExternalShares;
    return this;
  }

  public Boolean getAllowExternalShares() {
    return allowExternalShares;
  }

  public ClientConfig setAllowSubscriptions(Boolean allowSubscriptions) {
    this.allowSubscriptions = allowSubscriptions;
    return this;
  }

  public Boolean getAllowSubscriptions() {
    return allowSubscriptions;
  }

  public ClientConfig setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public ClientConfig setDateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
    return this;
  }

  public String getDateTimeFormat() {
    return dateTimeFormat;
  }

  public ClientConfig setDisablePublish(Boolean disablePublish) {
    this.disablePublish = disablePublish;
    return this;
  }

  public Boolean getDisablePublish() {
    return disablePublish;
  }

  public ClientConfig setEnableLegacyAutodetectTypes(Boolean enableLegacyAutodetectTypes) {
    this.enableLegacyAutodetectTypes = enableLegacyAutodetectTypes;
    return this;
  }

  public Boolean getEnableLegacyAutodetectTypes() {
    return enableLegacyAutodetectTypes;
  }

  public ClientConfig setFeatureShowPermissionsControl(Boolean featureShowPermissionsControl) {
    this.featureShowPermissionsControl = featureShowPermissionsControl;
    return this;
  }

  public Boolean getFeatureShowPermissionsControl() {
    return featureShowPermissionsControl;
  }

  public ClientConfig setHidePlotlyModeBar(Boolean hidePlotlyModeBar) {
    this.hidePlotlyModeBar = hidePlotlyModeBar;
    return this;
  }

  public Boolean getHidePlotlyModeBar() {
    return hidePlotlyModeBar;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientConfig that = (ClientConfig) o;
    return Objects.equals(allowCustomJsVisualizations, that.allowCustomJsVisualizations)
        && Objects.equals(allowDownloads, that.allowDownloads)
        && Objects.equals(allowExternalShares, that.allowExternalShares)
        && Objects.equals(allowSubscriptions, that.allowSubscriptions)
        && Objects.equals(dateFormat, that.dateFormat)
        && Objects.equals(dateTimeFormat, that.dateTimeFormat)
        && Objects.equals(disablePublish, that.disablePublish)
        && Objects.equals(enableLegacyAutodetectTypes, that.enableLegacyAutodetectTypes)
        && Objects.equals(featureShowPermissionsControl, that.featureShowPermissionsControl)
        && Objects.equals(hidePlotlyModeBar, that.hidePlotlyModeBar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowCustomJsVisualizations,
        allowDownloads,
        allowExternalShares,
        allowSubscriptions,
        dateFormat,
        dateTimeFormat,
        disablePublish,
        enableLegacyAutodetectTypes,
        featureShowPermissionsControl,
        hidePlotlyModeBar);
  }

  @Override
  public String toString() {
    return new ToStringer(ClientConfig.class)
        .add("allowCustomJsVisualizations", allowCustomJsVisualizations)
        .add("allowDownloads", allowDownloads)
        .add("allowExternalShares", allowExternalShares)
        .add("allowSubscriptions", allowSubscriptions)
        .add("dateFormat", dateFormat)
        .add("dateTimeFormat", dateTimeFormat)
        .add("disablePublish", disablePublish)
        .add("enableLegacyAutodetectTypes", enableLegacyAutodetectTypes)
        .add("featureShowPermissionsControl", featureShowPermissionsControl)
        .add("hidePlotlyModeBar", hidePlotlyModeBar)
        .toString();
  }
}
