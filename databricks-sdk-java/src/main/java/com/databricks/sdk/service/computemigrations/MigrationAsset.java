// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A working copy (job or notebook) the migration agent created for the migration. */
@Generated
public class MigrationAsset {
  /** Type of asset this working copy represents. */
  @JsonProperty("asset_type")
  private MigrationAssetType assetType;

  /** Identifier of the asset. */
  @JsonProperty("id")
  private String id;

  /** Link to the asset, e.g. "jobs/12345". */
  @JsonProperty("uri")
  private String uri;

  public MigrationAsset setAssetType(MigrationAssetType assetType) {
    this.assetType = assetType;
    return this;
  }

  public MigrationAssetType getAssetType() {
    return assetType;
  }

  public MigrationAsset setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public MigrationAsset setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public String getUri() {
    return uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrationAsset that = (MigrationAsset) o;
    return Objects.equals(assetType, that.assetType)
        && Objects.equals(id, that.id)
        && Objects.equals(uri, that.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, id, uri);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrationAsset.class)
        .add("assetType", assetType)
        .add("id", id)
        .add("uri", uri)
        .toString();
  }
}
