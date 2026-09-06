// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateDomainRequest {
  /** */
  @JsonProperty("domain")
  private Domain domain;

  /** Client-supplied resource ID for the new domain. If omitted, the server generates one. */
  @JsonIgnore
  @QueryParam("domain_id")
  private String domainId;

  public CreateDomainRequest setDomain(Domain domain) {
    this.domain = domain;
    return this;
  }

  public Domain getDomain() {
    return domain;
  }

  public CreateDomainRequest setDomainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  public String getDomainId() {
    return domainId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDomainRequest that = (CreateDomainRequest) o;
    return Objects.equals(domain, that.domain) && Objects.equals(domainId, that.domainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, domainId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDomainRequest.class)
        .add("domain", domain)
        .add("domainId", domainId)
        .toString();
  }
}
