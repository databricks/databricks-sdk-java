// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Name {
  /** Family name of the Databricks user. */
  @JsonProperty("familyName")
  private String familyName;

  /** Given name of the Databricks user. */
  @JsonProperty("givenName")
  private String givenName;

  public Name setFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  public String getFamilyName() {
    return familyName;
  }

  public Name setGivenName(String givenName) {
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
    Name that = (Name) o;
    return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  @Override
  public String toString() {
    return new ToStringer(Name.class)
        .add("familyName", familyName)
        .add("givenName", givenName)
        .toString();
  }
}
