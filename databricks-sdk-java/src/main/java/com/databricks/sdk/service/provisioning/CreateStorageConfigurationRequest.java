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
@JsonSerialize(
    using = CreateStorageConfigurationRequest.CreateStorageConfigurationRequestSerializer.class)
@JsonDeserialize(
    using = CreateStorageConfigurationRequest.CreateStorageConfigurationRequestDeserializer.class)
public class CreateStorageConfigurationRequest {
  /** Root S3 bucket information. */
  private RootBucketInfo rootBucketInfo;

  /** The human-readable name of the storage configuration. */
  private String storageConfigurationName;

  public CreateStorageConfigurationRequest setRootBucketInfo(RootBucketInfo rootBucketInfo) {
    this.rootBucketInfo = rootBucketInfo;
    return this;
  }

  public RootBucketInfo getRootBucketInfo() {
    return rootBucketInfo;
  }

  public CreateStorageConfigurationRequest setStorageConfigurationName(
      String storageConfigurationName) {
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
    CreateStorageConfigurationRequest that = (CreateStorageConfigurationRequest) o;
    return Objects.equals(rootBucketInfo, that.rootBucketInfo)
        && Objects.equals(storageConfigurationName, that.storageConfigurationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootBucketInfo, storageConfigurationName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateStorageConfigurationRequest.class)
        .add("rootBucketInfo", rootBucketInfo)
        .add("storageConfigurationName", storageConfigurationName)
        .toString();
  }

  CreateStorageConfigurationRequestPb toPb() {
    CreateStorageConfigurationRequestPb pb = new CreateStorageConfigurationRequestPb();
    pb.setRootBucketInfo(rootBucketInfo);
    pb.setStorageConfigurationName(storageConfigurationName);

    return pb;
  }

  static CreateStorageConfigurationRequest fromPb(CreateStorageConfigurationRequestPb pb) {
    CreateStorageConfigurationRequest model = new CreateStorageConfigurationRequest();
    model.setRootBucketInfo(pb.getRootBucketInfo());
    model.setStorageConfigurationName(pb.getStorageConfigurationName());

    return model;
  }

  public static class CreateStorageConfigurationRequestSerializer
      extends JsonSerializer<CreateStorageConfigurationRequest> {
    @Override
    public void serialize(
        CreateStorageConfigurationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateStorageConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateStorageConfigurationRequestDeserializer
      extends JsonDeserializer<CreateStorageConfigurationRequest> {
    @Override
    public CreateStorageConfigurationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateStorageConfigurationRequestPb pb =
          mapper.readValue(p, CreateStorageConfigurationRequestPb.class);
      return CreateStorageConfigurationRequest.fromPb(pb);
    }
  }
}
