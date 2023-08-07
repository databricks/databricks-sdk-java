// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Metrics about query execution. */
@Generated
public class QueryMetrics {
  /** Time spent loading metadata and optimizing the query, in milliseconds. */
  @JsonProperty("compilation_time_ms")
  private Long compilationTimeMs;

  /** Time spent executing the query, in milliseconds. */
  @JsonProperty("execution_time_ms")
  private Long executionTimeMs;

  /** Reserved for internal use. */
  @JsonProperty("metadata_time_ms")
  private Long metadataTimeMs;

  /** Total amount of data sent over the network between executor nodes during shuffle, in bytes. */
  @JsonProperty("network_sent_bytes")
  private Long networkSentBytes;

  /**
   * Timestamp of when the query was enqueued waiting while the warehouse was at max load. This
   * field is optional and will not appear if the query skipped the overloading queue.
   */
  @JsonProperty("overloading_queue_start_timestamp")
  private Long overloadingQueueStartTimestamp;

  /**
   * Total execution time for all individual Photon query engine tasks in the query, in
   * milliseconds.
   */
  @JsonProperty("photon_total_time_ms")
  private Long photonTotalTimeMs;

  /** Reserved for internal use. */
  @JsonProperty("planning_phases")
  private Collection<Object> planningPhases;

  /** Reserved for internal use. */
  @JsonProperty("planning_time_ms")
  private Long planningTimeMs;

  /**
   * Timestamp of when the query was enqueued waiting for a cluster to be provisioned for the
   * warehouse. This field is optional and will not appear if the query skipped the provisioning
   * queue.
   */
  @JsonProperty("provisioning_queue_start_timestamp")
  private Long provisioningQueueStartTimestamp;

  /** Total number of bytes in all tables not read due to pruning */
  @JsonProperty("pruned_bytes")
  private Long prunedBytes;

  /** Total number of files from all tables not read due to pruning */
  @JsonProperty("pruned_files_count")
  private Long prunedFilesCount;

  /** Timestamp of when the underlying compute started compilation of the query. */
  @JsonProperty("query_compilation_start_timestamp")
  private Long queryCompilationStartTimestamp;

  /** Reserved for internal use. */
  @JsonProperty("query_execution_time_ms")
  private Long queryExecutionTimeMs;

  /** Total size of data read by the query, in bytes. */
  @JsonProperty("read_bytes")
  private Long readBytes;

  /** Size of persistent data read from the cache, in bytes. */
  @JsonProperty("read_cache_bytes")
  private Long readCacheBytes;

  /** Number of files read after pruning. */
  @JsonProperty("read_files_count")
  private Long readFilesCount;

  /** Number of partitions read after pruning. */
  @JsonProperty("read_partitions_count")
  private Long readPartitionsCount;

  /** Size of persistent data read from cloud object storage on your cloud tenant, in bytes. */
  @JsonProperty("read_remote_bytes")
  private Long readRemoteBytes;

  /** Time spent fetching the query results after the execution finished, in milliseconds. */
  @JsonProperty("result_fetch_time_ms")
  private Long resultFetchTimeMs;

  /** true if the query result was fetched from cache, false otherwise. */
  @JsonProperty("result_from_cache")
  private Boolean resultFromCache;

  /** Total number of rows returned by the query. */
  @JsonProperty("rows_produced_count")
  private Long rowsProducedCount;

  /** Total number of rows read by the query. */
  @JsonProperty("rows_read_count")
  private Long rowsReadCount;

  /** Size of data temporarily written to disk while executing the query, in bytes. */
  @JsonProperty("spill_to_disk_bytes")
  private Long spillToDiskBytes;

  /** Sum of execution time for all of the query’s tasks, in milliseconds. */
  @JsonProperty("task_total_time_ms")
  private Long taskTotalTimeMs;

  /** Total execution time of the query from the client’s point of view, in milliseconds. */
  @JsonProperty("total_time_ms")
  private Long totalTimeMs;

  /** Size pf persistent data written to cloud object storage in your cloud tenant, in bytes. */
  @JsonProperty("write_remote_bytes")
  private Long writeRemoteBytes;

  public QueryMetrics setCompilationTimeMs(Long compilationTimeMs) {
    this.compilationTimeMs = compilationTimeMs;
    return this;
  }

  public Long getCompilationTimeMs() {
    return compilationTimeMs;
  }

