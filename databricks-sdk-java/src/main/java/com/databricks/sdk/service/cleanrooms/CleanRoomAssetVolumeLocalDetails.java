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

@Generated
@JsonSerialize(
    using = CleanRoomAssetVolumeLocalDetails.CleanRoomAssetVolumeLocalDetailsSerializer.class)
@JsonDeserialize(
    using = CleanRoomAssetVolumeLocalDetails.CleanRoomAssetVolumeLocalDetailsDeserializer.class)
public class CleanRoomAssetVolumeLocalDetails {
  /**
   * The fully qualified name of the volume in its owner's local metastore, in the format of
   * *catalog*.*schema*.*volume_name*
   */
  private String localName;

  public CleanRoomAssetVolumeLocalDetails setLocalName(String localName) {
    this.localName = localName;
    return this;
  }

  public String getLocalName() {
    return localName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetVolumeLocalDetails that = (CleanRoomAssetVolumeLocalDetails) o;
    return Objects.equals(localName, that.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetVolumeLocalDetails.class)
        .add("localName", localName)
        .toString();
  }

  CleanRoomAssetVolumeLocalDetailsPb toPb() {
    CleanRoomAssetVolumeLocalDetailsPb pb = new CleanRoomAssetVolumeLocalDetailsPb();
    pb.setLocalName(localName);

    return pb;
  }

  static CleanRoomAssetVolumeLocalDetails fromPb(CleanRoomAssetVolumeLocalDetailsPb pb) {
    CleanRoomAssetVolumeLocalDetails model = new CleanRoomAssetVolumeLocalDetails();
    model.setLocalName(pb.getLocalName());

    return model;
  }

  public static class CleanRoomAssetVolumeLocalDetailsSerializer
      extends JsonSerializer<CleanRoomAssetVolumeLocalDetails> {
    @Override
    public void serialize(
        CleanRoomAssetVolumeLocalDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetVolumeLocalDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetVolumeLocalDetailsDeserializer
      extends JsonDeserializer<CleanRoomAssetVolumeLocalDetails> {
    @Override
    public CleanRoomAssetVolumeLocalDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetVolumeLocalDetailsPb pb =
          mapper.readValue(p, CleanRoomAssetVolumeLocalDetailsPb.class);
      return CleanRoomAssetVolumeLocalDetails.fromPb(pb);
    }
  }
}
