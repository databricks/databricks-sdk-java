// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The full name of a user. */
@Generated
public class FullName {
  /** The family (last) name of the user, from the customer's IdP. */
  @JsonProperty("family_name")
  private String familyName;

  /** The given (first) name of the user, from the customer's IdP. */
  @JsonProperty("given_name")
  private String givenName;

  public FullName setFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  public String getFamilyName() {
    return familyName;
  }

  public FullName setGivenName(String givenName) {
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
    FullName that = (FullName) o;
    return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  @Override
  public String toString() {
    return new ToStringer(FullName.class)
        .add("familyName", familyName)
        .add("givenName", givenName)
        .toString();
  }
}
