// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class MeRequest {
  /** Comma-separated list of attributes to return in response. */
  @JsonIgnore
  @QueryParam("attributes")
  private String attributes;

  /** Comma-separated list of attributes to exclude in response. */
  @JsonIgnore
  @QueryParam("excludedAttributes")
  private String excludedAttributes;

  public MeRequest setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  public String getAttributes() {
    return attributes;
  }

  public MeRequest setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MeRequest that = (MeRequest) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(excludedAttributes, that.excludedAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, excludedAttributes);
  }

  @Override
  public String toString() {
    return new ToStringer(MeRequest.class)
        .add("attributes", attributes)
        .add("excludedAttributes", excludedAttributes)
        .toString();
  }
}
