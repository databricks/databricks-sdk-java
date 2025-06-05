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
@JsonSerialize(using = PublishedDashboard.PublishedDashboardSerializer.class)
@JsonDeserialize(using = PublishedDashboard.PublishedDashboardDeserializer.class)
public class PublishedDashboard {
  /** The display name of the published dashboard. */
  private String displayName;

  /** Indicates whether credentials are embedded in the published dashboard. */
  private Boolean embedCredentials;

  /** The timestamp of when the published dashboard was last revised. */
  private String revisionCreateTime;

  /** The warehouse ID used to run the published dashboard. */
  private String warehouseId;

  public PublishedDashboard setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PublishedDashboard setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishedDashboard setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  public PublishedDashboard setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishedDashboard that = (PublishedDashboard) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(embedCredentials, that.embedCredentials)
        && Objects.equals(revisionCreateTime, that.revisionCreateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, embedCredentials, revisionCreateTime, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishedDashboard.class)
        .add("displayName", displayName)
        .add("embedCredentials", embedCredentials)
        .add("revisionCreateTime", revisionCreateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }

  PublishedDashboardPb toPb() {
    PublishedDashboardPb pb = new PublishedDashboardPb();
    pb.setDisplayName(displayName);
    pb.setEmbedCredentials(embedCredentials);
    pb.setRevisionCreateTime(revisionCreateTime);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static PublishedDashboard fromPb(PublishedDashboardPb pb) {
    PublishedDashboard model = new PublishedDashboard();
    model.setDisplayName(pb.getDisplayName());
    model.setEmbedCredentials(pb.getEmbedCredentials());
    model.setRevisionCreateTime(pb.getRevisionCreateTime());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class PublishedDashboardSerializer extends JsonSerializer<PublishedDashboard> {
    @Override
    public void serialize(PublishedDashboard value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PublishedDashboardPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PublishedDashboardDeserializer extends JsonDeserializer<PublishedDashboard> {
    @Override
    public PublishedDashboard deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PublishedDashboardPb pb = mapper.readValue(p, PublishedDashboardPb.class);
      return PublishedDashboard.fromPb(pb);
    }
  }
}
