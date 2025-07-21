// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class RefreshDefaultBaseEnvironmentsRequest {
  /** */
  @JsonProperty("ids")
  private Collection<String> ids;

  public RefreshDefaultBaseEnvironmentsRequest setIds(Collection<String> ids) {
    this.ids = ids;
    return this;
  }

  public Collection<String> getIds() {
    return ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefreshDefaultBaseEnvironmentsRequest that = (RefreshDefaultBaseEnvironmentsRequest) o;
    return Objects.equals(ids, that.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    return new ToStringer(RefreshDefaultBaseEnvironmentsRequest.class).add("ids", ids).toString();
  }
}
