// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateResourceRequest {
  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonIgnore
  @QueryParam("field_mask")
  private FieldMask fieldMask;

  /** */
  @JsonIgnore private Boolean nestedPathParamBool;

  /** */
  @JsonIgnore private Long nestedPathParamInt;

  /** */
  @JsonIgnore private String nestedPathParamString;

  /** */
  @JsonIgnore
  @QueryParam("optional_complex_query_param")
  private ComplexQueryParam optionalComplexQueryParam;

  /** */
  @JsonIgnore
  @QueryParam("query_param_bool")
  private Boolean queryParamBool;

  /** */
  @JsonIgnore
  @QueryParam("query_param_int")
  private Long queryParamInt;

  /** */
  @JsonIgnore
  @QueryParam("query_param_string")
  private String queryParamString;

  /** */
  @JsonIgnore
  @QueryParam("repeated_complex_query_param")
  private Collection<ComplexQueryParam> repeatedComplexQueryParam;

  /** */
  @JsonIgnore
  @QueryParam("repeated_query_param")
  private Collection<String> repeatedQueryParam;

  /** Body element */
  @JsonProperty("resource")
  private Resource resource;

  public UpdateResourceRequest setFieldMask(FieldMask fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public FieldMask getFieldMask() {
    return fieldMask;
  }

  public UpdateResourceRequest setNestedPathParamBool(Boolean nestedPathParamBool) {
    this.nestedPathParamBool = nestedPathParamBool;
    return this;
  }

  public Boolean getNestedPathParamBool() {
    return nestedPathParamBool;
  }

  public UpdateResourceRequest setNestedPathParamInt(Long nestedPathParamInt) {
    this.nestedPathParamInt = nestedPathParamInt;
    return this;
  }

  public Long getNestedPathParamInt() {
    return nestedPathParamInt;
  }

  public UpdateResourceRequest setNestedPathParamString(String nestedPathParamString) {
    this.nestedPathParamString = nestedPathParamString;
    return this;
  }

  public String getNestedPathParamString() {
    return nestedPathParamString;
  }

  public UpdateResourceRequest setOptionalComplexQueryParam(
      ComplexQueryParam optionalComplexQueryParam) {
    this.optionalComplexQueryParam = optionalComplexQueryParam;
    return this;
  }

  public ComplexQueryParam getOptionalComplexQueryParam() {
    return optionalComplexQueryParam;
  }

  public UpdateResourceRequest setQueryParamBool(Boolean queryParamBool) {
    this.queryParamBool = queryParamBool;
    return this;
  }

  public Boolean getQueryParamBool() {
    return queryParamBool;
  }

  public UpdateResourceRequest setQueryParamInt(Long queryParamInt) {
    this.queryParamInt = queryParamInt;
    return this;
  }

  public Long getQueryParamInt() {
    return queryParamInt;
  }

  public UpdateResourceRequest setQueryParamString(String queryParamString) {
    this.queryParamString = queryParamString;
    return this;
  }

  public String getQueryParamString() {
    return queryParamString;
  }

  public UpdateResourceRequest setRepeatedComplexQueryParam(
      Collection<ComplexQueryParam> repeatedComplexQueryParam) {
    this.repeatedComplexQueryParam = repeatedComplexQueryParam;
    return this;
  }

  public Collection<ComplexQueryParam> getRepeatedComplexQueryParam() {
    return repeatedComplexQueryParam;
  }

  public UpdateResourceRequest setRepeatedQueryParam(Collection<String> repeatedQueryParam) {
    this.repeatedQueryParam = repeatedQueryParam;
    return this;
  }

  public Collection<String> getRepeatedQueryParam() {
    return repeatedQueryParam;
  }

  public UpdateResourceRequest setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  public Resource getResource() {
    return resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateResourceRequest that = (UpdateResourceRequest) o;
    return Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(nestedPathParamBool, that.nestedPathParamBool)
        && Objects.equals(nestedPathParamInt, that.nestedPathParamInt)
        && Objects.equals(nestedPathParamString, that.nestedPathParamString)
        && Objects.equals(optionalComplexQueryParam, that.optionalComplexQueryParam)
        && Objects.equals(queryParamBool, that.queryParamBool)
        && Objects.equals(queryParamInt, that.queryParamInt)
        && Objects.equals(queryParamString, that.queryParamString)
        && Objects.equals(repeatedComplexQueryParam, that.repeatedComplexQueryParam)
        && Objects.equals(repeatedQueryParam, that.repeatedQueryParam)
        && Objects.equals(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fieldMask,
        nestedPathParamBool,
        nestedPathParamInt,
        nestedPathParamString,
        optionalComplexQueryParam,
        queryParamBool,
        queryParamInt,
        queryParamString,
        repeatedComplexQueryParam,
        repeatedQueryParam,
        resource);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateResourceRequest.class)
        .add("fieldMask", fieldMask)
        .add("nestedPathParamBool", nestedPathParamBool)
        .add("nestedPathParamInt", nestedPathParamInt)
        .add("nestedPathParamString", nestedPathParamString)
        .add("optionalComplexQueryParam", optionalComplexQueryParam)
        .add("queryParamBool", queryParamBool)
        .add("queryParamInt", queryParamInt)
        .add("queryParamString", queryParamString)
        .add("repeatedComplexQueryParam", repeatedComplexQueryParam)
        .add("repeatedQueryParam", repeatedQueryParam)
        .add("resource", resource)
        .toString();
  }
}
