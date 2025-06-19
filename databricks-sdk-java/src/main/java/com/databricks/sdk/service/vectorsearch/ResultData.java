// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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

/** Data returned in the query result. */
@Generated
@JsonSerialize(using = ResultData.ResultDataSerializer.class)
@JsonDeserialize(using = ResultData.ResultDataDeserializer.class)
public class ResultData {
  /** Data rows returned in the query. */
  private Collection<Collection<String>> dataArray;

  /** Number of rows in the result set. */
  private Long rowCount;

  public ResultData setDataArray(Collection<Collection<String>> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public Collection<Collection<String>> getDataArray() {
    return dataArray;
  }

  public ResultData setRowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  public Long getRowCount() {
    return rowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResultData that = (ResultData) o;
    return Objects.equals(dataArray, that.dataArray) && Objects.equals(rowCount, that.rowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataArray, rowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(ResultData.class)
        .add("dataArray", dataArray)
        .add("rowCount", rowCount)
        .toString();
  }

  ResultDataPb toPb() {
    ResultDataPb pb = new ResultDataPb();
    pb.setDataArray(dataArray);
    pb.setRowCount(rowCount);

    return pb;
  }

  static ResultData fromPb(ResultDataPb pb) {
    ResultData model = new ResultData();
    model.setDataArray(pb.getDataArray());
    model.setRowCount(pb.getRowCount());

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
