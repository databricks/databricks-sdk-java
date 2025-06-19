// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** Configures the Lakeview Dashboard job task type. */
@Generated
@JsonSerialize(using = DashboardTask.DashboardTaskSerializer.class)
@JsonDeserialize(using = DashboardTask.DashboardTaskDeserializer.class)
public class DashboardTask {
  /** The identifier of the dashboard to refresh. */
  private String dashboardId;

  /** Optional: subscription configuration for sending the dashboard snapshot. */
  private Subscription subscription;

  /**
   * Optional: The warehouse id to execute the dashboard with for the schedule. If not specified,
   * the default warehouse of the dashboard will be used.
   */
  private String warehouseId;

  public DashboardTask setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardTask setSubscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public DashboardTask setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardTask that = (DashboardTask) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(subscription, that.subscription)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, subscription, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTask.class)
        .add("dashboardId", dashboardId)
        .add("subscription", subscription)
        .add("warehouseId", warehouseId)
        .toString();
  }

  DashboardTaskPb toPb() {
    DashboardTaskPb pb = new DashboardTaskPb();
    pb.setDashboardId(dashboardId);
    pb.setSubscription(subscription);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static DashboardTask fromPb(DashboardTaskPb pb) {
    DashboardTask model = new DashboardTask();
    model.setDashboardId(pb.getDashboardId());
    model.setSubscription(pb.getSubscription());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class DashboardTaskSerializer extends JsonSerializer<DashboardTask> {
    @Override
    public void serialize(DashboardTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardTaskDeserializer extends JsonDeserializer<DashboardTask> {
    @Override
    public DashboardTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardTaskPb pb = mapper.readValue(p, DashboardTaskPb.class);
      return DashboardTask.fromPb(pb);
    }
  }
}
