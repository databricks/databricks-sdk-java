// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** List cluster policies */
@Generated
@JsonSerialize(using = ListClusterPoliciesRequest.ListClusterPoliciesRequestSerializer.class)
@JsonDeserialize(using = ListClusterPoliciesRequest.ListClusterPoliciesRequestDeserializer.class)
public class ListClusterPoliciesRequest {
  /**
   * The cluster policy attribute to sort by. * `POLICY_CREATION_TIME` - Sort result list by policy
   * creation time. * `POLICY_NAME` - Sort result list by policy name.
   */
  private ListSortColumn sortColumn;

  /**
   * The order in which the policies get listed. * `DESC` - Sort result list in descending order. *
   * `ASC` - Sort result list in ascending order.
   */
  private ListSortOrder sortOrder;

  public ListClusterPoliciesRequest setSortColumn(ListSortColumn sortColumn) {
    this.sortColumn = sortColumn;
    return this;
  }

  public ListSortColumn getSortColumn() {
    return sortColumn;
  }

  public ListClusterPoliciesRequest setSortOrder(ListSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  public ListSortOrder getSortOrder() {
    return sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClusterPoliciesRequest that = (ListClusterPoliciesRequest) o;
    return Objects.equals(sortColumn, that.sortColumn) && Objects.equals(sortOrder, that.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortColumn, sortOrder);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClusterPoliciesRequest.class)
        .add("sortColumn", sortColumn)
        .add("sortOrder", sortOrder)
        .toString();
  }

  ListClusterPoliciesRequestPb toPb() {
    ListClusterPoliciesRequestPb pb = new ListClusterPoliciesRequestPb();
    pb.setSortColumn(sortColumn);
    pb.setSortOrder(sortOrder);

    return pb;
  }

  static ListClusterPoliciesRequest fromPb(ListClusterPoliciesRequestPb pb) {
    ListClusterPoliciesRequest model = new ListClusterPoliciesRequest();
    model.setSortColumn(pb.getSortColumn());
    model.setSortOrder(pb.getSortOrder());

    return model;
  }

  public static class ListClusterPoliciesRequestSerializer
      extends JsonSerializer<ListClusterPoliciesRequest> {
    @Override
    public void serialize(
        ListClusterPoliciesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClusterPoliciesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClusterPoliciesRequestDeserializer
      extends JsonDeserializer<ListClusterPoliciesRequest> {
    @Override
    public ListClusterPoliciesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClusterPoliciesRequestPb pb = mapper.readValue(p, ListClusterPoliciesRequestPb.class);
      return ListClusterPoliciesRequest.fromPb(pb);
    }
  }
}
