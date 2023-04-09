// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

public class CreateCatalog {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /** Name of catalog. */
  @JsonProperty("name")
  private String name;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  /**
   * The name of delta sharing provider.
   *
   * <p>A Delta Sharing catalog is a catalog that is based on a Delta share on a remote sharing
   * server.
   */
  @JsonProperty("provider_name")
  private String providerName;

  /** The name of the share under the share provider. */
  @JsonProperty("share_name")
  private String shareName;

  /** Storage root URL for managed tables within catalog. */
  @JsonProperty("storage_root")
  private String storageRoot;

  public CreateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public CreateCatalog setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  public String getProviderName() {
    return providerName;
  }

  public CreateCatalog setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public String getShareName() {
    return shareName;
  }

  public CreateCatalog setStorageRoot(String storageRoot) {
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
    CreateCatalog that = (CreateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, properties, providerName, shareName, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCatalog.class)
        .add("comment", comment)
        .add("name", name)
        .add("properties", properties)
        .add("providerName", providerName)
        .add("shareName", shareName)
        .add("storageRoot", storageRoot)
        .toString();
  }
}
