// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ComplexQueryParam {
  /** */
  @JsonProperty("nested_optional_query_param")
  @QueryParam("nested_optional_query_param")
  private String nestedOptionalQueryParam;

  /** */
  @JsonProperty("nested_repeated_query_param")
  @QueryParam("nested_repeated_query_param")
  private Collection<String> nestedRepeatedQueryParam;

  public ComplexQueryParam setNestedOptionalQueryParam(String nestedOptionalQueryParam) {
    this.nestedOptionalQueryParam = nestedOptionalQueryParam;
    return this;
  }

  public String getNestedOptionalQueryParam() {
    return nestedOptionalQueryParam;
  }

  public ComplexQueryParam setNestedRepeatedQueryParam(
      Collection<String> nestedRepeatedQueryParam) {
    this.nestedRepeatedQueryParam = nestedRepeatedQueryParam;
    return this;
  }

  public Collection<String> getNestedRepeatedQueryParam() {
    return nestedRepeatedQueryParam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComplexQueryParam that = (ComplexQueryParam) o;
    return Objects.equals(nestedOptionalQueryParam, that.nestedOptionalQueryParam)
        && Objects.equals(nestedRepeatedQueryParam, that.nestedRepeatedQueryParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestedOptionalQueryParam, nestedRepeatedQueryParam);
  }

  @Override
  public String toString() {
    return new ToStringer(ComplexQueryParam.class)
        .add("nestedOptionalQueryParam", nestedOptionalQueryParam)
        .add("nestedRepeatedQueryParam", nestedRepeatedQueryParam)
        .toString();
  }
}
