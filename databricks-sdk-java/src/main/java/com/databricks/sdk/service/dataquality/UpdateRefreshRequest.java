// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRefreshRequest {
  /** The UUID of the request object. For example, schema id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: `schema` or `table`. */
  @JsonIgnore private String objectType;

  /** The refresh to update. */
  @JsonProperty("refresh")
  private Refresh refresh;

  /** Unique id of the refresh operation. */
  @JsonIgnore private Long refreshId;

  /** The field mask to specify which fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateRefreshRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public UpdateRefreshRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public UpdateRefreshRequest setRefresh(Refresh refresh) {
    this.refresh = refresh;
    return this;
  }

  public Refresh getRefresh() {
    return refresh;
  }

  public UpdateRefreshRequest setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  public UpdateRefreshRequest setUpdateMask(String updateMask) {
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
    UpdateRefreshRequest that = (UpdateRefreshRequest) o;
    return Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(refresh, that.refresh)
        && Objects.equals(refreshId, that.refreshId)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, refresh, refreshId, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRefreshRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("refresh", refresh)
        .add("refreshId", refreshId)
        .add("updateMask", updateMask)
        .toString();
  }
}
