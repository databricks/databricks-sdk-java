// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomTaskRunOutputInfo {
  /** Expiration time of the output schema of the task run (if any), in epoch milliseconds. */
  @JsonProperty("output_schema_expiration_time")
  private Long outputSchemaExpirationTime;

  /** Name of the output schema associated with the clean room task run. */
  @JsonProperty("output_schema_name")
  private String outputSchemaName;

  public CleanRoomTaskRunOutputInfo setOutputSchemaExpirationTime(Long outputSchemaExpirationTime) {
    this.outputSchemaExpirationTime = outputSchemaExpirationTime;
    return this;
  }

  public Long getOutputSchemaExpirationTime() {
    return outputSchemaExpirationTime;
  }

  public CleanRoomTaskRunOutputInfo setOutputSchemaName(String outputSchemaName) {
    this.outputSchemaName = outputSchemaName;
    return this;
  }

  public String getOutputSchemaName() {
    return outputSchemaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomTaskRunOutputInfo that = (CleanRoomTaskRunOutputInfo) o;
    return Objects.equals(outputSchemaExpirationTime, that.outputSchemaExpirationTime)
        && Objects.equals(outputSchemaName, that.outputSchemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputSchemaExpirationTime, outputSchemaName);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomTaskRunOutputInfo.class)
        .add("outputSchemaExpirationTime", outputSchemaExpirationTime)
        .add("outputSchemaName", outputSchemaName)
        .toString();
  }
}
