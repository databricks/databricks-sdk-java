// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CheckPolicyResponse {
  /** */
  @JsonProperty("consistency_token")
  private ConsistencyToken consistencyToken;

  /** */
  @JsonProperty("is_permitted")
  private Boolean isPermitted;

  public CheckPolicyResponse setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyResponse setIsPermitted(Boolean isPermitted) {
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
    CheckPolicyResponse that = (CheckPolicyResponse) o;
    return Objects.equals(consistencyToken, that.consistencyToken)
        && Objects.equals(isPermitted, that.isPermitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyToken, isPermitted);
  }

  @Override
  public String toString() {
    return new ToStringer(CheckPolicyResponse.class)
        .add("consistencyToken", consistencyToken)
        .add("isPermitted", isPermitted)
        .toString();
  }
}
