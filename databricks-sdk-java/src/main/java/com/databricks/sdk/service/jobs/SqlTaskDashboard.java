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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = SqlTaskDashboard.SqlTaskDashboardSerializer.class)
@JsonDeserialize(using = SqlTaskDashboard.SqlTaskDashboardDeserializer.class)
public class SqlTaskDashboard {
  /** Subject of the email sent to subscribers of this task. */
  private String customSubject;

  /** The canonical identifier of the SQL dashboard. */
  private String dashboardId;

  /** If true, the dashboard snapshot is not taken, and emails are not sent to subscribers. */
  private Boolean pauseSubscriptions;

  /** If specified, dashboard snapshots are sent to subscriptions. */
  private Collection<SqlTaskSubscription> subscriptions;

  public SqlTaskDashboard setCustomSubject(String customSubject) {
    this.customSubject = customSubject;
    return this;
  }

  public String getCustomSubject() {
    return customSubject;
  }

  public SqlTaskDashboard setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public SqlTaskDashboard setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  public SqlTaskDashboard setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<SqlTaskSubscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskDashboard that = (SqlTaskDashboard) o;
    return Objects.equals(customSubject, that.customSubject)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customSubject, dashboardId, pauseSubscriptions, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskDashboard.class)
        .add("customSubject", customSubject)
        .add("dashboardId", dashboardId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }

  SqlTaskDashboardPb toPb() {
    SqlTaskDashboardPb pb = new SqlTaskDashboardPb();
    pb.setCustomSubject(customSubject);
    pb.setDashboardId(dashboardId);
    pb.setPauseSubscriptions(pauseSubscriptions);
    pb.setSubscriptions(subscriptions);

    return pb;
  }

  static SqlTaskDashboard fromPb(SqlTaskDashboardPb pb) {
    SqlTaskDashboard model = new SqlTaskDashboard();
    model.setCustomSubject(pb.getCustomSubject());
    model.setDashboardId(pb.getDashboardId());
    model.setPauseSubscriptions(pb.getPauseSubscriptions());
    model.setSubscriptions(pb.getSubscriptions());

    return model;
  }

  public static class SqlTaskDashboardSerializer extends JsonSerializer<SqlTaskDashboard> {
    @Override
    public void serialize(SqlTaskDashboard value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskDashboardPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskDashboardDeserializer extends JsonDeserializer<SqlTaskDashboard> {
    @Override
    public SqlTaskDashboard deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskDashboardPb pb = mapper.readValue(p, SqlTaskDashboardPb.class);
      return SqlTaskDashboard.fromPb(pb);
    }
  }
}
