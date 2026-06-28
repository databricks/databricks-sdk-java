// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Principal {
  /** Databricks user, group or service principal ID. */
  @JsonProperty("id")
  private String id;

  /** */
  @JsonProperty("principal_type")
  private PrincipalType principalType;

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
    return Objects.equals(id, that.id) && Objects.equals(principalType, that.principalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, principalType);
  }

  @Override
  public String toString() {
    return new ToStringer(Principal.class)
        .add("id", id)
        .add("principalType", principalType)
        .toString();
  }
}
