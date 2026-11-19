// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListingSummary {
  /**
   * Categories that consumers can use to filter listings. They also appear as tags on the listing
   * tile and detail page.
   */
  @JsonProperty("categories")
  private Collection<Category> categories;

  /** Time the listing was created, in epoch milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** Name of the user who created the listing. */
  @JsonProperty("created_by")
  private String createdBy;

  /** ID of the user who created the listing. */
  @JsonProperty("created_by_id")
  private Long createdById;

  /**
   * IDs of the private exchanges that the listing is shared in. A listing can be linked to at most
   * 10 exchanges.
   */
  @JsonProperty("exchange_ids")
  private Collection<String> exchangeIds;

  /**
   * Git repository that holds the listing's assets, used instead of a share for notebook and Git
   * repo listings. A listing cannot have both a share and a Git repo.
   */
  @JsonProperty("git_repo")
  private RepoInfo gitRepo;

  /**
   * How consumers get access to the listing. STANDARD listings are instantly available;
   * PERSONALIZED listings require the provider to approve each consumer request. Cannot be changed
   * after the listing is created.
   */
  @JsonProperty("listingType")
  private ListingType listingType;

  /**
   * Display name of the listing. Must start with a letter or digit and be at most 100 characters.
   */
  @JsonProperty("name")
  private String name;

  /** ID of the provider profile that owns the listing. */
  @JsonProperty("provider_id")
  private String providerId;

  /** Cloud and region of the provider's Unity Catalog metastore. Not allowed in create requests. */
  @JsonProperty("provider_region")
  private RegionInfo providerRegion;

  /** */
  @JsonProperty("published_at")
  private Long publishedAt;

  /** */
  @JsonProperty("published_by")
  private String publishedBy;

  /**
   * Listing settings, such as whether the listing is visible in the public Marketplace or only in
   * private exchanges.
   */
  @JsonProperty("setting")
  private ListingSetting setting;

  /**
   * Delta Sharing share that holds the listing's data assets. Required to publish a STANDARD
   * listing, except for app and MCP server listings; notebook and Git repo listings can use
   * git_repo instead. The caller must have access to the share.
   */
  @JsonProperty("share")
  private ShareInfo share;

  /**
   * Publication status of the listing. Only PUBLISHED listings are visible to consumers; create a
   * listing as DRAFT and set the status to PUBLISHED when it is ready.
   */
  @JsonProperty("status")
  private ListingStatus status;

  /** One-line subtitle shown with the listing name. */
  @JsonProperty("subtitle")
  private String subtitle;

  /** Time the listing was last updated, in epoch milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** Name of the user who last updated the listing. */
  @JsonProperty("updated_by")
  private String updatedBy;

  /** ID of the user who last updated the listing. */
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
