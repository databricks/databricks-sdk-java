// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * User-defined custom report for the Reddit Ads connector. Applies only to the custom_report table
 * — prebuilt tables ignore this.
 */
@Generated
public class RedditAdsOptionsRedditAdsCustomReportOptions {
  /**
   * (Optional) Breakdown dimensions to group report data by. Examples: CAMPAIGN_ID, DATE, COUNTRY,
   * REGION, AD_ID. Must include at least one time dimension (DATE or HOUR).
   */
  @JsonProperty("breakdowns")
  private Collection<String> breakdowns;

  /**
   * (Optional) Fields to include in the report (maps to the Reddit Ads API `fields` parameter).
   * Examples: IMPRESSIONS, CLICKS, SPEND, CPC, CTR.
   */
  @JsonProperty("fields")
  private Collection<String> fields;

  public RedditAdsOptionsRedditAdsCustomReportOptions setBreakdowns(Collection<String> breakdowns) {
    this.breakdowns = breakdowns;
    return this;
  }

  public Collection<String> getBreakdowns() {
    return breakdowns;
  }

  public RedditAdsOptionsRedditAdsCustomReportOptions setFields(Collection<String> fields) {
    this.fields = fields;
    return this;
  }

  public Collection<String> getFields() {
    return fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RedditAdsOptionsRedditAdsCustomReportOptions that =
        (RedditAdsOptionsRedditAdsCustomReportOptions) o;
    return Objects.equals(breakdowns, that.breakdowns) && Objects.equals(fields, that.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakdowns, fields);
  }

  @Override
  public String toString() {
    return new ToStringer(RedditAdsOptionsRedditAdsCustomReportOptions.class)
        .add("breakdowns", breakdowns)
        .add("fields", fields)
        .toString();
  }
}
