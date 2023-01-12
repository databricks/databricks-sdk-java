// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Metrics about query execution.
 */
@Generated("databricks-sdk-generator")
public class QueryMetrics {
    /**
     * Time spent loading metadata and optimizing the query, in milliseconds.
     */
    @JsonProperty("compilation_time_ms")
    private Long compilationTimeMs;
    
    /**
     * Time spent executing the query, in milliseconds.
     */
    @JsonProperty("execution_time_ms")
    private Long executionTimeMs;
    
    /**
     * Total amount of data sent over the network, in bytes.
     */
    @JsonProperty("network_sent_bytes")
    private Long networkSentBytes;
    
    /**
     * Total execution time for all individual Photon query engine tasks in the
     * query, in milliseconds.
     */
    @JsonProperty("photon_total_time_ms")
    private Long photonTotalTimeMs;
    
    /**
     * Time spent waiting to execute the query because the SQL warehouse is
     * already running the maximum number of concurrent queries, in
     * milliseconds.
     */
    @JsonProperty("queued_overload_time_ms")
    private Long queuedOverloadTimeMs;
    
    /**
     * Time waiting for compute resources to be provisioned for the SQL
     * warehouse, in milliseconds.
     */
    @JsonProperty("queued_provisioning_time_ms")
    private Long queuedProvisioningTimeMs;
    
    /**
     * Total size of data read by the query, in bytes.
     */
    @JsonProperty("read_bytes")
    private Long readBytes;
    
    /**
     * Size of persistent data read from the cache, in bytes.
     */
    @JsonProperty("read_cache_bytes")
    private Long readCacheBytes;
    
    /**
     * Number of files read after pruning.
     */
    @JsonProperty("read_files_count")
    private Long readFilesCount;
    
    /**
     * Number of partitions read after pruning.
     */
    @JsonProperty("read_partitions_count")
    private Long readPartitionsCount;
    
    /**
     * Size of persistent data read from cloud object storage on your cloud
     * tenant, in bytes.
     */
    @JsonProperty("read_remote_bytes")
    private Long readRemoteBytes;
    
    /**
     * Time spent fetching the query results after the execution finished, in
     * milliseconds.
     */
    @JsonProperty("result_fetch_time_ms")
    private Long resultFetchTimeMs;
    
    /**
     * true if the query result was fetched from cache, false otherwise.
     */
    @JsonProperty("result_from_cache")
    private Boolean resultFromCache;
    
    /**
     * Total number of rows returned by the query.
     */
    @JsonProperty("rows_produced_count")
    private Long rowsProducedCount;
    
    /**
     * Total number of rows read by the query.
     */
    @JsonProperty("rows_read_count")
    private Long rowsReadCount;
    
    /**
     * Size of data temporarily written to disk while executing the query, in
     * bytes.
     */
    @JsonProperty("spill_to_disk_bytes")
    private Long spillToDiskBytes;
    
    /**
     * Sum of execution time for all of the query’s tasks, in milliseconds.
     */
    @JsonProperty("task_total_time_ms")
    private Long taskTotalTimeMs;
    
    /**
     * Number of files that would have been read without pruning.
     */
    @JsonProperty("total_files_count")
    private Long totalFilesCount;
    
    /**
     * Number of partitions that would have been read without pruning.
     */
    @JsonProperty("total_partitions_count")
    private Long totalPartitionsCount;
    
    /**
     * Total execution time of the query from the client’s point of view, in
     * milliseconds.
     */
    @JsonProperty("total_time_ms")
    private Long totalTimeMs;
    
    /**
     * Size pf persistent data written to cloud object storage in your cloud
     * tenant, in bytes.
     */
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
    
    public QueryMetrics setNetworkSentBytes(Long networkSentBytes) {
        this.networkSentBytes = networkSentBytes;
        return this;
    }

    public Long getNetworkSentBytes() {
        return networkSentBytes;
    }
    
    public QueryMetrics setPhotonTotalTimeMs(Long photonTotalTimeMs) {
        this.photonTotalTimeMs = photonTotalTimeMs;
        return this;
    }

    public Long getPhotonTotalTimeMs() {
        return photonTotalTimeMs;
    }
    
    public QueryMetrics setQueuedOverloadTimeMs(Long queuedOverloadTimeMs) {
        this.queuedOverloadTimeMs = queuedOverloadTimeMs;
        return this;
    }

    public Long getQueuedOverloadTimeMs() {
        return queuedOverloadTimeMs;
    }
    
    public QueryMetrics setQueuedProvisioningTimeMs(Long queuedProvisioningTimeMs) {
        this.queuedProvisioningTimeMs = queuedProvisioningTimeMs;
        return this;
    }

    public Long getQueuedProvisioningTimeMs() {
        return queuedProvisioningTimeMs;
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
    
    public QueryMetrics setTotalFilesCount(Long totalFilesCount) {
        this.totalFilesCount = totalFilesCount;
        return this;
    }

    public Long getTotalFilesCount() {
        return totalFilesCount;
    }
    
    public QueryMetrics setTotalPartitionsCount(Long totalPartitionsCount) {
        this.totalPartitionsCount = totalPartitionsCount;
        return this;
    }

    public Long getTotalPartitionsCount() {
        return totalPartitionsCount;
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
    
}
