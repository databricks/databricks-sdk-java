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
@JsonSerialize(
    using = ListStorageCredentialsResponse.ListStorageCredentialsResponseSerializer.class)
@JsonDeserialize(
    using = ListStorageCredentialsResponse.ListStorageCredentialsResponseDeserializer.class)
public class ListStorageCredentialsResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  /** */
  private Collection<StorageCredentialInfo> storageCredentials;

  public ListStorageCredentialsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListStorageCredentialsResponse setStorageCredentials(
      Collection<StorageCredentialInfo> storageCredentials) {
    this.storageCredentials = storageCredentials;
    return this;
  }

  public Collection<StorageCredentialInfo> getStorageCredentials() {
    return storageCredentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStorageCredentialsResponse that = (ListStorageCredentialsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(storageCredentials, that.storageCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, storageCredentials);
  }

  @Override
  public String toString() {
    return new ToStringer(ListStorageCredentialsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("storageCredentials", storageCredentials)
        .toString();
  }

  ListStorageCredentialsResponsePb toPb() {
    ListStorageCredentialsResponsePb pb = new ListStorageCredentialsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setStorageCredentials(storageCredentials);

    return pb;
  }

  static ListStorageCredentialsResponse fromPb(ListStorageCredentialsResponsePb pb) {
    ListStorageCredentialsResponse model = new ListStorageCredentialsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setStorageCredentials(pb.getStorageCredentials());

    return model;
  }

  public static class ListStorageCredentialsResponseSerializer
      extends JsonSerializer<ListStorageCredentialsResponse> {
    @Override
    public void serialize(
        ListStorageCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListStorageCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListStorageCredentialsResponseDeserializer
      extends JsonDeserializer<ListStorageCredentialsResponse> {
    @Override
    public ListStorageCredentialsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListStorageCredentialsResponsePb pb =
          mapper.readValue(p, ListStorageCredentialsResponsePb.class);
      return ListStorageCredentialsResponse.fromPb(pb);
    }
  }
}
