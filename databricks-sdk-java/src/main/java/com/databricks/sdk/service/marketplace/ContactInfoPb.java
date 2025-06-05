// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** contact info for the consumer requesting data or performing a listing installation */
@Generated
class ContactInfoPb {
  @JsonProperty("company")
  private String company;

  @JsonProperty("email")
  private String email;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  public ContactInfoPb setCompany(String company) {
    this.company = company;
    return this;
  }

  public String getCompany() {
    return company;
  }

  public ContactInfoPb setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public ContactInfoPb setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public ContactInfoPb setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactInfoPb that = (ContactInfoPb) o;
    return Objects.equals(company, that.company)
        && Objects.equals(email, that.email)
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(lastName, that.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, email, firstName, lastName);
  }

  @Override
  public String toString() {
    return new ToStringer(ContactInfoPb.class)
        .add("company", company)
        .add("email", email)
        .add("firstName", firstName)
        .add("lastName", lastName)
        .toString();
  }
}
