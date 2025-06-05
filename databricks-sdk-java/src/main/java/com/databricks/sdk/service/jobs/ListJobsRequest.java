// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** List jobs */
@Generated
@JsonSerialize(using = ListJobsRequest.ListJobsRequestSerializer.class)
@JsonDeserialize(using = ListJobsRequest.ListJobsRequestDeserializer.class)
public class ListJobsRequest {
  /**
   * Whether to include task and cluster details in the response. Note that only the first 100
   * elements will be shown. Use :method:jobs/get to paginate through all tasks and clusters.
   */
  private Boolean expandTasks;

  /**
   * The number of jobs to return. This value must be greater than 0 and less or equal to 100. The
   * default value is 20.
   */
  private Long limit;

  /** A filter on the list based on the exact (case insensitive) job name. */
  private String name;

  /**
   * The offset of the first job to return, relative to the most recently created job. Deprecated
   * since June 2023. Use `page_token` to iterate through the pages instead.
   */
  private Long offset;

  /**
   * Use `next_page_token` or `prev_page_token` returned from the previous request to list the next
   * or previous page of jobs respectively.
   */
  private String pageToken;

  public ListJobsRequest setExpandTasks(Boolean expandTasks) {
    this.expandTasks = expandTasks;
    return this;
  }

  public Boolean getExpandTasks() {
    return expandTasks;
  }

  public ListJobsRequest setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public ListJobsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ListJobsRequest setOffset(Long offset) {
    this.offset = offset;
    return this;
  }

  public Long getOffset() {
    return offset;
  }

  public ListJobsRequest setPageToken(String pageToken) {
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
    ListJobsRequest that = (ListJobsRequest) o;
    return Objects.equals(expandTasks, that.expandTasks)
        && Objects.equals(limit, that.limit)
        && Objects.equals(name, that.name)
        && Objects.equals(offset, that.offset)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandTasks, limit, name, offset, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsRequest.class)
        .add("expandTasks", expandTasks)
        .add("limit", limit)
        .add("name", name)
        .add("offset", offset)
        .add("pageToken", pageToken)
        .toString();
  }

  ListJobsRequestPb toPb() {
    ListJobsRequestPb pb = new ListJobsRequestPb();
    pb.setExpandTasks(expandTasks);
    pb.setLimit(limit);
    pb.setName(name);
    pb.setOffset(offset);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListJobsRequest fromPb(ListJobsRequestPb pb) {
    ListJobsRequest model = new ListJobsRequest();
    model.setExpandTasks(pb.getExpandTasks());
    model.setLimit(pb.getLimit());
    model.setName(pb.getName());
    model.setOffset(pb.getOffset());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListJobsRequestSerializer extends JsonSerializer<ListJobsRequest> {
    @Override
    public void serialize(ListJobsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListJobsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListJobsRequestDeserializer extends JsonDeserializer<ListJobsRequest> {
    @Override
    public ListJobsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListJobsRequestPb pb = mapper.readValue(p, ListJobsRequestPb.class);
      return ListJobsRequest.fromPb(pb);
    }
  }
}
