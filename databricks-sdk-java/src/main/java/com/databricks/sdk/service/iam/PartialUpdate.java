// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = PartialUpdate.PartialUpdateSerializer.class)
@JsonDeserialize(using = PartialUpdate.PartialUpdateDeserializer.class)
public class PartialUpdate {
  /** Unique ID in the Databricks workspace. */
  private String id;

  /** */
  private Collection<Patch> operations;

  /** The schema of the patch request. Must be ["urn:ietf:params:scim:api:messages:2.0:PatchOp"]. */
  private Collection<PatchSchema> schemas;

  public PartialUpdate setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PartialUpdate setOperations(Collection<Patch> operations) {
    this.operations = operations;
    return this;
  }

  public Collection<Patch> getOperations() {
    return operations;
  }

  public PartialUpdate setSchemas(Collection<PatchSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<PatchSchema> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartialUpdate that = (PartialUpdate) o;
    return Objects.equals(id, that.id)
        && Objects.equals(operations, that.operations)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operations, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(PartialUpdate.class)
        .add("id", id)
        .add("operations", operations)
        .add("schemas", schemas)
        .toString();
  }

  PartialUpdatePb toPb() {
    PartialUpdatePb pb = new PartialUpdatePb();
    pb.setId(id);
    pb.setOperations(operations);
    pb.setSchemas(schemas);

    return pb;
  }

  static PartialUpdate fromPb(PartialUpdatePb pb) {
    PartialUpdate model = new PartialUpdate();
    model.setId(pb.getId());
    model.setOperations(pb.getOperations());
    model.setSchemas(pb.getSchemas());

    return model;
  }

  public static class PartialUpdateSerializer extends JsonSerializer<PartialUpdate> {
    @Override
    public void serialize(PartialUpdate value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PartialUpdatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PartialUpdateDeserializer extends JsonDeserializer<PartialUpdate> {
    @Override
    public PartialUpdate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PartialUpdatePb pb = mapper.readValue(p, PartialUpdatePb.class);
      return PartialUpdate.fromPb(pb);
    }
  }
}
