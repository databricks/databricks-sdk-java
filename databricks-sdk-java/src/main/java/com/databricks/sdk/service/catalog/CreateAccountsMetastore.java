// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAccountsMetastore {
  /** The user-specified name of the metastore. */
  @JsonProperty("name")
  private String name;

  /** Cloud region which the metastore serves (e.g., `us-west-2`, `westus`). */
  @JsonProperty("region")
  private String region;

  /** The storage root URL for metastore */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateAccountsMetastore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateAccountsMetastore setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateAccountsMetastore setStorageRoot(String storageRoot) {
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
    CreateAccountsMetastore that = (CreateAccountsMetastore) o;
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
    return new ToStringer(CreateAccountsMetastore.class)
        .add("name", name)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
