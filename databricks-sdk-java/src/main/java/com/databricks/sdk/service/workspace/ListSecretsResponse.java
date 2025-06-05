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
@JsonSerialize(using = ListSecretsResponse.ListSecretsResponseSerializer.class)
@JsonDeserialize(using = ListSecretsResponse.ListSecretsResponseDeserializer.class)
public class ListSecretsResponse {
  /** Metadata information of all secrets contained within the given scope. */
  private Collection<SecretMetadata> secrets;

  public ListSecretsResponse setSecrets(Collection<SecretMetadata> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Collection<SecretMetadata> getSecrets() {
    return secrets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSecretsResponse that = (ListSecretsResponse) o;
    return Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSecretsResponse.class).add("secrets", secrets).toString();
  }

  ListSecretsResponsePb toPb() {
    ListSecretsResponsePb pb = new ListSecretsResponsePb();
    pb.setSecrets(secrets);

    return pb;
  }

  static ListSecretsResponse fromPb(ListSecretsResponsePb pb) {
    ListSecretsResponse model = new ListSecretsResponse();
    model.setSecrets(pb.getSecrets());

    return model;
  }

  public static class ListSecretsResponseSerializer extends JsonSerializer<ListSecretsResponse> {
    @Override
    public void serialize(ListSecretsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSecretsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSecretsResponseDeserializer
      extends JsonDeserializer<ListSecretsResponse> {
    @Override
    public ListSecretsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSecretsResponsePb pb = mapper.readValue(p, ListSecretsResponsePb.class);
      return ListSecretsResponse.fromPb(pb);
    }
  }
}
