// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>QueryInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>channelUsed</code>.</p>
   *
   * @param channelUsed a {@link com.databricks.sdk.service.sql.ChannelInfo} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setChannelUsed(ChannelInfo channelUsed) {
    this.channelUsed = channelUsed;
    return this;
  }

  /**
   * <p>Getter for the field <code>channelUsed</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ChannelInfo} object
   */
  public ChannelInfo getChannelUsed() {
    return channelUsed;
  }

  /**
   * <p>Setter for the field <code>duration</code>.</p>
   *
   * @param duration a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setDuration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * <p>Getter for the field <code>duration</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getDuration() {
    return duration;
  }

  /**
   * <p>Setter for the field <code>endpointId</code>.</p>
   *
   * @param endpointId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setEndpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

  /**
   * <p>Getter for the field <code>endpointId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getEndpointId() {
    return endpointId;
  }

  /**
   * <p>Setter for the field <code>errorMessage</code>.</p>
   *
   * @param errorMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * <p>Setter for the field <code>executedAsUserId</code>.</p>
   *
   * @param executedAsUserId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setExecutedAsUserId(Long executedAsUserId) {
    this.executedAsUserId = executedAsUserId;
    return this;
  }

  /**
   * <p>Getter for the field <code>executedAsUserId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutedAsUserId() {
    return executedAsUserId;
  }

  /**
   * <p>Setter for the field <code>executedAsUserName</code>.</p>
   *
   * @param executedAsUserName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setExecutedAsUserName(String executedAsUserName) {
    this.executedAsUserName = executedAsUserName;
    return this;
  }

  /**
   * <p>Getter for the field <code>executedAsUserName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getExecutedAsUserName() {
    return executedAsUserName;
  }

  /**
   * <p>Setter for the field <code>executionEndTimeMs</code>.</p>
   *
   * @param executionEndTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setExecutionEndTimeMs(Long executionEndTimeMs) {
    this.executionEndTimeMs = executionEndTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>executionEndTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutionEndTimeMs() {
    return executionEndTimeMs;
  }

  /**
   * <p>Setter for the field <code>isFinal</code>.</p>
   *
   * @param isFinal a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
    return this;
  }

  /**
   * <p>Getter for the field <code>isFinal</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIsFinal() {
    return isFinal;
  }

  /**
   * <p>Setter for the field <code>lookupKey</code>.</p>
   *
   * @param lookupKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>lookupKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLookupKey() {
    return lookupKey;
  }

  /**
   * <p>Setter for the field <code>metrics</code>.</p>
   *
   * @param metrics a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setMetrics(QueryMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * <p>Getter for the field <code>metrics</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics getMetrics() {
    return metrics;
  }

  /**
   * <p>Setter for the field <code>plansState</code>.</p>
   *
   * @param plansState a {@link com.databricks.sdk.service.sql.PlansState} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setPlansState(PlansState plansState) {
    this.plansState = plansState;
    return this;
  }

  /**
   * <p>Getter for the field <code>plansState</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.PlansState} object
   */
  public PlansState getPlansState() {
    return plansState;
  }

  /**
   * <p>Setter for the field <code>queryEndTimeMs</code>.</p>
   *
   * @param queryEndTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setQueryEndTimeMs(Long queryEndTimeMs) {
    this.queryEndTimeMs = queryEndTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryEndTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getQueryEndTimeMs() {
    return queryEndTimeMs;
  }

  /**
   * <p>Setter for the field <code>queryId</code>.</p>
   *
   * @param queryId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setQueryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryId() {
    return queryId;
  }

  /**
   * <p>Setter for the field <code>queryStartTimeMs</code>.</p>
   *
   * @param queryStartTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setQueryStartTimeMs(Long queryStartTimeMs) {
    this.queryStartTimeMs = queryStartTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryStartTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getQueryStartTimeMs() {
    return queryStartTimeMs;
  }

  /**
   * <p>Setter for the field <code>queryText</code>.</p>
   *
   * @param queryText a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  /**
   * <p>Getter for the field <code>queryText</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getQueryText() {
    return queryText;
  }

  /**
   * <p>Setter for the field <code>rowsProduced</code>.</p>
   *
   * @param rowsProduced a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setRowsProduced(Long rowsProduced) {
    this.rowsProduced = rowsProduced;
    return this;
  }

  /**
   * <p>Getter for the field <code>rowsProduced</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRowsProduced() {
    return rowsProduced;
  }

  /**
   * <p>Setter for the field <code>sparkUiUrl</code>.</p>
   *
   * @param sparkUiUrl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setSparkUiUrl(String sparkUiUrl) {
    this.sparkUiUrl = sparkUiUrl;
    return this;
  }

  /**
   * <p>Getter for the field <code>sparkUiUrl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSparkUiUrl() {
    return sparkUiUrl;
  }

  /**
   * <p>Setter for the field <code>statementType</code>.</p>
   *
   * @param statementType a {@link com.databricks.sdk.service.sql.QueryStatementType} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setStatementType(QueryStatementType statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * <p>Getter for the field <code>statementType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryStatementType} object
   */
  public QueryStatementType getStatementType() {
    return statementType;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.sql.QueryStatus} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setStatus(QueryStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.QueryStatus} object
   */
  public QueryStatus getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>userId</code>.</p>
   *
   * @param userId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * <p>Getter for the field <code>userId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUserId() {
    return userId;
  }

  /**
   * <p>Setter for the field <code>userName</code>.</p>
   *
   * @param userName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <p>Getter for the field <code>userName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserName() {
    return userName;
  }

  /**
   * <p>Setter for the field <code>warehouseId</code>.</p>
   *
   * @param warehouseId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.QueryInfo} object
   */
  public QueryInfo setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * <p>Getter for the field <code>warehouseId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWarehouseId() {
    return warehouseId;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
