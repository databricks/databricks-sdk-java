// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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

/** Get schedule subscription */
@Generated
@JsonSerialize(using = GetSubscriptionRequest.GetSubscriptionRequestSerializer.class)
@JsonDeserialize(using = GetSubscriptionRequest.GetSubscriptionRequestDeserializer.class)
public class GetSubscriptionRequest {
  /** UUID identifying the dashboard which the subscription belongs. */
  private String dashboardId;

  /** UUID identifying the schedule which the subscription belongs. */
  private String scheduleId;

  /** UUID identifying the subscription. */
  private String subscriptionId;

  public GetSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public GetSubscriptionRequest setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetSubscriptionRequest that = (GetSubscriptionRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }

  GetSubscriptionRequestPb toPb() {
    GetSubscriptionRequestPb pb = new GetSubscriptionRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setScheduleId(scheduleId);
    pb.setSubscriptionId(subscriptionId);

    return pb;
  }

  static GetSubscriptionRequest fromPb(GetSubscriptionRequestPb pb) {
    GetSubscriptionRequest model = new GetSubscriptionRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setScheduleId(pb.getScheduleId());
    model.setSubscriptionId(pb.getSubscriptionId());

    return model;
  }

  public static class GetSubscriptionRequestSerializer
      extends JsonSerializer<GetSubscriptionRequest> {
    @Override
    public void serialize(
        GetSubscriptionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetSubscriptionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetSubscriptionRequestDeserializer
      extends JsonDeserializer<GetSubscriptionRequest> {
    @Override
    public GetSubscriptionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetSubscriptionRequestPb pb = mapper.readValue(p, GetSubscriptionRequestPb.class);
      return GetSubscriptionRequest.fromPb(pb);
    }
  }
}
