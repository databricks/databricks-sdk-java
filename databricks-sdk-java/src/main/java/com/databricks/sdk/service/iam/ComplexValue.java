// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = ComplexValue.ComplexValueSerializer.class)
@JsonDeserialize(using = ComplexValue.ComplexValueDeserializer.class)
public class ComplexValue {
  /** */
  private String display;

  /** */
  private Boolean primary;

  /** */
  private String ref;

  /** */
  private String typeValue;

  /** */
  private String value;

  public ComplexValue setDisplay(String display) {
    this.display = display;
    return this;
  }

  public String getDisplay() {
    return display;
  }

  public ComplexValue setPrimary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  public Boolean getPrimary() {
    return primary;
  }

  public ComplexValue setRef(String ref) {
    this.ref = ref;
    return this;
  }

  public String getRef() {
    return ref;
  }

  public ComplexValue setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public ComplexValue setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplexValue that = (ComplexValue) o;
    return Objects.equals(display, that.display)
        && Objects.equals(primary, that.primary)
        && Objects.equals(ref, that.ref)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, primary, ref, typeValue, value);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplexValue.class)
        .add("display", display)
        .add("primary", primary)
        .add("ref", ref)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }

  ComplexValuePb toPb() {
    ComplexValuePb pb = new ComplexValuePb();
    pb.setDisplay(display);
    pb.setPrimary(primary);
    pb.setRef(ref);
    pb.setType(typeValue);
    pb.setValue(value);

    return pb;
  }

  static ComplexValue fromPb(ComplexValuePb pb) {
    ComplexValue model = new ComplexValue();
    model.setDisplay(pb.getDisplay());
    model.setPrimary(pb.getPrimary());
    model.setRef(pb.getRef());
    model.setType(pb.getType());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ComplexValueSerializer extends JsonSerializer<ComplexValue> {
    @Override
    public void serialize(ComplexValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ComplexValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ComplexValueDeserializer extends JsonDeserializer<ComplexValue> {
    @Override
    public ComplexValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ComplexValuePb pb = mapper.readValue(p, ComplexValuePb.class);
      return ComplexValue.fromPb(pb);
    }
  }
}
