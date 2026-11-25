// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateSpaceRequest {
  /**
   * The name of the app space. The name must contain only lowercase alphanumeric characters and
   * hyphens. It must be unique within the workspace. It can't start or end with a hyphen, and it
   * can't be changed after the space is created.
   */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("space")
  private Space space;

  /**
   * Comma-separated names of the `space` fields to update, such as `description` or `resources`. A
   * field named in the mask but absent from `space` is cleared. Sent as a query parameter, not in
   * the `space` body.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateSpaceRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSpaceRequest setSpace(Space space) {
    this.space = space;
    return this;
  }

  public Space getSpace() {
    return space;
  }

  public UpdateSpaceRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateSpaceRequest that = (UpdateSpaceRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(space, that.space)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, space, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSpaceRequest.class)
        .add("name", name)
        .add("space", space)
        .add("updateMask", updateMask)
        .toString();
  }
}
