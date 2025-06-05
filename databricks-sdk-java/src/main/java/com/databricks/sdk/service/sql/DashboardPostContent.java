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
@JsonSerialize(using = DashboardPostContent.DashboardPostContentSerializer.class)
@JsonDeserialize(using = DashboardPostContent.DashboardPostContentDeserializer.class)
public class DashboardPostContent {
  /** Indicates whether the dashboard filters are enabled */
  private Boolean dashboardFiltersEnabled;

  /** Indicates whether this dashboard object should appear in the current user's favorites list. */
  private Boolean isFavorite;

  /**
   * The title of this dashboard that appears in list views and at the top of the dashboard page.
   */
  private String name;

  /** The identifier of the workspace folder containing the object. */
  private String parent;

  /**
   * Sets the **Run as** role for the object. Must be set to one of `"viewer"` (signifying "run as
   * viewer" behavior) or `"owner"` (signifying "run as owner" behavior)
   */
  private RunAsRole runAsRole;

  /** */
  private Collection<String> tags;

  public DashboardPostContent setDashboardFiltersEnabled(Boolean dashboardFiltersEnabled) {
    this.dashboardFiltersEnabled = dashboardFiltersEnabled;
    return this;
  }

  public Boolean getDashboardFiltersEnabled() {
    return dashboardFiltersEnabled;
  }

  public DashboardPostContent setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public DashboardPostContent setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DashboardPostContent setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public DashboardPostContent setRunAsRole(RunAsRole runAsRole) {
    this.runAsRole = runAsRole;
    return this;
  }

  public RunAsRole getRunAsRole() {
    return runAsRole;
  }

  public DashboardPostContent setTags(Collection<String> tags) {
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
    DashboardPostContent that = (DashboardPostContent) o;
    return Objects.equals(dashboardFiltersEnabled, that.dashboardFiltersEnabled)
        && Objects.equals(isFavorite, that.isFavorite)
        && Objects.equals(name, that.name)
        && Objects.equals(parent, that.parent)
        && Objects.equals(runAsRole, that.runAsRole)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardFiltersEnabled, isFavorite, name, parent, runAsRole, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardPostContent.class)
        .add("dashboardFiltersEnabled", dashboardFiltersEnabled)
        .add("isFavorite", isFavorite)
        .add("name", name)
        .add("parent", parent)
        .add("runAsRole", runAsRole)
        .add("tags", tags)
        .toString();
  }

  DashboardPostContentPb toPb() {
    DashboardPostContentPb pb = new DashboardPostContentPb();
    pb.setDashboardFiltersEnabled(dashboardFiltersEnabled);
    pb.setIsFavorite(isFavorite);
    pb.setName(name);
    pb.setParent(parent);
    pb.setRunAsRole(runAsRole);
    pb.setTags(tags);

    return pb;
  }

  static DashboardPostContent fromPb(DashboardPostContentPb pb) {
    DashboardPostContent model = new DashboardPostContent();
    model.setDashboardFiltersEnabled(pb.getDashboardFiltersEnabled());
    model.setIsFavorite(pb.getIsFavorite());
    model.setName(pb.getName());
    model.setParent(pb.getParent());
    model.setRunAsRole(pb.getRunAsRole());
    model.setTags(pb.getTags());

    return model;
  }

  public static class DashboardPostContentSerializer extends JsonSerializer<DashboardPostContent> {
    @Override
    public void serialize(
        DashboardPostContent value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardPostContentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardPostContentDeserializer
      extends JsonDeserializer<DashboardPostContent> {
    @Override
    public DashboardPostContent deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardPostContentPb pb = mapper.readValue(p, DashboardPostContentPb.class);
      return DashboardPostContent.fromPb(pb);
    }
  }
}
