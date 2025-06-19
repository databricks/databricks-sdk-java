// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/** Delete an asset */
@Generated
@JsonSerialize(using = DeleteCleanRoomAssetRequest.DeleteCleanRoomAssetRequestSerializer.class)
@JsonDeserialize(using = DeleteCleanRoomAssetRequest.DeleteCleanRoomAssetRequestDeserializer.class)
public class DeleteCleanRoomAssetRequest {
  /** The type of the asset. */
  private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  private String cleanRoomName;

  /** The fully qualified name of the asset, it is same as the name field in CleanRoomAsset. */
  private String name;

  public DeleteCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public DeleteCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public DeleteCleanRoomAssetRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCleanRoomAssetRequest that = (DeleteCleanRoomAssetRequest) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, cleanRoomName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCleanRoomAssetRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }

  DeleteCleanRoomAssetRequestPb toPb() {
    DeleteCleanRoomAssetRequestPb pb = new DeleteCleanRoomAssetRequestPb();
    pb.setAssetType(assetType);
    pb.setCleanRoomName(cleanRoomName);
    pb.setName(name);

    return pb;
  }

  static DeleteCleanRoomAssetRequest fromPb(DeleteCleanRoomAssetRequestPb pb) {
    DeleteCleanRoomAssetRequest model = new DeleteCleanRoomAssetRequest();
    model.setAssetType(pb.getAssetType());
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteCleanRoomAssetRequestSerializer
      extends JsonSerializer<DeleteCleanRoomAssetRequest> {
    @Override
    public void serialize(
        DeleteCleanRoomAssetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCleanRoomAssetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCleanRoomAssetRequestDeserializer
      extends JsonDeserializer<DeleteCleanRoomAssetRequest> {
    @Override
    public DeleteCleanRoomAssetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCleanRoomAssetRequestPb pb = mapper.readValue(p, DeleteCleanRoomAssetRequestPb.class);
      return DeleteCleanRoomAssetRequest.fromPb(pb);
    }
  }
}
