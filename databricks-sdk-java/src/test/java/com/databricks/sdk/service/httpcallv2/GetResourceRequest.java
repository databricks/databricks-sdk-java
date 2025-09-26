// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GetResourceRequest {
  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonIgnore
  @QueryParam("field_mask")
  private String fieldMask;

  /** */
  @JsonIgnore
  @QueryParam("optional_complex_query_param")
  private ComplexQueryParam optionalComplexQueryParam;

  /** */
  @JsonIgnore private Boolean pathParamBool;

  /** */
  @JsonIgnore private Long pathParamInt;

  /** */
  @JsonIgnore private String pathParamString;

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

  public GetResourceRequest setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public GetResourceRequest setOptionalComplexQueryParam(
      ComplexQueryParam optionalComplexQueryParam) {
    this.optionalComplexQueryParam = optionalComplexQueryParam;
    return this;
  }

  public ComplexQueryParam getOptionalComplexQueryParam() {
    return optionalComplexQueryParam;
  }

  public GetResourceRequest setPathParamBool(Boolean pathParamBool) {
    this.pathParamBool = pathParamBool;
    return this;
  }

  public Boolean getPathParamBool() {
    return pathParamBool;
  }

  public GetResourceRequest setPathParamInt(Long pathParamInt) {
    this.pathParamInt = pathParamInt;
    return this;
  }

  public Long getPathParamInt() {
    return pathParamInt;
  }

  public GetResourceRequest setPathParamString(String pathParamString) {
    this.pathParamString = pathParamString;
    return this;
  }

  public String getPathParamString() {
    return pathParamString;
  }

  public GetResourceRequest setQueryParamBool(Boolean queryParamBool) {
    this.queryParamBool = queryParamBool;
    return this;
  }

  public Boolean getQueryParamBool() {
    return queryParamBool;
  }

  public GetResourceRequest setQueryParamInt(Long queryParamInt) {
    this.queryParamInt = queryParamInt;
    return this;
  }

  public Long getQueryParamInt() {
    return queryParamInt;
  }

  public GetResourceRequest setQueryParamString(String queryParamString) {
    this.queryParamString = queryParamString;
    return this;
  }

  public String getQueryParamString() {
    return queryParamString;
  }

  public GetResourceRequest setRepeatedComplexQueryParam(
      Collection<ComplexQueryParam> repeatedComplexQueryParam) {
    this.repeatedComplexQueryParam = repeatedComplexQueryParam;
    return this;
  }

  public Collection<ComplexQueryParam> getRepeatedComplexQueryParam() {
    return repeatedComplexQueryParam;
  }

  public GetResourceRequest setRepeatedQueryParam(Collection<String> repeatedQueryParam) {
    this.repeatedQueryParam = repeatedQueryParam;
    return this;
  }

  public Collection<String> getRepeatedQueryParam() {
    return repeatedQueryParam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetResourceRequest that = (GetResourceRequest) o;
    return Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(optionalComplexQueryParam, that.optionalComplexQueryParam)
        && Objects.equals(pathParamBool, that.pathParamBool)
        && Objects.equals(pathParamInt, that.pathParamInt)
        && Objects.equals(pathParamString, that.pathParamString)
        && Objects.equals(queryParamBool, that.queryParamBool)
        && Objects.equals(queryParamInt, that.queryParamInt)
        && Objects.equals(queryParamString, that.queryParamString)
        && Objects.equals(repeatedComplexQueryParam, that.repeatedComplexQueryParam)
        && Objects.equals(repeatedQueryParam, that.repeatedQueryParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fieldMask,
        optionalComplexQueryParam,
        pathParamBool,
        pathParamInt,
        pathParamString,
        queryParamBool,
        queryParamInt,
        queryParamString,
        repeatedComplexQueryParam,
        repeatedQueryParam);
  }

  @Override
  public String toString() {
    return new ToStringer(GetResourceRequest.class)
        .add("fieldMask", fieldMask)
        .add("optionalComplexQueryParam", optionalComplexQueryParam)
        .add("pathParamBool", pathParamBool)
        .add("pathParamInt", pathParamInt)
        .add("pathParamString", pathParamString)
        .add("queryParamBool", queryParamBool)
        .add("queryParamInt", queryParamInt)
        .add("queryParamString", queryParamString)
        .add("repeatedComplexQueryParam", repeatedComplexQueryParam)
        .add("repeatedQueryParam", repeatedQueryParam)
        .toString();
  }
}
