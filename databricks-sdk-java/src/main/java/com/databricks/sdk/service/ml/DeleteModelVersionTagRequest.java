// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a model version tag */
@Generated
public class DeleteModelVersionTagRequest {
  /**
   * Name of the tag. The name must be an exact match; wild-card deletion is not supported. Maximum
   * size is 250 bytes.
   */
  @JsonIgnore
  @QueryParam("key")
  private String key;

  /** Name of the registered model that the tag was logged under. */
  @JsonIgnore
  @QueryParam("name")
  private String name;

  /** Model version number that the tag was logged under. */
  @JsonIgnore
  @QueryParam("version")
  private String version;

  public DeleteModelVersionTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteModelVersionTagRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteModelVersionTagRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteModelVersionTagRequest that = (DeleteModelVersionTagRequest) o;
    return Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteModelVersionTagRequest.class)
        .add("key", key)
        .add("name", name)
        .add("version", version)
        .toString();
  }
}
