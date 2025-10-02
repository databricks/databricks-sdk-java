// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateRefreshRequest {
  /** The UUID of the request object. For example, table id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: table. */
  @JsonIgnore private String objectType;

  /** The refresh to create */
  @JsonProperty("refresh")
  private Refresh refresh;

  public CreateRefreshRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public CreateRefreshRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public CreateRefreshRequest setRefresh(Refresh refresh) {
    this.refresh = refresh;
    return this;
  }

  public Refresh getRefresh() {
    return refresh;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRefreshRequest that = (CreateRefreshRequest) o;
    return Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(refresh, that.refresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, refresh);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRefreshRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("refresh", refresh)
        .toString();
  }
}
