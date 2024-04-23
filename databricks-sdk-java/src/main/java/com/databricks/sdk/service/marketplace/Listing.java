// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Listing {
  /** */
  @JsonProperty("detail")
  private ListingDetail detail;

  /** */
  @JsonProperty("id")
  private String id;

  /** Next Number: 26 */
  @JsonProperty("summary")
  private ListingSummary summary;

  public Listing setDetail(ListingDetail detail) {
    this.detail = detail;
    return this;
  }

  public ListingDetail getDetail() {
    return detail;
  }

  public Listing setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Listing setSummary(ListingSummary summary) {
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
    Listing that = (Listing) o;
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
    return new ToStringer(Listing.class)
        .add("detail", detail)
        .add("id", id)
        .add("summary", summary)
        .toString();
  }
}
