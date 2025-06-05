// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class NamePb {
  @JsonProperty("familyName")
  private String familyName;

  @JsonProperty("givenName")
  private String givenName;

  public NamePb setFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  public String getFamilyName() {
    return familyName;
  }

  public NamePb setGivenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  public String getGivenName() {
    return givenName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NamePb that = (NamePb) o;
    return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  @Override
  public String toString() {
    return new ToStringer(NamePb.class)
        .add("familyName", familyName)
        .add("givenName", givenName)
        .toString();
  }
}
