// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Patch {
  /** Type of patch operation. */
  @JsonProperty("op")
  private PatchOp op;

  /** Selection of patch operation */
  @JsonProperty("path")
  private String path;

  /** Value to modify */
  @JsonProperty("value")
  private String value;

  public Patch setOp(PatchOp op) {
    this.op = op;
    return this;
  }

  public PatchOp getOp() {
    return op;
  }

  public Patch setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public Patch setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Patch that = (Patch) o;
    return Objects.equals(op, that.op)
        && Objects.equals(path, that.path)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    return new ToStringer(Patch.class)
        .add("op", op)
        .add("path", path)
        .add("value", value)
        .toString();
  }
}
