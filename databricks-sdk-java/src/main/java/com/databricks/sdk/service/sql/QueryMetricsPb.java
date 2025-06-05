// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A query metric that encapsulates a set of measurements for a single query. Metrics come from the
 * driver and are stored in the history service database.
 */
@Generated
class QueryMetricsPb {
  @JsonProperty("compilation_time_ms")
  private Long compilationTimeMs;

  @JsonProperty("execution_time_ms")
  private Long executionTimeMs;

  @JsonProperty("network_sent_bytes")
  private Long networkSentBytes;

  @JsonProperty("overloading_queue_start_timestamp")
  private Long overloadingQueueStartTimestamp;

  @JsonProperty("photon_total_time_ms")
  private Long photonTotalTimeMs;

  @JsonProperty("provisioning_queue_start_timestamp")
  private Long provisioningQueueStartTimestamp;

  @JsonProperty("pruned_bytes")
  private Long prunedBytes;

  @JsonProperty("pruned_files_count")
  private Long prunedFilesCount;

  @JsonProperty("query_compilation_start_timestamp")
  private Long queryCompilationStartTimestamp;

  @JsonProperty("read_bytes")
  private Long readBytes;

  @JsonProperty("read_cache_bytes")
  private Long readCacheBytes;

  @JsonProperty("read_files_count")
  private Long readFilesCount;

  @JsonProperty("read_partitions_count")
  private Long readPartitionsCount;

  @JsonProperty("read_remote_bytes")
  private Long readRemoteBytes;

  @JsonProperty("result_fetch_time_ms")
  private Long resultFetchTimeMs;

  @JsonProperty("result_from_cache")
  private Boolean resultFromCache;

  @JsonProperty("rows_produced_count")
  private Long rowsProducedCount;

  @JsonProperty("rows_read_count")
  private Long rowsReadCount;

  @JsonProperty("spill_to_disk_bytes")
  private Long spillToDiskBytes;

  @JsonProperty("task_time_over_time_range")
  private TaskTimeOverRange taskTimeOverTimeRange;

  @JsonProperty("task_total_time_ms")
  private Long taskTotalTimeMs;

  @JsonProperty("total_time_ms")
  private Long totalTimeMs;

  @JsonProperty("write_remote_bytes")
  private Long writeRemoteBytes;

  public QueryMetricsPb setCompilationTimeMs(Long compilationTimeMs) {
    this.compilationTimeMs = compilationTimeMs;
    return this;
  }

  public Long getCompilationTimeMs() {
    return compilationTimeMs;
  }

  public QueryMetricsPb setExecutionTimeMs(Long executionTimeMs) {
    this.executionTimeMs = executionTimeMs;
    return this;
  }

  public Long getExecutionTimeMs() {
    return executionTimeMs;
  }

  public QueryMetricsPb setNetworkSentBytes(Long networkSentBytes) {
    this.networkSentBytes = networkSentBytes;
    return this;
  }

  public Long getNetworkSentBytes() {
    return networkSentBytes;
  }

  public QueryMetricsPb setOverloadingQueueStartTimestamp(Long overloadingQueueStartTimestamp) {
    this.overloadingQueueStartTimestamp = overloadingQueueStartTimestamp;
    return this;
  }

  public Long getOverloadingQueueStartTimestamp() {
    return overloadingQueueStartTimestamp;
  }

  public QueryMetricsPb setPhotonTotalTimeMs(Long photonTotalTimeMs) {
    this.photonTotalTimeMs = photonTotalTimeMs;
    return this;
  }

  public Long getPhotonTotalTimeMs() {
    return photonTotalTimeMs;
  }

  public QueryMetricsPb setProvisioningQueueStartTimestamp(Long provisioningQueueStartTimestamp) {
    this.provisioningQueueStartTimestamp = provisioningQueueStartTimestamp;
    return this;
  }

  public Long getProvisioningQueueStartTimestamp() {
    return provisioningQueueStartTimestamp;
  }

