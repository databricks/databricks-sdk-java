// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Metrics about query execution.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class QueryMetrics {
  /** Time spent loading metadata and optimizing the query, in milliseconds. */
  @JsonProperty("compilation_time_ms")
  private Long compilationTimeMs;

  /** Time spent executing the query, in milliseconds. */
  @JsonProperty("execution_time_ms")
  private Long executionTimeMs;

  /** Total amount of data sent over the network between executor nodes during shuffle, in bytes. */
  @JsonProperty("network_sent_bytes")
  private Long networkSentBytes;

  /**
   * Total execution time for all individual Photon query engine tasks in the query, in
   * milliseconds.
   */
  @JsonProperty("photon_total_time_ms")
  private Long photonTotalTimeMs;

  /**
   * Time spent waiting to execute the query because the SQL warehouse is already running the
   * maximum number of concurrent queries, in milliseconds.
   */
  @JsonProperty("queued_overload_time_ms")
  private Long queuedOverloadTimeMs;

  /**
   * Time waiting for compute resources to be provisioned for the SQL warehouse, in milliseconds.
   */
  @JsonProperty("queued_provisioning_time_ms")
  private Long queuedProvisioningTimeMs;

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

  /** Number of files that would have been read without pruning. */
  @JsonProperty("total_files_count")
  private Long totalFilesCount;

  /** Number of partitions that would have been read without pruning. */
  @JsonProperty("total_partitions_count")
  private Long totalPartitionsCount;

  /** Total execution time of the query from the client’s point of view, in milliseconds. */
  @JsonProperty("total_time_ms")
  private Long totalTimeMs;

  /** Size pf persistent data written to cloud object storage in your cloud tenant, in bytes. */
  @JsonProperty("write_remote_bytes")
  private Long writeRemoteBytes;

  /**
   * <p>Setter for the field <code>compilationTimeMs</code>.</p>
   *
   * @param compilationTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setCompilationTimeMs(Long compilationTimeMs) {
    this.compilationTimeMs = compilationTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>compilationTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCompilationTimeMs() {
    return compilationTimeMs;
  }

  /**
   * <p>Setter for the field <code>executionTimeMs</code>.</p>
   *
   * @param executionTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setExecutionTimeMs(Long executionTimeMs) {
    this.executionTimeMs = executionTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>executionTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getExecutionTimeMs() {
    return executionTimeMs;
  }

  /**
   * <p>Setter for the field <code>networkSentBytes</code>.</p>
   *
   * @param networkSentBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setNetworkSentBytes(Long networkSentBytes) {
    this.networkSentBytes = networkSentBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>networkSentBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getNetworkSentBytes() {
    return networkSentBytes;
  }

  /**
   * <p>Setter for the field <code>photonTotalTimeMs</code>.</p>
   *
   * @param photonTotalTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setPhotonTotalTimeMs(Long photonTotalTimeMs) {
    this.photonTotalTimeMs = photonTotalTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>photonTotalTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPhotonTotalTimeMs() {
    return photonTotalTimeMs;
  }

  /**
   * <p>Setter for the field <code>queuedOverloadTimeMs</code>.</p>
   *
   * @param queuedOverloadTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setQueuedOverloadTimeMs(Long queuedOverloadTimeMs) {
    this.queuedOverloadTimeMs = queuedOverloadTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>queuedOverloadTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getQueuedOverloadTimeMs() {
    return queuedOverloadTimeMs;
  }

  /**
   * <p>Setter for the field <code>queuedProvisioningTimeMs</code>.</p>
   *
   * @param queuedProvisioningTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setQueuedProvisioningTimeMs(Long queuedProvisioningTimeMs) {
    this.queuedProvisioningTimeMs = queuedProvisioningTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>queuedProvisioningTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getQueuedProvisioningTimeMs() {
    return queuedProvisioningTimeMs;
  }

  /**
   * <p>Setter for the field <code>readBytes</code>.</p>
   *
   * @param readBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setReadBytes(Long readBytes) {
    this.readBytes = readBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>readBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getReadBytes() {
    return readBytes;
  }

  /**
   * <p>Setter for the field <code>readCacheBytes</code>.</p>
   *
   * @param readCacheBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setReadCacheBytes(Long readCacheBytes) {
    this.readCacheBytes = readCacheBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>readCacheBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getReadCacheBytes() {
    return readCacheBytes;
  }

  /**
   * <p>Setter for the field <code>readFilesCount</code>.</p>
   *
   * @param readFilesCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setReadFilesCount(Long readFilesCount) {
    this.readFilesCount = readFilesCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>readFilesCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getReadFilesCount() {
    return readFilesCount;
  }

  /**
   * <p>Setter for the field <code>readPartitionsCount</code>.</p>
   *
   * @param readPartitionsCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setReadPartitionsCount(Long readPartitionsCount) {
    this.readPartitionsCount = readPartitionsCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>readPartitionsCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getReadPartitionsCount() {
    return readPartitionsCount;
  }

  /**
   * <p>Setter for the field <code>readRemoteBytes</code>.</p>
   *
   * @param readRemoteBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setReadRemoteBytes(Long readRemoteBytes) {
    this.readRemoteBytes = readRemoteBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>readRemoteBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getReadRemoteBytes() {
    return readRemoteBytes;
  }

  /**
   * <p>Setter for the field <code>resultFetchTimeMs</code>.</p>
   *
   * @param resultFetchTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setResultFetchTimeMs(Long resultFetchTimeMs) {
    this.resultFetchTimeMs = resultFetchTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>resultFetchTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getResultFetchTimeMs() {
    return resultFetchTimeMs;
  }

  /**
   * <p>Setter for the field <code>resultFromCache</code>.</p>
   *
   * @param resultFromCache a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setResultFromCache(Boolean resultFromCache) {
    this.resultFromCache = resultFromCache;
    return this;
  }

  /**
   * <p>Getter for the field <code>resultFromCache</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getResultFromCache() {
    return resultFromCache;
  }

  /**
   * <p>Setter for the field <code>rowsProducedCount</code>.</p>
   *
   * @param rowsProducedCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setRowsProducedCount(Long rowsProducedCount) {
    this.rowsProducedCount = rowsProducedCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>rowsProducedCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRowsProducedCount() {
    return rowsProducedCount;
  }

  /**
   * <p>Setter for the field <code>rowsReadCount</code>.</p>
   *
   * @param rowsReadCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setRowsReadCount(Long rowsReadCount) {
    this.rowsReadCount = rowsReadCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>rowsReadCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRowsReadCount() {
    return rowsReadCount;
  }

  /**
   * <p>Setter for the field <code>spillToDiskBytes</code>.</p>
   *
   * @param spillToDiskBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setSpillToDiskBytes(Long spillToDiskBytes) {
    this.spillToDiskBytes = spillToDiskBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>spillToDiskBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getSpillToDiskBytes() {
    return spillToDiskBytes;
  }

  /**
   * <p>Setter for the field <code>taskTotalTimeMs</code>.</p>
   *
   * @param taskTotalTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setTaskTotalTimeMs(Long taskTotalTimeMs) {
    this.taskTotalTimeMs = taskTotalTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>taskTotalTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTaskTotalTimeMs() {
    return taskTotalTimeMs;
  }

  /**
   * <p>Setter for the field <code>totalFilesCount</code>.</p>
   *
   * @param totalFilesCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setTotalFilesCount(Long totalFilesCount) {
    this.totalFilesCount = totalFilesCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>totalFilesCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTotalFilesCount() {
    return totalFilesCount;
  }

  /**
   * <p>Setter for the field <code>totalPartitionsCount</code>.</p>
   *
   * @param totalPartitionsCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setTotalPartitionsCount(Long totalPartitionsCount) {
    this.totalPartitionsCount = totalPartitionsCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>totalPartitionsCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTotalPartitionsCount() {
    return totalPartitionsCount;
  }

  /**
   * <p>Setter for the field <code>totalTimeMs</code>.</p>
   *
   * @param totalTimeMs a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setTotalTimeMs(Long totalTimeMs) {
    this.totalTimeMs = totalTimeMs;
    return this;
  }

  /**
   * <p>Getter for the field <code>totalTimeMs</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTotalTimeMs() {
    return totalTimeMs;
  }

  /**
   * <p>Setter for the field <code>writeRemoteBytes</code>.</p>
   *
   * @param writeRemoteBytes a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.sql.QueryMetrics} object
   */
  public QueryMetrics setWriteRemoteBytes(Long writeRemoteBytes) {
    this.writeRemoteBytes = writeRemoteBytes;
    return this;
  }

  /**
   * <p>Getter for the field <code>writeRemoteBytes</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getWriteRemoteBytes() {
    return writeRemoteBytes;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryMetrics that = (QueryMetrics) o;
    return Objects.equals(compilationTimeMs, that.compilationTimeMs)
        && Objects.equals(executionTimeMs, that.executionTimeMs)
        && Objects.equals(networkSentBytes, that.networkSentBytes)
        && Objects.equals(photonTotalTimeMs, that.photonTotalTimeMs)
        && Objects.equals(queuedOverloadTimeMs, that.queuedOverloadTimeMs)
        && Objects.equals(queuedProvisioningTimeMs, that.queuedProvisioningTimeMs)
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
        && Objects.equals(totalFilesCount, that.totalFilesCount)
        && Objects.equals(totalPartitionsCount, that.totalPartitionsCount)
        && Objects.equals(totalTimeMs, that.totalTimeMs)
        && Objects.equals(writeRemoteBytes, that.writeRemoteBytes);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        compilationTimeMs,
        executionTimeMs,
        networkSentBytes,
        photonTotalTimeMs,
        queuedOverloadTimeMs,
        queuedProvisioningTimeMs,
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
        totalFilesCount,
        totalPartitionsCount,
        totalTimeMs,
        writeRemoteBytes);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(QueryMetrics.class)
        .add("compilationTimeMs", compilationTimeMs)
        .add("executionTimeMs", executionTimeMs)
        .add("networkSentBytes", networkSentBytes)
        .add("photonTotalTimeMs", photonTotalTimeMs)
        .add("queuedOverloadTimeMs", queuedOverloadTimeMs)
        .add("queuedProvisioningTimeMs", queuedProvisioningTimeMs)
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
        .add("totalFilesCount", totalFilesCount)
        .add("totalPartitionsCount", totalPartitionsCount)
        .add("totalTimeMs", totalTimeMs)
        .add("writeRemoteBytes", writeRemoteBytes)
        .toString();
  }
}
