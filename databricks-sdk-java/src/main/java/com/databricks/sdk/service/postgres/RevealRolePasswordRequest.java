// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Request to reveal the current password for a password-authenticated Postgres role. */
@Generated
public class RevealRolePasswordRequest {
  /**
   * The full resource path of the role whose password should be revealed. Format:
   * projects/{project_id}/branches/{branch_id}/roles/{role_id}
   */
  @JsonIgnore private String name;

  public RevealRolePasswordRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevealRolePasswordRequest that = (RevealRolePasswordRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(RevealRolePasswordRequest.class).add("name", name).toString();
  }
}
