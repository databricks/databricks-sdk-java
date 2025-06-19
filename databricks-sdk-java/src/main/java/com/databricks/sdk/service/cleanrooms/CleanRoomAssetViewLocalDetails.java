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
    using = CleanRoomAssetViewLocalDetails.CleanRoomAssetViewLocalDetailsSerializer.class)
@JsonDeserialize(
    using = CleanRoomAssetViewLocalDetails.CleanRoomAssetViewLocalDetailsDeserializer.class)
public class CleanRoomAssetViewLocalDetails {
  /**
   * The fully qualified name of the view in its owner's local metastore, in the format of
   * *catalog*.*schema*.*view_name*
   */
  private String localName;

  public CleanRoomAssetViewLocalDetails setLocalName(String localName) {
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
    CleanRoomAssetViewLocalDetails that = (CleanRoomAssetViewLocalDetails) o;
    return Objects.equals(localName, that.localName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetViewLocalDetails.class)
        .add("localName", localName)
        .toString();
  }

  CleanRoomAssetViewLocalDetailsPb toPb() {
    CleanRoomAssetViewLocalDetailsPb pb = new CleanRoomAssetViewLocalDetailsPb();
    pb.setLocalName(localName);

    return pb;
  }

  static CleanRoomAssetViewLocalDetails fromPb(CleanRoomAssetViewLocalDetailsPb pb) {
    CleanRoomAssetViewLocalDetails model = new CleanRoomAssetViewLocalDetails();
    model.setLocalName(pb.getLocalName());

    return model;
  }

  public static class CleanRoomAssetViewLocalDetailsSerializer
      extends JsonSerializer<CleanRoomAssetViewLocalDetails> {
    @Override
    public void serialize(
        CleanRoomAssetViewLocalDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetViewLocalDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetViewLocalDetailsDeserializer
      extends JsonDeserializer<CleanRoomAssetViewLocalDetails> {
    @Override
    public CleanRoomAssetViewLocalDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetViewLocalDetailsPb pb =
          mapper.readValue(p, CleanRoomAssetViewLocalDetailsPb.class);
      return CleanRoomAssetViewLocalDetails.fromPb(pb);
    }
  }
}
