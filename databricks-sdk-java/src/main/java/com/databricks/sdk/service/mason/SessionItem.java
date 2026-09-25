// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A transcript entry in a session's history. */
@Generated
public class SessionItem {
  /**
   * Server-assigned time when the append commits. Values are nondecreasing within a session. Item
   * listing orders by this timestamp; equal timestamps are resolved by committed append order.
   */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Complete SDK-native, JSON-compatible item. The service stores and returns this value without
   * interpreting provider-specific fields such as `type`, `role`, or `content`.
   */
  @JsonProperty("data")
  private JsonNode data;

  /** Stable service-generated item ID. */
  @JsonProperty("item_id")
  private String itemId;

  public SessionItem setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SessionItem setData(JsonNode data) {
    this.data = data;
    return this;
  }

  public JsonNode getData() {
    return data;
  }

  public SessionItem setItemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  public String getItemId() {
    return itemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SessionItem that = (SessionItem) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(data, that.data)
        && Objects.equals(itemId, that.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, data, itemId);
  }

  @Override
  public String toString() {
    return new ToStringer(SessionItem.class)
        .add("createTime", createTime)
        .add("data", data)
        .add("itemId", itemId)
        .toString();
  }
}
