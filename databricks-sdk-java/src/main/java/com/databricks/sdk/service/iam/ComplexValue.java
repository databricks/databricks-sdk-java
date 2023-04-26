// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ComplexValue class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ComplexValue {
  /** */
  @JsonProperty("display")
  private String display;

  /** */
  @JsonProperty("primary")
  private Boolean primary;

  /** */
  @JsonProperty("$ref")
  private String ref;

  /** */
  @JsonProperty("type")
  private String typeValue;

  /** */
  @JsonProperty("value")
  private String value;

  /**
   * <p>Setter for the field <code>display</code>.</p>
   *
   * @param display a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ComplexValue} object
   */
  public ComplexValue setDisplay(String display) {
    this.display = display;
    return this;
  }

  /**
   * <p>Getter for the field <code>display</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDisplay() {
    return display;
  }

  /**
   * <p>Setter for the field <code>primary</code>.</p>
   *
   * @param primary a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.iam.ComplexValue} object
   */
  public ComplexValue setPrimary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * <p>Getter for the field <code>primary</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getPrimary() {
    return primary;
  }

  /**
   * <p>Setter for the field <code>ref</code>.</p>
   *
   * @param ref a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ComplexValue} object
   */
  public ComplexValue setRef(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * <p>Getter for the field <code>ref</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRef() {
    return ref;
  }

  /**
   * <p>setType.</p>
   *
   * @param typeValue a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ComplexValue} object
   */
  public ComplexValue setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  /**
   * <p>getType.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getType() {
    return typeValue;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.ComplexValue} object
   */
  public ComplexValue setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplexValue that = (ComplexValue) o;
    return Objects.equals(display, that.display)
        && Objects.equals(primary, that.primary)
        && Objects.equals(ref, that.ref)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(display, primary, ref, typeValue, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ComplexValue.class)
        .add("display", display)
        .add("primary", primary)
        .add("ref", ref)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }
}
