// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = ColumnInfo.ColumnInfoSerializer.class)
@JsonDeserialize(using = ColumnInfo.ColumnInfoDeserializer.class)
public class ColumnInfo {
  /** Name of the column. */
  private String name;

  public ColumnInfo setName(String name) {
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
    ColumnInfo that = (ColumnInfo) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(ColumnInfo.class).add("name", name).toString();
  }

  ColumnInfoPb toPb() {
    ColumnInfoPb pb = new ColumnInfoPb();
    pb.setName(name);

    return pb;
  }

  static ColumnInfo fromPb(ColumnInfoPb pb) {
    ColumnInfo model = new ColumnInfo();
    model.setName(pb.getName());

    return model;
  }

  public static class ColumnInfoSerializer extends JsonSerializer<ColumnInfo> {
    @Override
    public void serialize(ColumnInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ColumnInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ColumnInfoDeserializer extends JsonDeserializer<ColumnInfo> {
    @Override
    public ColumnInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ColumnInfoPb pb = mapper.readValue(p, ColumnInfoPb.class);
      return ColumnInfo.fromPb(pb);
    }
  }
}
