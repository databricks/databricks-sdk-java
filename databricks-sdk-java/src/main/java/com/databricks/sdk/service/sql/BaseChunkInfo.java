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
import java.util.Objects;

/**
 * Describes metadata for a particular chunk, within a result set; this structure is used both
 * within a manifest, and when fetching individual chunk data or links.
 */
@Generated
@JsonSerialize(using = BaseChunkInfo.BaseChunkInfoSerializer.class)
@JsonDeserialize(using = BaseChunkInfo.BaseChunkInfoDeserializer.class)
public class BaseChunkInfo {
  /**
   * The number of bytes in the result chunk. This field is not available when using `INLINE`
   * disposition.
   */
  private Long byteCount;

  /** The position within the sequence of result set chunks. */
  private Long chunkIndex;

  /** The number of rows within the result chunk. */
  private Long rowCount;

  /** The starting row offset within the result set. */
  private Long rowOffset;

  public BaseChunkInfo setByteCount(Long byteCount) {
    this.byteCount = byteCount;
    return this;
  }

  public Long getByteCount() {
    return byteCount;
  }

  public BaseChunkInfo setChunkIndex(Long chunkIndex) {
    this.chunkIndex = chunkIndex;
    return this;
  }

  public Long getChunkIndex() {
    return chunkIndex;
  }

  public BaseChunkInfo setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  public BaseChunkInfo setRowOffset(Long rowOffset) {
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
    BaseChunkInfo that = (BaseChunkInfo) o;
    return Objects.equals(byteCount, that.byteCount)
        && Objects.equals(chunkIndex, that.chunkIndex)
        && Objects.equals(rowCount, that.rowCount)
        && Objects.equals(rowOffset, that.rowOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteCount, chunkIndex, rowCount, rowOffset);
  }

  @Override
  public String toString() {
    return new ToStringer(BaseChunkInfo.class)
        .add("byteCount", byteCount)
        .add("chunkIndex", chunkIndex)
        .add("rowCount", rowCount)
        .add("rowOffset", rowOffset)
        .toString();
  }

  BaseChunkInfoPb toPb() {
    BaseChunkInfoPb pb = new BaseChunkInfoPb();
    pb.setByteCount(byteCount);
    pb.setChunkIndex(chunkIndex);
    pb.setRowCount(rowCount);
    pb.setRowOffset(rowOffset);

    return pb;
  }

  static BaseChunkInfo fromPb(BaseChunkInfoPb pb) {
    BaseChunkInfo model = new BaseChunkInfo();
    model.setByteCount(pb.getByteCount());
    model.setChunkIndex(pb.getChunkIndex());
    model.setRowCount(pb.getRowCount());
    model.setRowOffset(pb.getRowOffset());

    return model;
  }

  public static class BaseChunkInfoSerializer extends JsonSerializer<BaseChunkInfo> {
    @Override
    public void serialize(BaseChunkInfo value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BaseChunkInfoPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BaseChunkInfoDeserializer extends JsonDeserializer<BaseChunkInfo> {
    @Override
    public BaseChunkInfo deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BaseChunkInfoPb pb = mapper.readValue(p, BaseChunkInfoPb.class);
      return BaseChunkInfo.fromPb(pb);
    }
  }
}
