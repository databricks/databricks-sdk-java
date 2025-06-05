// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get information for a single resource quota. */
@Generated
class GetQuotaRequestPb {
  @JsonIgnore private String parentFullName;

  @JsonIgnore private String parentSecurableType;

  @JsonIgnore private String quotaName;

  public GetQuotaRequestPb setParentFullName(String parentFullName) {
    this.parentFullName = parentFullName;
    return this;
  }

  public String getParentFullName() {
    return parentFullName;
  }

  public GetQuotaRequestPb setParentSecurableType(String parentSecurableType) {
    this.parentSecurableType = parentSecurableType;
    return this;
  }

  public String getParentSecurableType() {
    return parentSecurableType;
  }

  public GetQuotaRequestPb setQuotaName(String quotaName) {
    this.quotaName = quotaName;
    return this;
  }

  public String getQuotaName() {
    return quotaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQuotaRequestPb that = (GetQuotaRequestPb) o;
    return Objects.equals(parentFullName, that.parentFullName)
        && Objects.equals(parentSecurableType, that.parentSecurableType)
        && Objects.equals(quotaName, that.quotaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentFullName, parentSecurableType, quotaName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQuotaRequestPb.class)
        .add("parentFullName", parentFullName)
        .add("parentSecurableType", parentSecurableType)
        .add("quotaName", quotaName)
        .toString();
  }
}
