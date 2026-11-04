// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Unwraps a transport envelope from the source data so that each contained event becomes its own
 * row. Applied when the source data is read, before parsing.
 */
@Generated
public class Envelope {
  /** */
  @JsonProperty("cloud_watch_logs")
  private CloudWatchLogsEnvelope cloudWatchLogs;

  /** */
  @JsonProperty("json_array")
  private JsonArrayEnvelope jsonArray;

  public Envelope setCloudWatchLogs(CloudWatchLogsEnvelope cloudWatchLogs) {
    this.cloudWatchLogs = cloudWatchLogs;
    return this;
  }

  public CloudWatchLogsEnvelope getCloudWatchLogs() {
    return cloudWatchLogs;
  }

  public Envelope setJsonArray(JsonArrayEnvelope jsonArray) {
    this.jsonArray = jsonArray;
    return this;
  }

  public JsonArrayEnvelope getJsonArray() {
    return jsonArray;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Envelope that = (Envelope) o;
    return Objects.equals(cloudWatchLogs, that.cloudWatchLogs)
        && Objects.equals(jsonArray, that.jsonArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudWatchLogs, jsonArray);
  }

  @Override
  public String toString() {
    return new ToStringer(Envelope.class)
        .add("cloudWatchLogs", cloudWatchLogs)
        .add("jsonArray", jsonArray)
        .toString();
  }
}
