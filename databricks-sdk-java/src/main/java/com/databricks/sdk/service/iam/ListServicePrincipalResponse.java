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
@JsonSerialize(using = ListServicePrincipalResponse.ListServicePrincipalResponseSerializer.class)
@JsonDeserialize(
    using = ListServicePrincipalResponse.ListServicePrincipalResponseDeserializer.class)
public class ListServicePrincipalResponse {
  /** Total results returned in the response. */
  private Long itemsPerPage;

  /** User objects returned in the response. */
  private Collection<ServicePrincipal> resources;

  /** The schema of the List response. */
  private Collection<ListResponseSchema> schemas;

  /** Starting index of all the results that matched the request filters. First item is number 1. */
  private Long startIndex;

  /** Total results that match the request filters. */
  private Long totalResults;

  public ListServicePrincipalResponse setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  public ListServicePrincipalResponse setResources(Collection<ServicePrincipal> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<ServicePrincipal> getResources() {
    return resources;
  }

  public ListServicePrincipalResponse setSchemas(Collection<ListResponseSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<ListResponseSchema> getSchemas() {
    return schemas;
  }

  public ListServicePrincipalResponse setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  public ListServicePrincipalResponse setTotalResults(Long totalResults) {
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
    ListServicePrincipalResponse that = (ListServicePrincipalResponse) o;
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
    return new ToStringer(ListServicePrincipalResponse.class)
        .add("itemsPerPage", itemsPerPage)
        .add("resources", resources)
        .add("schemas", schemas)
        .add("startIndex", startIndex)
        .add("totalResults", totalResults)
        .toString();
  }

  ListServicePrincipalResponsePb toPb() {
    ListServicePrincipalResponsePb pb = new ListServicePrincipalResponsePb();
    pb.setItemsPerPage(itemsPerPage);
    pb.setResources(resources);
    pb.setSchemas(schemas);
    pb.setStartIndex(startIndex);
    pb.setTotalResults(totalResults);

    return pb;
  }

  static ListServicePrincipalResponse fromPb(ListServicePrincipalResponsePb pb) {
    ListServicePrincipalResponse model = new ListServicePrincipalResponse();
    model.setItemsPerPage(pb.getItemsPerPage());
    model.setResources(pb.getResources());
    model.setSchemas(pb.getSchemas());
    model.setStartIndex(pb.getStartIndex());
    model.setTotalResults(pb.getTotalResults());

    return model;
  }

  public static class ListServicePrincipalResponseSerializer
      extends JsonSerializer<ListServicePrincipalResponse> {
    @Override
    public void serialize(
        ListServicePrincipalResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListServicePrincipalResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListServicePrincipalResponseDeserializer
      extends JsonDeserializer<ListServicePrincipalResponse> {
    @Override
    public ListServicePrincipalResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListServicePrincipalResponsePb pb = mapper.readValue(p, ListServicePrincipalResponsePb.class);
      return ListServicePrincipalResponse.fromPb(pb);
    }
  }
}
