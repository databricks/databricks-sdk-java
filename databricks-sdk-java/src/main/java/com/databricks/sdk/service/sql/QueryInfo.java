// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class QueryInfo {
  /** Channel information for the SQL warehouse at the time of query execution */
  @JsonProperty("channel_used")
  private ChannelInfo channelUsed;

  /** Total execution time of the query from the client’s point of view, in milliseconds. */
  @JsonProperty("duration")
  private Long duration;

  /** Alias for `warehouse_id`. */
  @JsonProperty("endpoint_id")
  private String endpointId;

  /** Message describing why the query could not complete. */
  @JsonProperty("error_message")
  private String errorMessage;

  /** The ID of the user whose credentials were used to run the query. */
  @JsonProperty("executed_as_user_id")
  private Long executedAsUserId;

  /** The email address or username of the user whose credentials were used to run the query. */
  @JsonProperty("executed_as_user_name")
  private String executedAsUserName;

  /** The time execution of the query ended. */
  @JsonProperty("execution_end_time_ms")
  private Long executionEndTimeMs;

  /** Whether more updates for the query are expected. */
  @JsonProperty("is_final")
  private Boolean isFinal;

  /** A key that can be used to look up query details. */
  @JsonProperty("lookup_key")
  private String lookupKey;

  /** Metrics about query execution. */
  @JsonProperty("metrics")
  private QueryMetrics metrics;

  /** Whether plans exist for the execution, or the reason why they are missing */
  @JsonProperty("plans_state")
  private PlansState plansState;

  /** The time the query ended. */
  @JsonProperty("query_end_time_ms")
  private Long queryEndTimeMs;

  /** The query ID. */
  @JsonProperty("query_id")
  private String queryId;

  /** The time the query started. */
  @JsonProperty("query_start_time_ms")
  private Long queryStartTimeMs;

  /** The text of the query. */
  @JsonProperty("query_text")
  private String queryText;

  /** The number of results returned by the query. */
  @JsonProperty("rows_produced")
  private Long rowsProduced;

  /** URL to the query plan. */
  @JsonProperty("spark_ui_url")
  private String sparkUiUrl;

  /** Type of statement for this query */
  @JsonProperty("statement_type")
  private QueryStatementType statementType;

  /** This describes an enum */
  @JsonProperty("status")
  private QueryStatus status;

  /** The ID of the user who ran the query. */
  @JsonProperty("user_id")
  private Long userId;

  /** The email address or username of the user who ran the query. */
  @JsonProperty("user_name")
  private String userName;

  /** Warehouse ID. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public QueryInfo setChannelUsed(ChannelInfo channelUsed) {
    this.channelUsed = channelUsed;
    return this;
  }

  public ChannelInfo getChannelUsed() {
    return channelUsed;
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
}
