// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** Search listings */
@Generated
public class SearchListingsRequest {
  /** Matches any of the following asset types */
  @JsonIgnore
  @QueryParam("assets")
  private Collection<AssetType> assets;

  /** Matches any of the following categories */
  @JsonIgnore
  @QueryParam("categories")
  private Collection<Category> categories;

  /** */
  @JsonIgnore
  @QueryParam("is_free")
  private Boolean isFree;

  /** */
  @JsonIgnore
  @QueryParam("is_private_exchange")
  private Boolean isPrivateExchange;

  /** */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Matches any of the following provider ids */
  @JsonIgnore
  @QueryParam("provider_ids")
  private Collection<String> providerIds;

  /** Fuzzy matches query */
  @JsonIgnore
  @QueryParam("query")
  private String query;

  public SearchListingsRequest setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public SearchListingsRequest setCategories(Collection<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<Category> getCategories() {
    return categories;
  }

  public SearchListingsRequest setIsFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

  public Boolean getIsFree() {
    return isFree;
  }

  public SearchListingsRequest setIsPrivateExchange(Boolean isPrivateExchange) {
    this.isPrivateExchange = isPrivateExchange;
    return this;
  }

  public Boolean getIsPrivateExchange() {
    return isPrivateExchange;
  }

  public SearchListingsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public SearchListingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchListingsRequest setProviderIds(Collection<String> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public Collection<String> getProviderIds() {
    return providerIds;
  }

  public SearchListingsRequest setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchListingsRequest that = (SearchListingsRequest) o;
    return Objects.equals(assets, that.assets)
        && Objects.equals(categories, that.categories)
        && Objects.equals(isFree, that.isFree)
        && Objects.equals(isPrivateExchange, that.isPrivateExchange)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(providerIds, that.providerIds)
        && Objects.equals(query, that.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assets, categories, isFree, isPrivateExchange, pageSize, pageToken, providerIds, query);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchListingsRequest.class)
        .add("assets", assets)
        .add("categories", categories)
        .add("isFree", isFree)
        .add("isPrivateExchange", isPrivateExchange)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("providerIds", providerIds)
        .add("query", query)
        .toString();
  }
}
