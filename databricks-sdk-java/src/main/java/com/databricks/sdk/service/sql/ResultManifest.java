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

/** The result manifest provides schema and metadata for the result set. */
@Generated
@JsonSerialize(using = ResultManifest.ResultManifestSerializer.class)
@JsonDeserialize(using = ResultManifest.ResultManifestDeserializer.class)
public class ResultManifest {
  /** Array of result set chunk metadata. */
  private Collection<BaseChunkInfo> chunks;

  /** */
  private Format format;

  /** The schema is an ordered list of column descriptions. */
  private ResultSchema schema;

  /**
   * The total number of bytes in the result set. This field is not available when using `INLINE`
   * disposition.
   */
  private Long totalByteCount;

  /** The total number of chunks that the result set has been divided into. */
  private Long totalChunkCount;

  /** The total number of rows in the result set. */
  private Long totalRowCount;

  /** Indicates whether the result is truncated due to `row_limit` or `byte_limit`. */
  private Boolean truncated;

  public ResultManifest setChunks(Collection<BaseChunkInfo> chunks) {
    this.chunks = chunks;
    return this;
  }

  public Collection<BaseChunkInfo> getChunks() {
    return chunks;
  }

  public ResultManifest setFormat(Format format) {
    this.format = format;
    return this;
  }

  public Format getFormat() {
    return format;
  }

  public ResultManifest setSchema(ResultSchema schema) {
    this.schema = schema;
    return this;
  }

  public ResultSchema getSchema() {
    return schema;
  }

  public ResultManifest setTotalByteCount(Long totalByteCount) {
    this.totalByteCount = totalByteCount;
    return this;
  }

  public Long getTotalByteCount() {
    return totalByteCount;
  }

  public ResultManifest setTotalChunkCount(Long totalChunkCount) {
    this.totalChunkCount = totalChunkCount;
    return this;
  }

  public Long getTotalChunkCount() {
    return totalChunkCount;
  }

  public ResultManifest setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  public Long getTotalRowCount() {
    return totalRowCount;
  }

  public ResultManifest setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultManifest that = (ResultManifest) o;
    return Objects.equals(chunks, that.chunks)
        && Objects.equals(format, that.format)
        && Objects.equals(schema, that.schema)
        && Objects.equals(totalByteCount, that.totalByteCount)
        && Objects.equals(totalChunkCount, that.totalChunkCount)
        && Objects.equals(totalRowCount, that.totalRowCount)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chunks, format, schema, totalByteCount, totalChunkCount, totalRowCount, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultManifest.class)
        .add("chunks", chunks)
        .add("format", format)
        .add("schema", schema)
        .add("totalByteCount", totalByteCount)
        .add("totalChunkCount", totalChunkCount)
        .add("totalRowCount", totalRowCount)
        .add("truncated", truncated)
        .toString();
  }

  ResultManifestPb toPb() {
    ResultManifestPb pb = new ResultManifestPb();
    pb.setChunks(chunks);
    pb.setFormat(format);
    pb.setSchema(schema);
    pb.setTotalByteCount(totalByteCount);
    pb.setTotalChunkCount(totalChunkCount);
    pb.setTotalRowCount(totalRowCount);
    pb.setTruncated(truncated);

    return pb;
  }

  static ResultManifest fromPb(ResultManifestPb pb) {
    ResultManifest model = new ResultManifest();
    model.setChunks(pb.getChunks());
    model.setFormat(pb.getFormat());
    model.setSchema(pb.getSchema());
    model.setTotalByteCount(pb.getTotalByteCount());
    model.setTotalChunkCount(pb.getTotalChunkCount());
    model.setTotalRowCount(pb.getTotalRowCount());
    model.setTruncated(pb.getTruncated());

    return model;
  }

  public static class ResultManifestSerializer extends JsonSerializer<ResultManifest> {
    @Override
    public void serialize(ResultManifest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultManifestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultManifestDeserializer extends JsonDeserializer<ResultManifest> {
    @Override
    public ResultManifest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultManifestPb pb = mapper.readValue(p, ResultManifestPb.class);
      return ResultManifest.fromPb(pb);
    }
  }
}
