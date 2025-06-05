// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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
@JsonSerialize(using = CleanRoomOutputCatalog.CleanRoomOutputCatalogSerializer.class)
@JsonDeserialize(using = CleanRoomOutputCatalog.CleanRoomOutputCatalogDeserializer.class)
public class CleanRoomOutputCatalog {
  /**
   * The name of the output catalog in UC. It should follow [UC securable naming requirements]. The
   * field will always exist if status is CREATED.
   *
   * <p>[UC securable naming requirements]:
   * https://docs.databricks.com/en/data-governance/unity-catalog/index.html#securable-object-naming-requirements
   */
  private String catalogName;

  /** */
  private CleanRoomOutputCatalogOutputCatalogStatus status;

  public CleanRoomOutputCatalog setCatalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
  }

  public String getCatalogName() {
    return catalogName;
  }

  public CleanRoomOutputCatalog setStatus(CleanRoomOutputCatalogOutputCatalogStatus status) {
    this.status = status;
    return this;
  }

  public CleanRoomOutputCatalogOutputCatalogStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomOutputCatalog that = (CleanRoomOutputCatalog) o;
    return Objects.equals(catalogName, that.catalogName) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogName, status);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomOutputCatalog.class)
        .add("catalogName", catalogName)
        .add("status", status)
        .toString();
  }

  CleanRoomOutputCatalogPb toPb() {
    CleanRoomOutputCatalogPb pb = new CleanRoomOutputCatalogPb();
    pb.setCatalogName(catalogName);
    pb.setStatus(status);

    return pb;
  }

  static CleanRoomOutputCatalog fromPb(CleanRoomOutputCatalogPb pb) {
    CleanRoomOutputCatalog model = new CleanRoomOutputCatalog();
    model.setCatalogName(pb.getCatalogName());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class CleanRoomOutputCatalogSerializer
      extends JsonSerializer<CleanRoomOutputCatalog> {
    @Override
    public void serialize(
        CleanRoomOutputCatalog value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomOutputCatalogPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomOutputCatalogDeserializer
      extends JsonDeserializer<CleanRoomOutputCatalog> {
    @Override
    public CleanRoomOutputCatalog deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomOutputCatalogPb pb = mapper.readValue(p, CleanRoomOutputCatalogPb.class);
      return CleanRoomOutputCatalog.fromPb(pb);
    }
  }
}
