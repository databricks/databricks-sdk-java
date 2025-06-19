// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** A storage location in Amazon S3 */
@Generated
@JsonSerialize(using = S3StorageInfo.S3StorageInfoSerializer.class)
@JsonDeserialize(using = S3StorageInfo.S3StorageInfoDeserializer.class)
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
  private String cannedAcl;

  /**
   * S3 destination, e.g. `s3://my-bucket/some-prefix` Note that logs will be delivered using
   * cluster iam role, please make sure you set cluster iam role and the role has write access to
   * the destination. Please also note that you cannot use AWS keys to deliver logs.
   */
  private String destination;

  /** (Optional) Flag to enable server side encryption, `false` by default. */
  private Boolean enableEncryption;

  /**
   * (Optional) The encryption type, it could be `sse-s3` or `sse-kms`. It will be used only when
   * encryption is enabled and the default type is `sse-s3`.
   */
  private String encryptionType;

  /**
   * S3 endpoint, e.g. `https://s3-us-west-2.amazonaws.com`. Either region or endpoint needs to be
   * set. If both are set, endpoint will be used.
   */
  private String endpoint;

  /**
   * (Optional) Kms key which will be used if encryption is enabled and encryption type is set to
   * `sse-kms`.
   */
  private String kmsKey;

  /**
   * S3 region, e.g. `us-west-2`. Either region or endpoint needs to be set. If both are set,
   * endpoint will be used.
   */
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

  S3StorageInfoPb toPb() {
    S3StorageInfoPb pb = new S3StorageInfoPb();
    pb.setCannedAcl(cannedAcl);
    pb.setDestination(destination);
    pb.setEnableEncryption(enableEncryption);
    pb.setEncryptionType(encryptionType);
    pb.setEndpoint(endpoint);
    pb.setKmsKey(kmsKey);
    pb.setRegion(region);

    return pb;
  }

  static S3StorageInfo fromPb(S3StorageInfoPb pb) {
    S3StorageInfo model = new S3StorageInfo();
    model.setCannedAcl(pb.getCannedAcl());
    model.setDestination(pb.getDestination());
    model.setEnableEncryption(pb.getEnableEncryption());
    model.setEncryptionType(pb.getEncryptionType());
    model.setEndpoint(pb.getEndpoint());
    model.setKmsKey(pb.getKmsKey());
    model.setRegion(pb.getRegion());

    return model;
  }

  public static class S3StorageInfoSerializer extends JsonSerializer<S3StorageInfo> {
    @Override
    public void serialize(S3StorageInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      S3StorageInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class S3StorageInfoDeserializer extends JsonDeserializer<S3StorageInfo> {
    @Override
    public S3StorageInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      S3StorageInfoPb pb = mapper.readValue(p, S3StorageInfoPb.class);
      return S3StorageInfo.fromPb(pb);
    }
  }
}
