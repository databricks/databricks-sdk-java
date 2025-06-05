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

/** Get an asset */
@Generated
@JsonSerialize(using = GetCleanRoomAssetRequest.GetCleanRoomAssetRequestSerializer.class)
@JsonDeserialize(using = GetCleanRoomAssetRequest.GetCleanRoomAssetRequestDeserializer.class)
public class GetCleanRoomAssetRequest {
  /** The type of the asset. */
  private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  private String cleanRoomName;

  /** The fully qualified name of the asset, it is same as the name field in CleanRoomAsset. */
  private String name;

  public GetCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public GetCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public GetCleanRoomAssetRequest setName(String name) {
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
    GetCleanRoomAssetRequest that = (GetCleanRoomAssetRequest) o;
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
    return new ToStringer(GetCleanRoomAssetRequest.class)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }

  GetCleanRoomAssetRequestPb toPb() {
    GetCleanRoomAssetRequestPb pb = new GetCleanRoomAssetRequestPb();
    pb.setAssetType(assetType);
    pb.setCleanRoomName(cleanRoomName);
    pb.setName(name);

    return pb;
  }

  static GetCleanRoomAssetRequest fromPb(GetCleanRoomAssetRequestPb pb) {
    GetCleanRoomAssetRequest model = new GetCleanRoomAssetRequest();
    model.setAssetType(pb.getAssetType());
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setName(pb.getName());

    return model;
  }

  public static class GetCleanRoomAssetRequestSerializer
      extends JsonSerializer<GetCleanRoomAssetRequest> {
    @Override
    public void serialize(
        GetCleanRoomAssetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCleanRoomAssetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCleanRoomAssetRequestDeserializer
      extends JsonDeserializer<GetCleanRoomAssetRequest> {
    @Override
    public GetCleanRoomAssetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCleanRoomAssetRequestPb pb = mapper.readValue(p, GetCleanRoomAssetRequestPb.class);
      return GetCleanRoomAssetRequest.fromPb(pb);
    }
  }
}
