// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AibiDashboardEmbeddingApprovedDomainsSettingPb {
  @JsonProperty("aibi_dashboard_embedding_approved_domains")
  private AibiDashboardEmbeddingApprovedDomains aibiDashboardEmbeddingApprovedDomains;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public AibiDashboardEmbeddingApprovedDomainsSettingPb setAibiDashboardEmbeddingApprovedDomains(
      AibiDashboardEmbeddingApprovedDomains aibiDashboardEmbeddingApprovedDomains) {
    this.aibiDashboardEmbeddingApprovedDomains = aibiDashboardEmbeddingApprovedDomains;
    return this;
  }

  public AibiDashboardEmbeddingApprovedDomains getAibiDashboardEmbeddingApprovedDomains() {
    return aibiDashboardEmbeddingApprovedDomains;
  }

  public AibiDashboardEmbeddingApprovedDomainsSettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AibiDashboardEmbeddingApprovedDomainsSettingPb setSettingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  public String getSettingName() {
    return settingName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingApprovedDomainsSettingPb that =
        (AibiDashboardEmbeddingApprovedDomainsSettingPb) o;
    return Objects.equals(
            aibiDashboardEmbeddingApprovedDomains, that.aibiDashboardEmbeddingApprovedDomains)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aibiDashboardEmbeddingApprovedDomains, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingApprovedDomainsSettingPb.class)
        .add("aibiDashboardEmbeddingApprovedDomains", aibiDashboardEmbeddingApprovedDomains)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
