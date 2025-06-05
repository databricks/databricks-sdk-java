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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = EnumValue.EnumValueSerializer.class)
@JsonDeserialize(using = EnumValue.EnumValueDeserializer.class)
public class EnumValue {
  /** List of valid query parameter values, newline delimited. */
  private String enumOptions;

  /** If specified, allows multiple values to be selected for this parameter. */
  private MultiValuesOptions multiValuesOptions;

  /** List of selected query parameter values. */
  private Collection<String> values;

  public EnumValue setEnumOptions(String enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public String getEnumOptions() {
    return enumOptions;
  }

  public EnumValue setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public EnumValue setValues(Collection<String> values) {
    this.values = values;
    return this;
  }

  public Collection<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnumValue that = (EnumValue) o;
    return Objects.equals(enumOptions, that.enumOptions)
        && Objects.equals(multiValuesOptions, that.multiValuesOptions)
        && Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumOptions, multiValuesOptions, values);
  }

  @Override
  public String toString() {
    return new ToStringer(EnumValue.class)
        .add("enumOptions", enumOptions)
        .add("multiValuesOptions", multiValuesOptions)
        .add("values", values)
        .toString();
  }

  EnumValuePb toPb() {
    EnumValuePb pb = new EnumValuePb();
    pb.setEnumOptions(enumOptions);
    pb.setMultiValuesOptions(multiValuesOptions);
    pb.setValues(values);

    return pb;
  }

  static EnumValue fromPb(EnumValuePb pb) {
    EnumValue model = new EnumValue();
    model.setEnumOptions(pb.getEnumOptions());
    model.setMultiValuesOptions(pb.getMultiValuesOptions());
    model.setValues(pb.getValues());

    return model;
  }

  public static class EnumValueSerializer extends JsonSerializer<EnumValue> {
    @Override
    public void serialize(EnumValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnumValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnumValueDeserializer extends JsonDeserializer<EnumValue> {
    @Override
    public EnumValue deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnumValuePb pb = mapper.readValue(p, EnumValuePb.class);
      return EnumValue.fromPb(pb);
    }
  }
}
