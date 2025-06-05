// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Delete an alert */
@Generated
@JsonSerialize(using = DeleteAlertsLegacyRequest.DeleteAlertsLegacyRequestSerializer.class)
@JsonDeserialize(using = DeleteAlertsLegacyRequest.DeleteAlertsLegacyRequestDeserializer.class)
public class DeleteAlertsLegacyRequest {
  /** */
  private String alertId;

  public DeleteAlertsLegacyRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAlertsLegacyRequest that = (DeleteAlertsLegacyRequest) o;
    return Objects.equals(alertId, that.alertId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAlertsLegacyRequest.class).add("alertId", alertId).toString();
  }

  DeleteAlertsLegacyRequestPb toPb() {
    DeleteAlertsLegacyRequestPb pb = new DeleteAlertsLegacyRequestPb();
    pb.setAlertId(alertId);

    return pb;
  }

  static DeleteAlertsLegacyRequest fromPb(DeleteAlertsLegacyRequestPb pb) {
    DeleteAlertsLegacyRequest model = new DeleteAlertsLegacyRequest();
    model.setAlertId(pb.getAlertId());

    return model;
  }

  public static class DeleteAlertsLegacyRequestSerializer
      extends JsonSerializer<DeleteAlertsLegacyRequest> {
    @Override
    public void serialize(
        DeleteAlertsLegacyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAlertsLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAlertsLegacyRequestDeserializer
      extends JsonDeserializer<DeleteAlertsLegacyRequest> {
    @Override
    public DeleteAlertsLegacyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAlertsLegacyRequestPb pb = mapper.readValue(p, DeleteAlertsLegacyRequestPb.class);
      return DeleteAlertsLegacyRequest.fromPb(pb);
    }
  }
}
