// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/**
 * This mimics a parameterless custom method's request: all fields are path-bound, so the serialized
 * JSON body is the empty object {}.
 */
@Generated
public class SyncResourceRequest {
  /** Boolean path segment identifying the resource to sync. */
  @JsonIgnore private Boolean pathParamBool;

  /** Integer path segment identifying the resource to sync. */
  @JsonIgnore private Long pathParamInt;

  /** String path segment identifying the resource to sync. */
  @JsonIgnore private String pathParamString;

  public SyncResourceRequest setPathParamBool(Boolean pathParamBool) {
    this.pathParamBool = pathParamBool;
    return this;
  }

  public Boolean getPathParamBool() {
    return pathParamBool;
  }

  public SyncResourceRequest setPathParamInt(Long pathParamInt) {
    this.pathParamInt = pathParamInt;
    return this;
  }

  public Long getPathParamInt() {
    return pathParamInt;
  }

  public SyncResourceRequest setPathParamString(String pathParamString) {
    this.pathParamString = pathParamString;
    return this;
  }

  public String getPathParamString() {
    return pathParamString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SyncResourceRequest that = (SyncResourceRequest) o;
    return Objects.equals(pathParamBool, that.pathParamBool)
        && Objects.equals(pathParamInt, that.pathParamInt)
        && Objects.equals(pathParamString, that.pathParamString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathParamBool, pathParamInt, pathParamString);
  }

  @Override
  public String toString() {
    return new ToStringer(SyncResourceRequest.class)
        .add("pathParamBool", pathParamBool)
        .add("pathParamInt", pathParamInt)
        .add("pathParamString", pathParamString)
        .toString();
  }
}
