// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * LinkedIn Ads specific options for ingestion. sync_start_date and lookback_window_days apply to
 * both the prebuilt analytics tables and custom reports. custom_report_options defines a custom
 * (user-defined) adAnalytics report and is only valid on a table object.
 */
@Generated
public class LinkedInAdsOptions {
  /**
   * (Optional) Custom report definition. Only valid on a table object. When set, the table is
   * synthesized from /rest/adAnalytics using the finder, pivots, time granularity and metrics here.
   * When unset, the table must match one of the connector's prebuilt sources.
   */
  @JsonProperty("custom_report_options")
  private LinkedInAdsOptionsLinkedInAdsCustomReportOptions customReportOptions;

  /**
   * (Optional) Days to look back during incremental sync for late-arriving data. If not specified,
   * defaults to 30 days.
   */
  @JsonProperty("lookback_window_days")
  private Long lookbackWindowDays;

  /**
   * (Optional) Start date for the initial sync of report tables, YYYY-MM-DD. Earliest date from
   * which to sync historical data; overrides the default when set. For finder
   * attributedRevenueMetrics, this must be between 30 and 366 days before today. If not specified,
   * defaults to 1 year of history.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public LinkedInAdsOptions setCustomReportOptions(
      LinkedInAdsOptionsLinkedInAdsCustomReportOptions customReportOptions) {
    this.customReportOptions = customReportOptions;
    return this;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptions getCustomReportOptions() {
    return customReportOptions;
  }

  public LinkedInAdsOptions setLookbackWindowDays(Long lookbackWindowDays) {
    this.lookbackWindowDays = lookbackWindowDays;
    return this;
  }

  public Long getLookbackWindowDays() {
    return lookbackWindowDays;
  }

  public LinkedInAdsOptions setSyncStartDate(String syncStartDate) {
    this.syncStartDate = syncStartDate;
    return this;
  }

  public String getSyncStartDate() {
    return syncStartDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedInAdsOptions that = (LinkedInAdsOptions) o;
    return Objects.equals(customReportOptions, that.customReportOptions)
        && Objects.equals(lookbackWindowDays, that.lookbackWindowDays)
        && Objects.equals(syncStartDate, that.syncStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customReportOptions, lookbackWindowDays, syncStartDate);
  }

  @Override
  public String toString() {
    return new ToStringer(LinkedInAdsOptions.class)
        .add("customReportOptions", customReportOptions)
        .add("lookbackWindowDays", lookbackWindowDays)
        .add("syncStartDate", syncStartDate)
        .toString();
  }
}
