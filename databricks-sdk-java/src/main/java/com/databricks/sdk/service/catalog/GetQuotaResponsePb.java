// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetQuotaResponsePb {
  @JsonProperty("quota_info")
  private QuotaInfo quotaInfo;

  public GetQuotaResponsePb setQuotaInfo(QuotaInfo quotaInfo) {
    this.quotaInfo = quotaInfo;
    return this;
  }

  public QuotaInfo getQuotaInfo() {
    return quotaInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetQuotaResponsePb that = (GetQuotaResponsePb) o;
    return Objects.equals(quotaInfo, that.quotaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(GetQuotaResponsePb.class).add("quotaInfo", quotaInfo).toString();
  }
}
