// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A storage location in Amazon S3 */
@Generated
class S3StorageInfoPb {
  @JsonProperty("canned_acl")
  private String cannedAcl;

  @JsonProperty("destination")
  private String destination;

  @JsonProperty("enable_encryption")
  private Boolean enableEncryption;

  @JsonProperty("encryption_type")
  private String encryptionType;

  @JsonProperty("endpoint")
  private String endpoint;

  @JsonProperty("kms_key")
  private String kmsKey;

  @JsonProperty("region")
  private String region;

  public S3StorageInfoPb setCannedAcl(String cannedAcl) {
    this.cannedAcl = cannedAcl;
    return this;
  }

  public String getCannedAcl() {
    return cannedAcl;
  }

  public S3StorageInfoPb setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public S3StorageInfoPb setEnableEncryption(Boolean enableEncryption) {
    this.enableEncryption = enableEncryption;
    return this;
  }

  public Boolean getEnableEncryption() {
    return enableEncryption;
  }

  public S3StorageInfoPb setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  public String getEncryptionType() {
    return encryptionType;
  }

  public S3StorageInfoPb setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public S3StorageInfoPb setKmsKey(String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  public String getKmsKey() {
    return kmsKey;
  }

  public S3StorageInfoPb setRegion(String region) {
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
    S3StorageInfoPb that = (S3StorageInfoPb) o;
    return Objects.equals(cannedAcl, that.cannedAcl)
        && Objects.equals(destination, that.destination)
        && Objects.equals(enableEncryption, that.enableEncryption)
        && Objects.equals(encryptionType, that.encryptionType)
        && Objects.equals(endpoint, that.endpoint)
        && Objects.equals(kmsKey, that.kmsKey)
        && Objects.equals(region, that.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cannedAcl, destination, enableEncryption, encryptionType, endpoint, kmsKey, region);
  }

  @Override
  public String toString() {
    return new ToStringer(S3StorageInfoPb.class)
        .add("cannedAcl", cannedAcl)
        .add("destination", destination)
        .add("enableEncryption", enableEncryption)
        .add("encryptionType", encryptionType)
        .add("endpoint", endpoint)
        .add("kmsKey", kmsKey)
        .add("region", region)
        .toString();
  }
}
