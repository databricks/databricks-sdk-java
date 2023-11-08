// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AppEvents {
  /** */
  @JsonProperty("event_name")
  private String eventName;

  /** */
  @JsonProperty("event_time")
  private String eventTime;

  /** */
  @JsonProperty("event_type")
  private String eventType;

  /** */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("service_name")
  private String serviceName;

  public AppEvents setEventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  public String getEventName() {
    return eventName;
  }

  public AppEvents setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  public String getEventTime() {
    return eventTime;
  }

  public AppEvents setEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  public String getEventType() {
    return eventType;
  }

  public AppEvents setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public AppEvents setServiceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  public String getServiceName() {
    return serviceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppEvents that = (AppEvents) o;
    return Objects.equals(eventName, that.eventName)
        && Objects.equals(eventTime, that.eventTime)
        && Objects.equals(eventType, that.eventType)
        && Objects.equals(message, that.message)
        && Objects.equals(serviceName, that.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, eventTime, eventType, message, serviceName);
  }

  @Override
  public String toString() {
    return new ToStringer(AppEvents.class)
        .add("eventName", eventName)
        .add("eventTime", eventTime)
        .add("eventType", eventType)
        .add("message", message)
        .add("serviceName", serviceName)
        .toString();
  }
}
