// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteFailoverGroupRequest {
  /**
   * Opaque version string for optimistic locking. If provided, must match the current etag. If
   * omitted, the delete proceeds without an etag check.
   */
  @JsonIgnore
  @QueryParam("etag")
  private String etag;

  /**
   * The fully qualified resource name of the failover group to delete. Format:
   * accounts/{account_id}/failover-groups/{failover_group_id}.
   */
  @JsonIgnore private String name;

  public DeleteFailoverGroupRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteFailoverGroupRequest setName(String name) {
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
    DeleteFailoverGroupRequest that = (DeleteFailoverGroupRequest) o;
    return Objects.equals(etag, that.etag) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteFailoverGroupRequest.class)
        .add("etag", etag)
        .add("name", name)
        .toString();
  }
}
