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

/** Get storage configuration */
@Generated
@JsonSerialize(using = GetStorageRequest.GetStorageRequestSerializer.class)
@JsonDeserialize(using = GetStorageRequest.GetStorageRequestDeserializer.class)
public class GetStorageRequest {
  /** Databricks Account API storage configuration ID. */
  private String storageConfigurationId;

  public GetStorageRequest setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetStorageRequest that = (GetStorageRequest) o;
    return Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStorageRequest.class)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }

  GetStorageRequestPb toPb() {
    GetStorageRequestPb pb = new GetStorageRequestPb();
    pb.setStorageConfigurationId(storageConfigurationId);

    return pb;
  }

  static GetStorageRequest fromPb(GetStorageRequestPb pb) {
    GetStorageRequest model = new GetStorageRequest();
    model.setStorageConfigurationId(pb.getStorageConfigurationId());

    return model;
  }

  public static class GetStorageRequestSerializer extends JsonSerializer<GetStorageRequest> {
    @Override
    public void serialize(GetStorageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetStorageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetStorageRequestDeserializer extends JsonDeserializer<GetStorageRequest> {
    @Override
    public GetStorageRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetStorageRequestPb pb = mapper.readValue(p, GetStorageRequestPb.class);
      return GetStorageRequest.fromPb(pb);
    }
  }
}
