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

/** List secret keys */
@Generated
@JsonSerialize(using = ListSecretsRequest.ListSecretsRequestSerializer.class)
@JsonDeserialize(using = ListSecretsRequest.ListSecretsRequestDeserializer.class)
public class ListSecretsRequest {
  /** The name of the scope to list secrets within. */
  private String scope;

  public ListSecretsRequest setScope(String scope) {
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
    ListSecretsRequest that = (ListSecretsRequest) o;
    return Objects.equals(scope, that.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecretsRequest.class).add("scope", scope).toString();
  }

  ListSecretsRequestPb toPb() {
    ListSecretsRequestPb pb = new ListSecretsRequestPb();
    pb.setScope(scope);

    return pb;
  }

  static ListSecretsRequest fromPb(ListSecretsRequestPb pb) {
    ListSecretsRequest model = new ListSecretsRequest();
    model.setScope(pb.getScope());

    return model;
  }

  public static class ListSecretsRequestSerializer extends JsonSerializer<ListSecretsRequest> {
    @Override
    public void serialize(ListSecretsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSecretsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSecretsRequestDeserializer extends JsonDeserializer<ListSecretsRequest> {
    @Override
    public ListSecretsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSecretsRequestPb pb = mapper.readValue(p, ListSecretsRequestPb.class);
      return ListSecretsRequest.fromPb(pb);
    }
  }
}
