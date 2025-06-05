// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ParameterPb {
  @JsonProperty("enumOptions")
  private String enumOptions;

  @JsonProperty("multiValuesOptions")
  private MultiValuesOptions multiValuesOptions;

  @JsonProperty("name")
  private String name;

  @JsonProperty("queryId")
  private String queryId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("type")
  private ParameterType typeValue;

  @JsonProperty("value")
  private Object value;

  public ParameterPb setEnumOptions(String enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public String getEnumOptions() {
    return enumOptions;
  }

  public ParameterPb setMultiValuesOptions(MultiValuesOptions multiValuesOptions) {
    this.multiValuesOptions = multiValuesOptions;
    return this;
  }

  public MultiValuesOptions getMultiValuesOptions() {
    return multiValuesOptions;
  }

  public ParameterPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ParameterPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public ParameterPb setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public ParameterPb setType(ParameterType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public ParameterType getType() {
    return typeValue;
  }

  public ParameterPb setValue(Object value) {
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
    ParameterPb that = (ParameterPb) o;
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
    return new ToStringer(ParameterPb.class)
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
