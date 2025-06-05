// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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

/** List pipelines */
@Generated
@JsonSerialize(using = ListPipelinesRequest.ListPipelinesRequestSerializer.class)
@JsonDeserialize(using = ListPipelinesRequest.ListPipelinesRequestDeserializer.class)
public class ListPipelinesRequest {
  /**
   * Select a subset of results based on the specified criteria. The supported filters are:
   *
   * <p>* `notebook='<path>'` to select pipelines that reference the provided notebook path. * `name
   * LIKE '[pattern]'` to select pipelines with a name that matches pattern. Wildcards are
   * supported, for example: `name LIKE '%shopping%'`
   *
   * <p>Composite filters are not supported. This field is optional.
   */
  private String filter;

  /**
   * The maximum number of entries to return in a single page. The system may return fewer than
   * max_results events in a response, even if there are more events available. This field is
   * optional. The default value is 25. The maximum value is 100. An error is returned if the value
   * of max_results is greater than 100.
   */
  private Long maxResults;

  /**
   * A list of strings specifying the order of results. Supported order_by fields are id and name.
   * The default is id asc. This field is optional.
   */
  private Collection<String> orderBy;

  /** Page token returned by previous call */
  private String pageToken;

  public ListPipelinesRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListPipelinesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPipelinesRequest setOrderBy(Collection<String> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public Collection<String> getOrderBy() {
    return orderBy;
  }

  public ListPipelinesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPipelinesRequest that = (ListPipelinesRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(orderBy, that.orderBy)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, maxResults, orderBy, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPipelinesRequest.class)
        .add("filter", filter)
        .add("maxResults", maxResults)
        .add("orderBy", orderBy)
        .add("pageToken", pageToken)
        .toString();
  }

  ListPipelinesRequestPb toPb() {
    ListPipelinesRequestPb pb = new ListPipelinesRequestPb();
    pb.setFilter(filter);
    pb.setMaxResults(maxResults);
    pb.setOrderBy(orderBy);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListPipelinesRequest fromPb(ListPipelinesRequestPb pb) {
    ListPipelinesRequest model = new ListPipelinesRequest();
    model.setFilter(pb.getFilter());
    model.setMaxResults(pb.getMaxResults());
    model.setOrderBy(pb.getOrderBy());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListPipelinesRequestSerializer extends JsonSerializer<ListPipelinesRequest> {
    @Override
    public void serialize(
        ListPipelinesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPipelinesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPipelinesRequestDeserializer
      extends JsonDeserializer<ListPipelinesRequest> {
    @Override
    public ListPipelinesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPipelinesRequestPb pb = mapper.readValue(p, ListPipelinesRequestPb.class);
      return ListPipelinesRequest.fromPb(pb);
    }
  }
}
