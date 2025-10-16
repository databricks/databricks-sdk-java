// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataquality;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The Refresh object gives information on a refresh of the data quality monitoring pipeline. */
@Generated
public class Refresh {
  /** Time when the refresh ended (milliseconds since 1/1/1970 UTC). */
  @JsonProperty("end_time_ms")
  private Long endTimeMs;

  /**
   * An optional message to give insight into the current state of the refresh (e.g. FAILURE
   * messages).
   */
  @JsonProperty("message")
  private String message;

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
  @JsonProperty("object_id")
  private String objectId;

  /** The type of the monitored object. Can be one of the following: `schema`or `table`. */
  @JsonProperty("object_type")
  private String objectType;

  /** Unique id of the refresh operation. */
  @JsonProperty("refresh_id")
  private Long refreshId;

  /** Time when the refresh started (milliseconds since 1/1/1970 UTC). */
  @JsonProperty("start_time_ms")
  private Long startTimeMs;

  /** The current state of the refresh. */
  @JsonProperty("state")
  private RefreshState state;

  /** What triggered the refresh. */
  @JsonProperty("trigger")
  private RefreshTrigger trigger;

  public Refresh setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  public Long getEndTimeMs() {
    return endTimeMs;
  }

  public Refresh setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public Refresh setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public Refresh setObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public String getObjectType() {
    return objectType;
  }

  public Refresh setRefreshId(Long refreshId) {
    this.refreshId = refreshId;
    return this;
  }

  public Long getRefreshId() {
    return refreshId;
  }

  public Refresh setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  public Refresh setState(RefreshState state) {
    this.state = state;
    return this;
  }

  public RefreshState getState() {
    return state;
  }

  public Refresh setTrigger(RefreshTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  public RefreshTrigger getTrigger() {
    return trigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Refresh that = (Refresh) o;
    return Objects.equals(endTimeMs, that.endTimeMs)
        && Objects.equals(message, that.message)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType)
        && Objects.equals(refreshId, that.refreshId)
        && Objects.equals(startTimeMs, that.startTimeMs)
        && Objects.equals(state, that.state)
        && Objects.equals(trigger, that.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        endTimeMs, message, objectId, objectType, refreshId, startTimeMs, state, trigger);
  }

  @Override
  public String toString() {
    return new ToStringer(Refresh.class)
        .add("endTimeMs", endTimeMs)
        .add("message", message)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .add("refreshId", refreshId)
        .add("startTimeMs", startTimeMs)
        .add("state", state)
        .add("trigger", trigger)
        .toString();
  }
}
