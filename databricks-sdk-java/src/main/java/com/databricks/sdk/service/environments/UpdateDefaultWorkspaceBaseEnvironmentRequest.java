// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.environments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateDefaultWorkspaceBaseEnvironmentRequest {
  /** Required. The default workspace base environment configuration to update. */
  @JsonProperty("default_workspace_base_environment")
  private DefaultWorkspaceBaseEnvironment defaultWorkspaceBaseEnvironment;

  /** The resource name of this singleton resource. Format: default-workspace-base-environment */
  @JsonIgnore private String name;

  /**
   * Field mask specifying which fields to update. Use comma as the separator for multiple fields
   * (no space). The special value '*' indicates that all fields should be updated (full
   * replacement). Valid field paths: cpu_workspace_base_environment, gpu_workspace_base_environment
   *
   * <p>To unset one or both defaults, include the field path(s) in the mask and omit them from the
   * request body. To unset both, you must list both paths explicitly — the wildcard '*' cannot be
   * used to unset fields.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateDefaultWorkspaceBaseEnvironmentRequest setDefaultWorkspaceBaseEnvironment(
      DefaultWorkspaceBaseEnvironment defaultWorkspaceBaseEnvironment) {
    this.defaultWorkspaceBaseEnvironment = defaultWorkspaceBaseEnvironment;
    return this;
  }

  public DefaultWorkspaceBaseEnvironment getDefaultWorkspaceBaseEnvironment() {
    return defaultWorkspaceBaseEnvironment;
  }

  public UpdateDefaultWorkspaceBaseEnvironmentRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateDefaultWorkspaceBaseEnvironmentRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateDefaultWorkspaceBaseEnvironmentRequest that =
        (UpdateDefaultWorkspaceBaseEnvironmentRequest) o;
    return Objects.equals(defaultWorkspaceBaseEnvironment, that.defaultWorkspaceBaseEnvironment)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWorkspaceBaseEnvironment, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDefaultWorkspaceBaseEnvironmentRequest.class)
        .add("defaultWorkspaceBaseEnvironment", defaultWorkspaceBaseEnvironment)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}
