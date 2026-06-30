// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AibiDashboardEmbeddingAccessPolicy {
  /** */
  @JsonProperty("access_policy_type")
  private AibiDashboardEmbeddingAccessPolicyAccessPolicyType accessPolicyType;

  public AibiDashboardEmbeddingAccessPolicy setAccessPolicyType(
      AibiDashboardEmbeddingAccessPolicyAccessPolicyType accessPolicyType) {
    this.accessPolicyType = accessPolicyType;
    return this;
  }

  public AibiDashboardEmbeddingAccessPolicyAccessPolicyType getAccessPolicyType() {
    return accessPolicyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingAccessPolicy that = (AibiDashboardEmbeddingAccessPolicy) o;
    return Objects.equals(accessPolicyType, that.accessPolicyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicyType);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingAccessPolicy.class)
        .add("accessPolicyType", accessPolicyType)
        .toString();
  }
}
