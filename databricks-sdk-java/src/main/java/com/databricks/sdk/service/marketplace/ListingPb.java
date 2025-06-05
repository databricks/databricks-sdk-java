// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ListingPb {
  @JsonProperty("detail")
  private ListingDetail detail;

  @JsonProperty("id")
  private String id;

  @JsonProperty("summary")
  private ListingSummary summary;

  public ListingPb setDetail(ListingDetail detail) {
    this.detail = detail;
    return this;
  }

  public ListingDetail getDetail() {
    return detail;
  }

  public ListingPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListingPb setSummary(ListingSummary summary) {
    this.summary = summary;
    return this;
  }

  public ListingSummary getSummary() {
    return summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingPb that = (ListingPb) o;
    return Objects.equals(detail, that.detail)
        && Objects.equals(id, that.id)
        && Objects.equals(summary, that.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, id, summary);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingPb.class)
        .add("detail", detail)
        .add("id", id)
        .add("summary", summary)
        .toString();
  }
}
