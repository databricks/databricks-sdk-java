// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class UpdateCatalog {
  /** User-provided free-form text description. */
  @JsonProperty("comment")
  private String comment;

  /**
   * Dropped objects in the catalog remain recoverable for this number of hours before they are
   * permanently purged. The value applies to standard catalogs only, must be 0 or within the range
   * allowed for the metastore, and is inherited by schemas and tables that do not set their own
   * value.
   */
  @JsonProperty("custom_max_retention_hours")
  private Long customMaxRetentionHours;

  /**
   * Whether predictive optimization is enabled for this catalog and the objects under it. Valid
   * values are ENABLE, DISABLE, and INHERIT, where INHERIT applies the account-level setting.
   * Standard catalogs start as INHERIT and other catalog types as DISABLE. It cannot be set when
   * creating a catalog; use the update method instead.
   */
  @JsonProperty("enable_predictive_optimization")
  private EnablePredictiveOptimization enablePredictiveOptimization;

  /**
   * Whether the catalog is accessible from all workspaces attached to the metastore (OPEN) or only
   * from the workspaces bound to it (ISOLATED). It cannot be set when creating a catalog; change it
   * with the update method and manage the bound workspaces with the workspace bindings API. See
   * [Workspace-catalog binding].
   *
   * <p>[Workspace-catalog binding]: https://docs.databricks.com/aws/en/catalogs/binding
   */
  @JsonProperty("isolation_mode")
  private CatalogIsolationMode isolationMode;

  /**
   * Customer-managed key (CMK) settings control the encryption at rest of the catalog's managed
   * data.
   */
  @JsonProperty("managed_encryption_settings")
  private EncryptionSettings managedEncryptionSettings;

  /** The name of the catalog. */
  @JsonIgnore private String name;

  /** New name for the catalog. */
  @JsonProperty("new_name")
  private String newName;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("options")
  private Map<String, String> options;

  /** Username of current owner of catalog. */
  @JsonProperty("owner")
  private String owner;

  /** A map of key-value properties attached to the securable. */
  @JsonProperty("properties")
  private Map<String, String> properties;

  public UpdateCatalog setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateCatalog setCustomMaxRetentionHours(Long customMaxRetentionHours) {
    this.customMaxRetentionHours = customMaxRetentionHours;
    return this;
  }

  public Long getCustomMaxRetentionHours() {
    return customMaxRetentionHours;
  }

  public UpdateCatalog setEnablePredictiveOptimization(
      EnablePredictiveOptimization enablePredictiveOptimization) {
    this.enablePredictiveOptimization = enablePredictiveOptimization;
    return this;
  }

  public EnablePredictiveOptimization getEnablePredictiveOptimization() {
    return enablePredictiveOptimization;
  }

  public UpdateCatalog setIsolationMode(CatalogIsolationMode isolationMode) {
    this.isolationMode = isolationMode;
    return this;
  }

  public CatalogIsolationMode getIsolationMode() {
    return isolationMode;
  }

  public UpdateCatalog setManagedEncryptionSettings(EncryptionSettings managedEncryptionSettings) {
    this.managedEncryptionSettings = managedEncryptionSettings;
    return this;
  }

  public EncryptionSettings getManagedEncryptionSettings() {
    return managedEncryptionSettings;
  }

  public UpdateCatalog setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateCatalog setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateCatalog setOptions(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Map<String, String> getOptions() {
    return options;
  }

  public UpdateCatalog setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateCatalog setProperties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCatalog that = (UpdateCatalog) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(customMaxRetentionHours, that.customMaxRetentionHours)
        && Objects.equals(enablePredictiveOptimization, that.enablePredictiveOptimization)
        && Objects.equals(isolationMode, that.isolationMode)
        && Objects.equals(managedEncryptionSettings, that.managedEncryptionSettings)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(options, that.options)
        && Objects.equals(owner, that.owner)
        && Objects.equals(properties, that.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment,
        customMaxRetentionHours,
        enablePredictiveOptimization,
        isolationMode,
        managedEncryptionSettings,
        name,
        newName,
        options,
        owner,
        properties);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCatalog.class)
        .add("comment", comment)
        .add("customMaxRetentionHours", customMaxRetentionHours)
        .add("enablePredictiveOptimization", enablePredictiveOptimization)
        .add("isolationMode", isolationMode)
        .add("managedEncryptionSettings", managedEncryptionSettings)
        .add("name", name)
        .add("newName", newName)
        .add("options", options)
        .add("owner", owner)
        .add("properties", properties)
        .toString();
  }
}
