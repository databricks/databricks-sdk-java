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
@JsonSerialize(using = DashboardPageSnapshot.DashboardPageSnapshotSerializer.class)
@JsonDeserialize(using = DashboardPageSnapshot.DashboardPageSnapshotDeserializer.class)
public class DashboardPageSnapshot {
  /** */
  private String pageDisplayName;

  /** */
  private Collection<WidgetErrorDetail> widgetErrorDetails;

  public DashboardPageSnapshot setPageDisplayName(String pageDisplayName) {
    this.pageDisplayName = pageDisplayName;
    return this;
  }

  public String getPageDisplayName() {
    return pageDisplayName;
  }

  public DashboardPageSnapshot setWidgetErrorDetails(
      Collection<WidgetErrorDetail> widgetErrorDetails) {
    this.widgetErrorDetails = widgetErrorDetails;
    return this;
  }

  public Collection<WidgetErrorDetail> getWidgetErrorDetails() {
    return widgetErrorDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardPageSnapshot that = (DashboardPageSnapshot) o;
    return Objects.equals(pageDisplayName, that.pageDisplayName)
        && Objects.equals(widgetErrorDetails, that.widgetErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageDisplayName, widgetErrorDetails);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardPageSnapshot.class)
        .add("pageDisplayName", pageDisplayName)
        .add("widgetErrorDetails", widgetErrorDetails)
        .toString();
  }

  DashboardPageSnapshotPb toPb() {
    DashboardPageSnapshotPb pb = new DashboardPageSnapshotPb();
    pb.setPageDisplayName(pageDisplayName);
    pb.setWidgetErrorDetails(widgetErrorDetails);

    return pb;
  }

  static DashboardPageSnapshot fromPb(DashboardPageSnapshotPb pb) {
    DashboardPageSnapshot model = new DashboardPageSnapshot();
    model.setPageDisplayName(pb.getPageDisplayName());
    model.setWidgetErrorDetails(pb.getWidgetErrorDetails());

    return model;
  }

  public static class DashboardPageSnapshotSerializer
      extends JsonSerializer<DashboardPageSnapshot> {
    @Override
    public void serialize(
        DashboardPageSnapshot value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardPageSnapshotPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardPageSnapshotDeserializer
      extends JsonDeserializer<DashboardPageSnapshot> {
    @Override
    public DashboardPageSnapshot deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardPageSnapshotPb pb = mapper.readValue(p, DashboardPageSnapshotPb.class);
      return DashboardPageSnapshot.fromPb(pb);
    }
  }
}
