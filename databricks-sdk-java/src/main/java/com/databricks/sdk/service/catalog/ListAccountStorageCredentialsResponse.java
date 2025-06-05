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
    using =
        ListAccountStorageCredentialsResponse.ListAccountStorageCredentialsResponseSerializer.class)
@JsonDeserialize(
    using =
        ListAccountStorageCredentialsResponse.ListAccountStorageCredentialsResponseDeserializer
            .class)
public class ListAccountStorageCredentialsResponse {
  /** An array of metastore storage credentials. */
  private Collection<StorageCredentialInfo> storageCredentials;

  public ListAccountStorageCredentialsResponse setStorageCredentials(
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
    ListAccountStorageCredentialsResponse that = (ListAccountStorageCredentialsResponse) o;
    return Objects.equals(storageCredentials, that.storageCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageCredentials);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountStorageCredentialsResponse.class)
        .add("storageCredentials", storageCredentials)
        .toString();
  }

  ListAccountStorageCredentialsResponsePb toPb() {
    ListAccountStorageCredentialsResponsePb pb = new ListAccountStorageCredentialsResponsePb();
    pb.setStorageCredentials(storageCredentials);

    return pb;
  }

  static ListAccountStorageCredentialsResponse fromPb(ListAccountStorageCredentialsResponsePb pb) {
    ListAccountStorageCredentialsResponse model = new ListAccountStorageCredentialsResponse();
    model.setStorageCredentials(pb.getStorageCredentials());

    return model;
  }

  public static class ListAccountStorageCredentialsResponseSerializer
      extends JsonSerializer<ListAccountStorageCredentialsResponse> {
    @Override
    public void serialize(
        ListAccountStorageCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAccountStorageCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountStorageCredentialsResponseDeserializer
      extends JsonDeserializer<ListAccountStorageCredentialsResponse> {
    @Override
    public ListAccountStorageCredentialsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountStorageCredentialsResponsePb pb =
          mapper.readValue(p, ListAccountStorageCredentialsResponsePb.class);
      return ListAccountStorageCredentialsResponse.fromPb(pb);
    }
  }
}
