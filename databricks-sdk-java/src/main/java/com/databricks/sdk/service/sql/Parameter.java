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
@JsonSerialize(using = Parameter.ParameterSerializer.class)
@JsonDeserialize(using = Parameter.ParameterDeserializer.class)
public class Parameter {
  /**
   * List of valid parameter values, newline delimited. Only applies for dropdown list parameters.
   */
  private String enumOptions;

  /**
   * If specified, allows multiple values to be selected for this parameter. Only applies to
   * dropdown list and query-based dropdown list parameters.
   */
  private MultiValuesOptions multiValuesOptions;

  /** The literal parameter marker that appears between double curly braces in the query text. */
  private String name;

  /**
   * The UUID of the query that provides the parameter values. Only applies for query-based dropdown
   * list parameters.
   */
  private String queryId;

  /** The text displayed in a parameter picking widget. */
  private String title;

  /** Parameters can have several different types. */
  private ParameterType typeValue;

  /** The default value for this parameter. */
  private Object value;

  public Parameter setEnumOptions(String enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public String getEnumOptions() {
    return enumOptions;
  }

  public Parameter setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public Parameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Parameter setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public Parameter setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Parameter setType(ParameterType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ParameterType getType() {
    return typeValue;
  }

  public Parameter setValue(Object value) {
    this.value = value;
    return this;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Parameter that = (Parameter) o;
    return Objects.equals(enumOptions, that.enumOptions)
        && Objects.equals(multiValuesOptions, that.multiValuesOptions)
        && Objects.equals(name, that.name)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(title, that.title)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumOptions, multiValuesOptions, name, queryId, title, typeValue, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Parameter.class)
        .add("enumOptions", enumOptions)
        .add("multiValuesOptions", multiValuesOptions)
        .add("name", name)
        .add("queryId", queryId)
        .add("title", title)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }

  ParameterPb toPb() {
    ParameterPb pb = new ParameterPb();
    pb.setEnumOptions(enumOptions);
    pb.setMultiValuesOptions(multiValuesOptions);
    pb.setName(name);
    pb.setQueryId(queryId);
    pb.setTitle(title);
    pb.setType(typeValue);
    pb.setValue(value);

    return pb;
  }

  static Parameter fromPb(ParameterPb pb) {
    Parameter model = new Parameter();
    model.setEnumOptions(pb.getEnumOptions());
    model.setMultiValuesOptions(pb.getMultiValuesOptions());
    model.setName(pb.getName());
    model.setQueryId(pb.getQueryId());
    model.setTitle(pb.getTitle());
    model.setType(pb.getType());
    model.setValue(pb.getValue());

    return model;
  }

  public static class ParameterSerializer extends JsonSerializer<Parameter> {
    @Override
    public void serialize(Parameter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ParameterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ParameterDeserializer extends JsonDeserializer<Parameter> {
    @Override
    public Parameter deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ParameterPb pb = mapper.readValue(p, ParameterPb.class);
      return Parameter.fromPb(pb);
    }
  }
}
