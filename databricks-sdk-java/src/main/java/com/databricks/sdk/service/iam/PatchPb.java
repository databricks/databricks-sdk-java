// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PatchPb {
  @JsonProperty("op")
  private PatchOp op;

  @JsonProperty("path")
  private String path;

  @JsonProperty("value")
  private Object value;

  public PatchPb setOp(PatchOp op) {
    this.op = op;
    return this;
  }

  public PatchOp getOp() {
    return op;
  }

  public PatchPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public PatchPb setValue(Object value) {
    this.value = value;
    return this;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchPb that = (PatchPb) o;
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
    return new ToStringer(PatchPb.class)
        .add("op", op)
        .add("path", path)
        .add("value", value)
        .toString();
  }
}
