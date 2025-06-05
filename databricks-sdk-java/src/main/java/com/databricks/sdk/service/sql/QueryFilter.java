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
@JsonSerialize(using = QueryFilter.QueryFilterSerializer.class)
@JsonDeserialize(using = QueryFilter.QueryFilterDeserializer.class)
public class QueryFilter {
  /** A range filter for query submitted time. The time range must be <= 30 days. */
  private TimeRange queryStartTimeRange;

  /** A list of statement IDs. */
  private Collection<String> statementIds;

  /** */
  private Collection<QueryStatus> statuses;

  /** A list of user IDs who ran the queries. */
  private Collection<Long> userIds;

  /** A list of warehouse IDs. */
  private Collection<String> warehouseIds;

  public QueryFilter setQueryStartTimeRange(TimeRange queryStartTimeRange) {
    this.queryStartTimeRange = queryStartTimeRange;
    return this;
  }

  public TimeRange getQueryStartTimeRange() {
    return queryStartTimeRange;
  }

  public QueryFilter setStatementIds(Collection<String> statementIds) {
    this.statementIds = statementIds;
    return this;
  }

  public Collection<String> getStatementIds() {
    return statementIds;
  }

  public QueryFilter setStatuses(Collection<QueryStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Collection<QueryStatus> getStatuses() {
    return statuses;
  }

  public QueryFilter setUserIds(Collection<Long> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Collection<Long> getUserIds() {
    return userIds;
  }

  public QueryFilter setWarehouseIds(Collection<String> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public Collection<String> getWarehouseIds() {
    return warehouseIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryFilter that = (QueryFilter) o;
    return Objects.equals(queryStartTimeRange, that.queryStartTimeRange)
        && Objects.equals(statementIds, that.statementIds)
        && Objects.equals(statuses, that.statuses)
        && Objects.equals(userIds, that.userIds)
        && Objects.equals(warehouseIds, that.warehouseIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStartTimeRange, statementIds, statuses, userIds, warehouseIds);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryFilter.class)
        .add("queryStartTimeRange", queryStartTimeRange)
        .add("statementIds", statementIds)
        .add("statuses", statuses)
        .add("userIds", userIds)
        .add("warehouseIds", warehouseIds)
        .toString();
  }

  QueryFilterPb toPb() {
    QueryFilterPb pb = new QueryFilterPb();
    pb.setQueryStartTimeRange(queryStartTimeRange);
    pb.setStatementIds(statementIds);
    pb.setStatuses(statuses);
    pb.setUserIds(userIds);
    pb.setWarehouseIds(warehouseIds);

    return pb;
  }

  static QueryFilter fromPb(QueryFilterPb pb) {
    QueryFilter model = new QueryFilter();
    model.setQueryStartTimeRange(pb.getQueryStartTimeRange());
    model.setStatementIds(pb.getStatementIds());
    model.setStatuses(pb.getStatuses());
    model.setUserIds(pb.getUserIds());
    model.setWarehouseIds(pb.getWarehouseIds());

    return model;
  }

  public static class QueryFilterSerializer extends JsonSerializer<QueryFilter> {
    @Override
    public void serialize(QueryFilter value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryFilterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryFilterDeserializer extends JsonDeserializer<QueryFilter> {
    @Override
    public QueryFilter deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryFilterPb pb = mapper.readValue(p, QueryFilterPb.class);
      return QueryFilter.fromPb(pb);
    }
  }
}
