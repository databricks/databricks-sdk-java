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

/** Remove a dashboard */
@Generated
@JsonSerialize(using = DeleteDashboardRequest.DeleteDashboardRequestSerializer.class)
@JsonDeserialize(using = DeleteDashboardRequest.DeleteDashboardRequestDeserializer.class)
public class DeleteDashboardRequest {
  /** */
  private String dashboardId;

  public DeleteDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDashboardRequest that = (DeleteDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDashboardRequest.class).add("dashboardId", dashboardId).toString();
  }

  DeleteDashboardRequestPb toPb() {
    DeleteDashboardRequestPb pb = new DeleteDashboardRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static DeleteDashboardRequest fromPb(DeleteDashboardRequestPb pb) {
    DeleteDashboardRequest model = new DeleteDashboardRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class DeleteDashboardRequestSerializer
      extends JsonSerializer<DeleteDashboardRequest> {
    @Override
    public void serialize(
        DeleteDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDashboardRequestDeserializer
      extends JsonDeserializer<DeleteDashboardRequest> {
    @Override
    public DeleteDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDashboardRequestPb pb = mapper.readValue(p, DeleteDashboardRequestPb.class);
      return DeleteDashboardRequest.fromPb(pb);
    }
  }
}
