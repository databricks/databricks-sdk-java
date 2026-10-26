// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A principal a store permission is granted to. `name` is the principal's Lakebase identifier: a
 * user's email or a service principal's application (client) id.
 */
@Generated
public class StorePrincipal {
  /** */
  @JsonProperty("name")
  private String name;

  /** The kind of principal. Required unless the deprecated type alias is supplied. */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

  public StorePrincipal setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public StorePrincipal setPrincipalType(PrincipalType principalType) {
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
    StorePrincipal that = (StorePrincipal) o;
    return Objects.equals(name, that.name) && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(StorePrincipal.class)
        .add("name", name)
        .add("principalType", principalType)
        .toString();
  }
}
