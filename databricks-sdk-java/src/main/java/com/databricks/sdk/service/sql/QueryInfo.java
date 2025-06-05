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
import java.util.Objects;

@Generated
@JsonSerialize(using = QueryInfo.QueryInfoSerializer.class)
@JsonDeserialize(using = QueryInfo.QueryInfoDeserializer.class)
public class QueryInfo {
  /** SQL Warehouse channel information at the time of query execution */
  private ChannelInfo channelUsed;

  /**
   * Client application that ran the statement. For example: Databricks SQL Editor, Tableau, and
   * Power BI. This field is derived from information provided by client applications. While values
   * are expected to remain static over time, this cannot be guaranteed.
   */
  private String clientApplication;

  /** Total execution time of the statement ( excluding result fetch time ). */
  private Long duration;

  /** Alias for `warehouse_id`. */
  private String endpointId;

  /** Message describing why the query could not complete. */
  private String errorMessage;

  /** The ID of the user whose credentials were used to run the query. */
  private Long executedAsUserId;

  /** The email address or username of the user whose credentials were used to run the query. */
  private String executedAsUserName;

  /** The time execution of the query ended. */
  private Long executionEndTimeMs;

  /** Whether more updates for the query are expected. */
  private Boolean isFinal;

  /** A key that can be used to look up query details. */
  private String lookupKey;

  /** Metrics about query execution. */
  private QueryMetrics metrics;

  /** Whether plans exist for the execution, or the reason why they are missing */
  private PlansState plansState;

  /** The time the query ended. */
  private Long queryEndTimeMs;

  /** The query ID. */
  private String queryId;

  /**
   * A struct that contains key-value pairs representing Databricks entities that were involved in
   * the execution of this statement, such as jobs, notebooks, or dashboards. This field only
   * records Databricks entities.
   */
  private ExternalQuerySource querySource;

  /** The time the query started. */
  private Long queryStartTimeMs;

  /** The text of the query. */
  private String queryText;

  /** The number of results returned by the query. */
  private Long rowsProduced;

  /** URL to the Spark UI query plan. */
  private String sparkUiUrl;

  /** Type of statement for this query */
  private QueryStatementType statementType;

  /**
   * Query status with one the following values:
   *
   * <p>- `QUEUED`: Query has been received and queued. - `RUNNING`: Query has started. -
   * `CANCELED`: Query has been cancelled by the user. - `FAILED`: Query has failed. - `FINISHED`:
   * Query has completed.
   */
  private QueryStatus status;

  /** The ID of the user who ran the query. */
  private Long userId;

  /** The email address or username of the user who ran the query. */
  private String userName;

  /** Warehouse ID. */
  private String warehouseId;

  public QueryInfo setChannelUsed(ChannelInfo channelUsed) {
    this.channelUsed = channelUsed;
    return this;
  }

  public ChannelInfo getChannelUsed() {
    return channelUsed;
  }

  public QueryInfo setClientApplication(String clientApplication) {
    this.clientApplication = clientApplication;
    return this;
  }

  public String getClientApplication() {
    return clientApplication;
  }

  public QueryInfo setDuration(Long duration) {
    this.duration = duration;
    return this;
  }

  public Long getDuration() {
    return duration;
  }

  public QueryInfo setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public QueryInfo setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public QueryInfo setExecutedAsUserId(Long executedAsUserId) {
    this.executedAsUserId = executedAsUserId;
    return this;
  }

  public Long getExecutedAsUserId() {
    return executedAsUserId;
  }

  public QueryInfo setExecutedAsUserName(String executedAsUserName) {
    this.executedAsUserName = executedAsUserName;
    return this;
  }

  public String getExecutedAsUserName() {
    return executedAsUserName;
  }

  public QueryInfo setExecutionEndTimeMs(Long executionEndTimeMs) {
    this.executionEndTimeMs = executionEndTimeMs;
    return this;
  }

  public Long getExecutionEndTimeMs() {
    return executionEndTimeMs;
  }

