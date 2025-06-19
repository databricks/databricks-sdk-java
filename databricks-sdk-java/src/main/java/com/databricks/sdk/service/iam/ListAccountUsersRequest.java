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
@JsonSerialize(using = ListAccountUsersRequest.ListAccountUsersRequestSerializer.class)
@JsonDeserialize(using = ListAccountUsersRequest.ListAccountUsersRequestDeserializer.class)
public class ListAccountUsersRequest {
  /** Comma-separated list of attributes to return in response. */
  private String attributes;

  /** Desired number of results per page. Default is 10000. */
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

  public ListAccountUsersRequest setAttributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

  public String getAttributes() {
    return attributes;
  }

  public ListAccountUsersRequest setCount(Long count) {
    this.count = count;
    return this;
  }

  public Long getCount() {
    return count;
  }

  public ListAccountUsersRequest setExcludedAttributes(String excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public String getExcludedAttributes() {
    return excludedAttributes;
  }

  public ListAccountUsersRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListAccountUsersRequest setSortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public String getSortBy() {
    return sortBy;
  }

  public ListAccountUsersRequest setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  public ListAccountUsersRequest setStartIndex(Long startIndex) {
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
    ListAccountUsersRequest that = (ListAccountUsersRequest) o;
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
    return new ToStringer(ListAccountUsersRequest.class)
        .add("attributes", attributes)
        .add("count", count)
        .add("excludedAttributes", excludedAttributes)
        .add("filter", filter)
        .add("sortBy", sortBy)
        .add("sortOrder", sortOrder)
        .add("startIndex", startIndex)
        .toString();
  }

  ListAccountUsersRequestPb toPb() {
    ListAccountUsersRequestPb pb = new ListAccountUsersRequestPb();
    pb.setAttributes(attributes);
    pb.setCount(count);
    pb.setExcludedAttributes(excludedAttributes);
    pb.setFilter(filter);
    pb.setSortBy(sortBy);
    pb.setSortOrder(sortOrder);
    pb.setStartIndex(startIndex);

    return pb;
  }

  static ListAccountUsersRequest fromPb(ListAccountUsersRequestPb pb) {
    ListAccountUsersRequest model = new ListAccountUsersRequest();
    model.setAttributes(pb.getAttributes());
    model.setCount(pb.getCount());
    model.setExcludedAttributes(pb.getExcludedAttributes());
    model.setFilter(pb.getFilter());
    model.setSortBy(pb.getSortBy());
    model.setSortOrder(pb.getSortOrder());
    model.setStartIndex(pb.getStartIndex());

    return model;
  }

  public static class ListAccountUsersRequestSerializer
      extends JsonSerializer<ListAccountUsersRequest> {
    @Override
    public void serialize(
        ListAccountUsersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAccountUsersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAccountUsersRequestDeserializer
      extends JsonDeserializer<ListAccountUsersRequest> {
    @Override
    public ListAccountUsersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAccountUsersRequestPb pb = mapper.readValue(p, ListAccountUsersRequestPb.class);
      return ListAccountUsersRequest.fromPb(pb);
    }
  }
}
