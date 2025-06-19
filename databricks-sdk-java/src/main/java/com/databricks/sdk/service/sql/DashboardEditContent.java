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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = DashboardEditContent.DashboardEditContentSerializer.class)
@JsonDeserialize(using = DashboardEditContent.DashboardEditContentDeserializer.class)
public class DashboardEditContent {
  /** */
  private String dashboardId;

  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  private String name;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  private RunAsRole runAsRole;

  /** */
  private Collection<String> tags;

  public DashboardEditContent setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DashboardEditContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardEditContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public DashboardEditContent setTags(Collection<String> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardEditContent that = (DashboardEditContent) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(name, that.name)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, name, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardEditContent.class)
        .add("dashboardId", dashboardId)
        .add("name", name)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }

  DashboardEditContentPb toPb() {
    DashboardEditContentPb pb = new DashboardEditContentPb();
    pb.setDashboardId(dashboardId);
    pb.setName(name);
    pb.setRunAsRole(runAsRole);
    pb.setTags(tags);

    return pb;
  }

  static DashboardEditContent fromPb(DashboardEditContentPb pb) {
    DashboardEditContent model = new DashboardEditContent();
    model.setDashboardId(pb.getDashboardId());
    model.setName(pb.getName());
    model.setRunAsRole(pb.getRunAsRole());
    model.setTags(pb.getTags());

    return model;
  }

  public static class DashboardEditContentSerializer extends JsonSerializer<DashboardEditContent> {
    @Override
    public void serialize(
        DashboardEditContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardEditContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardEditContentDeserializer
      extends JsonDeserializer<DashboardEditContent> {
    @Override
    public DashboardEditContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardEditContentPb pb = mapper.readValue(p, DashboardEditContentPb.class);
      return DashboardEditContent.fromPb(pb);
    }
  }
}