  public QueryInfo setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
    return this;
  }

  public Boolean getIsFinal() {
    return isFinal;
  }

  public QueryInfo setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  public String getLookupKey() {
    return lookupKey;
  }

  public QueryInfo setMetrics(QueryMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  public QueryMetrics getMetrics() {
    return metrics;
  }

  public QueryInfo setPlansState(PlansState plansState) {
    this.plansState = plansState;
    return this;
  }

  public PlansState getPlansState() {
    return plansState;
  }

  public QueryInfo setQueryEndTimeMs(Long queryEndTimeMs) {
    this.queryEndTimeMs = queryEndTimeMs;
    return this;
  }

  public Long getQueryEndTimeMs() {
    return queryEndTimeMs;
  }

  public QueryInfo setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryInfo setQuerySource(ExternalQuerySource querySource) {
    this.querySource = querySource;
    return this;
  }

  public ExternalQuerySource getQuerySource() {
    return querySource;
  }

  public QueryInfo setQueryStartTimeMs(Long queryStartTimeMs) {
    this.queryStartTimeMs = queryStartTimeMs;
    return this;
  }

  public Long getQueryStartTimeMs() {
    return queryStartTimeMs;
  }

  public QueryInfo setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public QueryInfo setRowsProduced(Long rowsProduced) {
    this.rowsProduced = rowsProduced;
    return this;
  }

  public Long getRowsProduced() {
    return rowsProduced;
  }

  public QueryInfo setSparkUiUrl(String sparkUiUrl) {
    this.sparkUiUrl = sparkUiUrl;
    return this;
  }

  public String getSparkUiUrl() {
    return sparkUiUrl;
  }

  public QueryInfo setStatementType(QueryStatementType statementType) {
    this.statementType = statementType;
    return this;
  }

  public QueryStatementType getStatementType() {
    return statementType;
  }

  public QueryInfo setStatus(QueryStatus status) {
    this.status = status;
    return this;
  }

  public QueryStatus getStatus() {
    return status;
  }

  public QueryInfo setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public QueryInfo setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  public QueryInfo setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryInfo that = (QueryInfo) o;
    return Objects.equals(channelUsed, that.channelUsed)
        && Objects.equals(clientApplication, that.clientApplication)
        && Objects.equals(duration, that.duration)
        && Objects.equals(endpointId, that.endpointId)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(executedAsUserId, that.executedAsUserId)
        && Objects.equals(executedAsUserName, that.executedAsUserName)
        && Objects.equals(executionEndTimeMs, that.executionEndTimeMs)
        && Objects.equals(isFinal, that.isFinal)
        && Objects.equals(lookupKey, that.lookupKey)
        && Objects.equals(metrics, that.metrics)
        && Objects.equals(plansState, that.plansState)
        && Objects.equals(queryEndTimeMs, that.queryEndTimeMs)
        && Objects.equals(queryId, that.queryId)
        && Objects.equals(querySource, that.querySource)
        && Objects.equals(queryStartTimeMs, that.queryStartTimeMs)
        && Objects.equals(queryText, that.queryText)
        && Objects.equals(rowsProduced, that.rowsProduced)
        && Objects.equals(sparkUiUrl, that.sparkUiUrl)
        && Objects.equals(statementType, that.statementType)
        && Objects.equals(status, that.status)
        && Objects.equals(userId, that.userId)
        && Objects.equals(userName, that.userName)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channelUsed,
        clientApplication,
        duration,
        endpointId,
        errorMessage,
        executedAsUserId,
        executedAsUserName,
        executionEndTimeMs,
        isFinal,
        lookupKey,
        metrics,
        plansState,
        queryEndTimeMs,
        queryId,
        querySource,
        queryStartTimeMs,
        queryText,
        rowsProduced,
        sparkUiUrl,
        statementType,
        status,
        userId,
        userName,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryInfo.class)
        .add("channelUsed", channelUsed)
        .add("clientApplication", clientApplication)
        .add("duration", duration)
        .add("endpointId", endpointId)
        .add("errorMessage", errorMessage)
        .add("executedAsUserId", executedAsUserId)
        .add("executedAsUserName", executedAsUserName)
        .add("executionEndTimeMs", executionEndTimeMs)
        .add("isFinal", isFinal)
        .add("lookupKey", lookupKey)
        .add("metrics", metrics)
        .add("plansState", plansState)
        .add("queryEndTimeMs", queryEndTimeMs)
        .add("queryId", queryId)
        .add("querySource", querySource)
        .add("queryStartTimeMs", queryStartTimeMs)
        .add("queryText", queryText)
        .add("rowsProduced", rowsProduced)
        .add("sparkUiUrl", sparkUiUrl)
        .add("statementType", statementType)
        .add("status", status)
        .add("userId", userId)
        .add("userName", userName)
        .add("warehouseId", warehouseId)
        .toString();
  }

  QueryInfoPb toPb() {
    QueryInfoPb pb = new QueryInfoPb();
    pb.setChannelUsed(channelUsed);
    pb.setClientApplication(clientApplication);
    pb.setDuration(duration);
    pb.setEndpointId(endpointId);
    pb.setErrorMessage(errorMessage);
    pb.setExecutedAsUserId(executedAsUserId);
    pb.setExecutedAsUserName(executedAsUserName);
    pb.setExecutionEndTimeMs(executionEndTimeMs);
    pb.setIsFinal(isFinal);
    pb.setLookupKey(lookupKey);
    pb.setMetrics(metrics);
    pb.setPlansState(plansState);
    pb.setQueryEndTimeMs(queryEndTimeMs);
    pb.setQueryId(queryId);
    pb.setQuerySource(querySource);
    pb.setQueryStartTimeMs(queryStartTimeMs);
    pb.setQueryText(queryText);
    pb.setRowsProduced(rowsProduced);
    pb.setSparkUiUrl(sparkUiUrl);
    pb.setStatementType(statementType);
    pb.setStatus(status);
    pb.setUserId(userId);
    pb.setUserName(userName);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static QueryInfo fromPb(QueryInfoPb pb) {
    QueryInfo model = new QueryInfo();
    model.setChannelUsed(pb.getChannelUsed());
    model.setClientApplication(pb.getClientApplication());
    model.setDuration(pb.getDuration());
    model.setEndpointId(pb.getEndpointId());
    model.setErrorMessage(pb.getErrorMessage());
    model.setExecutedAsUserId(pb.getExecutedAsUserId());
    model.setExecutedAsUserName(pb.getExecutedAsUserName());
    model.setExecutionEndTimeMs(pb.getExecutionEndTimeMs());
    model.setIsFinal(pb.getIsFinal());
    model.setLookupKey(pb.getLookupKey());
    model.setMetrics(pb.getMetrics());
    model.setPlansState(pb.getPlansState());
    model.setQueryEndTimeMs(pb.getQueryEndTimeMs());
    model.setQueryId(pb.getQueryId());
    model.setQuerySource(pb.getQuerySource());
    model.setQueryStartTimeMs(pb.getQueryStartTimeMs());
    model.setQueryText(pb.getQueryText());
    model.setRowsProduced(pb.getRowsProduced());
    model.setSparkUiUrl(pb.getSparkUiUrl());
    model.setStatementType(pb.getStatementType());
    model.setStatus(pb.getStatus());
    model.setUserId(pb.getUserId());
    model.setUserName(pb.getUserName());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class QueryInfoSerializer extends JsonSerializer<QueryInfo> {
    @Override
    public void serialize(QueryInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueryInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueryInfoDeserializer extends JsonDeserializer<QueryInfo> {
    @Override
    public QueryInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueryInfoPb pb = mapper.readValue(p, QueryInfoPb.class);
      return QueryInfo.fromPb(pb);
    }
  }
}
