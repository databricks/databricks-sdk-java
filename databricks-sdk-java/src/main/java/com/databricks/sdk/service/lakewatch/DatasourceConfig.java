// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * Per-catalog datasource-related config. Singleton. Name format:
 * `catalogs/{catalog}/datasourceConfig`.
 */
@Generated
public class DatasourceConfig {
  /**
   * Default compute mode applied to datasource ingestion jobs when the individual datasource
   * doesn't override it. v1 `datasources.defaultComputeMode`.
   */
  @JsonProperty("default_compute_mode")
  private DatasourceComputeMode defaultComputeMode;

  /**
   * Schema name of the registered folder (in this catalog) that a new datasource is placed in when
   * the request does not specify a schema. Must name a schema registered as a folder. Omit to
   * clear. Reads return the value as supplied; the folder's current schema name is reported in
   * `effective_default_folder`.
   */
  @JsonProperty("default_folder")
  private String defaultFolder;

  /**
   * The current schema name of the `default_folder` folder. Tracks UC schema renames. Unset when no
   * default is configured, or when the folder's schema no longer exists or is not visible to the
   * caller.
   */
  @JsonProperty("effective_default_folder")
  private String effectiveDefaultFolder;

  /**
   * Opaque entity tag for optimistic concurrency. Returned on every read; pass it back as the
   * Update request's `etag` to make the update conditional on the resource being unchanged.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** */
  @JsonProperty("updated_by")
  private Principal updatedBy;

  /**
   * Monotonic version, bumped on each update. Informational; use `etag` for optimistic concurrency.
   */
  @JsonProperty("version")
  private Long version;

  public DatasourceConfig setDefaultComputeMode(DatasourceComputeMode defaultComputeMode) {
    this.defaultComputeMode = defaultComputeMode;
    return this;
  }

  public DatasourceComputeMode getDefaultComputeMode() {
    return defaultComputeMode;
  }

  public DatasourceConfig setDefaultFolder(String defaultFolder) {
    this.defaultFolder = defaultFolder;
    return this;
  }

  public String getDefaultFolder() {
    return defaultFolder;
  }

  public DatasourceConfig setEffectiveDefaultFolder(String effectiveDefaultFolder) {
    this.effectiveDefaultFolder = effectiveDefaultFolder;
    return this;
  }

  public String getEffectiveDefaultFolder() {
    return effectiveDefaultFolder;
  }

  public DatasourceConfig setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DatasourceConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DatasourceConfig setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public DatasourceConfig setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public DatasourceConfig setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatasourceConfig that = (DatasourceConfig) o;
    return Objects.equals(defaultComputeMode, that.defaultComputeMode)
        && Objects.equals(defaultFolder, that.defaultFolder)
        && Objects.equals(effectiveDefaultFolder, that.effectiveDefaultFolder)
        && Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultComputeMode,
        defaultFolder,
        effectiveDefaultFolder,
        etag,
        name,
        updateTime,
        updatedBy,
        version);
  }

  @Override
  public String toString() {
    return new ToStringer(DatasourceConfig.class)
        .add("defaultComputeMode", defaultComputeMode)
        .add("defaultFolder", defaultFolder)
        .add("effectiveDefaultFolder", effectiveDefaultFolder)
        .add("etag", etag)
        .add("name", name)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
