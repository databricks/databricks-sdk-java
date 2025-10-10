// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** This mimics "old" style post requests which have the resource inlined. */
@Generated
public class CreateResourceRequest {
  /** Body element */
  @JsonProperty("body_field")
  private String bodyField;

  /** */
  @JsonIgnore private Boolean pathParamBool;

  /** */
  @JsonIgnore private Long pathParamInt;

  /** */
  @JsonIgnore private String pathParamString;

  public CreateResourceRequest setBodyField(String bodyField) {
    this.bodyField = bodyField;
    return this;
  }

  public String getBodyField() {
    return bodyField;
  }

  public CreateResourceRequest setPathParamBool(Boolean pathParamBool) {
    this.pathParamBool = pathParamBool;
    return this;
  }

  public Boolean getPathParamBool() {
    return pathParamBool;
  }

  public CreateResourceRequest setPathParamInt(Long pathParamInt) {
    this.pathParamInt = pathParamInt;
    return this;
  }

  public Long getPathParamInt() {
    return pathParamInt;
  }

  public CreateResourceRequest setPathParamString(String pathParamString) {
    this.pathParamString = pathParamString;
    return this;
  }

  public String getPathParamString() {
    return pathParamString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateResourceRequest that = (CreateResourceRequest) o;
    return Objects.equals(bodyField, that.bodyField)
        && Objects.equals(pathParamBool, that.pathParamBool)
        && Objects.equals(pathParamInt, that.pathParamInt)
        && Objects.equals(pathParamString, that.pathParamString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bodyField, pathParamBool, pathParamInt, pathParamString);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateResourceRequest.class)
        .add("bodyField", bodyField)
        .add("pathParamBool", pathParamBool)
        .add("pathParamInt", pathParamInt)
        .add("pathParamString", pathParamString)
        .toString();
  }
}
