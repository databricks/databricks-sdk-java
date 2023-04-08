// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
