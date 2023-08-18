// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TagSubentity {
  /** Name of the securable entity */
  @JsonProperty("full_name")
  private String fullName;

  /** Name of the subentity */
  @JsonProperty("subentity")
  private String subentity;

  /** Type of the securable entity */
  @JsonProperty("type")
  private String typeValue;

  public TagSubentity setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TagSubentity setSubentity(String subentity) {
    this.subentity = subentity;
    return this;
  }

  public String getSubentity() {
    return subentity;
  }

  public TagSubentity setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TagSubentity that = (TagSubentity) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(subentity, that.subentity)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, subentity, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TagSubentity.class)
        .add("fullName", fullName)
        .add("subentity", subentity)
        .add("typeValue", typeValue)
        .toString();
  }
}
