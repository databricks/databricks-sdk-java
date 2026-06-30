// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class Exchange {
  /** */
  @JsonProperty("comment")
  private String comment;

  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** */
  @JsonProperty("created_by")
  private String createdBy;

  /** */
  @JsonProperty("filters")
  private Collection<ExchangeFilter> filters;

  /** */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("linked_listings")
  private Collection<ExchangeListing> linkedListings;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** */
  @JsonProperty("updated_by")
  private String updatedBy;

  public Exchange setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public Exchange setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public Exchange setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public Exchange setFilters(Collection<ExchangeFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Collection<ExchangeFilter> getFilters() {
    return filters;
  }

  public Exchange setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Exchange setLinkedListings(Collection<ExchangeListing> linkedListings) {
    this.linkedListings = linkedListings;
    return this;
  }

  public Collection<ExchangeListing> getLinkedListings() {
    return linkedListings;
  }

  public Exchange setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Exchange setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public Exchange setUpdatedBy(String updatedBy) {
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
    Exchange that = (Exchange) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(filters, that.filters)
        && Objects.equals(id, that.id)
        && Objects.equals(linkedListings, that.linkedListings)
        && Objects.equals(name, that.name)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, createdAt, createdBy, filters, id, linkedListings, name, updatedAt, updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(Exchange.class)
        .add("comment", comment)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("filters", filters)
        .add("id", id)
        .add("linkedListings", linkedListings)
        .add("name", name)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}
