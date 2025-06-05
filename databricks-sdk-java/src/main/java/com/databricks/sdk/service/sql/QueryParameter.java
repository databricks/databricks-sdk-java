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
@JsonSerialize(using = QueryParameter.QueryParameterSerializer.class)
@JsonDeserialize(using = QueryParameter.QueryParameterDeserializer.class)
public class QueryParameter {
  /**
   * Date-range query parameter value. Can only specify one of `dynamic_date_range_value` or
   * `date_range_value`.
   */
  private DateRangeValue dateRangeValue;

  /** Date query parameter value. Can only specify one of `dynamic_date_value` or `date_value`. */
  private DateValue dateValue;

  /** Dropdown query parameter value. */
  private EnumValue enumValue;

  /** Literal parameter marker that appears between double curly braces in the query text. */
  private String name;

  /** Numeric query parameter value. */
  private NumericValue numericValue;

  /** Query-based dropdown query parameter value. */
  private QueryBackedValue queryBackedValue;

  /** Text query parameter value. */
  private TextValue textValue;

  /** Text displayed in the user-facing parameter widget in the UI. */
  private String title;

  public QueryParameter setDateRangeValue(DateRangeValue dateRangeValue) {
    this.dateRangeValue = dateRangeValue;
    return this;
  }

  public DateRangeValue getDateRangeValue() {
    return dateRangeValue;
  }

  public QueryParameter setDateValue(DateValue dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  public DateValue getDateValue() {
    return dateValue;
  }

  public QueryParameter setEnumValue(EnumValue enumValue) {
    this.enumValue = enumValue;
    return this;
  }

  public EnumValue getEnumValue() {
    return enumValue;
  }

  public QueryParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryParameter setNumericValue(NumericValue numericValue) {
    this.numericValue = numericValue;
    return this;
  }

  public NumericValue getNumericValue() {
    return numericValue;
  }

  public QueryParameter setQueryBackedValue(QueryBackedValue queryBackedValue) {
    this.queryBackedValue = queryBackedValue;
    return this;
  }

  public QueryBackedValue getQueryBackedValue() {
    return queryBackedValue;
  }

  public QueryParameter setTextValue(TextValue textValue) {
    this.textValue = textValue;
    return this;
  }

  public TextValue getTextValue() {
    return textValue;
  }

  public QueryParameter setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryParameter that = (QueryParameter) o;
    return Objects.equals(dateRangeValue, that.dateRangeValue)
        && Objects.equals(dateValue, that.dateValue)
        && Objects.equals(enumValue, that.enumValue)
        && Objects.equals(name, that.name)
        && Objects.equals(numericValue, that.numericValue)
        && Objects.equals(queryBackedValue, that.queryBackedValue)
        && Objects.equals(textValue, that.textValue)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dateRangeValue,
        dateValue,
        enumValue,
        name,
        numericValue,
        queryBackedValue,
        textValue,
        title);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryParameter.class)
        .add("dateRangeValue", dateRangeValue)
        .add("dateValue", dateValue)
        .add("enumValue", enumValue)
        .add("name", name)
        .add("numericValue", numericValue)
        .add("queryBackedValue", queryBackedValue)
        .add("textValue", textValue)
        .add("title", title)
        .toString();
  }

  QueryParameterPb toPb() {
    QueryParameterPb pb = new QueryParameterPb();
    pb.setDateRangeValue(dateRangeValue);
    pb.setDateValue(dateValue);
    pb.setEnumValue(enumValue);
    pb.setName(name);
    pb.setNumericValue(numericValue);
    pb.setQueryBackedValue(queryBackedValue);
    pb.setTextValue(textValue);
    pb.setTitle(title);

    return pb;
  }

  static QueryParameter fromPb(QueryParameterPb pb) {
    QueryParameter model = new QueryParameter();
    model.setDateRangeValue(pb.getDateRangeValue());
    model.setDateValue(pb.getDateValue());
    model.setEnumValue(pb.getEnumValue());
    model.setName(pb.getName());
    model.setNumericValue(pb.getNumericValue());
    model.setQueryBackedValue(pb.getQueryBackedValue());
    model.setTextValue(pb.getTextValue());
    model.setTitle(pb.getTitle());

    return model;
  }

  public static class QueryParameterSerializer extends JsonSerializer<QueryParameter> {
    @Override
    public void serialize(QueryParameter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryParameterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryParameterDeserializer extends JsonDeserializer<QueryParameter> {
    @Override
    public QueryParameter deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryParameterPb pb = mapper.readValue(p, QueryParameterPb.class);
      return QueryParameter.fromPb(pb);
    }
  }
}
