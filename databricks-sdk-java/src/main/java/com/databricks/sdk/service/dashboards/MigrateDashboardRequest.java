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

@Generated
@JsonSerialize(using = MigrateDashboardRequest.MigrateDashboardRequestSerializer.class)
@JsonDeserialize(using = MigrateDashboardRequest.MigrateDashboardRequestDeserializer.class)
public class MigrateDashboardRequest {
  /** Display name for the new Lakeview dashboard. */
  private String displayName;

  /** The workspace path of the folder to contain the migrated Lakeview dashboard. */
  private String parentPath;

  /** UUID of the dashboard to be migrated. */
  private String sourceDashboardId;

  /**
   * Flag to indicate if mustache parameter syntax ({{ param }}) should be auto-updated to named
   * syntax (:param) when converting datasets in the dashboard.
   */
  private Boolean updateParameterSyntax;

  public MigrateDashboardRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public MigrateDashboardRequest setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public MigrateDashboardRequest setSourceDashboardId(String sourceDashboardId) {
    this.sourceDashboardId = sourceDashboardId;
    return this;
  }

  public String getSourceDashboardId() {
    return sourceDashboardId;
  }

  public MigrateDashboardRequest setUpdateParameterSyntax(Boolean updateParameterSyntax) {
    this.updateParameterSyntax = updateParameterSyntax;
    return this;
  }

  public Boolean getUpdateParameterSyntax() {
    return updateParameterSyntax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrateDashboardRequest that = (MigrateDashboardRequest) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(sourceDashboardId, that.sourceDashboardId)
        && Objects.equals(updateParameterSyntax, that.updateParameterSyntax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, parentPath, sourceDashboardId, updateParameterSyntax);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrateDashboardRequest.class)
        .add("displayName", displayName)
        .add("parentPath", parentPath)
        .add("sourceDashboardId", sourceDashboardId)
        .add("updateParameterSyntax", updateParameterSyntax)
        .toString();
  }

  MigrateDashboardRequestPb toPb() {
    MigrateDashboardRequestPb pb = new MigrateDashboardRequestPb();
    pb.setDisplayName(displayName);
    pb.setParentPath(parentPath);
    pb.setSourceDashboardId(sourceDashboardId);
    pb.setUpdateParameterSyntax(updateParameterSyntax);

    return pb;
  }

  static MigrateDashboardRequest fromPb(MigrateDashboardRequestPb pb) {
    MigrateDashboardRequest model = new MigrateDashboardRequest();
    model.setDisplayName(pb.getDisplayName());
    model.setParentPath(pb.getParentPath());
    model.setSourceDashboardId(pb.getSourceDashboardId());
    model.setUpdateParameterSyntax(pb.getUpdateParameterSyntax());

    return model;
  }

  public static class MigrateDashboardRequestSerializer
      extends JsonSerializer<MigrateDashboardRequest> {
    @Override
    public void serialize(
        MigrateDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MigrateDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MigrateDashboardRequestDeserializer
      extends JsonDeserializer<MigrateDashboardRequest> {
    @Override
    public MigrateDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MigrateDashboardRequestPb pb = mapper.readValue(p, MigrateDashboardRequestPb.class);
      return MigrateDashboardRequest.fromPb(pb);
    }
  }
}
