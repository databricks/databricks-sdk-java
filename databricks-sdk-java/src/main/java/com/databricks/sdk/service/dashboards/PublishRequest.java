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
@JsonSerialize(using = PublishRequest.PublishRequestSerializer.class)
@JsonDeserialize(using = PublishRequest.PublishRequestDeserializer.class)
public class PublishRequest {
  /** UUID identifying the dashboard to be published. */
  private String dashboardId;

  /**
   * Flag to indicate if the publisher's credentials should be embedded in the published dashboard.
   * These embedded credentials will be used to execute the published dashboard's queries.
   */
  private Boolean embedCredentials;

  /**
   * The ID of the warehouse that can be used to override the warehouse which was set in the draft.
   */
  private String warehouseId;

  public PublishRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public PublishRequest setEmbedCredentials(Boolean embedCredentials) {
    this.embedCredentials = embedCredentials;
    return this;
  }

  public Boolean getEmbedCredentials() {
    return embedCredentials;
  }

  public PublishRequest setWarehouseId(String warehouseId) {
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
    PublishRequest that = (PublishRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(embedCredentials, that.embedCredentials)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, embedCredentials, warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishRequest.class)
        .add("dashboardId", dashboardId)
        .add("embedCredentials", embedCredentials)
        .add("warehouseId", warehouseId)
        .toString();
  }

  PublishRequestPb toPb() {
    PublishRequestPb pb = new PublishRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setEmbedCredentials(embedCredentials);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static PublishRequest fromPb(PublishRequestPb pb) {
    PublishRequest model = new PublishRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setEmbedCredentials(pb.getEmbedCredentials());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class PublishRequestSerializer extends JsonSerializer<PublishRequest> {
    @Override
    public void serialize(PublishRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PublishRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PublishRequestDeserializer extends JsonDeserializer<PublishRequest> {
    @Override
    public PublishRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PublishRequestPb pb = mapper.readValue(p, PublishRequestPb.class);
      return PublishRequest.fromPb(pb);
    }
  }
}
