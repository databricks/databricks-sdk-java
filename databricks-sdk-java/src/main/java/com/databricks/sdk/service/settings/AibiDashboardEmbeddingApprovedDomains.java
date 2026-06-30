// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AibiDashboardEmbeddingApprovedDomains {
  /** */
  @JsonProperty("approved_domains")
  private Collection<String> approvedDomains;

  public AibiDashboardEmbeddingApprovedDomains setApprovedDomains(
      Collection<String> approvedDomains) {
    this.approvedDomains = approvedDomains;
    return this;
  }

  public Collection<String> getApprovedDomains() {
    return approvedDomains;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AibiDashboardEmbeddingApprovedDomains that = (AibiDashboardEmbeddingApprovedDomains) o;
    return Objects.equals(approvedDomains, that.approvedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedDomains);
  }

  @Override
  public String toString() {
    return new ToStringer(AibiDashboardEmbeddingApprovedDomains.class)
        .add("approvedDomains", approvedDomains)
        .toString();
  }
}
