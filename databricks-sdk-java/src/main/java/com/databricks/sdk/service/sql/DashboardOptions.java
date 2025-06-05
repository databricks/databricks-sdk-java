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

@Generated
@JsonSerialize(using = DashboardOptions.DashboardOptionsSerializer.class)
@JsonDeserialize(using = DashboardOptions.DashboardOptionsDeserializer.class)
public class DashboardOptions {
  /**
   * The timestamp when this dashboard was moved to trash. Only present when the `is_archived`
   * property is `true`. Trashed items are deleted after thirty days.
   */
  private String movedToTrashAt;

  public DashboardOptions setMovedToTrashAt(String movedToTrashAt) {
    this.movedToTrashAt = movedToTrashAt;
    return this;
  }

  public String getMovedToTrashAt() {
    return movedToTrashAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardOptions that = (DashboardOptions) o;
    return Objects.equals(movedToTrashAt, that.movedToTrashAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movedToTrashAt);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardOptions.class).add("movedToTrashAt", movedToTrashAt).toString();
  }

  DashboardOptionsPb toPb() {
    DashboardOptionsPb pb = new DashboardOptionsPb();
    pb.setMovedToTrashAt(movedToTrashAt);

    return pb;
  }

  static DashboardOptions fromPb(DashboardOptionsPb pb) {
    DashboardOptions model = new DashboardOptions();
    model.setMovedToTrashAt(pb.getMovedToTrashAt());

    return model;
  }

  public static class DashboardOptionsSerializer extends JsonSerializer<DashboardOptions> {
    @Override
    public void serialize(DashboardOptions value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardOptionsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardOptionsDeserializer extends JsonDeserializer<DashboardOptions> {
    @Override
    public DashboardOptions deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardOptionsPb pb = mapper.readValue(p, DashboardOptionsPb.class);
      return DashboardOptions.fromPb(pb);
    }
  }
}
