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
@JsonSerialize(using = CleanRoomAssetTable.CleanRoomAssetTableSerializer.class)
@JsonDeserialize(using = CleanRoomAssetTable.CleanRoomAssetTableDeserializer.class)
public class CleanRoomAssetTable {
  /** The metadata information of the columns in the table */
  private Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns;

  public CleanRoomAssetTable setColumns(
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
    CleanRoomAssetTable that = (CleanRoomAssetTable) o;
    return Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetTable.class).add("columns", columns).toString();
  }

  CleanRoomAssetTablePb toPb() {
    CleanRoomAssetTablePb pb = new CleanRoomAssetTablePb();
    pb.setColumns(columns);

    return pb;
  }

  static CleanRoomAssetTable fromPb(CleanRoomAssetTablePb pb) {
    CleanRoomAssetTable model = new CleanRoomAssetTable();
    model.setColumns(pb.getColumns());

    return model;
  }

  public static class CleanRoomAssetTableSerializer extends JsonSerializer<CleanRoomAssetTable> {
    @Override
    public void serialize(CleanRoomAssetTable value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetTablePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetTableDeserializer
      extends JsonDeserializer<CleanRoomAssetTable> {
    @Override
    public CleanRoomAssetTable deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetTablePb pb = mapper.readValue(p, CleanRoomAssetTablePb.class);
      return CleanRoomAssetTable.fromPb(pb);
    }
  }
}
