// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Defines the shape of a single Meta Ads custom report (one /insights call shape). start_date,
 * custom_insights_lookback_window live on MetaMarketingOptions, not here. Metrics are not
 * customer-selectable; the connector returns a fixed standard metric set.
 */
@Generated
public class MetaMarketingOptionsMetaMarketingCustomReportOptions {
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

  /** (Optional) Granularity of data to pull (account, ad, adset, campaign) */
  @JsonProperty("level")
  private String level;

  /**
   * (Optional) Value in string by which to aggregate statistics (all_days, monthly or number of
   * days)
   */
  @JsonProperty("time_increment")
  private String timeIncrement;

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setActionAttributionWindows(
      Collection<String> actionAttributionWindows) {
    this.actionAttributionWindows = actionAttributionWindows;
    return this;
  }

  public Collection<String> getActionAttributionWindows() {
    return actionAttributionWindows;
  }

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setActionBreakdowns(
      Collection<String> actionBreakdowns) {
    this.actionBreakdowns = actionBreakdowns;
    return this;
  }

  public Collection<String> getActionBreakdowns() {
    return actionBreakdowns;
  }

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setActionReportTime(
      String actionReportTime) {
    this.actionReportTime = actionReportTime;
    return this;
  }

  public String getActionReportTime() {
    return actionReportTime;
  }

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setBreakdowns(
      Collection<String> breakdowns) {
    this.breakdowns = breakdowns;
    return this;
  }

  public Collection<String> getBreakdowns() {
    return breakdowns;
  }

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setLevel(String level) {
    this.level = level;
    return this;
  }

  public String getLevel() {
    return level;
  }

  public MetaMarketingOptionsMetaMarketingCustomReportOptions setTimeIncrement(
      String timeIncrement) {
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
    MetaMarketingOptionsMetaMarketingCustomReportOptions that =
        (MetaMarketingOptionsMetaMarketingCustomReportOptions) o;
    return Objects.equals(actionAttributionWindows, that.actionAttributionWindows)
        && Objects.equals(actionBreakdowns, that.actionBreakdowns)
        && Objects.equals(actionReportTime, that.actionReportTime)
        && Objects.equals(breakdowns, that.breakdowns)
        && Objects.equals(level, that.level)
        && Objects.equals(timeIncrement, that.timeIncrement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionAttributionWindows,
        actionBreakdowns,
        actionReportTime,
        breakdowns,
        level,
        timeIncrement);
  }

  @Override
  public String toString() {
    return new ToStringer(MetaMarketingOptionsMetaMarketingCustomReportOptions.class)
        .add("actionAttributionWindows", actionAttributionWindows)
        .add("actionBreakdowns", actionBreakdowns)
        .add("actionReportTime", actionReportTime)
        .add("breakdowns", breakdowns)
        .add("level", level)
        .add("timeIncrement", timeIncrement)
        .toString();
  }
}
