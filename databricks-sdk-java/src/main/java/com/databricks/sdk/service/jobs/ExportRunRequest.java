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

/** Export and retrieve a job run */
@Generated
@JsonSerialize(using = ExportRunRequest.ExportRunRequestSerializer.class)
@JsonDeserialize(using = ExportRunRequest.ExportRunRequestDeserializer.class)
public class ExportRunRequest {
  /** The canonical identifier for the run. This field is required. */
  private Long runId;

  /** Which views to export (CODE, DASHBOARDS, or ALL). Defaults to CODE. */
  private ViewsToExport viewsToExport;

  public ExportRunRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public ExportRunRequest setViewsToExport(ViewsToExport viewsToExport) {
    this.viewsToExport = viewsToExport;
    return this;
  }

  public ViewsToExport getViewsToExport() {
    return viewsToExport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRunRequest that = (ExportRunRequest) o;
    return Objects.equals(runId, that.runId) && Objects.equals(viewsToExport, that.viewsToExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, viewsToExport);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRunRequest.class)
        .add("runId", runId)
        .add("viewsToExport", viewsToExport)
        .toString();
  }

  ExportRunRequestPb toPb() {
    ExportRunRequestPb pb = new ExportRunRequestPb();
    pb.setRunId(runId);
    pb.setViewsToExport(viewsToExport);

    return pb;
  }

  static ExportRunRequest fromPb(ExportRunRequestPb pb) {
    ExportRunRequest model = new ExportRunRequest();
    model.setRunId(pb.getRunId());
    model.setViewsToExport(pb.getViewsToExport());

    return model;
  }

  public static class ExportRunRequestSerializer extends JsonSerializer<ExportRunRequest> {
    @Override
    public void serialize(ExportRunRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExportRunRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExportRunRequestDeserializer extends JsonDeserializer<ExportRunRequest> {
    @Override
    public ExportRunRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExportRunRequestPb pb = mapper.readValue(p, ExportRunRequestPb.class);
      return ExportRunRequest.fromPb(pb);
    }
  }
}
