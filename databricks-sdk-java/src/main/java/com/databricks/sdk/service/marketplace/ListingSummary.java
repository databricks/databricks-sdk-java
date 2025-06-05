// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListingSummary.ListingSummarySerializer.class)
@JsonDeserialize(using = ListingSummary.ListingSummaryDeserializer.class)
public class ListingSummary {
  /** */
  private Collection<Category> categories;

  /** */
  private Long createdAt;

  /** */
  private String createdBy;

  /** */
  private Long createdById;

  /** */
  private Collection<String> exchangeIds;

  /**
   * if a git repo is being created, a listing will be initialized with this field as opposed to a
   * share
   */
  private RepoInfo gitRepo;

  /** */
  private ListingType listingType;

  /** */
  private String name;

  /** */
  private String providerId;

  /** */
  private RegionInfo providerRegion;

  /** */
  private Long publishedAt;

  /** */
  private String publishedBy;

  /** */
  private ListingSetting setting;

  /** */
  private ShareInfo share;

  /** Enums */
  private ListingStatus status;

  /** */
  private String subtitle;

  /** */
  private Long updatedAt;

  /** */
  private String updatedBy;

  /** */
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

  ListingSummaryPb toPb() {
    ListingSummaryPb pb = new ListingSummaryPb();
    pb.setCategories(categories);
    pb.setCreatedAt(createdAt);
    pb.setCreatedBy(createdBy);
    pb.setCreatedById(createdById);
    pb.setExchangeIds(exchangeIds);
    pb.setGitRepo(gitRepo);
    pb.setListingType(listingType);
    pb.setName(name);
    pb.setProviderId(providerId);
    pb.setProviderRegion(providerRegion);
    pb.setPublishedAt(publishedAt);
    pb.setPublishedBy(publishedBy);
    pb.setSetting(setting);
    pb.setShare(share);
    pb.setStatus(status);
    pb.setSubtitle(subtitle);
    pb.setUpdatedAt(updatedAt);
    pb.setUpdatedBy(updatedBy);
    pb.setUpdatedById(updatedById);

    return pb;
  }

  static ListingSummary fromPb(ListingSummaryPb pb) {
    ListingSummary model = new ListingSummary();
    model.setCategories(pb.getCategories());
    model.setCreatedAt(pb.getCreatedAt());
    model.setCreatedBy(pb.getCreatedBy());
    model.setCreatedById(pb.getCreatedById());
    model.setExchangeIds(pb.getExchangeIds());
    model.setGitRepo(pb.getGitRepo());
    model.setListingType(pb.getListingType());
    model.setName(pb.getName());
    model.setProviderId(pb.getProviderId());
    model.setProviderRegion(pb.getProviderRegion());
    model.setPublishedAt(pb.getPublishedAt());
    model.setPublishedBy(pb.getPublishedBy());
    model.setSetting(pb.getSetting());
    model.setShare(pb.getShare());
    model.setStatus(pb.getStatus());
    model.setSubtitle(pb.getSubtitle());
    model.setUpdatedAt(pb.getUpdatedAt());
    model.setUpdatedBy(pb.getUpdatedBy());
    model.setUpdatedById(pb.getUpdatedById());

    return model;
  }

  public static class ListingSummarySerializer extends JsonSerializer<ListingSummary> {
    @Override
    public void serialize(ListingSummary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingSummaryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingSummaryDeserializer extends JsonDeserializer<ListingSummary> {
    @Override
    public ListingSummary deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingSummaryPb pb = mapper.readValue(p, ListingSummaryPb.class);
      return ListingSummary.fromPb(pb);
    }
  }
}
