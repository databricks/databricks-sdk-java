// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AibiDashboardEmbeddingAccessPolicySettingPb {
  @JsonProperty("aibi_dashboard_embedding_access_policy")
  private AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("setting_name")
  private String settingName;

  public AibiDashboardEmbeddingAccessPolicySettingPb setAibiDashboardEmbeddingAccessPolicy(
      AibiDashboardEmbeddingAccessPolicy aibiDashboardEmbeddingAccessPolicy) {
    this.aibiDashboardEmbeddingAccessPolicy = aibiDashboardEmbeddingAccessPolicy;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicy getAibiDashboardEmbeddingAccessPolicy() {
    return aibiDashboardEmbeddingAccessPolicy;
  }

  public AibiDashboardEmbeddingAccessPolicySettingPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public AibiDashboardEmbeddingAccessPolicySettingPb setSettingName(String settingName) {
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
    AibiDashboardEmbeddingAccessPolicySettingPb that =
        (AibiDashboardEmbeddingAccessPolicySettingPb) o;
    return Objects.equals(
            aibiDashboardEmbeddingAccessPolicy, that.aibiDashboardEmbeddingAccessPolicy)
        && Objects.equals(etag, that.etag)
        && Objects.equals(settingName, that.settingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aibiDashboardEmbeddingAccessPolicy, etag, settingName);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingAccessPolicySettingPb.class)
        .add("aibiDashboardEmbeddingAccessPolicy", aibiDashboardEmbeddingAccessPolicy)
        .add("etag", etag)
        .add("settingName", settingName)
        .toString();
  }
}
