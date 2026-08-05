// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class GrantOptions {
  /**
   * List of privileges to grant. When any of these privileges are requested, the policy will grant
   * access if the principal and condition match. Required on create and update.
   */
  @JsonProperty("privileges")
  private Collection<String> privileges;

  public GrantOptions setPrivileges(Collection<String> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Collection<String> getPrivileges() {
    return privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GrantOptions that = (GrantOptions) o;
    return Objects.equals(privileges, that.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileges);
  }

  @Override
  public String toString() {
    return new ToStringer(GrantOptions.class).add("privileges", privileges).toString();
  }
}
