// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** Response for Heartbeat. */
@Generated
public class HeartbeatResponse {
  /** The new lock expiry time after renewal. */
  @JsonProperty("expire_time")
  private Timestamp expireTime;

  public HeartbeatResponse setExpireTime(Timestamp expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public Timestamp getExpireTime() {
    return expireTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HeartbeatResponse that = (HeartbeatResponse) o;
    return Objects.equals(expireTime, that.expireTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireTime);
  }

  @Override
  public String toString() {
    return new ToStringer(HeartbeatResponse.class).add("expireTime", expireTime).toString();
  }
}
