// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Name class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Name {
  /** Family name of the Databricks user. */
  @JsonProperty("familyName")
  private String familyName;

  /** Given name of the Databricks user. */
  @JsonProperty("givenName")
  private String givenName;

  /**
   * <p>Setter for the field <code>familyName</code>.</p>
   *
   * @param familyName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Name} object
   */
  public Name setFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * <p>Getter for the field <code>familyName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFamilyName() {
    return familyName;
  }

  /**
   * <p>Setter for the field <code>givenName</code>.</p>
   *
   * @param givenName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Name} object
   */
  public Name setGivenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * <p>Getter for the field <code>givenName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGivenName() {
    return givenName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Name that = (Name) o;
    return Objects.equals(familyName, that.familyName) && Objects.equals(givenName, that.givenName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(familyName, givenName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Name.class)
        .add("familyName", familyName)
        .add("givenName", givenName)
        .toString();
  }
}
