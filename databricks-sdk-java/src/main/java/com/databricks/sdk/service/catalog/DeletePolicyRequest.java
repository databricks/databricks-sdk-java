// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeletePolicyRequest {
  /** Required. The name of the policy to delete */
  @JsonIgnore private String name;

  /** Required. The fully qualified name of the securable to delete the policy from. */
  @JsonIgnore private String onSecurableFullname;

  /** Required. The type of the securable to delete the policy from. */
  @JsonIgnore private String onSecurableType;

  public DeletePolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeletePolicyRequest setOnSecurableFullname(String onSecurableFullname) {
    this.onSecurableFullname = onSecurableFullname;
    return this;
  }

  public String getOnSecurableFullname() {
    return onSecurableFullname;
  }

  public DeletePolicyRequest setOnSecurableType(String onSecurableType) {
    this.onSecurableType = onSecurableType;
    return this;
  }

  public String getOnSecurableType() {
    return onSecurableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePolicyRequest that = (DeletePolicyRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(onSecurableFullname, that.onSecurableFullname)
        && Objects.equals(onSecurableType, that.onSecurableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, onSecurableFullname, onSecurableType);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePolicyRequest.class)
        .add("name", name)
        .add("onSecurableFullname", onSecurableFullname)
        .add("onSecurableType", onSecurableType)
        .toString();
  }
}
