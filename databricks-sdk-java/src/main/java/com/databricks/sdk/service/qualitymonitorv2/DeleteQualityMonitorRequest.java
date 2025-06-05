// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a quality monitor */
@Generated
public class DeleteQualityMonitorRequest {
  /** The uuid of the request object. For example, schema id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: schema. */
  @JsonIgnore private String objectType;

  public DeleteQualityMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public DeleteQualityMonitorRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteQualityMonitorRequest that = (DeleteQualityMonitorRequest) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQualityMonitorRequest.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
