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
@JsonSerialize(using = ListCredentialsResponse.ListCredentialsResponseSerializer.class)
@JsonDeserialize(using = ListCredentialsResponse.ListCredentialsResponseDeserializer.class)
public class ListCredentialsResponse {
  /** List of credentials. */
  private Collection<CredentialInfo> credentials;

  public ListCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCredentialsResponse that = (ListCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsResponse.class).add("credentials", credentials).toString();
  }

  ListCredentialsResponsePb toPb() {
    ListCredentialsResponsePb pb = new ListCredentialsResponsePb();
    pb.setCredentials(credentials);

    return pb;
  }

  static ListCredentialsResponse fromPb(ListCredentialsResponsePb pb) {
    ListCredentialsResponse model = new ListCredentialsResponse();
    model.setCredentials(pb.getCredentials());

    return model;
  }

  public static class ListCredentialsResponseSerializer
      extends JsonSerializer<ListCredentialsResponse> {
    @Override
    public void serialize(
        ListCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCredentialsResponseDeserializer
      extends JsonDeserializer<ListCredentialsResponse> {
    @Override
    public ListCredentialsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCredentialsResponsePb pb = mapper.readValue(p, ListCredentialsResponsePb.class);
      return ListCredentialsResponse.fromPb(pb);
    }
  }
}
