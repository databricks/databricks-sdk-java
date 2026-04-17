// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Wrapper message for source-specific options to support multiple connector types */
@Generated
public class ConnectorOptions {
  /** */
  @JsonProperty("gdrive_options")
  private GoogleDriveOptions gdriveOptions;

  /** */
  @JsonProperty("google_ads_options")
  private GoogleAdsOptions googleAdsOptions;

  /** */
  @JsonProperty("sharepoint_options")
  private SharepointOptions sharepointOptions;

  /** */
  @JsonProperty("tiktok_ads_options")
  private TikTokAdsOptions tiktokAdsOptions;

  public ConnectorOptions setGdriveOptions(GoogleDriveOptions gdriveOptions) {
    this.gdriveOptions = gdriveOptions;
    return this;
  }

  public GoogleDriveOptions getGdriveOptions() {
    return gdriveOptions;
  }

  public ConnectorOptions setGoogleAdsOptions(GoogleAdsOptions googleAdsOptions) {
    this.googleAdsOptions = googleAdsOptions;
    return this;
  }

  public GoogleAdsOptions getGoogleAdsOptions() {
    return googleAdsOptions;
  }

  public ConnectorOptions setSharepointOptions(SharepointOptions sharepointOptions) {
    this.sharepointOptions = sharepointOptions;
    return this;
  }

  public SharepointOptions getSharepointOptions() {
    return sharepointOptions;
  }

  public ConnectorOptions setTiktokAdsOptions(TikTokAdsOptions tiktokAdsOptions) {
    this.tiktokAdsOptions = tiktokAdsOptions;
    return this;
  }

  public TikTokAdsOptions getTiktokAdsOptions() {
    return tiktokAdsOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConnectorOptions that = (ConnectorOptions) o;
    return Objects.equals(gdriveOptions, that.gdriveOptions)
        && Objects.equals(googleAdsOptions, that.googleAdsOptions)
        && Objects.equals(sharepointOptions, that.sharepointOptions)
        && Objects.equals(tiktokAdsOptions, that.tiktokAdsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gdriveOptions, googleAdsOptions, sharepointOptions, tiktokAdsOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectorOptions.class)
        .add("gdriveOptions", gdriveOptions)
        .add("googleAdsOptions", googleAdsOptions)
        .add("sharepointOptions", sharepointOptions)
        .add("tiktokAdsOptions", tiktokAdsOptions)
        .toString();
  }
}
