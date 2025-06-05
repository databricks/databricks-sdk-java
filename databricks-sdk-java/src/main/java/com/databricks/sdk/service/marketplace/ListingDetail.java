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
@JsonSerialize(using = ListingDetail.ListingDetailSerializer.class)
@JsonDeserialize(using = ListingDetail.ListingDetailDeserializer.class)
public class ListingDetail {
  /** Type of assets included in the listing. eg. GIT_REPO, DATA_TABLE, MODEL, NOTEBOOK */
  private Collection<AssetType> assets;

  /** The ending date timestamp for when the data spans */
  private Long collectionDateEnd;

  /** The starting date timestamp for when the data spans */
  private Long collectionDateStart;

  /** Smallest unit of time in the dataset */
  private DataRefreshInfo collectionGranularity;

  /** Whether the dataset is free or paid */
  private Cost cost;

  /** Where/how the data is sourced */
  private String dataSource;

  /** */
  private String description;

  /** */
  private String documentationLink;

  /** */
  private Collection<FileInfo> embeddedNotebookFileInfos;

  /** */
  private Collection<String> fileIds;

  /** Which geo region the listing data is collected from */
  private String geographicalCoverage;

  /**
   * ID 20, 21 removed don't use License of the data asset - Required for listings with model based
   * assets
   */
  private String license;

  /**
   * What the pricing model is (e.g. paid, subscription, paid upfront); should only be present if
   * cost is paid TODO: Not used yet, should deprecate if we will never use it
   */
  private String pricingModel;

  /** */
  private String privacyPolicyLink;

  /** size of the dataset in GB */
  private Double size;

  /** */
  private String supportLink;

  /**
   * Listing tags - Simple key value pair to annotate listings. When should I use tags vs dedicated
   * fields? Using tags avoids the need to add new columns in the database for new annotations.
   * However, this should be used sparingly since tags are stored as key value pair. Use tags only:
   * 1. If the field is optional and won't need to have NOT NULL integrity check 2. The value is
   * fairly fixed, static and low cardinality (eg. enums). 3. The value won't be used in filters or
   * joins with other tables.
   */
  private Collection<ListingTag> tags;

  /** */
  private String termsOfService;

  /** How often data is updated */
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

  ListingDetailPb toPb() {
    ListingDetailPb pb = new ListingDetailPb();
    pb.setAssets(assets);
    pb.setCollectionDateEnd(collectionDateEnd);
    pb.setCollectionDateStart(collectionDateStart);
    pb.setCollectionGranularity(collectionGranularity);
    pb.setCost(cost);
    pb.setDataSource(dataSource);
    pb.setDescription(description);
    pb.setDocumentationLink(documentationLink);
    pb.setEmbeddedNotebookFileInfos(embeddedNotebookFileInfos);
    pb.setFileIds(fileIds);
    pb.setGeographicalCoverage(geographicalCoverage);
    pb.setLicense(license);
    pb.setPricingModel(pricingModel);
    pb.setPrivacyPolicyLink(privacyPolicyLink);
    pb.setSize(size);
    pb.setSupportLink(supportLink);
    pb.setTags(tags);
    pb.setTermsOfService(termsOfService);
    pb.setUpdateFrequency(updateFrequency);

    return pb;
  }

  static ListingDetail fromPb(ListingDetailPb pb) {
    ListingDetail model = new ListingDetail();
    model.setAssets(pb.getAssets());
    model.setCollectionDateEnd(pb.getCollectionDateEnd());
    model.setCollectionDateStart(pb.getCollectionDateStart());
    model.setCollectionGranularity(pb.getCollectionGranularity());
    model.setCost(pb.getCost());
    model.setDataSource(pb.getDataSource());
    model.setDescription(pb.getDescription());
    model.setDocumentationLink(pb.getDocumentationLink());
    model.setEmbeddedNotebookFileInfos(pb.getEmbeddedNotebookFileInfos());
    model.setFileIds(pb.getFileIds());
    model.setGeographicalCoverage(pb.getGeographicalCoverage());
    model.setLicense(pb.getLicense());
    model.setPricingModel(pb.getPricingModel());
    model.setPrivacyPolicyLink(pb.getPrivacyPolicyLink());
    model.setSize(pb.getSize());
    model.setSupportLink(pb.getSupportLink());
    model.setTags(pb.getTags());
    model.setTermsOfService(pb.getTermsOfService());
    model.setUpdateFrequency(pb.getUpdateFrequency());

    return model;
  }

  public static class ListingDetailSerializer extends JsonSerializer<ListingDetail> {
    @Override
    public void serialize(ListingDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingDetailDeserializer extends JsonDeserializer<ListingDetail> {
    @Override
    public ListingDetail deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingDetailPb pb = mapper.readValue(p, ListingDetailPb.class);
      return ListingDetail.fromPb(pb);
    }
  }
}
