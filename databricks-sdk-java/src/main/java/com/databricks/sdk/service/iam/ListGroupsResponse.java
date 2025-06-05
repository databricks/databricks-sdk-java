// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = ListGroupsResponse.ListGroupsResponseSerializer.class)
@JsonDeserialize(using = ListGroupsResponse.ListGroupsResponseDeserializer.class)
public class ListGroupsResponse {
  /** Total results returned in the response. */
  private Long itemsPerPage;

  /** User objects returned in the response. */
  private Collection<Group> resources;

  /** The schema of the service principal. */
  private Collection<ListResponseSchema> schemas;

  /** Starting index of all the results that matched the request filters. First item is number 1. */
  private Long startIndex;

  /** Total results that match the request filters. */
  private Long totalResults;

  public ListGroupsResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  public ListGroupsResponse setResources(Collection<Group> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<Group> getResources() {
    return resources;
  }

  public ListGroupsResponse setSchemas(Collection<ListResponseSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<ListResponseSchema> getSchemas() {
    return schemas;
  }

  public ListGroupsResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  public ListGroupsResponse setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  public Long getTotalResults() {
    return totalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGroupsResponse that = (ListGroupsResponse) o;
    return Objects.equals(itemsPerPage, that.itemsPerPage)
        && Objects.equals(resources, that.resources)
        && Objects.equals(schemas, that.schemas)
        && Objects.equals(startIndex, that.startIndex)
        && Objects.equals(totalResults, that.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemsPerPage, resources, schemas, startIndex, totalResults);
  }

  @Override
  public String toString() {
    return new ToStringer(ListGroupsResponse.class)
        .add("itemsPerPage", itemsPerPage)
        .add("resources", resources)
        .add("schemas", schemas)
        .add("startIndex", startIndex)
        .add("totalResults", totalResults)
        .toString();
  }

  ListGroupsResponsePb toPb() {
    ListGroupsResponsePb pb = new ListGroupsResponsePb();
    pb.setItemsPerPage(itemsPerPage);
    pb.setResources(resources);
    pb.setSchemas(schemas);
    pb.setStartIndex(startIndex);
    pb.setTotalResults(totalResults);

    return pb;
  }

  static ListGroupsResponse fromPb(ListGroupsResponsePb pb) {
    ListGroupsResponse model = new ListGroupsResponse();
    model.setItemsPerPage(pb.getItemsPerPage());
    model.setResources(pb.getResources());
    model.setSchemas(pb.getSchemas());
    model.setStartIndex(pb.getStartIndex());
    model.setTotalResults(pb.getTotalResults());

    return model;
  }

  public static class ListGroupsResponseSerializer extends JsonSerializer<ListGroupsResponse> {
    @Override
    public void serialize(ListGroupsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListGroupsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListGroupsResponseDeserializer extends JsonDeserializer<ListGroupsResponse> {
    @Override
    public ListGroupsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListGroupsResponsePb pb = mapper.readValue(p, ListGroupsResponsePb.class);
      return ListGroupsResponse.fromPb(pb);
    }
  }
}
