// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A principal — user or service-principal — used as the value type for `created_by` / `updated_by`
 * / `assignee` etc. across v2 resources.
 */
@Generated
public class Principal {
  /** Display name (user or SP name). */
  @JsonProperty("display_name")
  private String displayName;

  /** Email (regular users only). */
  @JsonProperty("email")
  private String email;

  /** User / service-principal ID. */
  @JsonProperty("id")
  private String id;

  /** Whether this principal is a regular user, service principal, or system principal. */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  public Principal setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Principal setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public Principal setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Principal setPrincipalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
  }

  public PrincipalType getPrincipalType() {
    return principalType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Principal that = (Principal) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(email, that.email)
        && Objects.equals(id, that.id)
        && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, email, id, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(Principal.class)
        .add("displayName", displayName)
        .add("email", email)
        .add("id", id)
        .add("principalType", principalType)
        .toString();
  }
}
