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

/** Get repos */
@Generated
@JsonSerialize(using = ListReposRequest.ListReposRequestSerializer.class)
@JsonDeserialize(using = ListReposRequest.ListReposRequestDeserializer.class)
public class ListReposRequest {
  /**
   * Token used to get the next page of results. If not specified, returns the first page of results
   * as well as a next page token if there are more results.
   */
  private String nextPageToken;

  /**
   * Filters repos that have paths starting with the given path prefix. If not provided or when
   * provided an effectively empty prefix (`/` or `/Workspace`) Git folders (repos) from
   * `/Workspace/Repos` will be served.
   */
  private String pathPrefix;

  public ListReposRequest setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposRequest setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  public String getPathPrefix() {
    return pathPrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposRequest that = (ListReposRequest) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(pathPrefix, that.pathPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pathPrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposRequest.class)
        .add("nextPageToken", nextPageToken)
        .add("pathPrefix", pathPrefix)
        .toString();
  }

  ListReposRequestPb toPb() {
    ListReposRequestPb pb = new ListReposRequestPb();
    pb.setNextPageToken(nextPageToken);
    pb.setPathPrefix(pathPrefix);

    return pb;
  }

  static ListReposRequest fromPb(ListReposRequestPb pb) {
    ListReposRequest model = new ListReposRequest();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPathPrefix(pb.getPathPrefix());

    return model;
  }

  public static class ListReposRequestSerializer extends JsonSerializer<ListReposRequest> {
    @Override
    public void serialize(ListReposRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListReposRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListReposRequestDeserializer extends JsonDeserializer<ListReposRequest> {
    @Override
    public ListReposRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListReposRequestPb pb = mapper.readValue(p, ListReposRequestPb.class);
      return ListReposRequest.fromPb(pb);
    }
  }
}
