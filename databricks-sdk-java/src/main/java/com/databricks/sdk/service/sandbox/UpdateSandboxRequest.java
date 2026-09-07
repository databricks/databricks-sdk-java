// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSandboxRequest {
  /** Resource name of the sandbox to update, in the form `sandboxes/{sandbox_id}`. */
  @JsonIgnore private String name;

  /**
   * The Sandbox resource carrying new field values. Only fields named in `update_mask` are read;
   * unmasked fields are ignored.
   */
  @JsonProperty("sandbox")
  private Sandbox sandbox;

  /**
   * Field paths to update. Must be a non-empty subset of: - display_name -
   * spec.compute.inactivity_timeout Any other path returns INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSandboxRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSandboxRequest setSandbox(Sandbox sandbox) {
    this.sandbox = sandbox;
    return this;
  }

  public Sandbox getSandbox() {
    return sandbox;
  }

  public UpdateSandboxRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateSandboxRequest that = (UpdateSandboxRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(sandbox, that.sandbox)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sandbox, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSandboxRequest.class)
        .add("name", name)
        .add("sandbox", sandbox)
        .add("updateMask", updateMask)
        .toString();
  }
}
