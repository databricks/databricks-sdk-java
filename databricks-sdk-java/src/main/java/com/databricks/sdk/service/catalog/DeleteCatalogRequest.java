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

/** Delete a catalog */
@Generated
@JsonSerialize(using = DeleteCatalogRequest.DeleteCatalogRequestSerializer.class)
@JsonDeserialize(using = DeleteCatalogRequest.DeleteCatalogRequestDeserializer.class)
public class DeleteCatalogRequest {
  /** Force deletion even if the catalog is not empty. */
  private Boolean force;

  /** The name of the catalog. */
  private String name;

  public DeleteCatalogRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteCatalogRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteCatalogRequest that = (DeleteCatalogRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCatalogRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }

  DeleteCatalogRequestPb toPb() {
    DeleteCatalogRequestPb pb = new DeleteCatalogRequestPb();
    pb.setForce(force);
    pb.setName(name);

    return pb;
  }

  static DeleteCatalogRequest fromPb(DeleteCatalogRequestPb pb) {
    DeleteCatalogRequest model = new DeleteCatalogRequest();
    model.setForce(pb.getForce());
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteCatalogRequestSerializer extends JsonSerializer<DeleteCatalogRequest> {
    @Override
    public void serialize(
        DeleteCatalogRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCatalogRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCatalogRequestDeserializer
      extends JsonDeserializer<DeleteCatalogRequest> {
    @Override
    public DeleteCatalogRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCatalogRequestPb pb = mapper.readValue(p, DeleteCatalogRequestPb.class);
      return DeleteCatalogRequest.fromPb(pb);
    }
  }
}
