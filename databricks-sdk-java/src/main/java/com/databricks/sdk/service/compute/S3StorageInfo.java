// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class S3StorageInfo {
  /**
   * (Optional) Set canned access control list for the logs, e.g. `bucket-owner-full-control`. If
   * `canned_cal` is set, please make sure the cluster iam role has `s3:PutObjectAcl` permission on
   * the destination bucket and prefix. The full list of possible canned acl can be found at
   * http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl. Please also note
   * that by default only the object owner gets full controls. If you are using cross account role
   * for writing data, you may want to set `bucket-owner-full-control` to make bucket owner able to
   * read the logs.
   */
  @JsonProperty("canned_acl")
  private String cannedAcl;

  /**
   * S3 destination, e.g. `s3://my-bucket/some-prefix` Note that logs will be delivered using
   * cluster iam role, please make sure you set cluster iam role and the role has write access to
   * the destination. Please also note that you cannot use AWS keys to deliver logs.
   */
  @JsonProperty("destination")
  private String destination;

  /** (Optional) Flag to enable server side encryption, `false` by default. */
  @JsonProperty("enable_encryption")
  private Boolean enableEncryption;

  /**
   * (Optional) The encryption type, it could be `sse-s3` or `sse-kms`. It will be used only when
   * encryption is enabled and the default type is `sse-s3`.
   */
  @JsonProperty("encryption_type")
  private String encryptionType;

  /**
   * S3 endpoint, e.g. `https://s3-us-west-2.amazonaws.com`. Either region or endpoint needs to be
   * set. If both are set, endpoint will be used.
   */
  @JsonProperty("endpoint")
  private String endpoint;

  /**
   * (Optional) Kms key which will be used if encryption is enabled and encryption type is set to
   * `sse-kms`.
   */
  @JsonProperty("kms_key")
  private String kmsKey;

  /**
   * S3 region, e.g. `us-west-2`. Either region or endpoint needs to be set. If both are set,
   * endpoint will be used.
   */
  @JsonProperty("region")
  private String region;

  public S3StorageInfo setCannedAcl(String cannedAcl) {
    this.cannedAcl = cannedAcl;
    return this;
  }

  public String getCannedAcl() {
    return cannedAcl;
  }

  public S3StorageInfo setDestination(String destination) {
    this.destination = destination;
    return this;
  }

  public String getDestination() {
    return destination;
  }

  public S3StorageInfo setEnableEncryption(Boolean enableEncryption) {
    this.enableEncryption = enableEncryption;
    return this;
  }

  public Boolean getEnableEncryption() {
    return enableEncryption;
  }

  public S3StorageInfo setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  public String getEncryptionType() {
    return encryptionType;
  }

  public S3StorageInfo setEndpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public S3StorageInfo setKmsKey(String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  public String getKmsKey() {
    return kmsKey;
  }

  public S3StorageInfo setRegion(String region) {
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
    S3StorageInfo that = (S3StorageInfo) o;
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
    return new ToStringer(S3StorageInfo.class)
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
