// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** Create a Database Table */
@Generated
@JsonSerialize(using = CreateDatabaseTableRequest.CreateDatabaseTableRequestSerializer.class)
@JsonDeserialize(using = CreateDatabaseTableRequest.CreateDatabaseTableRequestDeserializer.class)
public class CreateDatabaseTableRequest {
  /** Next field marker: 13 */
  private DatabaseTable table;

  public CreateDatabaseTableRequest setTable(DatabaseTable table) {
    this.table = table;
    return this;
  }

  public DatabaseTable getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateDatabaseTableRequest that = (CreateDatabaseTableRequest) o;
    return Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateDatabaseTableRequest.class).add("table", table).toString();
  }

  CreateDatabaseTableRequestPb toPb() {
    CreateDatabaseTableRequestPb pb = new CreateDatabaseTableRequestPb();
    pb.setTable(table);

    return pb;
  }

  static CreateDatabaseTableRequest fromPb(CreateDatabaseTableRequestPb pb) {
    CreateDatabaseTableRequest model = new CreateDatabaseTableRequest();
    model.setTable(pb.getTable());

    return model;
  }

  public static class CreateDatabaseTableRequestSerializer
      extends JsonSerializer<CreateDatabaseTableRequest> {
    @Override
    public void serialize(
        CreateDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDatabaseTableRequestDeserializer
      extends JsonDeserializer<CreateDatabaseTableRequest> {
    @Override
    public CreateDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDatabaseTableRequestPb pb = mapper.readValue(p, CreateDatabaseTableRequestPb.class);
      return CreateDatabaseTableRequest.fromPb(pb);
    }
  }
}
