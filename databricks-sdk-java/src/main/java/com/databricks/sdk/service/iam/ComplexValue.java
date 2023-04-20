// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public ComplexValue setDisplay(String display) {
    this.display = display;
    return this;
  }

  public String getDisplay() {
    return display;
  }

  public ComplexValue setPrimary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  public Boolean getPrimary() {
    return primary;
  }

  public ComplexValue setRef(String ref) {
    this.ref = ref;
    return this;
  }

  public String getRef() {
    return ref;
  }

  public ComplexValue setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public ComplexValue setValue(String value) {
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
    ComplexValue that = (ComplexValue) o;
    return Objects.equals(display, that.display)
        && Objects.equals(primary, that.primary)
        && Objects.equals(ref, that.ref)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, primary, ref, typeValue, value);
  }

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
