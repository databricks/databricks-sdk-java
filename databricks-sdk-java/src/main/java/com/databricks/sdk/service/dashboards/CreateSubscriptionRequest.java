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

/** Create schedule subscription */
@Generated
@JsonSerialize(using = CreateSubscriptionRequest.CreateSubscriptionRequestSerializer.class)
@JsonDeserialize(using = CreateSubscriptionRequest.CreateSubscriptionRequestDeserializer.class)
public class CreateSubscriptionRequest {
  /** UUID identifying the dashboard to which the subscription belongs. */
  private String dashboardId;

  /** UUID identifying the schedule to which the subscription belongs. */
  private String scheduleId;

  /** */
  private Subscription subscription;

  public CreateSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public CreateSubscriptionRequest setSubscription(Subscription subscription) {
    this.subscription = subscription;
    return this;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSubscriptionRequest that = (CreateSubscriptionRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscription, that.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId, subscription);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .add("subscription", subscription)
        .toString();
  }

  CreateSubscriptionRequestPb toPb() {
    CreateSubscriptionRequestPb pb = new CreateSubscriptionRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setScheduleId(scheduleId);
    pb.setSubscription(subscription);

    return pb;
  }

  static CreateSubscriptionRequest fromPb(CreateSubscriptionRequestPb pb) {
    CreateSubscriptionRequest model = new CreateSubscriptionRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setScheduleId(pb.getScheduleId());
    model.setSubscription(pb.getSubscription());

    return model;
  }

  public static class CreateSubscriptionRequestSerializer
      extends JsonSerializer<CreateSubscriptionRequest> {
    @Override
    public void serialize(
        CreateSubscriptionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateSubscriptionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateSubscriptionRequestDeserializer
      extends JsonDeserializer<CreateSubscriptionRequest> {
    @Override
    public CreateSubscriptionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateSubscriptionRequestPb pb = mapper.readValue(p, CreateSubscriptionRequestPb.class);
      return CreateSubscriptionRequest.fromPb(pb);
    }
  }
}
