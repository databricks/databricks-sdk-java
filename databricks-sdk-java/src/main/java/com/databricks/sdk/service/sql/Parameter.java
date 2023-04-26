// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Parameter class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Parameter} object
   */
  public Parameter setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>title</code>.</p>
   *
   * @param title a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.Parameter} object
   */
  public Parameter setTitle(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Getter for the field <code>title</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTitle() {
    return title;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link com.databricks.sdk.service.sql.ParameterType} object
   * @return a {@link com.databricks.sdk.service.sql.Parameter} object
   */
  public Parameter setType(ParameterType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ParameterType} object
   */
  public ParameterType getType() {
    return typeValue;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sql.Parameter} object
   */
  public Parameter setValue(Object /* MISSING TYPE */ value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getValue() {
    return value;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, title, typeValue, value);
  }

  /** {@inheritDoc} */
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
