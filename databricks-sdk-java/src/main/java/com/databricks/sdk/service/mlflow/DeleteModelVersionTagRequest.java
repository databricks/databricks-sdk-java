// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Delete a model version tag */
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
}
