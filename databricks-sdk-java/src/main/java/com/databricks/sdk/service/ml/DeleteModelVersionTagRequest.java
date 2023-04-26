// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a model version tag
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteModelVersionTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  @QueryParam("key")
  private String key;

  /** Name of the registered model that the tag was logged under. */
  @QueryParam("name")
  private String name;

  /** Model version number that the tag was logged under. */
  @QueryParam("version")
  private String version;

  /**
   * <p>Setter for the field <code>key</code>.</p>
   *
   * @param key a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteModelVersionTagRequest} object
   */
  public DeleteModelVersionTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  /**
   * <p>Getter for the field <code>key</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getKey() {
    return key;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteModelVersionTagRequest} object
   */
  public DeleteModelVersionTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>version</code>.</p>
   *
   * @param version a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.DeleteModelVersionTagRequest} object
   */
  public DeleteModelVersionTagRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Getter for the field <code>version</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getVersion() {
    return version;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelVersionTagRequest that = (DeleteModelVersionTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(key, name, version);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
