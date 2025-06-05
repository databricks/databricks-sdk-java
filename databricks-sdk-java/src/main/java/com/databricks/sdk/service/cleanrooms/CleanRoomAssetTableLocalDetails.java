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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = CleanRoomAssetTableLocalDetails.CleanRoomAssetTableLocalDetailsSerializer.class)
@JsonDeserialize(
    using = CleanRoomAssetTableLocalDetails.CleanRoomAssetTableLocalDetailsDeserializer.class)
public class CleanRoomAssetTableLocalDetails {
  /**
   * The fully qualified name of the table in its owner's local metastore, in the format of
   * *catalog*.*schema*.*table_name*
   */
  private String localName;

  /** Partition filtering specification for a shared table. */
  private Collection<com.databricks.sdk.service.sharing.Partition> partitions;

  public CleanRoomAssetTableLocalDetails setLocalName(String localName) {
    this.localName = localName;
    return this;
  }

  public String getLocalName() {
    return localName;
  }

  public CleanRoomAssetTableLocalDetails setPartitions(
      Collection<com.databricks.sdk.service.sharing.Partition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public Collection<com.databricks.sdk.service.sharing.Partition> getPartitions() {
    return partitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetTableLocalDetails that = (CleanRoomAssetTableLocalDetails) o;
    return Objects.equals(localName, that.localName) && Objects.equals(partitions, that.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localName, partitions);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetTableLocalDetails.class)
        .add("localName", localName)
        .add("partitions", partitions)
        .toString();
  }

  CleanRoomAssetTableLocalDetailsPb toPb() {
    CleanRoomAssetTableLocalDetailsPb pb = new CleanRoomAssetTableLocalDetailsPb();
    pb.setLocalName(localName);
    pb.setPartitions(partitions);

    return pb;
  }

  static CleanRoomAssetTableLocalDetails fromPb(CleanRoomAssetTableLocalDetailsPb pb) {
    CleanRoomAssetTableLocalDetails model = new CleanRoomAssetTableLocalDetails();
    model.setLocalName(pb.getLocalName());
    model.setPartitions(pb.getPartitions());

    return model;
  }

  public static class CleanRoomAssetTableLocalDetailsSerializer
      extends JsonSerializer<CleanRoomAssetTableLocalDetails> {
    @Override
    public void serialize(
        CleanRoomAssetTableLocalDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetTableLocalDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetTableLocalDetailsDeserializer
      extends JsonDeserializer<CleanRoomAssetTableLocalDetails> {
    @Override
    public CleanRoomAssetTableLocalDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetTableLocalDetailsPb pb =
          mapper.readValue(p, CleanRoomAssetTableLocalDetailsPb.class);
      return CleanRoomAssetTableLocalDetails.fromPb(pb);
    }
  }
}
