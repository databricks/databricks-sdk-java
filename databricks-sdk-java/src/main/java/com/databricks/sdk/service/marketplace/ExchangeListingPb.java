// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ExchangeListingPb {
  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private String createdBy;

  @JsonProperty("exchange_id")
  private String exchangeId;

  @JsonProperty("exchange_name")
  private String exchangeName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("listing_id")
  private String listingId;

  @JsonProperty("listing_name")
  private String listingName;

  public ExchangeListingPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExchangeListingPb setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExchangeListingPb setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ExchangeListingPb setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public ExchangeListingPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExchangeListingPb setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ExchangeListingPb setListingName(String listingName) {
    this.listingName = listingName;
    return this;
  }

  public String getListingName() {
    return listingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeListingPb that = (ExchangeListingPb) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(exchangeName, that.exchangeName)
        && Objects.equals(id, that.id)
        && Objects.equals(listingId, that.listingId)
        && Objects.equals(listingName, that.listingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, exchangeId, exchangeName, id, listingId, listingName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeListingPb.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("exchangeId", exchangeId)
        .add("exchangeName", exchangeName)
        .add("id", id)
        .add("listingId", listingId)
        .add("listingName", listingName)
        .toString();
  }
}
