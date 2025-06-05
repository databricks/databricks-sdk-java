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
@JsonSerialize(using = DeleteSecret.DeleteSecretSerializer.class)
@JsonDeserialize(using = DeleteSecret.DeleteSecretDeserializer.class)
public class DeleteSecret {
  /** Name of the secret to delete. */
  private String key;

  /** The name of the scope that contains the secret to delete. */
  private String scope;

  public DeleteSecret setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteSecret setScope(String scope) {
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
    DeleteSecret that = (DeleteSecret) o;
    return Objects.equals(key, that.key) && Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scope);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSecret.class).add("key", key).add("scope", scope).toString();
  }

  DeleteSecretPb toPb() {
    DeleteSecretPb pb = new DeleteSecretPb();
    pb.setKey(key);
    pb.setScope(scope);

    return pb;
  }

  static DeleteSecret fromPb(DeleteSecretPb pb) {
    DeleteSecret model = new DeleteSecret();
    model.setKey(pb.getKey());
    model.setScope(pb.getScope());

    return model;
  }

  public static class DeleteSecretSerializer extends JsonSerializer<DeleteSecret> {
    @Override
    public void serialize(DeleteSecret value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSecretPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSecretDeserializer extends JsonDeserializer<DeleteSecret> {
    @Override
    public DeleteSecret deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSecretPb pb = mapper.readValue(p, DeleteSecretPb.class);
      return DeleteSecret.fromPb(pb);
    }
  }
}
