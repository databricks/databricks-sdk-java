// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateMonitorRequest {
  /** The monitor to update. */
  @JsonProperty("monitor")
  private Monitor monitor;

  /** The UUID of the request object. For example, schema id. */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: schema or table. */
  @JsonIgnore private String objectType;

  /** The field mask to specify which fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateMonitorRequest setMonitor(Monitor monitor) {
    this.monitor = monitor;
    return this;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public UpdateMonitorRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public UpdateMonitorRequest setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public UpdateMonitorRequest setUpdateMask(String updateMask) {
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
    UpdateMonitorRequest that = (UpdateMonitorRequest) o;
    return Objects.equals(monitor, that.monitor)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitor, objectId, objectType, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateMonitorRequest.class)
        .add("monitor", monitor)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("updateMask", updateMask)
        .toString();
  }
}
