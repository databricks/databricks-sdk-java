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

/** Remove widget */
@Generated
@JsonSerialize(using = DeleteDashboardWidgetRequest.DeleteDashboardWidgetRequestSerializer.class)
@JsonDeserialize(
    using = DeleteDashboardWidgetRequest.DeleteDashboardWidgetRequestDeserializer.class)
public class DeleteDashboardWidgetRequest {
  /** Widget ID returned by :method:dashboardwidgets/create */
  private String id;

  public DeleteDashboardWidgetRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDashboardWidgetRequest that = (DeleteDashboardWidgetRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDashboardWidgetRequest.class).add("id", id).toString();
  }

  DeleteDashboardWidgetRequestPb toPb() {
    DeleteDashboardWidgetRequestPb pb = new DeleteDashboardWidgetRequestPb();
    pb.setId(id);

    return pb;
  }

  static DeleteDashboardWidgetRequest fromPb(DeleteDashboardWidgetRequestPb pb) {
    DeleteDashboardWidgetRequest model = new DeleteDashboardWidgetRequest();
    model.setId(pb.getId());

    return model;
  }

  public static class DeleteDashboardWidgetRequestSerializer
      extends JsonSerializer<DeleteDashboardWidgetRequest> {
    @Override
    public void serialize(
        DeleteDashboardWidgetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDashboardWidgetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDashboardWidgetRequestDeserializer
      extends JsonDeserializer<DeleteDashboardWidgetRequest> {
    @Override
    public DeleteDashboardWidgetRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDashboardWidgetRequestPb pb = mapper.readValue(p, DeleteDashboardWidgetRequestPb.class);
      return DeleteDashboardWidgetRequest.fromPb(pb);
    }
  }
}
