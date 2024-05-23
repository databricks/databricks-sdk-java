// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Collection;
import java.util.Objects;

/** List listings */
@Generated
public class ListListingsRequest {
  /** Matches any of the following asset types */
  @QueryParam("assets")
  private Collection<AssetType> assets;

  /** Matches any of the following categories */
  @QueryParam("categories")
  private Collection<Category> categories;

  /** */
  @QueryParam("is_ascending")
  private Boolean isAscending;

  /** Filters each listing based on if it is free. */
  @QueryParam("is_free")
  private Boolean isFree;

  /** Filters each listing based on if it is a private exchange. */
  @QueryParam("is_private_exchange")
  private Boolean isPrivateExchange;

  /** Filters each listing based on whether it is a staff pick. */
  @QueryParam("is_staff_pick")
  private Boolean isStaffPick;

  /** */
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @QueryParam("page_token")
  private String pageToken;

  /** Matches any of the following provider ids */
  @QueryParam("provider_ids")
  private Collection<String> providerIds;

  /** Criteria for sorting the resulting set of listings. */
  @QueryParam("sort_by")
  private SortBy sortBy;

  /** Matches any of the following tags */
  @QueryParam("tags")
  private Collection<ListingTag> tags;

  public ListListingsRequest setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public ListListingsRequest setCategories(Collection<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<Category> getCategories() {
    return categories;
  }

  public ListListingsRequest setIsAscending(Boolean isAscending) {
    this.isAscending = isAscending;
    return this;
  }

  public Boolean getIsAscending() {
    return isAscending;
  }

  public ListListingsRequest setIsFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

  public Boolean getIsFree() {
    return isFree;
  }

  public ListListingsRequest setIsPrivateExchange(Boolean isPrivateExchange) {
    this.isPrivateExchange = isPrivateExchange;
    return this;
  }

  public Boolean getIsPrivateExchange() {
    return isPrivateExchange;
  }

  public ListListingsRequest setIsStaffPick(Boolean isStaffPick) {
    this.isStaffPick = isStaffPick;
    return this;
  }

  public Boolean getIsStaffPick() {
    return isStaffPick;
  }

  public ListListingsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListListingsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListListingsRequest setProviderIds(Collection<String> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public Collection<String> getProviderIds() {
    return providerIds;
  }

  public ListListingsRequest setSortBy(SortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public SortBy getSortBy() {
    return sortBy;
  }

  public ListListingsRequest setTags(Collection<ListingTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ListingTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListListingsRequest that = (ListListingsRequest) o;
    return Objects.equals(assets, that.assets)
        && Objects.equals(categories, that.categories)
        && Objects.equals(isAscending, that.isAscending)
        && Objects.equals(isFree, that.isFree)
        && Objects.equals(isPrivateExchange, that.isPrivateExchange)
        && Objects.equals(isStaffPick, that.isStaffPick)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(providerIds, that.providerIds)
        && Objects.equals(sortBy, that.sortBy)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assets,
        categories,
        isAscending,
        isFree,
        isPrivateExchange,
        isStaffPick,
        pageSize,
        pageToken,
        providerIds,
        sortBy,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsRequest.class)
        .add("assets", assets)
        .add("categories", categories)
        .add("isAscending", isAscending)
        .add("isFree", isFree)
        .add("isPrivateExchange", isPrivateExchange)
        .add("isStaffPick", isStaffPick)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("providerIds", providerIds)
        .add("sortBy", sortBy)
        .add("tags", tags)
        .toString();
  }
}
