// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListingDetailPb {
  @JsonProperty("assets")
  private Collection<AssetType> assets;

  @JsonProperty("collection_date_end")
  private Long collectionDateEnd;

  @JsonProperty("collection_date_start")
  private Long collectionDateStart;

  @JsonProperty("collection_granularity")
  private DataRefreshInfo collectionGranularity;

  @JsonProperty("cost")
  private Cost cost;

  @JsonProperty("data_source")
  private String dataSource;

  @JsonProperty("description")
  private String description;

  @JsonProperty("documentation_link")
  private String documentationLink;

  @JsonProperty("embedded_notebook_file_infos")
  private Collection<FileInfo> embeddedNotebookFileInfos;

  @JsonProperty("file_ids")
  private Collection<String> fileIds;

  @JsonProperty("geographical_coverage")
  private String geographicalCoverage;

  @JsonProperty("license")
  private String license;

  @JsonProperty("pricing_model")
  private String pricingModel;

  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  @JsonProperty("size")
  private Double size;

  @JsonProperty("support_link")
  private String supportLink;

  @JsonProperty("tags")
  private Collection<ListingTag> tags;

  @JsonProperty("terms_of_service")
  private String termsOfService;

  @JsonProperty("update_frequency")
  private DataRefreshInfo updateFrequency;

  public ListingDetailPb setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public ListingDetailPb setCollectionDateEnd(Long collectionDateEnd) {
    this.collectionDateEnd = collectionDateEnd;
    return this;
  }

  public Long getCollectionDateEnd() {
    return collectionDateEnd;
  }

  public ListingDetailPb setCollectionDateStart(Long collectionDateStart) {
    this.collectionDateStart = collectionDateStart;
    return this;
  }

  public Long getCollectionDateStart() {
    return collectionDateStart;
  }

  public ListingDetailPb setCollectionGranularity(DataRefreshInfo collectionGranularity) {
    this.collectionGranularity = collectionGranularity;
    return this;
  }

  public DataRefreshInfo getCollectionGranularity() {
    return collectionGranularity;
  }

  public ListingDetailPb setCost(Cost cost) {
    this.cost = cost;
    return this;
  }

  public Cost getCost() {
    return cost;
  }

  public ListingDetailPb setDataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  public String getDataSource() {
    return dataSource;
  }

  public ListingDetailPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ListingDetailPb setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

  public String getDocumentationLink() {
    return documentationLink;
  }

  public ListingDetailPb setEmbeddedNotebookFileInfos(
      Collection<FileInfo> embeddedNotebookFileInfos) {
    this.embeddedNotebookFileInfos = embeddedNotebookFileInfos;
    return this;
  }

  public Collection<FileInfo> getEmbeddedNotebookFileInfos() {
    return embeddedNotebookFileInfos;
  }

  public ListingDetailPb setFileIds(Collection<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public Collection<String> getFileIds() {
    return fileIds;
  }

  public ListingDetailPb setGeographicalCoverage(String geographicalCoverage) {
    this.geographicalCoverage = geographicalCoverage;
    return this;
  }

  public String getGeographicalCoverage() {
    return geographicalCoverage;
  }

  public ListingDetailPb setLicense(String license) {
    this.license = license;
    return this;
  }

  public String getLicense() {
    return license;
  }

  public ListingDetailPb setPricingModel(String pricingModel) {
    this.pricingModel = pricingModel;
    return this;
  }

  public String getPricingModel() {
    return pricingModel;
  }

  public ListingDetailPb setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public ListingDetailPb setSize(Double size) {
    this.size = size;
    return this;
  }

  public Double getSize() {
    return size;
  }

  public ListingDetailPb setSupportLink(String supportLink) {
    this.supportLink = supportLink;
    return this;
  }

  public String getSupportLink() {
    return supportLink;
  }

  public ListingDetailPb setTags(Collection<ListingTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ListingTag> getTags() {
    return tags;
  }

  public ListingDetailPb setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  public String getTermsOfService() {
    return termsOfService;
  }

  public ListingDetailPb setUpdateFrequency(DataRefreshInfo updateFrequency) {
    this.updateFrequency = updateFrequency;
    return this;
  }

  public DataRefreshInfo getUpdateFrequency() {
    return updateFrequency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingDetailPb that = (ListingDetailPb) o;
    return Objects.equals(assets, that.assets)
        && Objects.equals(collectionDateEnd, that.collectionDateEnd)
        && Objects.equals(collectionDateStart, that.collectionDateStart)
        && Objects.equals(collectionGranularity, that.collectionGranularity)
        && Objects.equals(cost, that.cost)
        && Objects.equals(dataSource, that.dataSource)
        && Objects.equals(description, that.description)
        && Objects.equals(documentationLink, that.documentationLink)
        && Objects.equals(embeddedNotebookFileInfos, that.embeddedNotebookFileInfos)
        && Objects.equals(fileIds, that.fileIds)
        && Objects.equals(geographicalCoverage, that.geographicalCoverage)
        && Objects.equals(license, that.license)
        && Objects.equals(pricingModel, that.pricingModel)
        && Objects.equals(privacyPolicyLink, that.privacyPolicyLink)
        && Objects.equals(size, that.size)
        && Objects.equals(supportLink, that.supportLink)
        && Objects.equals(tags, that.tags)
        && Objects.equals(termsOfService, that.termsOfService)
        && Objects.equals(updateFrequency, that.updateFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assets,
        collectionDateEnd,
        collectionDateStart,
        collectionGranularity,
        cost,
        dataSource,
        description,
        documentationLink,
        embeddedNotebookFileInfos,
        fileIds,
        geographicalCoverage,
        license,
        pricingModel,
        privacyPolicyLink,
        size,
        supportLink,
        tags,
        termsOfService,
        updateFrequency);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingDetailPb.class)
        .add("assets", assets)
        .add("collectionDateEnd", collectionDateEnd)
        .add("collectionDateStart", collectionDateStart)
        .add("collectionGranularity", collectionGranularity)
        .add("cost", cost)
        .add("dataSource", dataSource)
        .add("description", description)
        .add("documentationLink", documentationLink)
        .add("embeddedNotebookFileInfos", embeddedNotebookFileInfos)
        .add("fileIds", fileIds)
        .add("geographicalCoverage", geographicalCoverage)
        .add("license", license)
        .add("pricingModel", pricingModel)
        .add("privacyPolicyLink", privacyPolicyLink)
        .add("size", size)
        .add("supportLink", supportLink)
        .add("tags", tags)
        .add("termsOfService", termsOfService)
        .add("updateFrequency", updateFrequency)
        .toString();
  }
}
