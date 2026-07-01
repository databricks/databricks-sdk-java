// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configuration for the initial default branch created during project creation. */
@Generated
public class InitialBranchSpec {
  /** Whether the initial default branch should be protected from deletion. */
  @JsonProperty("is_protected")
  private Boolean isProtected;

  public InitialBranchSpec setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  public Boolean getIsProtected() {
    return isProtected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitialBranchSpec that = (InitialBranchSpec) o;
    return Objects.equals(isProtected, that.isProtected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isProtected);
  }

  @Override
  public String toString() {
    return new ToStringer(InitialBranchSpec.class).add("isProtected", isProtected).toString();
  }
}
