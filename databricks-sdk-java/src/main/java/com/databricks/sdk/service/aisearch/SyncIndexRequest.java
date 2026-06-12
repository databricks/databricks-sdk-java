// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Request to synchronize a Delta Sync AI Search index with its source Delta table. */
@Generated
public class SyncIndexRequest {
  /**
   * Full resource name of the index to synchronize. Must be a Delta Sync index. Format: {@code
   * workspaces/{workspace_id}/endpoints/{endpoint_id}/indexes/{index_id}}
   */
  @JsonIgnore private String name;

  public SyncIndexRequest setName(String name) {
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
    SyncIndexRequest that = (SyncIndexRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncIndexRequest.class).add("name", name).toString();
  }
}
