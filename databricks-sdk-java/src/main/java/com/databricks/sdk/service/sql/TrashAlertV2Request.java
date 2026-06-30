// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class TrashAlertV2Request {
  /** */
  @JsonIgnore private String id;

  /** Whether to permanently delete the alert. If not set, the alert will only be soft deleted. */
  @JsonIgnore
  @QueryParam("purge")
  private Boolean purge;

  public TrashAlertV2Request setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TrashAlertV2Request setPurge(Boolean purge) {
    this.purge = purge;
    return this;
  }

  public Boolean getPurge() {
    return purge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrashAlertV2Request that = (TrashAlertV2Request) o;
    return Objects.equals(id, that.id) && Objects.equals(purge, that.purge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, purge);
  }

  @Override
  public String toString() {
    return new ToStringer(TrashAlertV2Request.class).add("id", id).add("purge", purge).toString();
  }
}
