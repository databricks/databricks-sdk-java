// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Resource {
  /** */
  @JsonProperty("any_field")
  private Object anyField;

  /** */
  @JsonProperty("body_field")
  private String bodyField;

  /** */
  @JsonProperty("nested_path_param_bool")
  private Boolean nestedPathParamBool;

  /** */
  @JsonProperty("nested_path_param_int")
  private Long nestedPathParamInt;

  /** */
  @JsonProperty("nested_path_param_string")
  private String nestedPathParamString;

  public Resource setAnyField(Object anyField) {
    this.anyField = anyField;
    return this;
  }

  public Object getAnyField() {
    return anyField;
  }

  public Resource setBodyField(String bodyField) {
    this.bodyField = bodyField;
    return this;
  }

  public String getBodyField() {
    return bodyField;
  }

  public Resource setNestedPathParamBool(Boolean nestedPathParamBool) {
    this.nestedPathParamBool = nestedPathParamBool;
    return this;
  }

  public Boolean getNestedPathParamBool() {
    return nestedPathParamBool;
  }

  public Resource setNestedPathParamInt(Long nestedPathParamInt) {
    this.nestedPathParamInt = nestedPathParamInt;
    return this;
  }

  public Long getNestedPathParamInt() {
    return nestedPathParamInt;
  }

  public Resource setNestedPathParamString(String nestedPathParamString) {
    this.nestedPathParamString = nestedPathParamString;
    return this;
  }

  public String getNestedPathParamString() {
    return nestedPathParamString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Resource that = (Resource) o;
    return Objects.equals(anyField, that.anyField)
        && Objects.equals(bodyField, that.bodyField)
        && Objects.equals(nestedPathParamBool, that.nestedPathParamBool)
        && Objects.equals(nestedPathParamInt, that.nestedPathParamInt)
        && Objects.equals(nestedPathParamString, that.nestedPathParamString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anyField, bodyField, nestedPathParamBool, nestedPathParamInt, nestedPathParamString);
  }

  @Override
  public String toString() {
    return new ToStringer(Resource.class)
        .add("anyField", anyField)
        .add("bodyField", bodyField)
        .add("nestedPathParamBool", nestedPathParamBool)
        .add("nestedPathParamInt", nestedPathParamInt)
        .add("nestedPathParamString", nestedPathParamString)
        .toString();
  }
}
