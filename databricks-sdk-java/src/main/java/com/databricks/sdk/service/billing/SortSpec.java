// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
@JsonSerialize(using = SortSpec.SortSpecSerializer.class)
@JsonDeserialize(using = SortSpec.SortSpecDeserializer.class)
public class SortSpec {
  /** Whether to sort in descending order. */
  private Boolean descending;

  /** The filed to sort by */
  private SortSpecField field;

  public SortSpec setDescending(Boolean descending) {
    this.descending = descending;
    return this;
  }

  public Boolean getDescending() {
    return descending;
  }

  public SortSpec setField(SortSpecField field) {
    this.field = field;
    return this;
  }

  public SortSpecField getField() {
    return field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SortSpec that = (SortSpec) o;
    return Objects.equals(descending, that.descending) && Objects.equals(field, that.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descending, field);
  }

  @Override
  public String toString() {
    return new ToStringer(SortSpec.class)
        .add("descending", descending)
        .add("field", field)
        .toString();
  }

  SortSpecPb toPb() {
    SortSpecPb pb = new SortSpecPb();
    pb.setDescending(descending);
    pb.setField(field);

    return pb;
  }

  static SortSpec fromPb(SortSpecPb pb) {
    SortSpec model = new SortSpec();
    model.setDescending(pb.getDescending());
    model.setField(pb.getField());

    return model;
  }

  public static class SortSpecSerializer extends JsonSerializer<SortSpec> {
    @Override
    public void serialize(SortSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SortSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SortSpecDeserializer extends JsonDeserializer<SortSpec> {
    @Override
    public SortSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SortSpecPb pb = mapper.readValue(p, SortSpecPb.class);
      return SortSpec.fromPb(pb);
    }
  }
}
