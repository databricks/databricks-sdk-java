// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get policy family information */
@Generated
class GetPolicyFamilyRequestPb {
  @JsonIgnore private String policyFamilyId;

  @JsonIgnore
  @QueryParam("version")
  private Long version;

  public GetPolicyFamilyRequestPb setPolicyFamilyId(String policyFamilyId) {
    this.policyFamilyId = policyFamilyId;
    return this;
  }

  public String getPolicyFamilyId() {
    return policyFamilyId;
  }

  public GetPolicyFamilyRequestPb setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPolicyFamilyRequestPb that = (GetPolicyFamilyRequestPb) o;
    return Objects.equals(policyFamilyId, that.policyFamilyId)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyFamilyId, version);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPolicyFamilyRequestPb.class)
        .add("policyFamilyId", policyFamilyId)
        .add("version", version)
        .toString();
  }
}
