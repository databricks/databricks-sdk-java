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
  /**
   * (Optional) Custom report definition. When set, the table is treated as a user-defined TikTok
   * Ads custom report: the connector synthesizes a report request from the dimensions, metrics,
   * report type, and data level specified here. Supersedes the deprecated top-level
   * dimensions/metrics/report_type/ data_level/query_lifetime fields above.
   */
  @JsonProperty("custom_report_options")
  private TikTokAdsOptionsTikTokAdsCustomReportOptions customReportOptions;

  /** Deprecated. Use custom_report_options.data_level instead. */
  @JsonProperty("data_level")
  private TikTokAdsOptionsTikTokDataLevel dataLevel;

  /** Deprecated. Use custom_report_options.dimensions instead. */
  @JsonProperty("dimensions")
  private Collection<String> dimensions;

  /**
   * (Optional) Number of days to look back for report tables during incremental sync to capture
   * late-arriving conversions and attribution data.
   */
  @JsonProperty("lookback_window_days")
  private Long lookbackWindowDays;

  /** Deprecated. Use custom_report_options.metrics instead. */
  @JsonProperty("metrics")
  private Collection<String> metrics;

  /** Deprecated. Use custom_report_options.query_lifetime instead. */
  @JsonProperty("query_lifetime")
  private Boolean queryLifetime;

  /** Deprecated. Use custom_report_options.report_type instead. */
  @JsonProperty("report_type")
  private TikTokAdsOptionsTikTokReportType reportType;

  /**
   * (Optional) Start date for the initial sync of report tables in YYYY-MM-DD format. This
   * determines the earliest date from which to sync historical data.
   */
  @JsonProperty("sync_start_date")
  private String syncStartDate;

  public TikTokAdsOptions setCustomReportOptions(
      TikTokAdsOptionsTikTokAdsCustomReportOptions customReportOptions) {
    this.customReportOptions = customReportOptions;
    return this;
  }

  public TikTokAdsOptionsTikTokAdsCustomReportOptions getCustomReportOptions() {
    return customReportOptions;
  }

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
    return Objects.equals(customReportOptions, that.customReportOptions)
        && Objects.equals(dataLevel, that.dataLevel)
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
        customReportOptions,
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
        .add("customReportOptions", customReportOptions)
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
