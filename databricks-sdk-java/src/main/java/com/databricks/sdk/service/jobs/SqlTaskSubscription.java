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

@Generated
@JsonSerialize(using = SqlTaskSubscription.SqlTaskSubscriptionSerializer.class)
@JsonDeserialize(using = SqlTaskSubscription.SqlTaskSubscriptionDeserializer.class)
public class SqlTaskSubscription {
  /**
   * The canonical identifier of the destination to receive email notification. This parameter is
   * mutually exclusive with user_name. You cannot set both destination_id and user_name for
   * subscription notifications.
   */
  private String destinationId;

  /**
   * The user name to receive the subscription email. This parameter is mutually exclusive with
   * destination_id. You cannot set both destination_id and user_name for subscription
   * notifications.
   */
  private String userName;

  public SqlTaskSubscription setDestinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public SqlTaskSubscription setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlTaskSubscription that = (SqlTaskSubscription) o;
    return Objects.equals(destinationId, that.destinationId)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlTaskSubscription.class)
        .add("destinationId", destinationId)
        .add("userName", userName)
        .toString();
  }

  SqlTaskSubscriptionPb toPb() {
    SqlTaskSubscriptionPb pb = new SqlTaskSubscriptionPb();
    pb.setDestinationId(destinationId);
    pb.setUserName(userName);

    return pb;
  }

  static SqlTaskSubscription fromPb(SqlTaskSubscriptionPb pb) {
    SqlTaskSubscription model = new SqlTaskSubscription();
    model.setDestinationId(pb.getDestinationId());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class SqlTaskSubscriptionSerializer extends JsonSerializer<SqlTaskSubscription> {
    @Override
    public void serialize(SqlTaskSubscription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SqlTaskSubscriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SqlTaskSubscriptionDeserializer
      extends JsonDeserializer<SqlTaskSubscription> {
    @Override
    public SqlTaskSubscription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SqlTaskSubscriptionPb pb = mapper.readValue(p, SqlTaskSubscriptionPb.class);
      return SqlTaskSubscription.fromPb(pb);
    }
  }
}
