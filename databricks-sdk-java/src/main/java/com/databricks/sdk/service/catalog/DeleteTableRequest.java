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

/** Delete a table */
@Generated
@JsonSerialize(using = DeleteTableRequest.DeleteTableRequestSerializer.class)
@JsonDeserialize(using = DeleteTableRequest.DeleteTableRequestDeserializer.class)
public class DeleteTableRequest {
  /** Full name of the table. */
  private String fullName;

  public DeleteTableRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTableRequest that = (DeleteTableRequest) o;
    return Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTableRequest.class).add("fullName", fullName).toString();
  }

  DeleteTableRequestPb toPb() {
    DeleteTableRequestPb pb = new DeleteTableRequestPb();
    pb.setFullName(fullName);

    return pb;
  }

  static DeleteTableRequest fromPb(DeleteTableRequestPb pb) {
    DeleteTableRequest model = new DeleteTableRequest();
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class DeleteTableRequestSerializer extends JsonSerializer<DeleteTableRequest> {
    @Override
    public void serialize(DeleteTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTableRequestDeserializer extends JsonDeserializer<DeleteTableRequest> {
    @Override
    public DeleteTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTableRequestPb pb = mapper.readValue(p, DeleteTableRequestPb.class);
      return DeleteTableRequest.fromPb(pb);
    }
  }
}
