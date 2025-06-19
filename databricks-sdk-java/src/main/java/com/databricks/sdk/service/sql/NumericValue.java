// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = NumericValue.NumericValueSerializer.class)
@JsonDeserialize(using = NumericValue.NumericValueDeserializer.class)
public class NumericValue {
  /** */
  private Double value;

  public NumericValue setValue(Double value) {
    this.value = value;
    return this;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NumericValue that = (NumericValue) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(NumericValue.class).add("value", value).toString();
  }

  NumericValuePb toPb() {
    NumericValuePb pb = new NumericValuePb();
    pb.setValue(value);

    return pb;
  }

  static NumericValue fromPb(NumericValuePb pb) {
    NumericValue model = new NumericValue();
    model.setValue(pb.getValue());

    return model;
  }

  public static class NumericValueSerializer extends JsonSerializer<NumericValue> {
    @Override
    public void serialize(NumericValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NumericValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NumericValueDeserializer extends JsonDeserializer<NumericValue> {
    @Override
    public NumericValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NumericValuePb pb = mapper.readValue(p, NumericValuePb.class);
      return NumericValue.fromPb(pb);
    }
  }
}
