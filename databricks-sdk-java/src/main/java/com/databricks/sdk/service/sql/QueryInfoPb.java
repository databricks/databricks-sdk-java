// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class QueryInfoPb {
  @JsonProperty("channel_used")
  private ChannelInfo channelUsed;

  @JsonProperty("client_application")
  private String clientApplication;

  @JsonProperty("duration")
  private Long duration;

  @JsonProperty("endpoint_id")
  private String endpointId;

  @JsonProperty("error_message")
  private String errorMessage;

  @JsonProperty("executed_as_user_id")
  private Long executedAsUserId;

  @JsonProperty("executed_as_user_name")
  private String executedAsUserName;

  @JsonProperty("execution_end_time_ms")
  private Long executionEndTimeMs;

  @JsonProperty("is_final")
  private Boolean isFinal;

  @JsonProperty("lookup_key")
  private String lookupKey;

  @JsonProperty("metrics")
  private QueryMetrics metrics;

  @JsonProperty("plans_state")
  private PlansState plansState;

  @JsonProperty("query_end_time_ms")
  private Long queryEndTimeMs;

  @JsonProperty("query_id")
  private String queryId;

  @JsonProperty("query_source")
  private ExternalQuerySource querySource;

  @JsonProperty("query_start_time_ms")
  private Long queryStartTimeMs;

  @JsonProperty("query_text")
  private String queryText;

  @JsonProperty("rows_produced")
  private Long rowsProduced;

  @JsonProperty("spark_ui_url")
  private String sparkUiUrl;

  @JsonProperty("statement_type")
  private QueryStatementType statementType;

  @JsonProperty("status")
  private QueryStatus status;

  @JsonProperty("user_id")
  private Long userId;

  @JsonProperty("user_name")
  private String userName;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public QueryInfoPb setChannelUsed(ChannelInfo channelUsed) {
    this.channelUsed = channelUsed;
    return this;
  }

  public ChannelInfo getChannelUsed() {
    return channelUsed;
  }

  public QueryInfoPb setClientApplication(String clientApplication) {
    this.clientApplication = clientApplication;
    return this;
  }

  public String getClientApplication() {
    return clientApplication;
  }

  public QueryInfoPb setDuration(Long duration) {
    this.duration = duration;
    return this;
  }

  public Long getDuration() {
    return duration;
  }

  public QueryInfoPb setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  public String getEndpointId() {
    return endpointId;
  }

  public QueryInfoPb setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public QueryInfoPb setExecutedAsUserId(Long executedAsUserId) {
    this.executedAsUserId = executedAsUserId;
    return this;
  }

  public Long getExecutedAsUserId() {
    return executedAsUserId;
  }

  public QueryInfoPb setExecutedAsUserName(String executedAsUserName) {
    this.executedAsUserName = executedAsUserName;
    return this;
  }

  public String getExecutedAsUserName() {
    return executedAsUserName;
  }

  public QueryInfoPb setExecutionEndTimeMs(Long executionEndTimeMs) {
    this.executionEndTimeMs = executionEndTimeMs;
    return this;
  }

  public Long getExecutionEndTimeMs() {
    return executionEndTimeMs;
  }

  public QueryInfoPb setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
    return this;
  }

  public Boolean getIsFinal() {
    return isFinal;
  }

  public QueryInfoPb setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  public String getLookupKey() {
    return lookupKey;
  }

  public QueryInfoPb setMetrics(QueryMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  public QueryMetrics getMetrics() {
    return metrics;
  }

  public QueryInfoPb setPlansState(PlansState plansState) {
    this.plansState = plansState;
    return this;
  }

  public PlansState getPlansState() {
    return plansState;
  }

  public QueryInfoPb setQueryEndTimeMs(Long queryEndTimeMs) {
    this.queryEndTimeMs = queryEndTimeMs;
    return this;
  }

  public Long getQueryEndTimeMs() {
    return queryEndTimeMs;
  }

  public QueryInfoPb setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  public String getQueryId() {
    return queryId;
  }

  public QueryInfoPb setQuerySource(ExternalQuerySource querySource) {
    this.querySource = querySource;
    return this;
  }

  public ExternalQuerySource getQuerySource() {
    return querySource;
  }

  public QueryInfoPb setQueryStartTimeMs(Long queryStartTimeMs) {
    this.queryStartTimeMs = queryStartTimeMs;
    return this;
  }

  public Long getQueryStartTimeMs() {
    return queryStartTimeMs;
  }

  public QueryInfoPb setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public String getQueryText() {
    return queryText;
  }

  public QueryInfoPb setRowsProduced(Long rowsProduced) {
    this.rowsProduced = rowsProduced;
    return this;
  }

  public Long getRowsProduced() {
    return rowsProduced;
  }

  public QueryInfoPb setSparkUiUrl(String sparkUiUrl) {
    this.sparkUiUrl = sparkUiUrl;
    return this;
  }

  public String getSparkUiUrl() {
    return sparkUiUrl;
  }

  public QueryInfoPb setStatementType(QueryStatementType statementType) {
    this.statementType = statementType;
    return this;
  }

  public QueryStatementType getStatementType() {
    return statementType;
  }

  public QueryInfoPb setStatus(QueryStatus status) {
    this.status = status;
    return this;
  }

  public QueryStatus getStatus() {
    return status;
  }

  public QueryInfoPb setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  public QueryInfoPb setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  public QueryInfoPb setWarehouseId(String warehouseId) {
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
    QueryInfoPb that = (QueryInfoPb) o;
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
    return new ToStringer(QueryInfoPb.class)
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
}
