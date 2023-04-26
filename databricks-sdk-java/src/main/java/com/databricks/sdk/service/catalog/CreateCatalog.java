// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/**
 * <p>CreateCatalog class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setName(String name) {
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
   * <p>Setter for the field <code>properties</code>.</p>
   *
   * @param properties a {@link java.util.Map} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * <p>Getter for the field <code>properties</code>.</p>
   *
   * @return a {@link java.util.Map} object
   */
  public Map<String, String> getProperties() {
    return properties;
  }

  /**
   * <p>Setter for the field <code>providerName</code>.</p>
   *
   * @param providerName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setProviderName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * <p>Getter for the field <code>providerName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getProviderName() {
    return providerName;
  }

  /**
   * <p>Setter for the field <code>shareName</code>.</p>
   *
   * @param shareName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setShareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  /**
   * <p>Getter for the field <code>shareName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getShareName() {
    return shareName;
  }

  /**
   * <p>Setter for the field <code>storageRoot</code>.</p>
   *
   * @param storageRoot a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.CreateCatalog} object
   */
  public CreateCatalog setStorageRoot(String storageRoot) {
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
    CreateCatalog that = (CreateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(properties, that.properties)
        && Objects.equals(providerName, that.providerName)
        && Objects.equals(shareName, that.shareName)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, name, properties, providerName, shareName, storageRoot);
  }

  /** {@inheritDoc} */
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
