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

/** Create an Online Table */
@Generated
@JsonSerialize(using = CreateOnlineTableRequest.CreateOnlineTableRequestSerializer.class)
@JsonDeserialize(using = CreateOnlineTableRequest.CreateOnlineTableRequestDeserializer.class)
public class CreateOnlineTableRequest {
  /** Online Table information. */
  private OnlineTable table;

  public CreateOnlineTableRequest setTable(OnlineTable table) {
    this.table = table;
    return this;
  }

  public OnlineTable getTable() {
    return table;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOnlineTableRequest that = (CreateOnlineTableRequest) o;
    return Objects.equals(table, that.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOnlineTableRequest.class).add("table", table).toString();
  }

  CreateOnlineTableRequestPb toPb() {
    CreateOnlineTableRequestPb pb = new CreateOnlineTableRequestPb();
    pb.setTable(table);

    return pb;
  }

  static CreateOnlineTableRequest fromPb(CreateOnlineTableRequestPb pb) {
    CreateOnlineTableRequest model = new CreateOnlineTableRequest();
    model.setTable(pb.getTable());

    return model;
  }

  public static class CreateOnlineTableRequestSerializer
      extends JsonSerializer<CreateOnlineTableRequest> {
    @Override
    public void serialize(
        CreateOnlineTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateOnlineTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateOnlineTableRequestDeserializer
      extends JsonDeserializer<CreateOnlineTableRequest> {
    @Override
    public CreateOnlineTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateOnlineTableRequestPb pb = mapper.readValue(p, CreateOnlineTableRequestPb.class);
      return CreateOnlineTableRequest.fromPb(pb);
    }
  }
}
