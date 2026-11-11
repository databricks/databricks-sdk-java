// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * Catch-all per-catalog config — settings that don't belong to any one resource family. Singleton.
 * Name format: `catalogs/{catalog}/commonConfig`.
 */
@Generated
public class CommonConfig {
  /**
   * Opaque entity tag for optimistic concurrency. Returned on every read; pass it back as the
   * Update request's `etag` to make the update conditional on the resource being unchanged.
   */
  @JsonProperty("etag")
  private String etag;

  /** */
  @JsonProperty("name")
  private String name;

  /**
   * Whether users may grant permissions on individual resources rather than only at the Folder
   * level.
   */
  @JsonProperty("per_resource_permissions_enabled")
  private Boolean perResourcePermissionsEnabled;

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

  public CommonConfig setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CommonConfig setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CommonConfig setPerResourcePermissionsEnabled(Boolean perResourcePermissionsEnabled) {
    this.perResourcePermissionsEnabled = perResourcePermissionsEnabled;
    return this;
  }

  public Boolean getPerResourcePermissionsEnabled() {
    return perResourcePermissionsEnabled;
  }

  public CommonConfig setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public CommonConfig setUpdatedBy(Principal updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Principal getUpdatedBy() {
    return updatedBy;
  }

  public CommonConfig setVersion(Long version) {
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
    CommonConfig that = (CommonConfig) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(name, that.name)
        && Objects.equals(perResourcePermissionsEnabled, that.perResourcePermissionsEnabled)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updatedBy, that.updatedBy)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, name, perResourcePermissionsEnabled, updateTime, updatedBy, version);
  }

  @Override
  public String toString() {
    return new ToStringer(CommonConfig.class)
        .add("etag", etag)
        .add("name", name)
        .add("perResourcePermissionsEnabled", perResourcePermissionsEnabled)
        .add("updateTime", updateTime)
        .add("updatedBy", updatedBy)
        .add("version", version)
        .toString();
  }
}
