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

/** Delete schedule subscription */
@Generated
@JsonSerialize(using = DeleteSubscriptionRequest.DeleteSubscriptionRequestSerializer.class)
@JsonDeserialize(using = DeleteSubscriptionRequest.DeleteSubscriptionRequestDeserializer.class)
public class DeleteSubscriptionRequest {
  /** UUID identifying the dashboard which the subscription belongs. */
  private String dashboardId;

  /**
   * The etag for the subscription. Can be optionally provided to ensure that the subscription has
   * not been modified since the last read.
   */
  private String etag;

  /** UUID identifying the schedule which the subscription belongs. */
  private String scheduleId;

  /** UUID identifying the subscription. */
  private String subscriptionId;

  public DeleteSubscriptionRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DeleteSubscriptionRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteSubscriptionRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public DeleteSubscriptionRequest setSubscriptionId(String subscriptionId) {
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
    DeleteSubscriptionRequest that = (DeleteSubscriptionRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(etag, that.etag)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(subscriptionId, that.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, etag, scheduleId, subscriptionId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSubscriptionRequest.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .add("subscriptionId", subscriptionId)
        .toString();
  }

  DeleteSubscriptionRequestPb toPb() {
    DeleteSubscriptionRequestPb pb = new DeleteSubscriptionRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setEtag(etag);
    pb.setScheduleId(scheduleId);
    pb.setSubscriptionId(subscriptionId);

    return pb;
  }

  static DeleteSubscriptionRequest fromPb(DeleteSubscriptionRequestPb pb) {
    DeleteSubscriptionRequest model = new DeleteSubscriptionRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setEtag(pb.getEtag());
    model.setScheduleId(pb.getScheduleId());
    model.setSubscriptionId(pb.getSubscriptionId());

    return model;
  }

  public static class DeleteSubscriptionRequestSerializer
      extends JsonSerializer<DeleteSubscriptionRequest> {
    @Override
    public void serialize(
        DeleteSubscriptionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSubscriptionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSubscriptionRequestDeserializer
      extends JsonDeserializer<DeleteSubscriptionRequest> {
    @Override
    public DeleteSubscriptionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSubscriptionRequestPb pb = mapper.readValue(p, DeleteSubscriptionRequestPb.class);
      return DeleteSubscriptionRequest.fromPb(pb);
    }
  }
}
