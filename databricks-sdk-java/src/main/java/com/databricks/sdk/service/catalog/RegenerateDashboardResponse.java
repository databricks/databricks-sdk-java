// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = RegenerateDashboardResponse.RegenerateDashboardResponseSerializer.class)
@JsonDeserialize(using = RegenerateDashboardResponse.RegenerateDashboardResponseDeserializer.class)
public class RegenerateDashboardResponse {
  /** Id of the regenerated monitoring dashboard. */
  private String dashboardId;

  /** The directory where the regenerated dashboard is stored. */
  private String parentFolder;

  public RegenerateDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public RegenerateDashboardResponse setParentFolder(String parentFolder) {
    this.parentFolder = parentFolder;
    return this;
  }

  public String getParentFolder() {
    return parentFolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegenerateDashboardResponse that = (RegenerateDashboardResponse) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(parentFolder, that.parentFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, parentFolder);
  }

  @Override
  public String toString() {
    return new ToStringer(RegenerateDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .add("parentFolder", parentFolder)
        .toString();
  }

  RegenerateDashboardResponsePb toPb() {
    RegenerateDashboardResponsePb pb = new RegenerateDashboardResponsePb();
    pb.setDashboardId(dashboardId);
    pb.setParentFolder(parentFolder);

    return pb;
  }

  static RegenerateDashboardResponse fromPb(RegenerateDashboardResponsePb pb) {
    RegenerateDashboardResponse model = new RegenerateDashboardResponse();
    model.setDashboardId(pb.getDashboardId());
    model.setParentFolder(pb.getParentFolder());

    return model;
  }

  public static class RegenerateDashboardResponseSerializer
      extends JsonSerializer<RegenerateDashboardResponse> {
    @Override
    public void serialize(
        RegenerateDashboardResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegenerateDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegenerateDashboardResponseDeserializer
      extends JsonDeserializer<RegenerateDashboardResponse> {
    @Override
    public RegenerateDashboardResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegenerateDashboardResponsePb pb = mapper.readValue(p, RegenerateDashboardResponsePb.class);
      return RegenerateDashboardResponse.fromPb(pb);
    }
  }
}
