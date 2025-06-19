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
@JsonSerialize(using = SqlTaskAlert.SqlTaskAlertSerializer.class)
@JsonDeserialize(using = SqlTaskAlert.SqlTaskAlertDeserializer.class)
public class SqlTaskAlert {
  /** The canonical identifier of the SQL alert. */
  private String alertId;

  /** If true, the alert notifications are not sent to subscribers. */
  private Boolean pauseSubscriptions;

  /** If specified, alert notifications are sent to subscribers. */
  private Collection<SqlTaskSubscription> subscriptions;

  public SqlTaskAlert setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  public SqlTaskAlert setPauseSubscriptions(Boolean pauseSubscriptions) {
    this.pauseSubscriptions = pauseSubscriptions;
    return this;
  }

  public Boolean getPauseSubscriptions() {
    return pauseSubscriptions;
  }

  public SqlTaskAlert setSubscriptions(Collection<SqlTaskSubscription> subscriptions) {
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
    SqlTaskAlert that = (SqlTaskAlert) o;
    return Objects.equals(alertId, that.alertId)
        && Objects.equals(pauseSubscriptions, that.pauseSubscriptions)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, pauseSubscriptions, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskAlert.class)
        .add("alertId", alertId)
        .add("pauseSubscriptions", pauseSubscriptions)
        .add("subscriptions", subscriptions)
        .toString();
  }

  SqlTaskAlertPb toPb() {
    SqlTaskAlertPb pb = new SqlTaskAlertPb();
    pb.setAlertId(alertId);
    pb.setPauseSubscriptions(pauseSubscriptions);
    pb.setSubscriptions(subscriptions);

    return pb;
  }

  static SqlTaskAlert fromPb(SqlTaskAlertPb pb) {
    SqlTaskAlert model = new SqlTaskAlert();
    model.setAlertId(pb.getAlertId());
    model.setPauseSubscriptions(pb.getPauseSubscriptions());
    model.setSubscriptions(pb.getSubscriptions());

    return model;
  }

  public static class SqlTaskAlertSerializer extends JsonSerializer<SqlTaskAlert> {
    @Override
    public void serialize(SqlTaskAlert value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskAlertPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskAlertDeserializer extends JsonDeserializer<SqlTaskAlert> {
    @Override
    public SqlTaskAlert deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskAlertPb pb = mapper.readValue(p, SqlTaskAlertPb.class);
      return SqlTaskAlert.fromPb(pb);
    }
  }
}
