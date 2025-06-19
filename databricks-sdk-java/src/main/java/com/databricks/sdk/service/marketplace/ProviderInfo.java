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
import java.util.Objects;

@Generated
@JsonSerialize(using = ProviderInfo.ProviderInfoSerializer.class)
@JsonDeserialize(using = ProviderInfo.ProviderInfoDeserializer.class)
public class ProviderInfo {
  /** */
  private String businessContactEmail;

  /** */
  private String companyWebsiteLink;

  /** */
  private String darkModeIconFileId;

  /** */
  private String darkModeIconFilePath;

  /** */
  private String description;

  /** */
  private String iconFileId;

  /** */
  private String iconFilePath;

  /** */
  private String id;

  /** is_featured is accessible by consumers only */
  private Boolean isFeatured;

  /** */
  private String name;

  /** */
  private String privacyPolicyLink;

  /** published_by is only applicable to data aggregators (e.g. Crux) */
  private String publishedBy;

  /** */
  private String supportContactEmail;

  /** */
  private String termOfServiceLink;

  public ProviderInfo setBusinessContactEmail(String businessContactEmail) {
    this.businessContactEmail = businessContactEmail;
    return this;
  }

  public String getBusinessContactEmail() {
    return businessContactEmail;
  }

  public ProviderInfo setCompanyWebsiteLink(String companyWebsiteLink) {
    this.companyWebsiteLink = companyWebsiteLink;
    return this;
  }

  public String getCompanyWebsiteLink() {
    return companyWebsiteLink;
  }

  public ProviderInfo setDarkModeIconFileId(String darkModeIconFileId) {
    this.darkModeIconFileId = darkModeIconFileId;
    return this;
  }

  public String getDarkModeIconFileId() {
    return darkModeIconFileId;
  }

  public ProviderInfo setDarkModeIconFilePath(String darkModeIconFilePath) {
    this.darkModeIconFilePath = darkModeIconFilePath;
    return this;
  }

  public String getDarkModeIconFilePath() {
    return darkModeIconFilePath;
  }

  public ProviderInfo setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ProviderInfo setIconFileId(String iconFileId) {
    this.iconFileId = iconFileId;
    return this;
  }

  public String getIconFileId() {
    return iconFileId;
  }

  public ProviderInfo setIconFilePath(String iconFilePath) {
    this.iconFilePath = iconFilePath;
    return this;
  }

  public String getIconFilePath() {
    return iconFilePath;
  }

  public ProviderInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ProviderInfo setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public ProviderInfo setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ProviderInfo setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public ProviderInfo setPublishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
  }

  public String getPublishedBy() {
    return publishedBy;
  }

  public ProviderInfo setSupportContactEmail(String supportContactEmail) {
    this.supportContactEmail = supportContactEmail;
    return this;
  }

  public String getSupportContactEmail() {
    return supportContactEmail;
  }

  public ProviderInfo setTermOfServiceLink(String termOfServiceLink) {
    this.termOfServiceLink = termOfServiceLink;
    return this;
  }

  public String getTermOfServiceLink() {
    return termOfServiceLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProviderInfo that = (ProviderInfo) o;
    return Objects.equals(businessContactEmail, that.businessContactEmail)
        && Objects.equals(companyWebsiteLink, that.companyWebsiteLink)
        && Objects.equals(darkModeIconFileId, that.darkModeIconFileId)
        && Objects.equals(darkModeIconFilePath, that.darkModeIconFilePath)
        && Objects.equals(description, that.description)
        && Objects.equals(iconFileId, that.iconFileId)
        && Objects.equals(iconFilePath, that.iconFilePath)
        && Objects.equals(id, that.id)
        && Objects.equals(isFeatured, that.isFeatured)
        && Objects.equals(name, that.name)
        && Objects.equals(privacyPolicyLink, that.privacyPolicyLink)
        && Objects.equals(publishedBy, that.publishedBy)
        && Objects.equals(supportContactEmail, that.supportContactEmail)
        && Objects.equals(termOfServiceLink, that.termOfServiceLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        businessContactEmail,
        companyWebsiteLink,
        darkModeIconFileId,
        darkModeIconFilePath,
        description,
        iconFileId,
        iconFilePath,
        id,
        isFeatured,
        name,
        privacyPolicyLink,
        publishedBy,
        supportContactEmail,
        termOfServiceLink);
  }

  @Override
  public String toString() {
    return new ToStringer(ProviderInfo.class)
        .add("businessContactEmail", businessContactEmail)
        .add("companyWebsiteLink", companyWebsiteLink)
        .add("darkModeIconFileId", darkModeIconFileId)
        .add("darkModeIconFilePath", darkModeIconFilePath)
        .add("description", description)
        .add("iconFileId", iconFileId)
        .add("iconFilePath", iconFilePath)
        .add("id", id)
        .add("isFeatured", isFeatured)
        .add("name", name)
        .add("privacyPolicyLink", privacyPolicyLink)
        .add("publishedBy", publishedBy)
        .add("supportContactEmail", supportContactEmail)
        .add("termOfServiceLink", termOfServiceLink)
        .toString();
  }

  ProviderInfoPb toPb() {
    ProviderInfoPb pb = new ProviderInfoPb();
    pb.setBusinessContactEmail(businessContactEmail);
    pb.setCompanyWebsiteLink(companyWebsiteLink);
    pb.setDarkModeIconFileId(darkModeIconFileId);
    pb.setDarkModeIconFilePath(darkModeIconFilePath);
    pb.setDescription(description);
    pb.setIconFileId(iconFileId);
    pb.setIconFilePath(iconFilePath);
    pb.setId(id);
    pb.setIsFeatured(isFeatured);
    pb.setName(name);
    pb.setPrivacyPolicyLink(privacyPolicyLink);
    pb.setPublishedBy(publishedBy);
    pb.setSupportContactEmail(supportContactEmail);
    pb.setTermOfServiceLink(termOfServiceLink);

    return pb;
  }

  static ProviderInfo fromPb(ProviderInfoPb pb) {
    ProviderInfo model = new ProviderInfo();
    model.setBusinessContactEmail(pb.getBusinessContactEmail());
    model.setCompanyWebsiteLink(pb.getCompanyWebsiteLink());
    model.setDarkModeIconFileId(pb.getDarkModeIconFileId());
    model.setDarkModeIconFilePath(pb.getDarkModeIconFilePath());
    model.setDescription(pb.getDescription());
    model.setIconFileId(pb.getIconFileId());
    model.setIconFilePath(pb.getIconFilePath());
    model.setId(pb.getId());
    model.setIsFeatured(pb.getIsFeatured());
    model.setName(pb.getName());
    model.setPrivacyPolicyLink(pb.getPrivacyPolicyLink());
    model.setPublishedBy(pb.getPublishedBy());
    model.setSupportContactEmail(pb.getSupportContactEmail());
    model.setTermOfServiceLink(pb.getTermOfServiceLink());

    return model;
  }

  public static class ProviderInfoSerializer extends JsonSerializer<ProviderInfo> {
    @Override
    public void serialize(ProviderInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ProviderInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ProviderInfoDeserializer extends JsonDeserializer<ProviderInfo> {
    @Override
    public ProviderInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ProviderInfoPb pb = mapper.readValue(p, ProviderInfoPb.class);
      return ProviderInfo.fromPb(pb);
    }
  }
}
