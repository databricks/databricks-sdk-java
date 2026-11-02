// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListMigrationsRequest {
  /** Filter by asset type. */
  @JsonIgnore
  @QueryParam("asset_type")
  private MigrationAssetType assetType;

  /** Maximum number of migrations to return. Default: 50, maximum: 1000. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Page token from a previous ListMigrations call. When paginating, all other parameters must
   * match the call that provided the page token.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Filter by migration state. Returns migrations in any of the specified states. */
  @JsonIgnore
  @QueryParam("states")
  private Collection<MigrationState> states;

  public ListMigrationsRequest setAssetType(MigrationAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public MigrationAssetType getAssetType() {
    return assetType;
  }

  public ListMigrationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListMigrationsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListMigrationsRequest setStates(Collection<MigrationState> states) {
    this.states = states;
    return this;
  }

  public Collection<MigrationState> getStates() {
    return states;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListMigrationsRequest that = (ListMigrationsRequest) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(states, that.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, pageSize, pageToken, states);
  }

  @Override
  public String toString() {
    return new ToStringer(ListMigrationsRequest.class)
        .add("assetType", assetType)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("states", states)
        .toString();
  }
}
