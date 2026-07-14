// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * User-defined custom report for the Google Ads connector. Mirrors the resource + fields + segments
 * + metrics model that Google Ads GAQL exposes. The customer account this report runs against is
 * supplied by the source schema (namespace), not by this message. The whole message is gated by the
 * parent GoogleAdsOptions.custom_report_options stage; per-field stage annotations are
 * intentionally omitted. Only supported on table-type objects: a custom report requires a
 * destination table, so it cannot be specified at the schema/source level.
 */
@Generated
public class GoogleAdsCustomReportOptions {
  /**
   * (Optional) Metric fields to select (e.g. "metrics.clicks", "metrics.cost_micros"). Multiple
   * values are joined into the GAQL SELECT clause.
   */
  @JsonProperty("metrics")
  private Collection<String> metrics;

  /**
   * (Required) Google Ads resource to query (e.g. "ad_group_ad", "keyword_view",
   * "search_term_view"). Must be a resource that has metrics. Values are validated against Google
   * Ads' field-service catalog at pipeline plan time.
   */
  @JsonProperty("resource")
  private String resource;

  /**
   * (Optional) Resource fields to select, in fully-qualified GAQL form (e.g. "ad_group_ad.ad.id",
   * "ad_group_ad.status"). Multiple values are joined into the GAQL SELECT clause.
   */
  @JsonProperty("resource_fields")
  private Collection<String> resourceFields;

  /**
   * (Optional) Segment fields to select (e.g. "segments.date", "segments.device"). Must include at
   * least one of segments.date, segments.week, or segments.month — that segment is used as the
   * incremental cursor for the table.
   */
  @JsonProperty("segments")
  private Collection<String> segments;

  public GoogleAdsCustomReportOptions setMetrics(Collection<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<String> getMetrics() {
    return metrics;
  }

  public GoogleAdsCustomReportOptions setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  public GoogleAdsCustomReportOptions setResourceFields(Collection<String> resourceFields) {
    this.resourceFields = resourceFields;
    return this;
  }

  public Collection<String> getResourceFields() {
    return resourceFields;
  }

  public GoogleAdsCustomReportOptions setSegments(Collection<String> segments) {
    this.segments = segments;
    return this;
  }

  public Collection<String> getSegments() {
    return segments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleAdsCustomReportOptions that = (GoogleAdsCustomReportOptions) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(resource, that.resource)
        && Objects.equals(resourceFields, that.resourceFields)
        && Objects.equals(segments, that.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, resource, resourceFields, segments);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleAdsCustomReportOptions.class)
        .add("metrics", metrics)
        .add("resource", resource)
        .add("resourceFields", resourceFields)
        .add("segments", segments)
        .toString();
  }
}
