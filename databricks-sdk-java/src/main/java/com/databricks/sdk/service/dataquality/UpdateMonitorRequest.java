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

  /**
   * The UUID of the request object. It is `schema_id` for `schema`, and `table_id` for `table`.
   *
   * <p>Find the `schema_id` from either: 1. The [schema_id] of the `Schemas` resource. 2. In
   * [Catalog Explorer] > select the `schema` > go to the `Details` tab > the `Schema ID` field.
   *
   * <p>Find the `table_id` from either: 1. The [table_id] of the `Tables` resource. 2. In [Catalog
   * Explorer] > select the `table` > go to the `Details` tab > the `Table ID` field.
   *
   * <p>[Catalog Explorer]: https://docs.databricks.com/aws/en/catalog-explorer/ [schema_id]:
   * https://docs.databricks.com/api/workspace/schemas/get#schema_id [table_id]:
   * https://docs.databricks.com/api/workspace/tables/get#table_id
   */
  @JsonIgnore private String objectId;

  /** The type of the monitored object. Can be one of the following: `schema` or `table`. */
  @JsonIgnore private String objectType;

  /**
   * The field mask to specify which fields to update as a comma-separated list. Example value:
   * `data_profiling_config.custom_metrics,data_profiling_config.schedule.quartz_cron_expression`
   */
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
