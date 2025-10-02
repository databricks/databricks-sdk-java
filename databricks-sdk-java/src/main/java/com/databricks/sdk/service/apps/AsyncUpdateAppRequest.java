// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AsyncUpdateAppRequest {
  /** */
  @JsonProperty("app")
  private App app;

  /** */
  @JsonIgnore private String appName;

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
  @JsonProperty("update_mask")
  private String updateMask;

  public AsyncUpdateAppRequest setApp(App app) {
    this.app = app;
    return this;
  }

  public App getApp() {
    return app;
  }

  public AsyncUpdateAppRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public AsyncUpdateAppRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AsyncUpdateAppRequest that = (AsyncUpdateAppRequest) o;
    return Objects.equals(app, that.app)
        && Objects.equals(appName, that.appName)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appName, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(AsyncUpdateAppRequest.class)
        .add("app", app)
        .add("appName", appName)
        .add("updateMask", updateMask)
        .toString();
  }
}
