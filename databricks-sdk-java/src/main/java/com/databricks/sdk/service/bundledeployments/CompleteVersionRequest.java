// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A request to complete a Version. */
@Generated
public class CompleteVersionRequest {
  /**
   * The reason for completing the version. Must be a terminal reason: VERSION_COMPLETE_SUCCESS,
   * VERSION_COMPLETE_FAILURE, or VERSION_COMPLETE_FORCE_ABORT.
   */
  @JsonProperty("completion_reason")
  private VersionComplete completionReason;

  /**
   * If true, force-completes the version even if the caller is not the original creator. The
   * completion_reason must be VERSION_COMPLETE_FORCE_ABORT when force is true.
   */
  @JsonProperty("force")
  private Boolean force;

  /**
   * The name of the version to complete. Format: deployments/{deployment_id}/versions/{version_id}
   */
  @JsonIgnore private String name;

  public CompleteVersionRequest setCompletionReason(VersionComplete completionReason) {
    this.completionReason = completionReason;
    return this;
  }

  public VersionComplete getCompletionReason() {
    return completionReason;
  }

  public CompleteVersionRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public CompleteVersionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompleteVersionRequest that = (CompleteVersionRequest) o;
    return Objects.equals(completionReason, that.completionReason)
        && Objects.equals(force, that.force)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionReason, force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(CompleteVersionRequest.class)
        .add("completionReason", completionReason)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
