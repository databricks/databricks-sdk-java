// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateMetastore {
  /** The user-specified name of the metastore. */
  @JsonProperty("name")
  private String name;

  /**
   * Cloud region which the metastore serves (e.g., `us-west-2`, `westus`). If this field is
   * omitted, the region of the workspace receiving the request will be used.
   */
  @JsonProperty("region")
  private String region;

  /** The storage root URL for metastore */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateMetastore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateMetastore setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateMetastore setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMetastore that = (CreateMetastore) o;
    return Objects.equals(name, that.name)
        && Objects.equals(region, that.region)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMetastore.class)
        .add("name", name)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
