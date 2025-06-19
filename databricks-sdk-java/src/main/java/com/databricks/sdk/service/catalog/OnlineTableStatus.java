// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Status of an online table. */
@Generated
@JsonSerialize(using = OnlineTableStatus.OnlineTableStatusSerializer.class)
@JsonDeserialize(using = OnlineTableStatus.OnlineTableStatusDeserializer.class)
public class OnlineTableStatus {
  /**
   * Detailed status of an online table. Shown if the online table is in the
   * ONLINE_CONTINUOUS_UPDATE or the ONLINE_UPDATING_PIPELINE_RESOURCES state.
   */
  private ContinuousUpdateStatus continuousUpdateStatus;

  /** The state of the online table. */
  private OnlineTableState detailedState;

  /**
   * Detailed status of an online table. Shown if the online table is in the OFFLINE_FAILED or the
   * ONLINE_PIPELINE_FAILED state.
   */
  private FailedStatus failedStatus;

  /** A text description of the current state of the online table. */
  private String message;

  /**
   * Detailed status of an online table. Shown if the online table is in the
   * PROVISIONING_PIPELINE_RESOURCES or the PROVISIONING_INITIAL_SNAPSHOT state.
   */
  private ProvisioningStatus provisioningStatus;

  /**
   * Detailed status of an online table. Shown if the online table is in the ONLINE_TRIGGERED_UPDATE
   * or the ONLINE_NO_PENDING_UPDATE state.
   */
  private TriggeredUpdateStatus triggeredUpdateStatus;

  public OnlineTableStatus setContinuousUpdateStatus(
      ContinuousUpdateStatus continuousUpdateStatus) {
    this.continuousUpdateStatus = continuousUpdateStatus;
    return this;
  }

  public ContinuousUpdateStatus getContinuousUpdateStatus() {
    return continuousUpdateStatus;
  }

  public OnlineTableStatus setDetailedState(OnlineTableState detailedState) {
    this.detailedState = detailedState;
    return this;
  }

  public OnlineTableState getDetailedState() {
    return detailedState;
  }

  public OnlineTableStatus setFailedStatus(FailedStatus failedStatus) {
    this.failedStatus = failedStatus;
    return this;
  }

  public FailedStatus getFailedStatus() {
    return failedStatus;
  }

  public OnlineTableStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public OnlineTableStatus setProvisioningStatus(ProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }

  public ProvisioningStatus getProvisioningStatus() {
    return provisioningStatus;
  }

  public OnlineTableStatus setTriggeredUpdateStatus(TriggeredUpdateStatus triggeredUpdateStatus) {
    this.triggeredUpdateStatus = triggeredUpdateStatus;
    return this;
  }

  public TriggeredUpdateStatus getTriggeredUpdateStatus() {
    return triggeredUpdateStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineTableStatus that = (OnlineTableStatus) o;
    return Objects.equals(continuousUpdateStatus, that.continuousUpdateStatus)
        && Objects.equals(detailedState, that.detailedState)
        && Objects.equals(failedStatus, that.failedStatus)
        && Objects.equals(message, that.message)
        && Objects.equals(provisioningStatus, that.provisioningStatus)
        && Objects.equals(triggeredUpdateStatus, that.triggeredUpdateStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        continuousUpdateStatus,
        detailedState,
        failedStatus,
        message,
        provisioningStatus,
        triggeredUpdateStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(OnlineTableStatus.class)
        .add("continuousUpdateStatus", continuousUpdateStatus)
        .add("detailedState", detailedState)
        .add("failedStatus", failedStatus)
        .add("message", message)
        .add("provisioningStatus", provisioningStatus)
        .add("triggeredUpdateStatus", triggeredUpdateStatus)
        .toString();
  }

  OnlineTableStatusPb toPb() {
    OnlineTableStatusPb pb = new OnlineTableStatusPb();
    pb.setContinuousUpdateStatus(continuousUpdateStatus);
    pb.setDetailedState(detailedState);
    pb.setFailedStatus(failedStatus);
    pb.setMessage(message);
    pb.setProvisioningStatus(provisioningStatus);
    pb.setTriggeredUpdateStatus(triggeredUpdateStatus);

    return pb;
  }

  static OnlineTableStatus fromPb(OnlineTableStatusPb pb) {
    OnlineTableStatus model = new OnlineTableStatus();
    model.setContinuousUpdateStatus(pb.getContinuousUpdateStatus());
    model.setDetailedState(pb.getDetailedState());
    model.setFailedStatus(pb.getFailedStatus());
    model.setMessage(pb.getMessage());
    model.setProvisioningStatus(pb.getProvisioningStatus());
    model.setTriggeredUpdateStatus(pb.getTriggeredUpdateStatus());

    return model;
  }

  public static class OnlineTableStatusSerializer extends JsonSerializer<OnlineTableStatus> {
    @Override
    public void serialize(OnlineTableStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OnlineTableStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OnlineTableStatusDeserializer extends JsonDeserializer<OnlineTableStatus> {
    @Override
    public OnlineTableStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OnlineTableStatusPb pb = mapper.readValue(p, OnlineTableStatusPb.class);
      return OnlineTableStatus.fromPb(pb);
    }
  }
}
