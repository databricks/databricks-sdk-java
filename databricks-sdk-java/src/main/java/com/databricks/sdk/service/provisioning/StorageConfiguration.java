// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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
@JsonSerialize(using = StorageConfiguration.StorageConfigurationSerializer.class)
@JsonDeserialize(using = StorageConfiguration.StorageConfigurationDeserializer.class)
public class StorageConfiguration {
  /** The Databricks account ID that hosts the credential. */
  private String accountId;

  /** Time in epoch milliseconds when the storage configuration was created. */
  private Long creationTime;

  /** Root S3 bucket information. */
  private RootBucketInfo rootBucketInfo;

  /** Databricks storage configuration ID. */
  private String storageConfigurationId;

  /** The human-readable name of the storage configuration. */
  private String storageConfigurationName;

  public StorageConfiguration setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public StorageConfiguration setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public Long getCreationTime() {
    return creationTime;
  }

  public StorageConfiguration setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public StorageConfiguration setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  public StorageConfiguration setStorageConfigurationName(String storageConfigurationName) {
    this.storageConfigurationName = storageConfigurationName;
    return this;
  }

  public String getStorageConfigurationName() {
    return storageConfigurationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageConfiguration that = (StorageConfiguration) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationId, that.storageConfigurationId)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, creationTime, rootBucketInfo, storageConfigurationId, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageConfiguration.class)
        .add("accountId", accountId)
        .add("creationTime", creationTime)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationId", storageConfigurationId)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }

  StorageConfigurationPb toPb() {
    StorageConfigurationPb pb = new StorageConfigurationPb();
    pb.setAccountId(accountId);
    pb.setCreationTime(creationTime);
    pb.setRootBucketInfo(rootBucketInfo);
    pb.setStorageConfigurationId(storageConfigurationId);
    pb.setStorageConfigurationName(storageConfigurationName);

    return pb;
  }

  static StorageConfiguration fromPb(StorageConfigurationPb pb) {
    StorageConfiguration model = new StorageConfiguration();
    model.setAccountId(pb.getAccountId());
    model.setCreationTime(pb.getCreationTime());
    model.setRootBucketInfo(pb.getRootBucketInfo());
    model.setStorageConfigurationId(pb.getStorageConfigurationId());
    model.setStorageConfigurationName(pb.getStorageConfigurationName());

    return model;
  }

  public static class StorageConfigurationSerializer extends JsonSerializer<StorageConfiguration> {
    @Override
    public void serialize(
        StorageConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StorageConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StorageConfigurationDeserializer
      extends JsonDeserializer<StorageConfiguration> {
    @Override
    public StorageConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StorageConfigurationPb pb = mapper.readValue(p, StorageConfigurationPb.class);
      return StorageConfiguration.fromPb(pb);
    }
  }
}
