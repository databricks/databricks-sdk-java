// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = DeleteScope.DeleteScopeSerializer.class)
@JsonDeserialize(using = DeleteScope.DeleteScopeDeserializer.class)
public class DeleteScope {
  /** Name of the scope to delete. */
  private String scope;

  public DeleteScope setScope(String scope) {
    this.scope = scope;
    return this;
  }

  public String getScope() {
    return scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteScope that = (DeleteScope) o;
    return Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteScope.class).add("scope", scope).toString();
  }

  DeleteScopePb toPb() {
    DeleteScopePb pb = new DeleteScopePb();
    pb.setScope(scope);

    return pb;
  }

  static DeleteScope fromPb(DeleteScopePb pb) {
    DeleteScope model = new DeleteScope();
    model.setScope(pb.getScope());

    return model;
  }

  public static class DeleteScopeSerializer extends JsonSerializer<DeleteScope> {
    @Override
    public void serialize(DeleteScope value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteScopePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteScopeDeserializer extends JsonDeserializer<DeleteScope> {
    @Override
    public DeleteScope deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteScopePb pb = mapper.readValue(p, DeleteScopePb.class);
      return DeleteScope.fromPb(pb);
    }
  }
}
