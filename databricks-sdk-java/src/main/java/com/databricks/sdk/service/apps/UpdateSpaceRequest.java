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
   * hyphens. It must be unique within the workspace.
   */
  @JsonIgnore private String name;

  /** */
  @JsonProperty("space")
  private Space space;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   *
   * <p>A field mask of `*` indicates full replacement. It’s recommended to always explicitly list
   * the fields being updated and avoid using `*` wildcards, as it can lead to unintended results if
   * the API changes in the future.
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