  public QueryMetrics setExecutionTimeMs(Long executionTimeMs) {
    this.executionTimeMs = executionTimeMs;
    return this;
  }

  public Long getExecutionTimeMs() {
    return executionTimeMs;
  }

  public QueryMetrics setMetadataTimeMs(Long metadataTimeMs) {
    this.metadataTimeMs = metadataTimeMs;
    return this;
  }

  public Long getMetadataTimeMs() {
    return metadataTimeMs;
  }

  public QueryMetrics setNetworkSentBytes(Long networkSentBytes) {
    this.networkSentBytes = networkSentBytes;
    return this;
  }

  public Long getNetworkSentBytes() {
    return networkSentBytes;
  }

  public QueryMetrics setOverloadingQueueStartTimestamp(Long overloadingQueueStartTimestamp) {
    this.overloadingQueueStartTimestamp = overloadingQueueStartTimestamp;
    return this;
  }

  public Long getOverloadingQueueStartTimestamp() {
    return overloadingQueueStartTimestamp;
  }

  public QueryMetrics setPhotonTotalTimeMs(Long photonTotalTimeMs) {
    this.photonTotalTimeMs = photonTotalTimeMs;
    return this;
  }

  public Long getPhotonTotalTimeMs() {
    return photonTotalTimeMs;
  }

  public QueryMetrics setPlanningPhases(Collection<Object> planningPhases) {
    this.planningPhases = planningPhases;
    return this;
  }

  public Collection<Object> getPlanningPhases() {
    return planningPhases;
  }

  public QueryMetrics setPlanningTimeMs(Long planningTimeMs) {
    this.planningTimeMs = planningTimeMs;
    return this;
  }

  public Long getPlanningTimeMs() {
    return planningTimeMs;
  }

  public QueryMetrics setProvisioningQueueStartTimestamp(Long provisioningQueueStartTimestamp) {
    this.provisioningQueueStartTimestamp = provisioningQueueStartTimestamp;
    return this;
  }

  public Long getProvisioningQueueStartTimestamp() {
    return provisioningQueueStartTimestamp;
  }

  public QueryMetrics setPrunedBytes(Long prunedBytes) {
    this.prunedBytes = prunedBytes;
    return this;
  }

  public Long getPrunedBytes() {
    return prunedBytes;
  }

  public QueryMetrics setPrunedFilesCount(Long prunedFilesCount) {
    this.prunedFilesCount = prunedFilesCount;
    return this;
  }

  public Long getPrunedFilesCount() {
    return prunedFilesCount;
  }

  public QueryMetrics setQueryCompilationStartTimestamp(Long queryCompilationStartTimestamp) {
    this.queryCompilationStartTimestamp = queryCompilationStartTimestamp;
    return this;
  }

  public Long getQueryCompilationStartTimestamp() {
    return queryCompilationStartTimestamp;
  }

  public QueryMetrics setQueryExecutionTimeMs(Long queryExecutionTimeMs) {
    this.queryExecutionTimeMs = queryExecutionTimeMs;
    return this;
  }

  public Long getQueryExecutionTimeMs() {
    return queryExecutionTimeMs;
  }

