// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * User-defined custom report for the TikTok Ads connector. Groups the dimensions + metrics + report
 * type + data level that define a TikTok Ads custom report request.
 */
@Generated
public class TikTokAdsOptionsTikTokAdsCustomReportOptions {
  /** (Optional) Data level for the report. If not specified, defaults to AUCTION_CAMPAIGN. */
  @JsonProperty("data_level")
  private TikTokAdsOptionsTikTokDataLevel dataLevel;

  /**
   * (Optional) Dimensions to include in the report (e.g. "campaign_id", "adgroup_id", "ad_id",
   * "stat_time_day", "stat_time_hour").
   */
  @JsonProperty("dimensions")
  private Collection<String> dimensions;

  /**
   * (Optional) Metrics to include in the report (e.g. "spend", "impressions", "clicks",
   * "conversion", "cpc").
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

  public TikTokAdsOptionsTikTokAdsCustomReportOptions setDataLevel(
      TikTokAdsOptionsTikTokDataLevel dataLevel) {
    this.dataLevel = dataLevel;
    return this;
  }

  public TikTokAdsOptionsTikTokDataLevel getDataLevel() {
    return dataLevel;
  }

  public TikTokAdsOptionsTikTokAdsCustomReportOptions setDimensions(Collection<String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public Collection<String> getDimensions() {
    return dimensions;
  }

  public TikTokAdsOptionsTikTokAdsCustomReportOptions setMetrics(Collection<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<String> getMetrics() {
    return metrics;
  }

  public TikTokAdsOptionsTikTokAdsCustomReportOptions setQueryLifetime(Boolean queryLifetime) {
    this.queryLifetime = queryLifetime;
    return this;
  }

  public Boolean getQueryLifetime() {
    return queryLifetime;
  }

  public TikTokAdsOptionsTikTokAdsCustomReportOptions setReportType(
      TikTokAdsOptionsTikTokReportType reportType) {
    this.reportType = reportType;
    return this;
  }

  public TikTokAdsOptionsTikTokReportType getReportType() {
    return reportType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TikTokAdsOptionsTikTokAdsCustomReportOptions that =
        (TikTokAdsOptionsTikTokAdsCustomReportOptions) o;
    return Objects.equals(dataLevel, that.dataLevel)
        && Objects.equals(dimensions, that.dimensions)
        && Objects.equals(metrics, that.metrics)
        && Objects.equals(queryLifetime, that.queryLifetime)
        && Objects.equals(reportType, that.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataLevel, dimensions, metrics, queryLifetime, reportType);
  }

  @Override
  public String toString() {
    return new ToStringer(TikTokAdsOptionsTikTokAdsCustomReportOptions.class)
        .add("dataLevel", dataLevel)
        .add("dimensions", dimensions)
        .add("metrics", metrics)
        .add("queryLifetime", queryLifetime)
        .add("reportType", reportType)
        .toString();
  }
}
