// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Meta Marketing (Meta Ads) specific options for ingestion */
@Generated
public class MetaMarketingOptions {
  /** (Optional) Action attribution windows for insights reporting (e.g. "28d_click", "1d_view") */
  @JsonProperty("action_attribution_windows")
  private Collection<String> actionAttributionWindows;

  /** (Optional) Action breakdowns to configure for data aggregation */
  @JsonProperty("action_breakdowns")
  private Collection<String> actionBreakdowns;

  /**
   * (Optional) Timing used to report action statistics (impression, conversion, mixed, or lifetime)
   */
  @JsonProperty("action_report_time")
  private String actionReportTime;

  /** (Optional) Breakdowns to configure for data aggregation */
  @JsonProperty("breakdowns")
  private Collection<String> breakdowns;

  /**
   * (Optional) Window in days to revisit data during sync to capture updated conversion data from
   * the API.
   */
  @JsonProperty("custom_insights_lookback_window")
  private Long customInsightsLookbackWindow;

  /** (Optional) Granularity of data to pull (account, ad, adset, campaign) */
  @JsonProperty("level")
  private String level;

  /**
   * (Optional) Start date in yyyy-MM-dd format (e.g. 2025-01-15). Data added after this date will
   * be ingested
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * (Optional) Value in string by which to aggregate statistics (can take all_days, monthly or
   * number of days)
   */
  @JsonProperty("time_increment")
  private String timeIncrement;

  public MetaMarketingOptions setActionAttributionWindows(
      Collection<String> actionAttributionWindows) {
    this.actionAttributionWindows = actionAttributionWindows;
    return this;
  }

  public Collection<String> getActionAttributionWindows() {
    return actionAttributionWindows;
  }

  public MetaMarketingOptions setActionBreakdowns(Collection<String> actionBreakdowns) {
    this.actionBreakdowns = actionBreakdowns;
    return this;
  }

  public Collection<String> getActionBreakdowns() {
    return actionBreakdowns;
  }

  public MetaMarketingOptions setActionReportTime(String actionReportTime) {
    this.actionReportTime = actionReportTime;
    return this;
  }

  public String getActionReportTime() {
    return actionReportTime;
  }

  public MetaMarketingOptions setBreakdowns(Collection<String> breakdowns) {
    this.breakdowns = breakdowns;
    return this;
  }

  public Collection<String> getBreakdowns() {
    return breakdowns;
  }

  public MetaMarketingOptions setCustomInsightsLookbackWindow(Long customInsightsLookbackWindow) {
    this.customInsightsLookbackWindow = customInsightsLookbackWindow;
    return this;
  }

  public Long getCustomInsightsLookbackWindow() {
    return customInsightsLookbackWindow;
  }

  public MetaMarketingOptions setLevel(String level) {
    this.level = level;
    return this;
  }

  public String getLevel() {
    return level;
  }

  public MetaMarketingOptions setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getStartDate() {
    return startDate;
  }

  public MetaMarketingOptions setTimeIncrement(String timeIncrement) {
    this.timeIncrement = timeIncrement;
    return this;
  }

  public String getTimeIncrement() {
    return timeIncrement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaMarketingOptions that = (MetaMarketingOptions) o;
    return Objects.equals(actionAttributionWindows, that.actionAttributionWindows)
        && Objects.equals(actionBreakdowns, that.actionBreakdowns)
        && Objects.equals(actionReportTime, that.actionReportTime)
        && Objects.equals(breakdowns, that.breakdowns)
        && Objects.equals(customInsightsLookbackWindow, that.customInsightsLookbackWindow)
        && Objects.equals(level, that.level)
        && Objects.equals(startDate, that.startDate)
        && Objects.equals(timeIncrement, that.timeIncrement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionAttributionWindows,
        actionBreakdowns,
        actionReportTime,
        breakdowns,
        customInsightsLookbackWindow,
        level,
        startDate,
        timeIncrement);
  }

  @Override
  public String toString() {
    return new ToStringer(MetaMarketingOptions.class)
        .add("actionAttributionWindows", actionAttributionWindows)
        .add("actionBreakdowns", actionBreakdowns)
        .add("actionReportTime", actionReportTime)
        .add("breakdowns", breakdowns)
        .add("customInsightsLookbackWindow", customInsightsLookbackWindow)
        .add("level", level)
        .add("startDate", startDate)
        .add("timeIncrement", timeIncrement)
        .toString();
  }
}
