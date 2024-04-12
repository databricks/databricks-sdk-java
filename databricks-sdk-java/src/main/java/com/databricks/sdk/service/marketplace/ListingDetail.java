// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListingDetail {
  /** Type of assets included in the listing. eg. GIT_REPO, DATA_TABLE, MODEL, NOTEBOOK */
  @JsonProperty("assets")
  private Collection<AssetType> assets;

  /** The ending date timestamp for when the data spans */
  @JsonProperty("collection_date_end")
  private Long collectionDateEnd;

  /** The starting date timestamp for when the data spans */
  @JsonProperty("collection_date_start")
  private Long collectionDateStart;

  /** Smallest unit of time in the dataset */
  @JsonProperty("collection_granularity")
  private DataRefreshInfo collectionGranularity;

  /** Whether the dataset is free or paid */
  @JsonProperty("cost")
  private Cost cost;

  /** Where/how the data is sourced */
  @JsonProperty("data_source")
  private String dataSource;

  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("documentation_link")
  private String documentationLink;

  /** */
  @JsonProperty("embedded_notebook_file_infos")
  private Collection<FileInfo> embeddedNotebookFileInfos;

  /** */
  @JsonProperty("file_ids")
  private Collection<String> fileIds;

  /** Which geo region the listing data is collected from */
  @JsonProperty("geographical_coverage")
  private String geographicalCoverage;

  /**
   * ID 20, 21 removed don't use License of the data asset - Required for listings with model based
   * assets
   */
  @JsonProperty("license")
  private String license;

  /**
   * What the pricing model is (e.g. paid, subscription, paid upfront); should only be present if
   * cost is paid TODO: Not used yet, should deprecate if we will never use it
   */
  @JsonProperty("pricing_model")
  private String pricingModel;

  /** */
  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  /** size of the dataset in GB */
  @JsonProperty("size")
  private Double size;

  /** */
  @JsonProperty("support_link")
  private String supportLink;

  /**
   * Listing tags - Simple key value pair to annotate listings. When should I use tags vs dedicated
   * fields? Using tags avoids the need to add new columns in the database for new annotations.
   * However, this should be used sparingly since tags are stored as key value pair. Use tags only:
   * 1. If the field is optional and won't need to have NOT NULL integrity check 2. The value is
   * fairly fixed, static and low cardinality (eg. enums). 3. The value won't be used in filters or
   * joins with other tables.
   */
  @JsonProperty("tags")
  private Collection<ListingTag> tags;

  /** */
  @JsonProperty("terms_of_service")
  private String termsOfService;

  /** How often data is updated */
  @JsonProperty("update_frequency")
  private DataRefreshInfo updateFrequency;

  public ListingDetail setAssets(Collection<AssetType> assets) {
    this.assets = assets;
    return this;
  }

  public Collection<AssetType> getAssets() {
    return assets;
  }

  public ListingDetail setCollectionDateEnd(Long collectionDateEnd) {
    this.collectionDateEnd = collectionDateEnd;
    return this;
  }

  public Long getCollectionDateEnd() {
    return collectionDateEnd;
  }

  public ListingDetail setCollectionDateStart(Long collectionDateStart) {
    this.collectionDateStart = collectionDateStart;
    return this;
  }

  public Long getCollectionDateStart() {
    return collectionDateStart;
  }

  public ListingDetail setCollectionGranularity(DataRefreshInfo collectionGranularity) {
    this.collectionGranularity = collectionGranularity;
    return this;
  }

  public DataRefreshInfo getCollectionGranularity() {
    return collectionGranularity;
  }

  public ListingDetail setCost(Cost cost) {
    this.cost = cost;
    return this;
  }

  public Cost getCost() {
    return cost;
  }

  public ListingDetail setDataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  public String getDataSource() {
    return dataSource;
  }

  public ListingDetail setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ListingDetail setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

  public String getDocumentationLink() {
    return documentationLink;
  }

  public ListingDetail setEmbeddedNotebookFileInfos(
      Collection<FileInfo> embeddedNotebookFileInfos) {
    this.embeddedNotebookFileInfos = embeddedNotebookFileInfos;
    return this;
  }

  public Collection<FileInfo> getEmbeddedNotebookFileInfos() {
    return embeddedNotebookFileInfos;
  }

  public ListingDetail setFileIds(Collection<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public Collection<String> getFileIds() {
    return fileIds;
  }

  public ListingDetail setGeographicalCoverage(String geographicalCoverage) {
    this.geographicalCoverage = geographicalCoverage;
    return this;
  }

  public String getGeographicalCoverage() {
    return geographicalCoverage;
  }

  public ListingDetail setLicense(String license) {
    this.license = license;
    return this;
  }

  public String getLicense() {
    return license;
  }

  public ListingDetail setPricingModel(String pricingModel) {
    this.pricingModel = pricingModel;
    return this;
  }

  public String getPricingModel() {
    return pricingModel;
  }

  public ListingDetail setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public ListingDetail setSize(Double size) {
    this.size = size;
    return this;
  }

  public Double getSize() {
    return size;
  }

  public ListingDetail setSupportLink(String supportLink) {
    this.supportLink = supportLink;
    return this;
  }

  public String getSupportLink() {
    return supportLink;
  }

  public ListingDetail setTags(Collection<ListingTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ListingTag> getTags() {
    return tags;
  }

  public ListingDetail setTermsOfService(String termsOfService) {
    this.termsOfService = termsOfService;
    return this;
  }

  public String getTermsOfService() {
    return termsOfService;
  }

  public ListingDetail setUpdateFrequency(DataRefreshInfo updateFrequency) {
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
    ListingDetail that = (ListingDetail) o;
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
    return new ToStringer(ListingDetail.class)
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
