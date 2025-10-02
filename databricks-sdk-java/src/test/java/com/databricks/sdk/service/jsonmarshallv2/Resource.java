// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * We separate this into 3 submessages to simplify test cases. E.g., any required top level field
 * needs to be included in the expected json for each test case.
 */
@Generated
public class Resource {
  /** */
  @JsonProperty("optional_fields")
  @QueryParam("optional_fields")
  private OptionalFields optionalFields;

  /** */
  @JsonProperty("repeated_fields")
  @QueryParam("repeated_fields")
  private RepeatedFields repeatedFields;

  /** */
  @JsonProperty("required_fields")
  @QueryParam("required_fields")
  private RequiredFields requiredFields;

  public Resource setOptionalFields(OptionalFields optionalFields) {
    this.optionalFields = optionalFields;
    return this;
  }

  public OptionalFields getOptionalFields() {
    return optionalFields;
  }

  public Resource setRepeatedFields(RepeatedFields repeatedFields) {
    this.repeatedFields = repeatedFields;
    return this;
  }

  public RepeatedFields getRepeatedFields() {
    return repeatedFields;
  }

  public Resource setRequiredFields(RequiredFields requiredFields) {
    this.requiredFields = requiredFields;
    return this;
  }

  public RequiredFields getRequiredFields() {
    return requiredFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Resource that = (Resource) o;
    return Objects.equals(optionalFields, that.optionalFields)
        && Objects.equals(repeatedFields, that.repeatedFields)
        && Objects.equals(requiredFields, that.requiredFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalFields, repeatedFields, requiredFields);
  }

  @Override
  public String toString() {
    return new ToStringer(Resource.class)
        .add("optionalFields", optionalFields)
        .add("repeatedFields", repeatedFields)
        .add("requiredFields", requiredFields)
        .toString();
  }
}
