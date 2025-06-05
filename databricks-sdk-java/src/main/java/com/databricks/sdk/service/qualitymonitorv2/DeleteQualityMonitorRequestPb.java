// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a quality monitor */
@Generated
class DeleteQualityMonitorRequestPb {
  @JsonIgnore private String objectId;

  @JsonIgnore private String objectType;

  public DeleteQualityMonitorRequestPb setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public DeleteQualityMonitorRequestPb setObjectType(String objectType) {
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
    DeleteQualityMonitorRequestPb that = (DeleteQualityMonitorRequestPb) o;
    return Objects.equals(objectId, that.objectId) && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteQualityMonitorRequestPb.class)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }
}
