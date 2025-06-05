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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListScopesResponse.ListScopesResponseSerializer.class)
@JsonDeserialize(using = ListScopesResponse.ListScopesResponseDeserializer.class)
public class ListScopesResponse {
  /** The available secret scopes. */
  private Collection<SecretScope> scopes;

  public ListScopesResponse setScopes(Collection<SecretScope> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<SecretScope> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListScopesResponse that = (ListScopesResponse) o;
    return Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(ListScopesResponse.class).add("scopes", scopes).toString();
  }

  ListScopesResponsePb toPb() {
    ListScopesResponsePb pb = new ListScopesResponsePb();
    pb.setScopes(scopes);

    return pb;
  }

  static ListScopesResponse fromPb(ListScopesResponsePb pb) {
    ListScopesResponse model = new ListScopesResponse();
    model.setScopes(pb.getScopes());

    return model;
  }

  public static class ListScopesResponseSerializer extends JsonSerializer<ListScopesResponse> {
    @Override
    public void serialize(ListScopesResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListScopesResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListScopesResponseDeserializer extends JsonDeserializer<ListScopesResponse> {
    @Override
    public ListScopesResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListScopesResponsePb pb = mapper.readValue(p, ListScopesResponsePb.class);
      return ListScopesResponse.fromPb(pb);
    }
  }
}
