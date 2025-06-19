// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = ListDirectoryResponse.ListDirectoryResponseSerializer.class)
@JsonDeserialize(using = ListDirectoryResponse.ListDirectoryResponseDeserializer.class)
public class ListDirectoryResponse {
  /** Array of DirectoryEntry. */
  private Collection<DirectoryEntry> contents;

  /** A token, which can be sent as `page_token` to retrieve the next page. */
  private String nextPageToken;

  public ListDirectoryResponse setContents(Collection<DirectoryEntry> contents) {
    this.contents = contents;
    return this;
  }

  public Collection<DirectoryEntry> getContents() {
    return contents;
  }

  public ListDirectoryResponse setNextPageToken(String nextPageToken) {
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
    ListDirectoryResponse that = (ListDirectoryResponse) o;
    return Objects.equals(contents, that.contents)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDirectoryResponse.class)
        .add("contents", contents)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListDirectoryResponsePb toPb() {
    ListDirectoryResponsePb pb = new ListDirectoryResponsePb();
    pb.setContents(contents);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListDirectoryResponse fromPb(ListDirectoryResponsePb pb) {
    ListDirectoryResponse model = new ListDirectoryResponse();
    model.setContents(pb.getContents());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListDirectoryResponseSerializer
      extends JsonSerializer<ListDirectoryResponse> {
    @Override
    public void serialize(
        ListDirectoryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDirectoryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDirectoryResponseDeserializer
      extends JsonDeserializer<ListDirectoryResponse> {
    @Override
    public ListDirectoryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDirectoryResponsePb pb = mapper.readValue(p, ListDirectoryResponsePb.class);
      return ListDirectoryResponse.fromPb(pb);
    }
  }
}
