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
@JsonSerialize(using = CleanRoomAssetView.CleanRoomAssetViewSerializer.class)
@JsonDeserialize(using = CleanRoomAssetView.CleanRoomAssetViewDeserializer.class)
public class CleanRoomAssetView {
  /** The metadata information of the columns in the view */
  private Collection<com.databricks.sdk.service.catalog.ColumnInfo> columns;

  public CleanRoomAssetView setColumns(
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
    CleanRoomAssetView that = (CleanRoomAssetView) o;
    return Objects.equals(columns, that.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetView.class).add("columns", columns).toString();
  }

  CleanRoomAssetViewPb toPb() {
    CleanRoomAssetViewPb pb = new CleanRoomAssetViewPb();
    pb.setColumns(columns);

    return pb;
  }

  static CleanRoomAssetView fromPb(CleanRoomAssetViewPb pb) {
    CleanRoomAssetView model = new CleanRoomAssetView();
    model.setColumns(pb.getColumns());

    return model;
  }

  public static class CleanRoomAssetViewSerializer extends JsonSerializer<CleanRoomAssetView> {
    @Override
    public void serialize(CleanRoomAssetView value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetViewPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetViewDeserializer extends JsonDeserializer<CleanRoomAssetView> {
    @Override
    public CleanRoomAssetView deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetViewPb pb = mapper.readValue(p, CleanRoomAssetViewPb.class);
      return CleanRoomAssetView.fromPb(pb);
    }
  }
}
