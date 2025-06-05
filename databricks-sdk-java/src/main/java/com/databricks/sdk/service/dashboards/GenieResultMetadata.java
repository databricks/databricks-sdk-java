// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = GenieResultMetadata.GenieResultMetadataSerializer.class)
@JsonDeserialize(using = GenieResultMetadata.GenieResultMetadataDeserializer.class)
public class GenieResultMetadata {
  /** Indicates whether the result set is truncated. */
  private Boolean isTruncated;

  /** The number of rows in the result set. */
  private Long rowCount;

  public GenieResultMetadata setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public GenieResultMetadata setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieResultMetadata that = (GenieResultMetadata) o;
    return Objects.equals(isTruncated, that.isTruncated) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTruncated, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieResultMetadata.class)
        .add("isTruncated", isTruncated)
        .add("rowCount", rowCount)
        .toString();
  }

  GenieResultMetadataPb toPb() {
    GenieResultMetadataPb pb = new GenieResultMetadataPb();
    pb.setIsTruncated(isTruncated);
    pb.setRowCount(rowCount);

    return pb;
  }

  static GenieResultMetadata fromPb(GenieResultMetadataPb pb) {
    GenieResultMetadata model = new GenieResultMetadata();
    model.setIsTruncated(pb.getIsTruncated());
    model.setRowCount(pb.getRowCount());

    return model;
  }

  public static class GenieResultMetadataSerializer extends JsonSerializer<GenieResultMetadata> {
    @Override
    public void serialize(GenieResultMetadata value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GenieResultMetadataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenieResultMetadataDeserializer
      extends JsonDeserializer<GenieResultMetadata> {
    @Override
    public GenieResultMetadata deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenieResultMetadataPb pb = mapper.readValue(p, GenieResultMetadataPb.class);
      return GenieResultMetadata.fromPb(pb);
    }
  }
}
