// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

/** List listings */
@Generated
class ListListingsRequestPb {
  @JsonIgnore
  @QueryParam("assets")
  private Collection<AssetType> assets;

  @JsonIgnore
  @QueryParam("categories")
  private Collection<Category> categories;

  @JsonIgnore
  @QueryParam("is_free")
  private Boolean isFree;

  @JsonIgnore
  @QueryParam("is_private_exchange")
  private Boolean isPrivateExchange;

  @JsonIgnore
  @QueryParam("is_staff_pick")
  private Boolean isStaffPick;

  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  @JsonIgnore
  @QueryParam("provider_ids")
  private Collection<String> providerIds;

  @JsonIgnore
  @QueryParam("tags")
  private Collection<ListingTag> tags;

  public ListListingsRequestPb setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public ListListingsRequestPb setCategories(Collection<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<Category> getCategories() {
    return categories;
  }

  public ListListingsRequestPb setIsFree(Boolean isFree) {
    this.isFree = isFree;
    return this;
  }

  public Boolean getIsFree() {
    return isFree;
  }

  public ListListingsRequestPb setIsPrivateExchange(Boolean isPrivateExchange) {
    this.isPrivateExchange = isPrivateExchange;
    return this;
  }

  public Boolean getIsPrivateExchange() {
    return isPrivateExchange;
  }

  public ListListingsRequestPb setIsStaffPick(Boolean isStaffPick) {
    this.isStaffPick = isStaffPick;
    return this;
  }

  public Boolean getIsStaffPick() {
    return isStaffPick;
  }

  public ListListingsRequestPb setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListListingsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListListingsRequestPb setProviderIds(Collection<String> providerIds) {
    this.providerIds = providerIds;
    return this;
  }

  public Collection<String> getProviderIds() {
    return providerIds;
  }

  public ListListingsRequestPb setTags(Collection<ListingTag> tags) {
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
    ListListingsRequestPb that = (ListListingsRequestPb) o;
    return Objects.equals(assets, that.assets)
        && Objects.equals(categories, that.categories)
        && Objects.equals(isFree, that.isFree)
        && Objects.equals(isPrivateExchange, that.isPrivateExchange)
        && Objects.equals(isStaffPick, that.isStaffPick)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(providerIds, that.providerIds)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assets,
        categories,
        isFree,
        isPrivateExchange,
        isStaffPick,
        pageSize,
        pageToken,
        providerIds,
        tags);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsRequestPb.class)
        .add("assets", assets)
        .add("categories", categories)
        .add("isFree", isFree)
        .add("isPrivateExchange", isPrivateExchange)
        .add("isStaffPick", isStaffPick)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("providerIds", providerIds)
        .add("tags", tags)
        .toString();
  }
}
