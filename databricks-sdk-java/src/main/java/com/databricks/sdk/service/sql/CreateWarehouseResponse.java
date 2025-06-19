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
@JsonSerialize(using = CreateWarehouseResponse.CreateWarehouseResponseSerializer.class)
@JsonDeserialize(using = CreateWarehouseResponse.CreateWarehouseResponseDeserializer.class)
public class CreateWarehouseResponse {
  /** Id for the SQL warehouse. This value is unique across all SQL warehouses. */
  private String id;

  public CreateWarehouseResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateWarehouseResponse that = (CreateWarehouseResponse) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateWarehouseResponse.class).add("id", id).toString();
  }

  CreateWarehouseResponsePb toPb() {
    CreateWarehouseResponsePb pb = new CreateWarehouseResponsePb();
    pb.setId(id);

    return pb;
  }

  static CreateWarehouseResponse fromPb(CreateWarehouseResponsePb pb) {
    CreateWarehouseResponse model = new CreateWarehouseResponse();
    model.setId(pb.getId());

    return model;
  }

  public static class CreateWarehouseResponseSerializer
      extends JsonSerializer<CreateWarehouseResponse> {
    @Override
    public void serialize(
        CreateWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateWarehouseResponseDeserializer
      extends JsonDeserializer<CreateWarehouseResponse> {
    @Override
    public CreateWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateWarehouseResponsePb pb = mapper.readValue(p, CreateWarehouseResponsePb.class);
      return CreateWarehouseResponse.fromPb(pb);
    }
  }
}
