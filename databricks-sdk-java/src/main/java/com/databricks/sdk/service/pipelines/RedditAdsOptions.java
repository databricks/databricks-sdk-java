// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Reddit Ads specific options for ingestion */
@Generated
public class RedditAdsOptions {
  /**
   * (Optional) Custom report definition. When set, the table is treated as a user-defined Reddit
   * Ads custom report. When unset, the table must match one of the connector's prebuilt sources.
   */
  @JsonProperty("custom_report_options")
  private RedditAdsOptionsRedditAdsCustomReportOptions customReportOptions;

  /**
   * (Optional) Number of days to look back for report tables during incremental sync to capture
   * late-arriving conversions and attribution data. If not specified, defaults to 30 days.
   */
  @JsonProperty("lookback_window_days")
  private Long lookbackWindowDays;

  /**
   * (Optional) Start date for the initial sync of report tables in YYYY-MM-DD format. This
   * determines the earliest date from which to sync historical data. If not specified, defaults to
   * 2 years ago.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public RedditAdsOptions setCustomReportOptions(
      RedditAdsOptionsRedditAdsCustomReportOptions customReportOptions) {
    this.customReportOptions = customReportOptions;
    return this;
  }

  public RedditAdsOptionsRedditAdsCustomReportOptions getCustomReportOptions() {
    return customReportOptions;
  }

  public RedditAdsOptions setLookbackWindowDays(Long lookbackWindowDays) {
    this.lookbackWindowDays = lookbackWindowDays;
    return this;
  }

  public Long getLookbackWindowDays() {
    return lookbackWindowDays;
  }

  public RedditAdsOptions setSyncStartDate(String syncStartDate) {
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
    RedditAdsOptions that = (RedditAdsOptions) o;
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
    return new ToStringer(RedditAdsOptions.class)
        .add("customReportOptions", customReportOptions)
        .add("lookbackWindowDays", lookbackWindowDays)
        .add("syncStartDate", syncStartDate)
        .toString();
  }
}
