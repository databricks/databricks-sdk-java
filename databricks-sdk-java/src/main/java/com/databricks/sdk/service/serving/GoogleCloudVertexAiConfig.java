// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GoogleCloudVertexAiConfig {
  /**
   * The Databricks secret key reference for a private key for the service account which has access
   * to the Google Cloud Vertex AI Service. See <a
   * href="https://cloud.google.com/iam/docs/best-practices-for-managing-service-account-keys">Best
   * practices for managing service account keys</a>. If you prefer to paste your API key directly,
   * see {@code private_key_plaintext}. You must provide an API key using one of the following
   * fields: {@code private_key} or {@code private_key_plaintext}
   */
  @JsonProperty("private_key")
  private String privateKey;

  /**
   * The private key for the service account which has access to the Google Cloud Vertex AI Service
   * provided as a plaintext secret. See <a
   * href="https://cloud.google.com/iam/docs/best-practices-for-managing-service-account-keys">Best
   * practices for managing service account keys</a>. If you prefer to reference your key using
   * Databricks Secrets, see {@code private_key}. You must provide an API key using one of the
   * following fields: {@code private_key} or {@code private_key_plaintext}.
   */
  @JsonProperty("private_key_plaintext")
  private String privateKeyPlaintext;

  /** This is the Google Cloud project id that the service account is associated with. */
  @JsonProperty("project_id")
  private String projectId;

  /**
   * This is the region for the Google Cloud Vertex AI Service. See <a
   * href="https://cloud.google.com/vertex-ai/docs/general/locations">supported regions</a> for more
   * details. Some models are only available in specific regions.
   */
  @JsonProperty("region")
  private String region;

  public GoogleCloudVertexAiConfig setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  public String getPrivateKey() {
    return privateKey;
  }

  public GoogleCloudVertexAiConfig setPrivateKeyPlaintext(String privateKeyPlaintext) {
    this.privateKeyPlaintext = privateKeyPlaintext;
    return this;
  }

  public String getPrivateKeyPlaintext() {
    return privateKeyPlaintext;
  }

  public GoogleCloudVertexAiConfig setProjectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public GoogleCloudVertexAiConfig setRegion(String region) {
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
    GoogleCloudVertexAiConfig that = (GoogleCloudVertexAiConfig) o;
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
    return new ToStringer(GoogleCloudVertexAiConfig.class)
        .add("privateKey", privateKey)
        .add("privateKeyPlaintext", privateKeyPlaintext)
        .add("projectId", projectId)
        .add("region", region)
        .toString();
  }
}
