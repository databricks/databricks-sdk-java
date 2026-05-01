// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** TikTok Ads specific options for ingestion */
@Generated
public class TikTokAdsOptions {
  /** (Optional) Data level for the report. If not specified, defaults to AUCTION_CAMPAIGN. */
  @JsonProperty("data_level")
  private TikTokAdsOptionsTikTokDataLevel dataLevel;

  /**
   * (Optional) Dimensions to include in the report. Examples: "campaign_id", "adgroup_id", "ad_id",
   * "stat_time_day", "stat_time_hour" If not specified, defaults to campaign_id.
   */
  @JsonProperty("dimensions")
  private Collection<String> dimensions;

  /**
   * (Optional) Number of days to look back for report tables during incremental sync to capture
   * late-arriving conversions and attribution data. If not specified, defaults to 7 days.
   */
  @JsonProperty("lookback_window_days")
  private Long lookbackWindowDays;

  /**
   * (Optional) Metrics to include in the report. Examples: "spend", "impressions", "clicks",
   * "conversion", "cpc" If not specified, defaults to basic metrics (spend, impressions, clicks,
   * etc.)
   */
  @JsonProperty("metrics")
  private Collection<String> metrics;

  /**
   * (Optional) Whether to request lifetime metrics (all-time aggregated data). When true, the
   * report returns all-time data. If not specified, defaults to false.
   */
  @JsonProperty("query_lifetime")
  private Boolean queryLifetime;

  /** (Optional) Report type for the TikTok Ads API. If not specified, defaults to BASIC. */
  @JsonProperty("report_type")
  private TikTokAdsOptionsTikTokReportType reportType;

  /**
   * (Optional) Start date for the initial sync of report tables in YYYY-MM-DD format. This
   * determines the earliest date from which to sync historical data. If not specified, defaults to
   * 1 year of historical data for daily reports and 30 days for hourly reports.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public TikTokAdsOptions setDataLevel(TikTokAdsOptionsTikTokDataLevel dataLevel) {
    this.dataLevel = dataLevel;
    return this;
  }

  public TikTokAdsOptionsTikTokDataLevel getDataLevel() {
    return dataLevel;
  }

  public TikTokAdsOptions setDimensions(Collection<String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public Collection<String> getDimensions() {
    return dimensions;
  }

  public TikTokAdsOptions setLookbackWindowDays(Long lookbackWindowDays) {
    this.lookbackWindowDays = lookbackWindowDays;
    return this;
  }

  public Long getLookbackWindowDays() {
    return lookbackWindowDays;
  }

  public TikTokAdsOptions setMetrics(Collection<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<String> getMetrics() {
    return metrics;
  }

  public TikTokAdsOptions setQueryLifetime(Boolean queryLifetime) {
    this.queryLifetime = queryLifetime;
    return this;
  }

  public Boolean getQueryLifetime() {
    return queryLifetime;
  }

  public TikTokAdsOptions setReportType(TikTokAdsOptionsTikTokReportType reportType) {
    this.reportType = reportType;
    return this;
  }

  public TikTokAdsOptionsTikTokReportType getReportType() {
    return reportType;
  }

  public TikTokAdsOptions setSyncStartDate(String syncStartDate) {
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
    TikTokAdsOptions that = (TikTokAdsOptions) o;
    return Objects.equals(dataLevel, that.dataLevel)
        && Objects.equals(dimensions, that.dimensions)
        && Objects.equals(lookbackWindowDays, that.lookbackWindowDays)
        && Objects.equals(metrics, that.metrics)
        && Objects.equals(queryLifetime, that.queryLifetime)
        && Objects.equals(reportType, that.reportType)
        && Objects.equals(syncStartDate, that.syncStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataLevel,
        dimensions,
        lookbackWindowDays,
        metrics,
        queryLifetime,
        reportType,
        syncStartDate);
  }

  @Override
  public String toString() {
    return new ToStringer(TikTokAdsOptions.class)
        .add("dataLevel", dataLevel)
        .add("dimensions", dimensions)
        .add("lookbackWindowDays", lookbackWindowDays)
        .add("metrics", metrics)
        .add("queryLifetime", queryLifetime)
        .add("reportType", reportType)
        .add("syncStartDate", syncStartDate)
        .toString();
  }
}
