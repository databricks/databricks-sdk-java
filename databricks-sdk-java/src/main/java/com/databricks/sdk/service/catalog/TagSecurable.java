// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TagSecurable {
  /** Name of the securable entity */
  @JsonProperty("full_name")
  private String fullName;

  /** Type of the securable entity */
  @JsonProperty("type")
  private String typeValue;

  public TagSecurable setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public TagSecurable setType(String typeValue) {
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
    TagSecurable that = (TagSecurable) o;
    return Objects.equals(fullName, that.fullName) && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(TagSecurable.class)
        .add("fullName", fullName)
        .add("typeValue", typeValue)
        .toString();
  }
}
