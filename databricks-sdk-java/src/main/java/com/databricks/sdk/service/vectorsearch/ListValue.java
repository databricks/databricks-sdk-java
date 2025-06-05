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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListValue.ListValueSerializer.class)
@JsonDeserialize(using = ListValue.ListValueDeserializer.class)
public class ListValue {
  /** Repeated field of dynamically typed values. */
  private Collection<Value> values;

  public ListValue setValues(Collection<Value> values) {
    this.values = values;
    return this;
  }

  public Collection<Value> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListValue that = (ListValue) o;
    return Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    return new ToStringer(ListValue.class).add("values", values).toString();
  }

  ListValuePb toPb() {
    ListValuePb pb = new ListValuePb();
    pb.setValues(values);

    return pb;
  }

  static ListValue fromPb(ListValuePb pb) {
    ListValue model = new ListValue();
    model.setValues(pb.getValues());

    return model;
  }

  public static class ListValueSerializer extends JsonSerializer<ListValue> {
    @Override
    public void serialize(ListValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListValueDeserializer extends JsonDeserializer<ListValue> {
    @Override
    public ListValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListValuePb pb = mapper.readValue(p, ListValuePb.class);
      return ListValue.fromPb(pb);
    }
  }
}
