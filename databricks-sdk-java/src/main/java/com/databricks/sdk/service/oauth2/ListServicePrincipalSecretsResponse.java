// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(
    using = ListServicePrincipalSecretsResponse.ListServicePrincipalSecretsResponseSerializer.class)
@JsonDeserialize(
    using =
        ListServicePrincipalSecretsResponse.ListServicePrincipalSecretsResponseDeserializer.class)
public class ListServicePrincipalSecretsResponse {
  /** A token, which can be sent as `page_token` to retrieve the next page. */
  private String nextPageToken;

  /** List of the secrets */
  private Collection<SecretInfo> secrets;

  public ListServicePrincipalSecretsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListServicePrincipalSecretsResponse setSecrets(Collection<SecretInfo> secrets) {
    this.secrets = secrets;
    return this;
  }

  public Collection<SecretInfo> getSecrets() {
    return secrets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListServicePrincipalSecretsResponse that = (ListServicePrincipalSecretsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(secrets, that.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, secrets);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalSecretsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("secrets", secrets)
        .toString();
  }

  ListServicePrincipalSecretsResponsePb toPb() {
    ListServicePrincipalSecretsResponsePb pb = new ListServicePrincipalSecretsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSecrets(secrets);

    return pb;
  }

  static ListServicePrincipalSecretsResponse fromPb(ListServicePrincipalSecretsResponsePb pb) {
    ListServicePrincipalSecretsResponse model = new ListServicePrincipalSecretsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSecrets(pb.getSecrets());

    return model;
  }

  public static class ListServicePrincipalSecretsResponseSerializer
      extends JsonSerializer<ListServicePrincipalSecretsResponse> {
    @Override
    public void serialize(
        ListServicePrincipalSecretsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListServicePrincipalSecretsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListServicePrincipalSecretsResponseDeserializer
      extends JsonDeserializer<ListServicePrincipalSecretsResponse> {
    @Override
    public ListServicePrincipalSecretsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListServicePrincipalSecretsResponsePb pb =
          mapper.readValue(p, ListServicePrincipalSecretsResponsePb.class);
      return ListServicePrincipalSecretsResponse.fromPb(pb);
    }
  }
}
