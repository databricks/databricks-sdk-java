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

/** Delete a Registered Model Alias */
@Generated
@JsonSerialize(using = DeleteAliasRequest.DeleteAliasRequestSerializer.class)
@JsonDeserialize(using = DeleteAliasRequest.DeleteAliasRequestDeserializer.class)
public class DeleteAliasRequest {
  /** The name of the alias */
  private String alias;

  /** The three-level (fully qualified) name of the registered model */
  private String fullName;

  public DeleteAliasRequest setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public DeleteAliasRequest setFullName(String fullName) {
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
    DeleteAliasRequest that = (DeleteAliasRequest) o;
    return Objects.equals(alias, that.alias) && Objects.equals(fullName, that.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, fullName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAliasRequest.class)
        .add("alias", alias)
        .add("fullName", fullName)
        .toString();
  }

  DeleteAliasRequestPb toPb() {
    DeleteAliasRequestPb pb = new DeleteAliasRequestPb();
    pb.setAlias(alias);
    pb.setFullName(fullName);

    return pb;
  }

  static DeleteAliasRequest fromPb(DeleteAliasRequestPb pb) {
    DeleteAliasRequest model = new DeleteAliasRequest();
    model.setAlias(pb.getAlias());
    model.setFullName(pb.getFullName());

    return model;
  }

  public static class DeleteAliasRequestSerializer extends JsonSerializer<DeleteAliasRequest> {
    @Override
    public void serialize(DeleteAliasRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAliasRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAliasRequestDeserializer extends JsonDeserializer<DeleteAliasRequest> {
    @Override
    public DeleteAliasRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAliasRequestPb pb = mapper.readValue(p, DeleteAliasRequestPb.class);
      return DeleteAliasRequest.fromPb(pb);
    }
  }
}
