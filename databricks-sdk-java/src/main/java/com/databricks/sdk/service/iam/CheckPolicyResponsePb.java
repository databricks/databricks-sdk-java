// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CheckPolicyResponsePb {
  @JsonProperty("consistency_token")
  private ConsistencyToken consistencyToken;

  @JsonProperty("is_permitted")
  private Boolean isPermitted;

  public CheckPolicyResponsePb setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyResponsePb setIsPermitted(Boolean isPermitted) {
    this.isPermitted = isPermitted;
    return this;
  }

  public Boolean getIsPermitted() {
    return isPermitted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckPolicyResponsePb that = (CheckPolicyResponsePb) o;
    return Objects.equals(consistencyToken, that.consistencyToken)
        && Objects.equals(isPermitted, that.isPermitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyToken, isPermitted);
  }

  @Override
  public String toString() {
    return new ToStringer(CheckPolicyResponsePb.class)
        .add("consistencyToken", consistencyToken)
        .add("isPermitted", isPermitted)
        .toString();
  }
}
