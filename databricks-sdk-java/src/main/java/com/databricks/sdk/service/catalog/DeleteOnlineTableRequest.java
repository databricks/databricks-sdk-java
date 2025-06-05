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

/** Delete an Online Table */
@Generated
@JsonSerialize(using = DeleteOnlineTableRequest.DeleteOnlineTableRequestSerializer.class)
@JsonDeserialize(using = DeleteOnlineTableRequest.DeleteOnlineTableRequestDeserializer.class)
public class DeleteOnlineTableRequest {
  /** Full three-part (catalog, schema, table) name of the table. */
  private String name;

  public DeleteOnlineTableRequest setName(String name) {
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
    DeleteOnlineTableRequest that = (DeleteOnlineTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteOnlineTableRequest.class).add("name", name).toString();
  }

  DeleteOnlineTableRequestPb toPb() {
    DeleteOnlineTableRequestPb pb = new DeleteOnlineTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteOnlineTableRequest fromPb(DeleteOnlineTableRequestPb pb) {
    DeleteOnlineTableRequest model = new DeleteOnlineTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteOnlineTableRequestSerializer
      extends JsonSerializer<DeleteOnlineTableRequest> {
    @Override
    public void serialize(
        DeleteOnlineTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteOnlineTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteOnlineTableRequestDeserializer
      extends JsonDeserializer<DeleteOnlineTableRequest> {
    @Override
    public DeleteOnlineTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteOnlineTableRequestPb pb = mapper.readValue(p, DeleteOnlineTableRequestPb.class);
      return DeleteOnlineTableRequest.fromPb(pb);
    }
  }
}
