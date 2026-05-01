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
  @JsonProperty("confluence_options")
  private ConfluenceConnectorOptions confluenceOptions;

  /** */
  @JsonProperty("gdrive_options")
  private GoogleDriveOptions gdriveOptions;

  /** */
  @JsonProperty("google_ads_options")
  private GoogleAdsOptions googleAdsOptions;

  /** */
  @JsonProperty("jira_options")
  private JiraConnectorOptions jiraOptions;

  /** */
  @JsonProperty("outlook_options")
  private OutlookOptions outlookOptions;

  /** */
  @JsonProperty("sharepoint_options")
  private SharepointOptions sharepointOptions;

  /** */
  @JsonProperty("smartsheet_options")
  private SmartsheetOptions smartsheetOptions;

  /** */
  @JsonProperty("tiktok_ads_options")
  private TikTokAdsOptions tiktokAdsOptions;

  public ConnectorOptions setConfluenceOptions(ConfluenceConnectorOptions confluenceOptions) {
    this.confluenceOptions = confluenceOptions;
    return this;
  }

  public ConfluenceConnectorOptions getConfluenceOptions() {
    return confluenceOptions;
  }

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

  public ConnectorOptions setJiraOptions(JiraConnectorOptions jiraOptions) {
    this.jiraOptions = jiraOptions;
    return this;
  }

  public JiraConnectorOptions getJiraOptions() {
    return jiraOptions;
  }

  public ConnectorOptions setOutlookOptions(OutlookOptions outlookOptions) {
    this.outlookOptions = outlookOptions;
    return this;
  }

  public OutlookOptions getOutlookOptions() {
    return outlookOptions;
  }

  public ConnectorOptions setSharepointOptions(SharepointOptions sharepointOptions) {
    this.sharepointOptions = sharepointOptions;
    return this;
  }

  public SharepointOptions getSharepointOptions() {
    return sharepointOptions;
  }

  public ConnectorOptions setSmartsheetOptions(SmartsheetOptions smartsheetOptions) {
    this.smartsheetOptions = smartsheetOptions;
    return this;
  }

  public SmartsheetOptions getSmartsheetOptions() {
    return smartsheetOptions;
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
    return Objects.equals(confluenceOptions, that.confluenceOptions)
        && Objects.equals(gdriveOptions, that.gdriveOptions)
        && Objects.equals(googleAdsOptions, that.googleAdsOptions)
        && Objects.equals(jiraOptions, that.jiraOptions)
        && Objects.equals(outlookOptions, that.outlookOptions)
        && Objects.equals(sharepointOptions, that.sharepointOptions)
        && Objects.equals(smartsheetOptions, that.smartsheetOptions)
        && Objects.equals(tiktokAdsOptions, that.tiktokAdsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confluenceOptions,
        gdriveOptions,
        googleAdsOptions,
        jiraOptions,
        outlookOptions,
        sharepointOptions,
        smartsheetOptions,
        tiktokAdsOptions);
  }

  @Override
  public String toString() {
    return new ToStringer(ConnectorOptions.class)
        .add("confluenceOptions", confluenceOptions)
        .add("gdriveOptions", gdriveOptions)
        .add("googleAdsOptions", googleAdsOptions)
        .add("jiraOptions", jiraOptions)
        .add("outlookOptions", outlookOptions)
        .add("sharepointOptions", sharepointOptions)
        .add("smartsheetOptions", smartsheetOptions)
        .add("tiktokAdsOptions", tiktokAdsOptions)
        .toString();
  }
}
