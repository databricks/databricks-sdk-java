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
@JsonSerialize(using = DeleteAcl.DeleteAclSerializer.class)
@JsonDeserialize(using = DeleteAcl.DeleteAclDeserializer.class)
public class DeleteAcl {
  /** The principal to remove an existing ACL from. */
  private String principal;

  /** The name of the scope to remove permissions from. */
  private String scope;

  public DeleteAcl setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public DeleteAcl setScope(String scope) {
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
    DeleteAcl that = (DeleteAcl) o;
    return Objects.equals(principal, that.principal) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principal, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAcl.class)
        .add("principal", principal)
        .add("scope", scope)
        .toString();
  }

  DeleteAclPb toPb() {
    DeleteAclPb pb = new DeleteAclPb();
    pb.setPrincipal(principal);
    pb.setScope(scope);

    return pb;
  }

  static DeleteAcl fromPb(DeleteAclPb pb) {
    DeleteAcl model = new DeleteAcl();
    model.setPrincipal(pb.getPrincipal());
    model.setScope(pb.getScope());

    return model;
  }

  public static class DeleteAclSerializer extends JsonSerializer<DeleteAcl> {
    @Override
    public void serialize(DeleteAcl value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAclPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAclDeserializer extends JsonDeserializer<DeleteAcl> {
    @Override
    public DeleteAcl deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAclPb pb = mapper.readValue(p, DeleteAclPb.class);
      return DeleteAcl.fromPb(pb);
    }
  }
}
