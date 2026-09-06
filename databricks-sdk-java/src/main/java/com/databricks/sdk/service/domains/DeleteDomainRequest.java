// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteDomainRequest {
  /**
   * When false (default), DeleteDomain is rejected with FAILED_PRECONDITION if the domain still has
   * Glossary pages. When true, those pages are deleted first and then the domain is removed.
   * Forwarded to the central service.
   */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Full resource name of the domain to delete. Format: `domains/{domain_id}` */
  @JsonIgnore private String name;

  public DeleteDomainRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteDomainRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDomainRequest that = (DeleteDomainRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDomainRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
