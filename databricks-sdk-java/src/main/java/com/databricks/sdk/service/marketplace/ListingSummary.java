// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListingSummary {
  /** */
  @JsonProperty("categories")
  private Collection<Category> categories;

  /** */
  @JsonProperty("created_at")
  private Long createdAt;

  /** */
  @JsonProperty("created_by")
  private String createdBy;

  /** */
  @JsonProperty("created_by_id")
  private Long createdById;

  /** */
  @JsonProperty("exchange_ids")
  private Collection<String> exchangeIds;

  /**
   * if a git repo is being created, a listing will be initialized with this field as opposed to a
   * share
   */
  @JsonProperty("git_repo")
  private RepoInfo gitRepo;

  /** */
  @JsonProperty("listingType")
  private ListingType listingType;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("provider_id")
  private String providerId;

  /** */
  @JsonProperty("provider_region")
  private RegionInfo providerRegion;

  /** */
  @JsonProperty("published_at")
  private Long publishedAt;

  /** */
  @JsonProperty("published_by")
  private String publishedBy;

  /** */
  @JsonProperty("setting")
  private ListingSetting setting;

  /** */
  @JsonProperty("share")
  private ShareInfo share;

  /** */
  @JsonProperty("status")
  private ListingStatus status;

  /** */
  @JsonProperty("subtitle")
  private String subtitle;

  /** */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** */
  @JsonProperty("updated_by_id")
  private Long updatedById;

  public ListingSummary setCategories(Collection<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Collection<Category> getCategories() {
    return categories;
  }

  public ListingSummary setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public ListingSummary setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public ListingSummary setCreatedById(Long createdById) {
    this.createdById = createdById;
    return this;
  }

  public Long getCreatedById() {
    return createdById;
  }

  public ListingSummary setExchangeIds(Collection<String> exchangeIds) {
    this.exchangeIds = exchangeIds;
    return this;
  }

  public Collection<String> getExchangeIds() {
    return exchangeIds;
  }

  public ListingSummary setGitRepo(RepoInfo gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

  public RepoInfo getGitRepo() {
    return gitRepo;
  }

  public ListingSummary setListingType(ListingType listingType) {
    this.listingType = listingType;
    return this;
  }

  public ListingType getListingType() {
    return listingType;
  }

  public ListingSummary setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListingSummary setProviderId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  public String getProviderId() {
    return providerId;
  }

  public ListingSummary setProviderRegion(RegionInfo providerRegion) {
    this.providerRegion = providerRegion;
    return this;
  }

  public RegionInfo getProviderRegion() {
    return providerRegion;
  }

  public ListingSummary setPublishedAt(Long publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  public Long getPublishedAt() {
    return publishedAt;
  }

  public ListingSummary setPublishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }

  public String getPublishedBy() {
    return publishedBy;
  }

  public ListingSummary setSetting(ListingSetting setting) {
    this.setting = setting;
    return this;
  }

  public ListingSetting getSetting() {
    return setting;
  }

  public ListingSummary setShare(ShareInfo share) {
    this.share = share;
    return this;
  }

  public ShareInfo getShare() {
    return share;
  }

  public ListingSummary setStatus(ListingStatus status) {
    this.status = status;
    return this;
  }

  public ListingStatus getStatus() {
    return status;
  }

  public ListingSummary setSubtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public ListingSummary setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public ListingSummary setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public ListingSummary setUpdatedById(Long updatedById) {
    this.updatedById = updatedById;
    return this;
  }

  public Long getUpdatedById() {
    return updatedById;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingSummary that = (ListingSummary) o;
    return Objects.equals(categories, that.categories)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(createdById, that.createdById)
        && Objects.equals(exchangeIds, that.exchangeIds)
        && Objects.equals(gitRepo, that.gitRepo)
        && Objects.equals(listingType, that.listingType)
        && Objects.equals(name, that.name)
        && Objects.equals(providerId, that.providerId)
        && Objects.equals(providerRegion, that.providerRegion)
        && Objects.equals(publishedAt, that.publishedAt)
        && Objects.equals(publishedBy, that.publishedBy)
        && Objects.equals(setting, that.setting)
        && Objects.equals(share, that.share)
        && Objects.equals(status, that.status)
        && Objects.equals(subtitle, that.subtitle)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(updatedById, that.updatedById);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        categories,
        createdAt,
        createdBy,
        createdById,
        exchangeIds,
        gitRepo,
        listingType,
        name,
        providerId,
        providerRegion,
        publishedAt,
        publishedBy,
        setting,
        share,
        status,
        subtitle,
        updatedAt,
        updatedBy,
        updatedById);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingSummary.class)
        .add("categories", categories)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("createdById", createdById)
        .add("exchangeIds", exchangeIds)
        .add("gitRepo", gitRepo)
        .add("listingType", listingType)
        .add("name", name)
        .add("providerId", providerId)
        .add("providerRegion", providerRegion)
        .add("publishedAt", publishedAt)
        .add("publishedBy", publishedBy)
        .add("setting", setting)
        .add("share", share)
        .add("status", status)
        .add("subtitle", subtitle)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .add("updatedById", updatedById)
        .toString();
  }
}