  public QueryMetricsPb setPrunedBytes(Long prunedBytes) {
    this.prunedBytes = prunedBytes;
    return this;
  }

  public Long getPrunedBytes() {
    return prunedBytes;
  }

  public QueryMetricsPb setPrunedFilesCount(Long prunedFilesCount) {
    this.prunedFilesCount = prunedFilesCount;
    return this;
  }

  public Long getPrunedFilesCount() {
    return prunedFilesCount;
  }

  public QueryMetricsPb setQueryCompilationStartTimestamp(Long queryCompilationStartTimestamp) {
    this.queryCompilationStartTimestamp = queryCompilationStartTimestamp;
    return this;
  }

  public Long getQueryCompilationStartTimestamp() {
    return queryCompilationStartTimestamp;
  }

  public QueryMetricsPb setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }

  public Long getReadBytes() {
    return readBytes;
  }

  public QueryMetricsPb setReadCacheBytes(Long readCacheBytes) {
    this.readCacheBytes = readCacheBytes;
    return this;
  }

  public Long getReadCacheBytes() {
    return readCacheBytes;
  }

  public QueryMetricsPb setReadFilesCount(Long readFilesCount) {
    this.readFilesCount = readFilesCount;
    return this;
  }

  public Long getReadFilesCount() {
    return readFilesCount;
  }

  public QueryMetricsPb setReadPartitionsCount(Long readPartitionsCount) {
    this.readPartitionsCount = readPartitionsCount;
    return this;
  }

  public Long getReadPartitionsCount() {
    return readPartitionsCount;
  }

  public QueryMetricsPb setReadRemoteBytes(Long readRemoteBytes) {
    this.readRemoteBytes = readRemoteBytes;
    return this;
  }

  public Long getReadRemoteBytes() {
    return readRemoteBytes;
  }

  public QueryMetricsPb setResultFetchTimeMs(Long resultFetchTimeMs) {
    this.resultFetchTimeMs = resultFetchTimeMs;
    return this;
  }

  public Long getResultFetchTimeMs() {
    return resultFetchTimeMs;
  }

  public QueryMetricsPb setResultFromCache(Boolean resultFromCache) {
    this.resultFromCache = resultFromCache;
    return this;
  }

  public Boolean getResultFromCache() {
    return resultFromCache;
  }

  public QueryMetricsPb setRowsProducedCount(Long rowsProducedCount) {
    this.rowsProducedCount = rowsProducedCount;
    return this;
  }

  public Long getRowsProducedCount() {
    return rowsProducedCount;
  }

  public QueryMetricsPb setRowsReadCount(Long rowsReadCount) {
    this.rowsReadCount = rowsReadCount;
    return this;
  }

  public Long getRowsReadCount() {
    return rowsReadCount;
  }

  public QueryMetricsPb setSpillToDiskBytes(Long spillToDiskBytes) {
    this.spillToDiskBytes = spillToDiskBytes;
    return this;
  }

  public Long getSpillToDiskBytes() {
    return spillToDiskBytes;
  }

  public QueryMetricsPb setTaskTimeOverTimeRange(TaskTimeOverRange taskTimeOverTimeRange) {
    this.taskTimeOverTimeRange = taskTimeOverTimeRange;
    return this;
  }

  public TaskTimeOverRange getTaskTimeOverTimeRange() {
    return taskTimeOverTimeRange;
  }

  public QueryMetricsPb setTaskTotalTimeMs(Long taskTotalTimeMs) {
    this.taskTotalTimeMs = taskTotalTimeMs;
    return this;
  }

  public Long getTaskTotalTimeMs() {
    return taskTotalTimeMs;
  }

  public QueryMetricsPb setTotalTimeMs(Long totalTimeMs) {
    this.totalTimeMs = totalTimeMs;
    return this;
  }

  public Long getTotalTimeMs() {
    return totalTimeMs;
  }

  public QueryMetricsPb setWriteRemoteBytes(Long writeRemoteBytes) {
    this.writeRemoteBytes = writeRemoteBytes;
    return this;
  }

  public Long getWriteRemoteBytes() {
    return writeRemoteBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryMetricsPb that = (QueryMetricsPb) o;
    return Objects.equals(compilationTimeMs, that.compilationTimeMs)
        && Objects.equals(executionTimeMs, that.executionTimeMs)
        && Objects.equals(networkSentBytes, that.networkSentBytes)
        && Objects.equals(overloadingQueueStartTimestamp, that.overloadingQueueStartTimestamp)
        && Objects.equals(photonTotalTimeMs, that.photonTotalTimeMs)
        && Objects.equals(provisioningQueueStartTimestamp, that.provisioningQueueStartTimestamp)
        && Objects.equals(prunedBytes, that.prunedBytes)
        && Objects.equals(prunedFilesCount, that.prunedFilesCount)
        && Objects.equals(queryCompilationStartTimestamp, that.queryCompilationStartTimestamp)
        && Objects.equals(readBytes, that.readBytes)
        && Objects.equals(readCacheBytes, that.readCacheBytes)
        && Objects.equals(readFilesCount, that.readFilesCount)
        && Objects.equals(readPartitionsCount, that.readPartitionsCount)
        && Objects.equals(readRemoteBytes, that.readRemoteBytes)
        && Objects.equals(resultFetchTimeMs, that.resultFetchTimeMs)
        && Objects.equals(resultFromCache, that.resultFromCache)
        && Objects.equals(rowsProducedCount, that.rowsProducedCount)
        && Objects.equals(rowsReadCount, that.rowsReadCount)
        && Objects.equals(spillToDiskBytes, that.spillToDiskBytes)
        && Objects.equals(taskTimeOverTimeRange, that.taskTimeOverTimeRange)
        && Objects.equals(taskTotalTimeMs, that.taskTotalTimeMs)
        && Objects.equals(totalTimeMs, that.totalTimeMs)
        && Objects.equals(writeRemoteBytes, that.writeRemoteBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compilationTimeMs,
        executionTimeMs,
        networkSentBytes,
        overloadingQueueStartTimestamp,
        photonTotalTimeMs,
        provisioningQueueStartTimestamp,
        prunedBytes,
        prunedFilesCount,
        queryCompilationStartTimestamp,
        readBytes,
        readCacheBytes,
        readFilesCount,
        readPartitionsCount,
        readRemoteBytes,
        resultFetchTimeMs,
        resultFromCache,
        rowsProducedCount,
        rowsReadCount,
        spillToDiskBytes,
        taskTimeOverTimeRange,
        taskTotalTimeMs,
        totalTimeMs,
        writeRemoteBytes);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryMetricsPb.class)
        .add("compilationTimeMs", compilationTimeMs)
        .add("executionTimeMs", executionTimeMs)
        .add("networkSentBytes", networkSentBytes)
        .add("overloadingQueueStartTimestamp", overloadingQueueStartTimestamp)
        .add("photonTotalTimeMs", photonTotalTimeMs)
        .add("provisioningQueueStartTimestamp", provisioningQueueStartTimestamp)
        .add("prunedBytes", prunedBytes)
        .add("prunedFilesCount", prunedFilesCount)
        .add("queryCompilationStartTimestamp", queryCompilationStartTimestamp)
        .add("readBytes", readBytes)
        .add("readCacheBytes", readCacheBytes)
        .add("readFilesCount", readFilesCount)
        .add("readPartitionsCount", readPartitionsCount)
        .add("readRemoteBytes", readRemoteBytes)
        .add("resultFetchTimeMs", resultFetchTimeMs)
        .add("resultFromCache", resultFromCache)
        .add("rowsProducedCount", rowsProducedCount)
        .add("rowsReadCount", rowsReadCount)
        .add("spillToDiskBytes", spillToDiskBytes)
        .add("taskTimeOverTimeRange", taskTimeOverTimeRange)
        .add("taskTotalTimeMs", taskTotalTimeMs)
        .add("totalTimeMs", totalTimeMs)
        .add("writeRemoteBytes", writeRemoteBytes)
        .toString();
  }
}
