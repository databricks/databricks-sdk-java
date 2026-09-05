// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDomainRequest {
  /** */
  @JsonProperty("domain")
  private Domain domain;

  /**
   * Full resource name of the domain. The primary identifier for this resource. Format:
   * `domains/{domain_id}` Identifies the domain on get, update, and delete. Not an input on create
   * — to choose the id, set `CreateDomainRequest.domain_id`.
   */
  @JsonIgnore private String name;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDomainRequest setDomain(Domain domain) {
    this.domain = domain;
    return this;
  }

  public Domain getDomain() {
    return domain;
  }

  public UpdateDomainRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDomainRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDomainRequest that = (UpdateDomainRequest) o;
    return Objects.equals(domain, that.domain)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDomainRequest.class)
        .add("domain", domain)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
