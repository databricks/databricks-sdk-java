// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class QueryParameter {
  /**
   * Date-range query parameter value. Can only specify one of `dynamic_date_range_value` or
   * `date_range_value`.
   */
  @JsonProperty("date_range_value")
  private DateRangeValue dateRangeValue;

  /** Date query parameter value. Can only specify one of `dynamic_date_value` or `date_value`. */
  @JsonProperty("date_value")
  private DateValue dateValue;

  /** Dropdown query parameter value. */
  @JsonProperty("enum_value")
  private EnumValue enumValue;

  /** Literal parameter marker that appears between double curly braces in the query text. */
  @JsonProperty("name")
  private String name;

  /** Numeric query parameter value. */
  @JsonProperty("numeric_value")
  private NumericValue numericValue;

  /** Query-based dropdown query parameter value. */
  @JsonProperty("query_backed_value")
  private QueryBackedValue queryBackedValue;

  /** Text query parameter value. */
  @JsonProperty("text_value")
  private TextValue textValue;

  /** Text displayed in the user-facing parameter widget in the UI. */
  @JsonProperty("title")
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
}
