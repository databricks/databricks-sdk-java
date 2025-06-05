// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

@Generated
@JsonSerialize(using = ClusterAutoRestartMessage.ClusterAutoRestartMessageSerializer.class)
@JsonDeserialize(using = ClusterAutoRestartMessage.ClusterAutoRestartMessageDeserializer.class)
public class ClusterAutoRestartMessage {
  /** */
  private Boolean canToggle;

  /** */
  private Boolean enabled;

  /**
   * Contains an information about the enablement status judging (e.g. whether the enterprise tier
   * is enabled) This is only additional information that MUST NOT be used to decide whether the
   * setting is enabled or not. This is intended to use only for purposes like showing an error
   * message to the customer with the additional details. For example, using these details we can
   * check why exactly the feature is disabled for this customer.
   */
  private ClusterAutoRestartMessageEnablementDetails enablementDetails;

  /** */
  private ClusterAutoRestartMessageMaintenanceWindow maintenanceWindow;

  /** */
  private Boolean restartEvenIfNoUpdatesAvailable;

  public ClusterAutoRestartMessage setCanToggle(Boolean canToggle) {
    this.canToggle = canToggle;
    return this;
  }

  public Boolean getCanToggle() {
    return canToggle;
  }

  public ClusterAutoRestartMessage setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public ClusterAutoRestartMessage setEnablementDetails(
      ClusterAutoRestartMessageEnablementDetails enablementDetails) {
    this.enablementDetails = enablementDetails;
    return this;
  }

  public ClusterAutoRestartMessageEnablementDetails getEnablementDetails() {
    return enablementDetails;
  }

  public ClusterAutoRestartMessage setMaintenanceWindow(
      ClusterAutoRestartMessageMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  public ClusterAutoRestartMessageMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  public ClusterAutoRestartMessage setRestartEvenIfNoUpdatesAvailable(
      Boolean restartEvenIfNoUpdatesAvailable) {
    this.restartEvenIfNoUpdatesAvailable = restartEvenIfNoUpdatesAvailable;
    return this;
  }

  public Boolean getRestartEvenIfNoUpdatesAvailable() {
    return restartEvenIfNoUpdatesAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessage that = (ClusterAutoRestartMessage) o;
    return Objects.equals(canToggle, that.canToggle)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(enablementDetails, that.enablementDetails)
        && Objects.equals(maintenanceWindow, that.maintenanceWindow)
        && Objects.equals(restartEvenIfNoUpdatesAvailable, that.restartEvenIfNoUpdatesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canToggle, enabled, enablementDetails, maintenanceWindow, restartEvenIfNoUpdatesAvailable);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessage.class)
        .add("canToggle", canToggle)
        .add("enabled", enabled)
        .add("enablementDetails", enablementDetails)
        .add("maintenanceWindow", maintenanceWindow)
        .add("restartEvenIfNoUpdatesAvailable", restartEvenIfNoUpdatesAvailable)
        .toString();
  }

  ClusterAutoRestartMessagePb toPb() {
    ClusterAutoRestartMessagePb pb = new ClusterAutoRestartMessagePb();
    pb.setCanToggle(canToggle);
    pb.setEnabled(enabled);
    pb.setEnablementDetails(enablementDetails);
    pb.setMaintenanceWindow(maintenanceWindow);
    pb.setRestartEvenIfNoUpdatesAvailable(restartEvenIfNoUpdatesAvailable);

    return pb;
  }

  static ClusterAutoRestartMessage fromPb(ClusterAutoRestartMessagePb pb) {
    ClusterAutoRestartMessage model = new ClusterAutoRestartMessage();
    model.setCanToggle(pb.getCanToggle());
    model.setEnabled(pb.getEnabled());
    model.setEnablementDetails(pb.getEnablementDetails());
    model.setMaintenanceWindow(pb.getMaintenanceWindow());
    model.setRestartEvenIfNoUpdatesAvailable(pb.getRestartEvenIfNoUpdatesAvailable());

    return model;
  }

  public static class ClusterAutoRestartMessageSerializer
      extends JsonSerializer<ClusterAutoRestartMessage> {
    @Override
    public void serialize(
        ClusterAutoRestartMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterAutoRestartMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAutoRestartMessageDeserializer
      extends JsonDeserializer<ClusterAutoRestartMessage> {
    @Override
    public ClusterAutoRestartMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAutoRestartMessagePb pb = mapper.readValue(p, ClusterAutoRestartMessagePb.class);
      return ClusterAutoRestartMessage.fromPb(pb);
    }
  }
}
