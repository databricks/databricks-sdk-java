// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>Patch class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>op</code>.</p>
   *
   * @param op a {@link com.databricks.sdk.service.iam.PatchOp} object
   * @return a {@link com.databricks.sdk.service.iam.Patch} object
   */
  public Patch setOp(PatchOp op) {
    this.op = op;
    return this;
  }

  /**
   * <p>Getter for the field <code>op</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.PatchOp} object
   */
  public PatchOp getOp() {
    return op;
  }

  /**
   * <p>Setter for the field <code>path</code>.</p>
   *
   * @param path a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Patch} object
   */
  public Patch setPath(String path) {
    this.path = path;
    return this;
  }

  /**
   * <p>Getter for the field <code>path</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPath() {
    return path;
  }

  /**
   * <p>Setter for the field <code>value</code>.</p>
   *
   * @param value a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.Patch} object
   */
  public Patch setValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * <p>Getter for the field <code>value</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getValue() {
    return value;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Patch that = (Patch) o;
    return Objects.equals(op, that.op)
        && Objects.equals(path, that.path)
        && Objects.equals(value, that.value);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Patch.class)
        .add("op", op)
        .add("path", path)
        .add("value", value)
        .toString();
  }
}
