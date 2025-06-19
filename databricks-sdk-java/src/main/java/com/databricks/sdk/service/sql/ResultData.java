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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ResultData.ResultDataSerializer.class)
@JsonDeserialize(using = ResultData.ResultDataDeserializer.class)
public class ResultData {
  /**
   * The number of bytes in the result chunk. This field is not available when using `INLINE`
   * disposition.
   */
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  private Long chunkIndex;

  /**
   * The `JSON_ARRAY` format is an array of arrays of values, where each non-null value is formatted
   * as a string. Null values are encoded as JSON `null`.
   */
  private Collection<Collection<String>> dataArray;

  /** */
  private Collection<ExternalLink> externalLinks;

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

  public ResultData setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public ResultData setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public ResultData setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultData setExternalLinks(Collection<ExternalLink> externalLinks) {
    this.externalLinks = externalLinks;
    return this;
  }

  public Collection<ExternalLink> getExternalLinks() {
    return externalLinks;
  }

  public ResultData setNextChunkIndex(Long nextChunkIndex) {
    this.nextChunkIndex = nextChunkIndex;
    return this;
  }

  public Long getNextChunkIndex() {
    return nextChunkIndex;
  }

  public ResultData setNextChunkInternalLink(String nextChunkInternalLink) {
    this.nextChunkInternalLink = nextChunkInternalLink;
    return this;
  }

  public String getNextChunkInternalLink() {
    return nextChunkInternalLink;
  }

  public ResultData setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public ResultData setRowOffset(Long rowOffset) {
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
    ResultData that = (ResultData) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(dataArray, that.dataArray)
        && Objects.equals(externalLinks, that.externalLinks)
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
        dataArray,
        externalLinks,
        nextChunkIndex,
        nextChunkInternalLink,
        rowCount,
        rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultData.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("dataArray", dataArray)
        .add("externalLinks", externalLinks)
        .add("nextChunkIndex", nextChunkIndex)
        .add("nextChunkInternalLink", nextChunkInternalLink)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }

  ResultDataPb toPb() {
    ResultDataPb pb = new ResultDataPb();
    pb.setByteCount(byteCount);
    pb.setChunkIndex(chunkIndex);
    pb.setDataArray(dataArray);
    pb.setExternalLinks(externalLinks);
    pb.setNextChunkIndex(nextChunkIndex);
    pb.setNextChunkInternalLink(nextChunkInternalLink);
    pb.setRowCount(rowCount);
    pb.setRowOffset(rowOffset);

    return pb;
  }

  static ResultData fromPb(ResultDataPb pb) {
    ResultData model = new ResultData();
    model.setByteCount(pb.getByteCount());
    model.setChunkIndex(pb.getChunkIndex());
    model.setDataArray(pb.getDataArray());
    model.setExternalLinks(pb.getExternalLinks());
    model.setNextChunkIndex(pb.getNextChunkIndex());
    model.setNextChunkInternalLink(pb.getNextChunkInternalLink());
    model.setRowCount(pb.getRowCount());
    model.setRowOffset(pb.getRowOffset());

    return model;
  }

  public static class ResultDataSerializer extends JsonSerializer<ResultData> {
    @Override
    public void serialize(ResultData value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultDataPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultDataDeserializer extends JsonDeserializer<ResultData> {
    @Override
    public ResultData deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultDataPb pb = mapper.readValue(p, ResultDataPb.class);
      return ResultData.fromPb(pb);
    }
  }
}
