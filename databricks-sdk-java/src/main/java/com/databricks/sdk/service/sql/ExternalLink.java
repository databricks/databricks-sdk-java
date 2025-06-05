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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = ExternalLink.ExternalLinkSerializer.class)
@JsonDeserialize(using = ExternalLink.ExternalLinkDeserializer.class)
public class ExternalLink {
  /**
   * The number of bytes in the result chunk. This field is not available when using `INLINE`
   * disposition.
   */
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  private Long chunkIndex;

  /**
   * Indicates the date-time that the given external link will expire and becomes invalid, after
   * which point a new `external_link` must be requested.
   */
  private String expiration;

  /** */
  private String externalLink;

  /**
   * HTTP headers that must be included with a GET request to the `external_link`. Each header is
   * provided as a key-value pair. Headers are typically used to pass a decryption key to the
   * external service. The values of these headers should be considered sensitive and the client
   * should not expose these values in a log.
   */
  private Map<String, String> httpHeaders;

  /**
   * When fetching, provides the `chunk_index` for the _next_ chunk. If absent, indicates there are
   * no more chunks. The next chunk can be fetched with a
   * :method:statementexecution/getStatementResultChunkN request.
   */
  private Long nextChunkIndex;

  /**
   * When fetching, provides a link to fetch the _next_ chunk. If absent, indicates there are no
   * more chunks. This link is an absolute `path` to be joined with your `$DATABRICKS_HOST`, and
   * should be treated as an opaque link. This is an alternative to using `next_chunk_index`.
   */
  private String nextChunkInternalLink;

  /** The number of rows within the result chunk. */
  private Long rowCount;

  /** The starting row offset within the result set. */
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

  public ExternalLink setHttpHeaders(Map<String, String> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public Map<String, String> getHttpHeaders() {
    return httpHeaders;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalLink that = (ExternalLink) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(expiration, that.expiration)
        && Objects.equals(externalLink, that.externalLink)
        && Objects.equals(httpHeaders, that.httpHeaders)
        && Objects.equals(nextChunkIndex, that.nextChunkIndex)
        && Objects.equals(nextChunkInternalLink, that.nextChunkInternalLink)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(rowOffset, that.rowOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        byteCount,
        chunkIndex,
        expiration,
        externalLink,
        httpHeaders,
        nextChunkIndex,
        nextChunkInternalLink,
        rowCount,
        rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(ExternalLink.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("expiration", expiration)
        .add("externalLink", externalLink)
        .add("httpHeaders", httpHeaders)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }

  ExternalLinkPb toPb() {
    ExternalLinkPb pb = new ExternalLinkPb();
    pb.setByteCount(byteCount);
    pb.setChunkIndex(chunkIndex);
    pb.setExpiration(expiration);
    pb.setExternalLink(externalLink);
    pb.setHttpHeaders(httpHeaders);
    pb.setNextChunkIndex(nextChunkIndex);
    pb.setNextChunkInternalLink(nextChunkInternalLink);
    pb.setRowCount(rowCount);
    pb.setRowOffset(rowOffset);

    return pb;
  }

  static ExternalLink fromPb(ExternalLinkPb pb) {
    ExternalLink model = new ExternalLink();
    model.setByteCount(pb.getByteCount());
    model.setChunkIndex(pb.getChunkIndex());
    model.setExpiration(pb.getExpiration());
    model.setExternalLink(pb.getExternalLink());
    model.setHttpHeaders(pb.getHttpHeaders());
    model.setNextChunkIndex(pb.getNextChunkIndex());
    model.setNextChunkInternalLink(pb.getNextChunkInternalLink());
    model.setRowCount(pb.getRowCount());
    model.setRowOffset(pb.getRowOffset());

    return model;
  }

  public static class ExternalLinkSerializer extends JsonSerializer<ExternalLink> {
    @Override
    public void serialize(ExternalLink value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExternalLinkPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExternalLinkDeserializer extends JsonDeserializer<ExternalLink> {
    @Override
    public ExternalLink deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExternalLinkPb pb = mapper.readValue(p, ExternalLinkPb.class);
      return ExternalLink.fromPb(pb);
    }
  }
}
