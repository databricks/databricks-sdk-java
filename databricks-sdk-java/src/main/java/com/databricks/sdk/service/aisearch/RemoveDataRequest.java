// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Request to remove rows by primary key from a Direct Access AI Search index. Named RemoveData (not
 * DeleteData) so the linter does not classify it as a standard AIP-135 Delete method — it deletes
 * rows within an index, not the index resource.
 */
@Generated
public class RemoveDataRequest {
  /**
   * Full resource name of the index. Must be a Direct Access index. Format: {@code
   * workspaces/{workspace_id}/endpoints/{endpoint_id}/indexes/{index_id}}
   */
  @JsonIgnore private String name;

  /** Primary keys of the rows to remove. */
  @JsonProperty("primary_keys")
  private Collection<String> primaryKeys;

  public RemoveDataRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public RemoveDataRequest setPrimaryKeys(Collection<String> primaryKeys) {
    this.primaryKeys = primaryKeys;
    return this;
  }

  public Collection<String> getPrimaryKeys() {
    return primaryKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoveDataRequest that = (RemoveDataRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(primaryKeys, that.primaryKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, primaryKeys);
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveDataRequest.class)
        .add("name", name)
        .add("primaryKeys", primaryKeys)
        .toString();
  }
}
