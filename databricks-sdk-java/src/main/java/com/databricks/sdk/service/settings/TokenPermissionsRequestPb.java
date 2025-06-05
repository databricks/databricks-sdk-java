// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TokenPermissionsRequestPb {
  @JsonProperty("access_control_list")
  private Collection<TokenAccessControlRequest> accessControlList;

  public TokenPermissionsRequestPb setAccessControlList(
      Collection<TokenAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<TokenAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenPermissionsRequestPb that = (TokenPermissionsRequestPb) o;
    return Objects.equals(accessControlList, that.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenPermissionsRequestPb.class)
        .add("accessControlList", accessControlList)
        .toString();
  }
}
