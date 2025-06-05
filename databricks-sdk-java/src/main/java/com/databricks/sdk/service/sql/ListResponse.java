// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = ListResponse.ListResponseSerializer.class)
@JsonDeserialize(using = ListResponse.ListResponseDeserializer.class)
public class ListResponse {
  /** The total number of dashboards. */
  private Long count;

  /** The current page being displayed. */
  private Long page;

  /** The number of dashboards per page. */
  private Long pageSize;

  /** List of dashboards returned. */
  private Collection<Dashboard> results;

  public ListResponse setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public ListResponse setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public ListResponse setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListResponse setResults(Collection<Dashboard> results) {
    this.results = results;
    return this;
  }

  public Collection<Dashboard> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListResponse that = (ListResponse) o;
    return Objects.equals(count, that.count)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, pageSize, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListResponse.class)
        .add("count", count)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("results", results)
        .toString();
  }

  ListResponsePb toPb() {
    ListResponsePb pb = new ListResponsePb();
    pb.setCount(count);
    pb.setPage(page);
    pb.setPageSize(pageSize);
    pb.setResults(results);

    return pb;
  }

  static ListResponse fromPb(ListResponsePb pb) {
    ListResponse model = new ListResponse();
    model.setCount(pb.getCount());
    model.setPage(pb.getPage());
    model.setPageSize(pb.getPageSize());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListResponseSerializer extends JsonSerializer<ListResponse> {
    @Override
    public void serialize(ListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListResponseDeserializer extends JsonDeserializer<ListResponse> {
    @Override
    public ListResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListResponsePb pb = mapper.readValue(p, ListResponsePb.class);
      return ListResponse.fromPb(pb);
    }
  }
}
