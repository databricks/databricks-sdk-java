// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** List policies */
@Generated
@JsonSerialize(using = ListBudgetPoliciesRequest.ListBudgetPoliciesRequestSerializer.class)
@JsonDeserialize(using = ListBudgetPoliciesRequest.ListBudgetPoliciesRequestDeserializer.class)
public class ListBudgetPoliciesRequest {
  /** A filter to apply to the list of policies. */
  private Filter filterBy;

  /**
   * The maximum number of budget policies to return. If unspecified, at most 100 budget policies
   * will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
   */
  private Long pageSize;

  /**
   * A page token, received from a previous `ListServerlessPolicies` call. Provide this to retrieve
   * the subsequent page. If unspecified, the first page will be returned.
   *
   * <p>When paginating, all other parameters provided to `ListServerlessPoliciesRequest` must match
   * the call that provided the page token.
   */
  private String pageToken;

  /** The sort specification. */
  private SortSpec sortSpec;

  public ListBudgetPoliciesRequest setFilterBy(Filter filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public Filter getFilterBy() {
    return filterBy;
  }

  public ListBudgetPoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListBudgetPoliciesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListBudgetPoliciesRequest setSortSpec(SortSpec sortSpec) {
    this.sortSpec = sortSpec;
    return this;
  }

  public SortSpec getSortSpec() {
    return sortSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListBudgetPoliciesRequest that = (ListBudgetPoliciesRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(sortSpec, that.sortSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, pageSize, pageToken, sortSpec);
  }

  @Override
  public String toString() {
    return new ToStringer(ListBudgetPoliciesRequest.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortSpec", sortSpec)
        .toString();
  }

  ListBudgetPoliciesRequestPb toPb() {
    ListBudgetPoliciesRequestPb pb = new ListBudgetPoliciesRequestPb();
    pb.setFilterBy(filterBy);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setSortSpec(sortSpec);

    return pb;
  }

  static ListBudgetPoliciesRequest fromPb(ListBudgetPoliciesRequestPb pb) {
    ListBudgetPoliciesRequest model = new ListBudgetPoliciesRequest();
    model.setFilterBy(pb.getFilterBy());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setSortSpec(pb.getSortSpec());

    return model;
  }

  public static class ListBudgetPoliciesRequestSerializer
      extends JsonSerializer<ListBudgetPoliciesRequest> {
    @Override
    public void serialize(
        ListBudgetPoliciesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListBudgetPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListBudgetPoliciesRequestDeserializer
      extends JsonDeserializer<ListBudgetPoliciesRequest> {
    @Override
    public ListBudgetPoliciesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListBudgetPoliciesRequestPb pb = mapper.readValue(p, ListBudgetPoliciesRequestPb.class);
      return ListBudgetPoliciesRequest.fromPb(pb);
    }
  }
}
