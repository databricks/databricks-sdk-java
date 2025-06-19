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
import java.util.Objects;

/** List users. */
@Generated
@JsonSerialize(using = ListUsersRequest.ListUsersRequestSerializer.class)
@JsonDeserialize(using = ListUsersRequest.ListUsersRequestDeserializer.class)
public class ListUsersRequest {
  /** Comma-separated list of attributes to return in response. */
  private String attributes;

  /** Desired number of results per page. */
  private Long count;

  /** Comma-separated list of attributes to exclude in response. */
  private String excludedAttributes;

  /**
   * Query by which the results have to be filtered. Supported operators are equals(`eq`),
   * contains(`co`), starts with(`sw`) and not equals(`ne`). Additionally, simple expressions can be
   * formed using logical operators - `and` and `or`. The [SCIM RFC] has more details but we
   * currently only support simple expressions.
   *
   * <p>[SCIM RFC]: https://tools.ietf.org/html/rfc7644#section-3.4.2.2
   */
  private String filter;

  /**
   * Attribute to sort the results. Multi-part paths are supported. For example, `userName`,
   * `name.givenName`, and `emails`.
   */
  private String sortBy;

  /** The order to sort the results. */
  private ListSortOrder sortOrder;

  /** Specifies the index of the first result. First item is number 1. */
  private Long startIndex;

  public ListUsersRequest setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  public String getAttributes() {
    return attributes;
  }

  public ListUsersRequest setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public ListUsersRequest setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  public ListUsersRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListUsersRequest setSortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public String getSortBy() {
    return sortBy;
  }

  public ListUsersRequest setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  public ListUsersRequest setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  public Long getStartIndex() {
    return startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUsersRequest that = (ListUsersRequest) o;
    return Objects.equals(attributes, that.attributes)
        && Objects.equals(count, that.count)
        && Objects.equals(excludedAttributes, that.excludedAttributes)
        && Objects.equals(filter, that.filter)
        && Objects.equals(sortBy, that.sortBy)
        && Objects.equals(sortOrder, that.sortOrder)
        && Objects.equals(startIndex, that.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attributes, count, excludedAttributes, filter, sortBy, sortOrder, startIndex);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUsersRequest.class)
        .add("attributes", attributes)
        .add("count", count)
        .add("excludedAttributes", excludedAttributes)
        .add("filter", filter)
        .add("sortBy", sortBy)
        .add("sortOrder", sortOrder)
        .add("startIndex", startIndex)
        .toString();
  }

  ListUsersRequestPb toPb() {
    ListUsersRequestPb pb = new ListUsersRequestPb();
    pb.setAttributes(attributes);
    pb.setCount(count);
    pb.setExcludedAttributes(excludedAttributes);
    pb.setFilter(filter);
    pb.setSortBy(sortBy);
    pb.setSortOrder(sortOrder);
    pb.setStartIndex(startIndex);

    return pb;
  }

  static ListUsersRequest fromPb(ListUsersRequestPb pb) {
    ListUsersRequest model = new ListUsersRequest();
    model.setAttributes(pb.getAttributes());
    model.setCount(pb.getCount());
    model.setExcludedAttributes(pb.getExcludedAttributes());
    model.setFilter(pb.getFilter());
    model.setSortBy(pb.getSortBy());
    model.setSortOrder(pb.getSortOrder());
    model.setStartIndex(pb.getStartIndex());

    return model;
  }

  public static class ListUsersRequestSerializer extends JsonSerializer<ListUsersRequest> {
    @Override
    public void serialize(ListUsersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListUsersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListUsersRequestDeserializer extends JsonDeserializer<ListUsersRequest> {
    @Override
    public ListUsersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListUsersRequestPb pb = mapper.readValue(p, ListUsersRequestPb.class);
      return ListUsersRequest.fromPb(pb);
    }
  }
}
