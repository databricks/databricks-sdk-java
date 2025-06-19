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

/** Create an asset */
@Generated
@JsonSerialize(using = CreateCleanRoomAssetRequest.CreateCleanRoomAssetRequestSerializer.class)
@JsonDeserialize(using = CreateCleanRoomAssetRequest.CreateCleanRoomAssetRequestDeserializer.class)
public class CreateCleanRoomAssetRequest {
  /** Metadata of the clean room asset */
  private CleanRoomAsset asset;

  /** Name of the clean room. */
  private String cleanRoomName;

  public CreateCleanRoomAssetRequest setAsset(CleanRoomAsset asset) {
    this.asset = asset;
    return this;
  }

  public CleanRoomAsset getAsset() {
    return asset;
  }

  public CreateCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomAssetRequest that = (CreateCleanRoomAssetRequest) o;
    return Objects.equals(asset, that.asset) && Objects.equals(cleanRoomName, that.cleanRoomName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, cleanRoomName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomAssetRequest.class)
        .add("asset", asset)
        .add("cleanRoomName", cleanRoomName)
        .toString();
  }

  CreateCleanRoomAssetRequestPb toPb() {
    CreateCleanRoomAssetRequestPb pb = new CreateCleanRoomAssetRequestPb();
    pb.setAsset(asset);
    pb.setCleanRoomName(cleanRoomName);

    return pb;
  }

  static CreateCleanRoomAssetRequest fromPb(CreateCleanRoomAssetRequestPb pb) {
    CreateCleanRoomAssetRequest model = new CreateCleanRoomAssetRequest();
    model.setAsset(pb.getAsset());
    model.setCleanRoomName(pb.getCleanRoomName());

    return model;
  }

  public static class CreateCleanRoomAssetRequestSerializer
      extends JsonSerializer<CreateCleanRoomAssetRequest> {
    @Override
    public void serialize(
        CreateCleanRoomAssetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCleanRoomAssetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCleanRoomAssetRequestDeserializer
      extends JsonDeserializer<CreateCleanRoomAssetRequest> {
    @Override
    public CreateCleanRoomAssetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCleanRoomAssetRequestPb pb = mapper.readValue(p, CreateCleanRoomAssetRequestPb.class);
      return CreateCleanRoomAssetRequest.fromPb(pb);
    }
  }
}
