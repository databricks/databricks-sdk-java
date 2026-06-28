// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateVersionRequest {
  /**
   * The parent deployment where this version will be created. Format: deployments/{deployment_id}
   */
  @JsonIgnore private String parent;

  /** The version to create. */
  @JsonProperty("version")
  private Version version;

  /**
   * The ID to use for the version, which becomes the final component of the version's resource
   * name. A numeric string (base-10, fits in a signed 64-bit integer) chosen by the caller; must be
   * greater than or equal to 1. Must be numerically greater than the deployment's most recent
   * version (see `version.previous_version_id`); it does not need to start at 1 or increase by
   * exactly 1. If the value is not numerically greater, the server returns
   * `INVALID_PARAMETER_VALUE`.
   */
  @JsonIgnore
  @QueryParam("version_id")
  private String versionId;

  public CreateVersionRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateVersionRequest setVersion(Version version) {
    this.version = version;
    return this;
  }

  public Version getVersion() {
    return version;
  }

  public CreateVersionRequest setVersionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  public String getVersionId() {
    return versionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateVersionRequest that = (CreateVersionRequest) o;
    return Objects.equals(parent, that.parent)
        && Objects.equals(version, that.version)
        && Objects.equals(versionId, that.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, version, versionId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateVersionRequest.class)
        .add("parent", parent)
        .add("version", version)
        .add("versionId", versionId)
        .toString();
  }
}
