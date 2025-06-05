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
@JsonSerialize(using = StatementParameterListItem.StatementParameterListItemSerializer.class)
@JsonDeserialize(using = StatementParameterListItem.StatementParameterListItemDeserializer.class)
public class StatementParameterListItem {
  /** The name of a parameter marker to be substituted in the statement. */
  private String name;

  /**
   * The data type, given as a string. For example: `INT`, `STRING`, `DECIMAL(10,2)`. If no type is
   * given the type is assumed to be `STRING`. Complex types, such as `ARRAY`, `MAP`, and `STRUCT`
   * are not supported. For valid types, refer to the section [Data types] of the SQL language
   * reference.
   *
   * <p>[Data types]: https://docs.databricks.com/sql/language-manual/functions/cast.html
   */
  private String typeValue;

  /**
   * The value to substitute, represented as a string. If omitted, the value is interpreted as NULL.
   */
  private String value;

  public StatementParameterListItem setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public StatementParameterListItem setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public StatementParameterListItem setValue(String value) {
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
    StatementParameterListItem that = (StatementParameterListItem) o;
    return Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeValue, value);
  }

  @Override
  public String toString() {
    return new ToStringer(StatementParameterListItem.class)
        .add("name", name)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }

  StatementParameterListItemPb toPb() {
    StatementParameterListItemPb pb = new StatementParameterListItemPb();
    pb.setName(name);
    pb.setType(typeValue);
    pb.setValue(value);

    return pb;
  }

  static StatementParameterListItem fromPb(StatementParameterListItemPb pb) {
    StatementParameterListItem model = new StatementParameterListItem();
    model.setName(pb.getName());
    model.setType(pb.getType());
    model.setValue(pb.getValue());

    return model;
  }

  public static class StatementParameterListItemSerializer
      extends JsonSerializer<StatementParameterListItem> {
    @Override
    public void serialize(
        StatementParameterListItem value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StatementParameterListItemPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StatementParameterListItemDeserializer
      extends JsonDeserializer<StatementParameterListItem> {
    @Override
    public StatementParameterListItem deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StatementParameterListItemPb pb = mapper.readValue(p, StatementParameterListItemPb.class);
      return StatementParameterListItem.fromPb(pb);
    }
  }
}
