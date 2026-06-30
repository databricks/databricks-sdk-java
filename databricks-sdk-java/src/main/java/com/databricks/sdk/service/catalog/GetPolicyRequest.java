// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetPolicyRequest {
  /** Required. The name of the policy to retrieve. */
  @JsonIgnore private String name;

  /** Required. The fully qualified name of securable to retrieve policy for. */
  @JsonIgnore private String onSecurableFullname;

  /** Required. The type of the securable to retrieve the policy for. */
  @JsonIgnore private String onSecurableType;

  public GetPolicyRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetPolicyRequest setOnSecurableFullname(String onSecurableFullname) {
    this.onSecurableFullname = onSecurableFullname;
    return this;
  }

  public String getOnSecurableFullname() {
    return onSecurableFullname;
  }

  public GetPolicyRequest setOnSecurableType(String onSecurableType) {
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
    GetPolicyRequest that = (GetPolicyRequest) o;
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
    return new ToStringer(GetPolicyRequest.class)
        .add("name", name)
        .add("onSecurableFullname", onSecurableFullname)
        .add("onSecurableType", onSecurableType)
        .toString();
  }
}
