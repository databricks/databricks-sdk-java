// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Response containing the password for a password-authenticated Postgres role. */
@Generated
public class RevealRolePasswordResponse {
  /** The current password for the Postgres role. */
  @JsonProperty("password")
  private String password;

  public RevealRolePasswordResponse setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RevealRolePasswordResponse that = (RevealRolePasswordResponse) o;
    return Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password);
  }

  @Override
  public String toString() {
    return new ToStringer(RevealRolePasswordResponse.class).add("password", password).toString();
  }
}
