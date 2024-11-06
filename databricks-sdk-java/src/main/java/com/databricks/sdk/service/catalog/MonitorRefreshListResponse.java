// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class MonitorRefreshListResponse {
  /** List of refreshes. */
  @JsonProperty("refreshes")
  private Collection<MonitorRefreshInfo> refreshes;

  public MonitorRefreshListResponse setRefreshes(Collection<MonitorRefreshInfo> refreshes) {
    this.refreshes = refreshes;
    return this;
  }

  public Collection<MonitorRefreshInfo> getRefreshes() {
    return refreshes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorRefreshListResponse that = (MonitorRefreshListResponse) o;
    return Objects.equals(refreshes, that.refreshes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshes);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorRefreshListResponse.class).add("refreshes", refreshes).toString();
  }
}
