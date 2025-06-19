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
    using =
        CleanRoomAssetForeignTableLocalDetails.CleanRoomAssetForeignTableLocalDetailsSerializer
            .class)
@JsonDeserialize(
    using =
        CleanRoomAssetForeignTableLocalDetails.CleanRoomAssetForeignTableLocalDetailsDeserializer
            .class)
public class CleanRoomAssetForeignTableLocalDetails {
  /**
   * The fully qualified name of the foreign table in its owner's local metastore, in the format of
   * *catalog*.*schema*.*foreign_table_name*
   */
  private String localName;

  public CleanRoomAssetForeignTableLocalDetails setLocalName(String localName) {
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
    CleanRoomAssetForeignTableLocalDetails that = (CleanRoomAssetForeignTableLocalDetails) o;
    return Objects.equals(localName, that.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetForeignTableLocalDetails.class)
        .add("localName", localName)
        .toString();
  }

  CleanRoomAssetForeignTableLocalDetailsPb toPb() {
    CleanRoomAssetForeignTableLocalDetailsPb pb = new CleanRoomAssetForeignTableLocalDetailsPb();
    pb.setLocalName(localName);

    return pb;
  }

  static CleanRoomAssetForeignTableLocalDetails fromPb(
      CleanRoomAssetForeignTableLocalDetailsPb pb) {
    CleanRoomAssetForeignTableLocalDetails model = new CleanRoomAssetForeignTableLocalDetails();
    model.setLocalName(pb.getLocalName());

    return model;
  }

  public static class CleanRoomAssetForeignTableLocalDetailsSerializer
      extends JsonSerializer<CleanRoomAssetForeignTableLocalDetails> {
    @Override
    public void serialize(
        CleanRoomAssetForeignTableLocalDetails value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CleanRoomAssetForeignTableLocalDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetForeignTableLocalDetailsDeserializer
      extends JsonDeserializer<CleanRoomAssetForeignTableLocalDetails> {
    @Override
    public CleanRoomAssetForeignTableLocalDetails deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetForeignTableLocalDetailsPb pb =
          mapper.readValue(p, CleanRoomAssetForeignTableLocalDetailsPb.class);
      return CleanRoomAssetForeignTableLocalDetails.fromPb(pb);
    }
  }
}
