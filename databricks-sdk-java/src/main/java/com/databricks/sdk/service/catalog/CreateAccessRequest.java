// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateAccessRequest {
  /**
   * Optional. The principal this request is for. Empty `behalf_of` defaults to the requester's
   * identity.
   *
   * <p>Principals must be unique across the API call.
   */
  @JsonProperty("behalf_of")
  private Principal behalfOf;

  /**
   * Optional. Comment associated with the request.
   *
   * <p>At most 200 characters, can only contain lowercase/uppercase letters (a-z, A-Z), numbers
   * (0-9), punctuation, and spaces.
   */
  @JsonProperty("comment")
  private String comment;

  /**
   * List of securables and their corresponding requested UC privileges.
   *
   * <p>At most 30 securables can be requested for a principal per batched call. Each securable can
   * only be requested once per principal.
   */
  @JsonProperty("securable_permissions")
  private Collection<SecurablePermissions> securablePermissions;

  public CreateAccessRequest setBehalfOf(Principal behalfOf) {
    this.behalfOf = behalfOf;
    return this;
  }

  public Principal getBehalfOf() {
    return behalfOf;
  }

  public CreateAccessRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateAccessRequest setSecurablePermissions(
      Collection<SecurablePermissions> securablePermissions) {
    this.securablePermissions = securablePermissions;
    return this;
  }

  public Collection<SecurablePermissions> getSecurablePermissions() {
    return securablePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateAccessRequest that = (CreateAccessRequest) o;
    return Objects.equals(behalfOf, that.behalfOf)
        && Objects.equals(comment, that.comment)
        && Objects.equals(securablePermissions, that.securablePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behalfOf, comment, securablePermissions);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAccessRequest.class)
        .add("behalfOf", behalfOf)
        .add("comment", comment)
        .add("securablePermissions", securablePermissions)
        .toString();
  }
}
