// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Request to cancel a refresh. */
@Generated
public class CancelRefreshRequest {
  /** The UUID of the request object. For example, schema id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: schema or table. */
  @JsonIgnore private String objectType;

  /** Unique id of the refresh operation. */
  @JsonIgnore private Long refreshId;

  public CancelRefreshRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public CancelRefreshRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public CancelRefreshRequest setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CancelRefreshRequest that = (CancelRefreshRequest) o;
    return Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(refreshId, that.refreshId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, refreshId);
  }

  @Override
  public String toString() {
    return new ToStringer(CancelRefreshRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("refreshId", refreshId)
        .toString();
  }
}
