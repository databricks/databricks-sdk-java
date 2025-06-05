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
@JsonSerialize(using = Value.ValueSerializer.class)
@JsonDeserialize(using = Value.ValueDeserializer.class)
public class Value {
  /** */
  private Boolean boolValue;

  /** */
  private ListValue listValue;

  /** */
  private Double numberValue;

  /** */
  private String stringValue;

  /** */
  private Struct structValue;

  public Value setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  public Boolean getBoolValue() {
    return boolValue;
  }

  public Value setListValue(ListValue listValue) {
    this.listValue = listValue;
    return this;
  }

  public ListValue getListValue() {
    return listValue;
  }

  public Value setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  public Double getNumberValue() {
    return numberValue;
  }

  public Value setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }

  public Value setStructValue(Struct structValue) {
    this.structValue = structValue;
    return this;
  }

  public Struct getStructValue() {
    return structValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Value that = (Value) o;
    return Objects.equals(boolValue, that.boolValue)
        && Objects.equals(listValue, that.listValue)
        && Objects.equals(numberValue, that.numberValue)
        && Objects.equals(stringValue, that.stringValue)
        && Objects.equals(structValue, that.structValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolValue, listValue, numberValue, stringValue, structValue);
  }

  @Override
  public String toString() {
    return new ToStringer(Value.class)
        .add("boolValue", boolValue)
        .add("listValue", listValue)
        .add("numberValue", numberValue)
        .add("stringValue", stringValue)
        .add("structValue", structValue)
        .toString();
  }

  ValuePb toPb() {
    ValuePb pb = new ValuePb();
    pb.setBoolValue(boolValue);
    pb.setListValue(listValue);
    pb.setNumberValue(numberValue);
    pb.setStringValue(stringValue);
    pb.setStructValue(structValue);

    return pb;
  }

  static Value fromPb(ValuePb pb) {
    Value model = new Value();
    model.setBoolValue(pb.getBoolValue());
    model.setListValue(pb.getListValue());
    model.setNumberValue(pb.getNumberValue());
    model.setStringValue(pb.getStringValue());
    model.setStructValue(pb.getStructValue());

    return model;
  }

  public static class ValueSerializer extends JsonSerializer<Value> {
    @Override
    public void serialize(Value value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValueDeserializer extends JsonDeserializer<Value> {
    @Override
    public Value deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValuePb pb = mapper.readValue(p, ValuePb.class);
      return Value.fromPb(pb);
    }
  }
}
