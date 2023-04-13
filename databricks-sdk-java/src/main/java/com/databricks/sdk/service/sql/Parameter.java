// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Parameter {
  /** The literal parameter marker that appears between double curly braces in the query text. */
  @JsonProperty("name")
  private String name;

  /** The text displayed in a parameter picking widget. */
  @JsonProperty("title")
  private String title;

  /** Parameters can have several different types. */
  @JsonProperty("type")
  private ParameterType typeValue;

  /** The default value for this parameter. */
  @JsonProperty("value")
  private Object /* MISSING TYPE */ value;

  public Parameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
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

  public Parameter setValue(Object /* MISSING TYPE */ value) {
    this.value = value;
    return this;
  }

  public Object /* MISSING TYPE */ getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Parameter that = (Parameter) o;
    return Objects.equals(name, that.name)
        && Objects.equals(title, that.title)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, typeValue, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Parameter.class)
        .add("name", name)
        .add("title", title)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }
}
