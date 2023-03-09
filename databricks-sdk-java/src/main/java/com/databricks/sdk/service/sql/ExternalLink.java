// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ExternalLink {
    /**
     * Number of bytes in the result chunk.
     */
    @JsonProperty("byte_count")
    private Long byteCount;
    
    /**
     * Position within the sequence of result set chunks.
     */
    @JsonProperty("chunk_index")
    private Long chunkIndex;
    
    /**
     * Indicates date-time that the given external link will expire and become
     * invalid, after which point a new `external_link` must be requested.
     */
    @JsonProperty("expiration")
    private String expiration;
    
    /**
     * Pre-signed URL pointing to a chunk of result data, hosted by an external
     * service, with a short expiration time (< 1 hour).
     */
    @JsonProperty("external_link")
    private String externalLink;
    
    /**
     * When fetching, gives `chunk_index` for the _next_ chunk; if absent,
     * indicates there are no more chunks.
     */
    @JsonProperty("next_chunk_index")
    private Long nextChunkIndex;
    
    /**
     * When fetching, gives `internal_link` for the _next_ chunk; if absent,
     * indicates there are no more chunks.
     */
    @JsonProperty("next_chunk_internal_link")
    private String nextChunkInternalLink;
    
    /**
     * Number of rows within the result chunk.
     */
    @JsonProperty("row_count")
    private Long rowCount;
    
    /**
     * Starting row offset within the result set.
     */
    @JsonProperty("row_offset")
    private Long rowOffset;
    
    public ExternalLink setByteCount(Long byteCount) {
        this.byteCount = byteCount;
        return this;
    }

    public Long getByteCount() {
        return byteCount;
    }
    
    public ExternalLink setChunkIndex(Long chunkIndex) {
        this.chunkIndex = chunkIndex;
        return this;
    }

    public Long getChunkIndex() {
        return chunkIndex;
    }
    
    public ExternalLink setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    public String getExpiration() {
        return expiration;
    }
    
    public ExternalLink setExternalLink(String externalLink) {
        this.externalLink = externalLink;
        return this;
    }

    public String getExternalLink() {
        return externalLink;
    }
    
    public ExternalLink setNextChunkIndex(Long nextChunkIndex) {
        this.nextChunkIndex = nextChunkIndex;
        return this;
    }

    public Long getNextChunkIndex() {
        return nextChunkIndex;
    }
    
    public ExternalLink setNextChunkInternalLink(String nextChunkInternalLink) {
        this.nextChunkInternalLink = nextChunkInternalLink;
        return this;
    }

    public String getNextChunkInternalLink() {
        return nextChunkInternalLink;
    }
    
    public ExternalLink setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }
    
    public ExternalLink setRowOffset(Long rowOffset) {
        this.rowOffset = rowOffset;
        return this;
    }

    public Long getRowOffset() {
        return rowOffset;
    }
    
}
