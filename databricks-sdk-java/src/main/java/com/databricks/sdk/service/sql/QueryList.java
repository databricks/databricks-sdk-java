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
@JsonSerialize(using = QueryList.QueryListSerializer.class)
@JsonDeserialize(using = QueryList.QueryListDeserializer.class)
public class QueryList {
  /** The total number of queries. */
  private Long count;

  /** The page number that is currently displayed. */
  private Long page;

  /** The number of queries per page. */
  private Long pageSize;

  /** List of queries returned. */
  private Collection<LegacyQuery> results;

  public QueryList setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public QueryList setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public QueryList setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public QueryList setResults(Collection<LegacyQuery> results) {
    this.results = results;
    return this;
  }

  public Collection<LegacyQuery> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryList that = (QueryList) o;
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
    return new ToStringer(QueryList.class)
        .add("count", count)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("results", results)
        .toString();
  }

  QueryListPb toPb() {
    QueryListPb pb = new QueryListPb();
    pb.setCount(count);
    pb.setPage(page);
    pb.setPageSize(pageSize);
    pb.setResults(results);

    return pb;
  }

  static QueryList fromPb(QueryListPb pb) {
    QueryList model = new QueryList();
    model.setCount(pb.getCount());
    model.setPage(pb.getPage());
    model.setPageSize(pb.getPageSize());
    model.setResults(pb.getResults());

    return model;
  }

  public static class QueryListSerializer extends JsonSerializer<QueryList> {
    @Override
    public void serialize(QueryList value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryListPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryListDeserializer extends JsonDeserializer<QueryList> {
    @Override
    public QueryList deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryListPb pb = mapper.readValue(p, QueryListPb.class);
      return QueryList.fromPb(pb);
    }
  }
}
