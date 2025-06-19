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
@JsonSerialize(using = ListReposResponse.ListReposResponseSerializer.class)
@JsonDeserialize(using = ListReposResponse.ListReposResponseDeserializer.class)
public class ListReposResponse {
  /**
   * Token that can be specified as a query parameter to the `GET /repos` endpoint to retrieve the
   * next page of results.
   */
  private String nextPageToken;

  /** List of Git folders (repos). */
  private Collection<RepoInfo> repos;

  public ListReposResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposResponse setRepos(Collection<RepoInfo> repos) {
    this.repos = repos;
    return this;
  }

  public Collection<RepoInfo> getRepos() {
    return repos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposResponse that = (ListReposResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(repos, that.repos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, repos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("repos", repos)
        .toString();
  }

  ListReposResponsePb toPb() {
    ListReposResponsePb pb = new ListReposResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRepos(repos);

    return pb;
  }

  static ListReposResponse fromPb(ListReposResponsePb pb) {
    ListReposResponse model = new ListReposResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRepos(pb.getRepos());

    return model;
  }

  public static class ListReposResponseSerializer extends JsonSerializer<ListReposResponse> {
    @Override
    public void serialize(ListReposResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListReposResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListReposResponseDeserializer extends JsonDeserializer<ListReposResponse> {
    @Override
    public ListReposResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListReposResponsePb pb = mapper.readValue(p, ListReposResponsePb.class);
      return ListReposResponse.fromPb(pb);
    }
  }
}
