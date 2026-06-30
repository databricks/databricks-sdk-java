// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Parameter {
  /**
   * List of valid parameter values, newline delimited. Only applies for dropdown list parameters.
   */
  @JsonProperty("enumOptions")
  private String enumOptions;

  /**
   * If specified, allows multiple values to be selected for this parameter. Only applies to
   * dropdown list and query-based dropdown list parameters.
   */
  @JsonProperty("multiValuesOptions")
  private MultiValuesOptions multiValuesOptions;

  /** The literal parameter marker that appears between double curly braces in the query text. */
  @JsonProperty("name")
  private String name;

  /**
   * The UUID of the query that provides the parameter values. Only applies for query-based dropdown
   * list parameters.
   */
  @JsonProperty("queryId")
  private String queryId;

  /** The text displayed in a parameter picking widget. */
  @JsonProperty("title")
  private String title;

  /** Parameters can have several different types. */
  @JsonProperty("type")
  private ParameterType typeValue;

  /** The default value for this parameter. */
  @JsonProperty("value")
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
}
