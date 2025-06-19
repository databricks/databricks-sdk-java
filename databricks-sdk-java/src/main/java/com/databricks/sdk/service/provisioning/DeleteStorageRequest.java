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

/** Delete storage configuration */
@Generated
@JsonSerialize(using = DeleteStorageRequest.DeleteStorageRequestSerializer.class)
@JsonDeserialize(using = DeleteStorageRequest.DeleteStorageRequestDeserializer.class)
public class DeleteStorageRequest {
  /** Databricks Account API storage configuration ID. */
  private String storageConfigurationId;

  public DeleteStorageRequest setStorageConfigurationId(String storageConfigurationId) {
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
    DeleteStorageRequest that = (DeleteStorageRequest) o;
    return Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteStorageRequest.class)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }

  DeleteStorageRequestPb toPb() {
    DeleteStorageRequestPb pb = new DeleteStorageRequestPb();
    pb.setStorageConfigurationId(storageConfigurationId);

    return pb;
  }

  static DeleteStorageRequest fromPb(DeleteStorageRequestPb pb) {
    DeleteStorageRequest model = new DeleteStorageRequest();
    model.setStorageConfigurationId(pb.getStorageConfigurationId());

    return model;
  }

  public static class DeleteStorageRequestSerializer extends JsonSerializer<DeleteStorageRequest> {
    @Override
    public void serialize(
        DeleteStorageRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteStorageRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteStorageRequestDeserializer
      extends JsonDeserializer<DeleteStorageRequest> {
    @Override
    public DeleteStorageRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteStorageRequestPb pb = mapper.readValue(p, DeleteStorageRequestPb.class);
      return DeleteStorageRequest.fromPb(pb);
    }
  }
}
