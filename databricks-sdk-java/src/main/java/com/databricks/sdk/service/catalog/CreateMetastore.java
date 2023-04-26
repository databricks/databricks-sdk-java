// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateMetastore class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   */
  public CreateMetastore setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>region</code>.</p>
   *
   * @param region a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   */
  public CreateMetastore setRegion(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>Getter for the field <code>region</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRegion() {
    return region;
  }

  /**
   * <p>Setter for the field <code>storageRoot</code>.</p>
   *
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateMetastore} object
   */
  public CreateMetastore setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  /**
   * <p>Getter for the field <code>storageRoot</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getStorageRoot() {
    return storageRoot;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMetastore that = (CreateMetastore) o;
    return Objects.equals(name, that.name)
        && Objects.equals(region, that.region)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(name, region, storageRoot);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateMetastore.class)
        .add("name", name)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
