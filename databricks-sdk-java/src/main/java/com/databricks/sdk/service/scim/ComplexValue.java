// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}