  public QueryMetrics setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }

  public Long getReadBytes() {
    return readBytes;
  }

  public QueryMetrics setReadCacheBytes(Long readCacheBytes) {
    this.readCacheBytes = readCacheBytes;
    return this;
  }

  public Long getReadCacheBytes() {
    return readCacheBytes;
  }

  public QueryMetrics setReadFilesCount(Long readFilesCount) {
    this.readFilesCount = readFilesCount;
    return this;
  }

  public Long getReadFilesCount() {
    return readFilesCount;
  }

  public QueryMetrics setReadPartitionsCount(Long readPartitionsCount) {
    this.readPartitionsCount = readPartitionsCount;
    return this;
  }

  public Long getReadPartitionsCount() {
    return readPartitionsCount;
  }

  public QueryMetrics setReadRemoteBytes(Long readRemoteBytes) {
    this.readRemoteBytes = readRemoteBytes;
    return this;
  }

  public Long getReadRemoteBytes() {
    return readRemoteBytes;
  }

  public QueryMetrics setResultFetchTimeMs(Long resultFetchTimeMs) {
    this.resultFetchTimeMs = resultFetchTimeMs;
    return this;
  }

  public Long getResultFetchTimeMs() {
    return resultFetchTimeMs;
  }

  public QueryMetrics setResultFromCache(Boolean resultFromCache) {
    this.resultFromCache = resultFromCache;
    return this;
  }

  public Boolean getResultFromCache() {
    return resultFromCache;
  }

  public QueryMetrics setRowsProducedCount(Long rowsProducedCount) {
    this.rowsProducedCount = rowsProducedCount;
    return this;
  }

  public Long getRowsProducedCount() {
    return rowsProducedCount;
  }

  public QueryMetrics setRowsReadCount(Long rowsReadCount) {
    this.rowsReadCount = rowsReadCount;
    return this;
  }

  public Long getRowsReadCount() {
    return rowsReadCount;
  }

  public QueryMetrics setSpillToDiskBytes(Long spillToDiskBytes) {
    this.spillToDiskBytes = spillToDiskBytes;
    return this;
  }

  public Long getSpillToDiskBytes() {
    return spillToDiskBytes;
  }

  public QueryMetrics setTaskTotalTimeMs(Long taskTotalTimeMs) {
    this.taskTotalTimeMs = taskTotalTimeMs;
    return this;
  }

  public Long getTaskTotalTimeMs() {
    return taskTotalTimeMs;
  }

  public QueryMetrics setTotalTimeMs(Long totalTimeMs) {
    this.totalTimeMs = totalTimeMs;
    return this;
  }

  public Long getTotalTimeMs() {
    return totalTimeMs;
  }

  public QueryMetrics setWriteRemoteBytes(Long writeRemoteBytes) {
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
    QueryMetrics that = (QueryMetrics) o;
    return Objects.equals(compilationTimeMs, that.compilationTimeMs)
        && Objects.equals(executionTimeMs, that.executionTimeMs)
        && Objects.equals(metadataTimeMs, that.metadataTimeMs)
        && Objects.equals(networkSentBytes, that.networkSentBytes)
        && Objects.equals(overloadingQueueStartTimestamp, that.overloadingQueueStartTimestamp)
        && Objects.equals(photonTotalTimeMs, that.photonTotalTimeMs)
        && Objects.equals(planningPhases, that.planningPhases)
        && Objects.equals(planningTimeMs, that.planningTimeMs)
        && Objects.equals(provisioningQueueStartTimestamp, that.provisioningQueueStartTimestamp)
        && Objects.equals(prunedBytes, that.prunedBytes)
        && Objects.equals(prunedFilesCount, that.prunedFilesCount)
        && Objects.equals(queryCompilationStartTimestamp, that.queryCompilationStartTimestamp)
        && Objects.equals(queryExecutionTimeMs, that.queryExecutionTimeMs)
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
        && Objects.equals(taskTotalTimeMs, that.taskTotalTimeMs)
        && Objects.equals(totalTimeMs, that.totalTimeMs)
        && Objects.equals(writeRemoteBytes, that.writeRemoteBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compilationTimeMs,
        executionTimeMs,
        metadataTimeMs,
        networkSentBytes,
        overloadingQueueStartTimestamp,
        photonTotalTimeMs,
        planningPhases,
        planningTimeMs,
        provisioningQueueStartTimestamp,
        prunedBytes,
        prunedFilesCount,
        queryCompilationStartTimestamp,
        queryExecutionTimeMs,
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
        taskTotalTimeMs,
        totalTimeMs,
        writeRemoteBytes);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryMetrics.class)
        .add("compilationTimeMs", compilationTimeMs)
        .add("executionTimeMs", executionTimeMs)
        .add("metadataTimeMs", metadataTimeMs)
        .add("networkSentBytes", networkSentBytes)
        .add("overloadingQueueStartTimestamp", overloadingQueueStartTimestamp)
        .add("photonTotalTimeMs", photonTotalTimeMs)
        .add("planningPhases", planningPhases)
        .add("planningTimeMs", planningTimeMs)
        .add("provisioningQueueStartTimestamp", provisioningQueueStartTimestamp)
        .add("prunedBytes", prunedBytes)
        .add("prunedFilesCount", prunedFilesCount)
        .add("queryCompilationStartTimestamp", queryCompilationStartTimestamp)
        .add("queryExecutionTimeMs", queryExecutionTimeMs)
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
        .add("taskTotalTimeMs", taskTotalTimeMs)
        .add("totalTimeMs", totalTimeMs)
        .add("writeRemoteBytes", writeRemoteBytes)
        .toString();
  }
}
