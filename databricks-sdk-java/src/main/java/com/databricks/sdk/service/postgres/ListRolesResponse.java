// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRolesResponse {
  /** Token to request the next page of Postgres roles. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of Postgres roles in the branch. */
  @JsonProperty("roles")
  private Collection<Role> roles;

  public ListRolesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRolesResponse setRoles(Collection<Role> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<Role> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRolesResponse that = (ListRolesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, roles);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRolesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("roles", roles)
        .toString();
  }
}
