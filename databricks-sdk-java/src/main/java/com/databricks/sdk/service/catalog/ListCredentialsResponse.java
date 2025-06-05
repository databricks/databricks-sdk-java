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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListCredentialsResponse.ListCredentialsResponseSerializer.class)
@JsonDeserialize(using = ListCredentialsResponse.ListCredentialsResponseDeserializer.class)
public class ListCredentialsResponse {
  /** */
  private Collection<CredentialInfo> credentials;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  public ListCredentialsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCredentialsResponse that = (ListCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsResponse.class)
        .add("credentials", credentials)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListCredentialsResponsePb toPb() {
    ListCredentialsResponsePb pb = new ListCredentialsResponsePb();
    pb.setCredentials(credentials);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListCredentialsResponse fromPb(ListCredentialsResponsePb pb) {
    ListCredentialsResponse model = new ListCredentialsResponse();
    model.setCredentials(pb.getCredentials());
    model.setNextPageToken(pb.getNextPageToken());

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
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCredentialsResponsePb pb = mapper.readValue(p, ListCredentialsResponsePb.class);
      return ListCredentialsResponse.fromPb(pb);
    }
  }
}
