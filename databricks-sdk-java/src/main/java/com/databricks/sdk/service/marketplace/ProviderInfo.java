// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ProviderInfo {
  /** */
  @JsonProperty("business_contact_email")
  private String businessContactEmail;

  /** */
  @JsonProperty("company_website_link")
  private String companyWebsiteLink;

  /** */
  @JsonProperty("dark_mode_icon_file_id")
  private String darkModeIconFileId;

  /** */
  @JsonProperty("dark_mode_icon_file_path")
  private String darkModeIconFilePath;

  /** */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("icon_file_id")
  private String iconFileId;

  /** */
  @JsonProperty("icon_file_path")
  private String iconFilePath;

  /** */
  @JsonProperty("id")
  private String id;

  /** is_featured is accessible by consumers only */
  @JsonProperty("is_featured")
  private Boolean isFeatured;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  /** published_by is only applicable to data aggregators (e.g. Crux) */
  @JsonProperty("published_by")
  private String publishedBy;

  /** */
  @JsonProperty("support_contact_email")
  private String supportContactEmail;

  /** */
  @JsonProperty("term_of_service_link")
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
}
