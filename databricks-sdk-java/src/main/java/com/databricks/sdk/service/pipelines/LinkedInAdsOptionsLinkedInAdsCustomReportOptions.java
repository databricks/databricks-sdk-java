// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * User-defined custom report for the LinkedIn Ads connector. The destination table name comes from
 * the enclosing TableSpec.destination_table, the start date from the enclosing
 * LinkedInAdsOptions.sync_start_date, and the account it runs against from the source schema
 * (namespace) -- none are repeated here.
 */
@Generated
public class LinkedInAdsOptionsLinkedInAdsCustomReportOptions {
  /** (Required) Entity pivots to group by; count/constraints depend on finder. */
  @JsonProperty("entity_granularity")
  private Collection<LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsEntityGranularity>
      entityGranularity;

  /** (Required) adAnalytics finder. See LinkedInAdsFinder. */
  @JsonProperty("finder")
  private LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsFinder finder;

  /**
   * (Optional) LinkedIn metric names for the report. Open vocabulary (not an enum): the valid set
   * is large (~100) and evolves with the LinkedIn adAnalytics API, so values are passed through
   * verbatim. If empty, a pivot-safe default core set is ingested: impressions, clicks,
   * costInLocalCurrency, externalWebsiteConversions (valid for every pivot). Ignored for
   * attributedRevenueMetrics (always returns the full RevenueAttributionMetrics struct).
   */
  @JsonProperty("metrics")
  private Collection<String> metrics;

  /**
   * (Optional) Time aggregation. Defaults to DAILY when unspecified. Used by analytics/statistics;
   * ignored for attributedRevenueMetrics.
   */
  @JsonProperty("time_granularity")
  private LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsTimeGranularity
      timeGranularity;

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptions setEntityGranularity(
      Collection<LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsEntityGranularity>
          entityGranularity) {
    this.entityGranularity = entityGranularity;
    return this;
  }

  public Collection<LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsEntityGranularity>
      getEntityGranularity() {
    return entityGranularity;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptions setFinder(
      LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsFinder finder) {
    this.finder = finder;
    return this;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsFinder getFinder() {
    return finder;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptions setMetrics(Collection<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<String> getMetrics() {
    return metrics;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptions setTimeGranularity(
      LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsTimeGranularity timeGranularity) {
    this.timeGranularity = timeGranularity;
    return this;
  }

  public LinkedInAdsOptionsLinkedInAdsCustomReportOptionsLinkedInAdsTimeGranularity
      getTimeGranularity() {
    return timeGranularity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedInAdsOptionsLinkedInAdsCustomReportOptions that =
        (LinkedInAdsOptionsLinkedInAdsCustomReportOptions) o;
    return Objects.equals(entityGranularity, that.entityGranularity)
        && Objects.equals(finder, that.finder)
        && Objects.equals(metrics, that.metrics)
        && Objects.equals(timeGranularity, that.timeGranularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityGranularity, finder, metrics, timeGranularity);
  }

  @Override
  public String toString() {
    return new ToStringer(LinkedInAdsOptionsLinkedInAdsCustomReportOptions.class)
        .add("entityGranularity", entityGranularity)
        .add("finder", finder)
        .add("metrics", metrics)
        .add("timeGranularity", timeGranularity)
        .toString();
  }
}
