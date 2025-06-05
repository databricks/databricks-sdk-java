// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QueryParameterPb {
  @JsonProperty("date_range_value")
  private DateRangeValue dateRangeValue;

  @JsonProperty("date_value")
  private DateValue dateValue;

  @JsonProperty("enum_value")
  private EnumValue enumValue;

  @JsonProperty("name")
  private String name;

  @JsonProperty("numeric_value")
  private NumericValue numericValue;

  @JsonProperty("query_backed_value")
  private QueryBackedValue queryBackedValue;

  @JsonProperty("text_value")
  private TextValue textValue;

  @JsonProperty("title")
  private String title;

  public QueryParameterPb setDateRangeValue(DateRangeValue dateRangeValue) {
    this.dateRangeValue = dateRangeValue;
    return this;
  }

  public DateRangeValue getDateRangeValue() {
    return dateRangeValue;
  }

  public QueryParameterPb setDateValue(DateValue dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  public DateValue getDateValue() {
    return dateValue;
  }

  public QueryParameterPb setEnumValue(EnumValue enumValue) {
    this.enumValue = enumValue;
    return this;
  }

  public EnumValue getEnumValue() {
    return enumValue;
  }

  public QueryParameterPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryParameterPb setNumericValue(NumericValue numericValue) {
    this.numericValue = numericValue;
    return this;
  }

  public NumericValue getNumericValue() {
    return numericValue;
  }

  public QueryParameterPb setQueryBackedValue(QueryBackedValue queryBackedValue) {
    this.queryBackedValue = queryBackedValue;
    return this;
  }

  public QueryBackedValue getQueryBackedValue() {
    return queryBackedValue;
  }

  public QueryParameterPb setTextValue(TextValue textValue) {
    this.textValue = textValue;
    return this;
  }

  public TextValue getTextValue() {
    return textValue;
  }

  public QueryParameterPb setTitle(String title) {
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
    QueryParameterPb that = (QueryParameterPb) o;
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
    return new ToStringer(QueryParameterPb.class)
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
}
