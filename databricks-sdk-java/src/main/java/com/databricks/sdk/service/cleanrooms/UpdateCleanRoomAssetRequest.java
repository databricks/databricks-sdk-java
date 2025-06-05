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

/** Update an asset */
@Generated
@JsonSerialize(using = UpdateCleanRoomAssetRequest.UpdateCleanRoomAssetRequestSerializer.class)
@JsonDeserialize(using = UpdateCleanRoomAssetRequest.UpdateCleanRoomAssetRequestDeserializer.class)
public class UpdateCleanRoomAssetRequest {
  /** Metadata of the clean room asset */
  private CleanRoomAsset asset;

  /** The type of the asset. */
  private CleanRoomAssetAssetType assetType;

  /** Name of the clean room. */
  private String cleanRoomName;

  /**
   * A fully qualified name that uniquely identifies the asset within the clean room. This is also
   * the name displayed in the clean room UI.
   *
   * <p>For UC securable assets (tables, volumes, etc.), the format is
   * *shared_catalog*.*shared_schema*.*asset_name*
   *
   * <p>For notebooks, the name is the notebook file name.
   */
  private String name;

  public UpdateCleanRoomAssetRequest setAsset(CleanRoomAsset asset) {
    this.asset = asset;
    return this;
  }

  public CleanRoomAsset getAsset() {
    return asset;
  }

  public UpdateCleanRoomAssetRequest setAssetType(CleanRoomAssetAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public CleanRoomAssetAssetType getAssetType() {
    return assetType;
  }

  public UpdateCleanRoomAssetRequest setCleanRoomName(String cleanRoomName) {
    this.cleanRoomName = cleanRoomName;
    return this;
  }

  public String getCleanRoomName() {
    return cleanRoomName;
  }

  public UpdateCleanRoomAssetRequest setName(String name) {
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
    UpdateCleanRoomAssetRequest that = (UpdateCleanRoomAssetRequest) o;
    return Objects.equals(asset, that.asset)
        && Objects.equals(assetType, that.assetType)
        && Objects.equals(cleanRoomName, that.cleanRoomName)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, assetType, cleanRoomName, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCleanRoomAssetRequest.class)
        .add("asset", asset)
        .add("assetType", assetType)
        .add("cleanRoomName", cleanRoomName)
        .add("name", name)
        .toString();
  }

  UpdateCleanRoomAssetRequestPb toPb() {
    UpdateCleanRoomAssetRequestPb pb = new UpdateCleanRoomAssetRequestPb();
    pb.setAsset(asset);
    pb.setAssetType(assetType);
    pb.setCleanRoomName(cleanRoomName);
    pb.setName(name);

    return pb;
  }

  static UpdateCleanRoomAssetRequest fromPb(UpdateCleanRoomAssetRequestPb pb) {
    UpdateCleanRoomAssetRequest model = new UpdateCleanRoomAssetRequest();
    model.setAsset(pb.getAsset());
    model.setAssetType(pb.getAssetType());
    model.setCleanRoomName(pb.getCleanRoomName());
    model.setName(pb.getName());

    return model;
  }

  public static class UpdateCleanRoomAssetRequestSerializer
      extends JsonSerializer<UpdateCleanRoomAssetRequest> {
    @Override
    public void serialize(
        UpdateCleanRoomAssetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCleanRoomAssetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCleanRoomAssetRequestDeserializer
      extends JsonDeserializer<UpdateCleanRoomAssetRequest> {
    @Override
    public UpdateCleanRoomAssetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCleanRoomAssetRequestPb pb = mapper.readValue(p, UpdateCleanRoomAssetRequestPb.class);
      return UpdateCleanRoomAssetRequest.fromPb(pb);
    }
  }
}
