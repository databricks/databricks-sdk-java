// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExchangeFilter {
  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** */
  @JsonProperty("created_by")
  private String createdBy;

  /** */
  @JsonProperty("exchange_id")
  private String exchangeId;

  /** */
  @JsonProperty("filter_type")
  private ExchangeFilterType filterType;

  /** */
  @JsonProperty("filter_value")
  private String filterValue;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** */
  @JsonProperty("updated_by")
  private String updatedBy;

  public ExchangeFilter setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ExchangeFilter setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ExchangeFilter setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ExchangeFilter setFilterType(ExchangeFilterType filterType) {
    this.filterType = filterType;
    return this;
  }

  public ExchangeFilterType getFilterType() {
    return filterType;
  }

  public ExchangeFilter setFilterValue(String filterValue) {
    this.filterValue = filterValue;
    return this;
  }

  public String getFilterValue() {
    return filterValue;
  }

  public ExchangeFilter setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ExchangeFilter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ExchangeFilter setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ExchangeFilter setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeFilter that = (ExchangeFilter) o;
    return Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(filterType, that.filterType)
        && Objects.equals(filterValue, that.filterValue)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, exchangeId, filterType, filterValue, id, name, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ExchangeFilter.class)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("exchangeId", exchangeId)
        .add("filterType", filterType)
        .add("filterValue", filterValue)
        .add("id", id)
        .add("name", name)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
