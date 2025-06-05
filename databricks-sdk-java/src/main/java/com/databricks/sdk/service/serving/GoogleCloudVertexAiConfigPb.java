// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GoogleCloudVertexAiConfigPb {
  @JsonProperty("private_key")
  private String privateKey;

  @JsonProperty("private_key_plaintext")
  private String privateKeyPlaintext;

  @JsonProperty("project_id")
  private String projectId;

  @JsonProperty("region")
  private String region;

  public GoogleCloudVertexAiConfigPb setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  public String getPrivateKey() {
    return privateKey;
  }

  public GoogleCloudVertexAiConfigPb setPrivateKeyPlaintext(String privateKeyPlaintext) {
    this.privateKeyPlaintext = privateKeyPlaintext;
    return this;
  }

  public String getPrivateKeyPlaintext() {
    return privateKeyPlaintext;
  }

  public GoogleCloudVertexAiConfigPb setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public GoogleCloudVertexAiConfigPb setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GoogleCloudVertexAiConfigPb that = (GoogleCloudVertexAiConfigPb) o;
    return Objects.equals(privateKey, that.privateKey)
        && Objects.equals(privateKeyPlaintext, that.privateKeyPlaintext)
        && Objects.equals(projectId, that.projectId)
        && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, privateKeyPlaintext, projectId, region);
  }

  @Override
  public String toString() {
    return new ToStringer(GoogleCloudVertexAiConfigPb.class)
        .add("privateKey", privateKey)
        .add("privateKeyPlaintext", privateKeyPlaintext)
        .add("projectId", projectId)
        .add("region", region)
        .toString();
  }
}
