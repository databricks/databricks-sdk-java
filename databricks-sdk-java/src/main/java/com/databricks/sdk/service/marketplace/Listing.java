// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A Marketplace listing: a data product that a provider offers to consumers. The summary holds the
 * listing's identity, status and sharing configuration, and the detail holds the descriptive
 * content that consumers see on the listing page.
 */
@Generated
public class Listing {
  /**
   * Descriptive content shown to consumers on the listing page, such as the description, links and
   * data attributes.
   */
  @JsonProperty("detail")
  private ListingDetail detail;

  /** ID of the listing. Assigned by the server; not allowed in create requests. */
  @JsonProperty("id")
  private String id;

  /** Identity, status and sharing configuration of the listing. */
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
