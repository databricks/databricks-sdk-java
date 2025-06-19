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
@JsonSerialize(using = CleanRoomAssetForeignTable.CleanRoomAssetForeignTableSerializer.class)
@JsonDeserialize(using = CleanRoomAssetForeignTable.CleanRoomAssetForeignTableDeserializer.class)
public class CleanRoomAssetForeignTable {
  /** The metadata information of the columns in the foreign table */
  private Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns;

  public CleanRoomAssetForeignTable setColumns(
      Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns) {
    this.columns = columns;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.ColumnInfo> getColumns() {
    return columns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetForeignTable that = (CleanRoomAssetForeignTable) o;
    return Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetForeignTable.class).add("columns", columns).toString();
  }

  CleanRoomAssetForeignTablePb toPb() {
    CleanRoomAssetForeignTablePb pb = new CleanRoomAssetForeignTablePb();
    pb.setColumns(columns);

    return pb;
  }

  static CleanRoomAssetForeignTable fromPb(CleanRoomAssetForeignTablePb pb) {
    CleanRoomAssetForeignTable model = new CleanRoomAssetForeignTable();
    model.setColumns(pb.getColumns());

    return model;
  }

  public static class CleanRoomAssetForeignTableSerializer
      extends JsonSerializer<CleanRoomAssetForeignTable> {
    @Override
    public void serialize(
        CleanRoomAssetForeignTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetForeignTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetForeignTableDeserializer
      extends JsonDeserializer<CleanRoomAssetForeignTable> {
    @Override
    public CleanRoomAssetForeignTable deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetForeignTablePb pb = mapper.readValue(p, CleanRoomAssetForeignTablePb.class);
      return CleanRoomAssetForeignTable.fromPb(pb);
    }
  }
}
