// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = Results.ResultsSerializer.class)
@JsonDeserialize(using = Results.ResultsDeserializer.class)
public class Results {
  /** The cause of the error */
  private String cause;

  /** */
  private Object data;

  /** The image filename */
  private String fileName;

  /** */
  private Collection<String> fileNames;

  /** true if a JSON schema is returned instead of a string representation of the Hive type. */
  private Boolean isJsonSchema;

  /** internal field used by SDK */
  private Long pos;

  /** */
  private ResultType resultType;

  /** The table schema */
  private Collection<Map<String, Object>> schema;

  /** The summary of the error */
  private String summary;

  /** true if partial results are returned. */
  private Boolean truncated;

  public Results setCause(String cause) {
    this.cause = cause;
    return this;
  }

  public String getCause() {
    return cause;
  }

  public Results setData(Object data) {
    this.data = data;
    return this;
  }

  public Object getData() {
    return data;
  }

  public Results setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  public String getFileName() {
    return fileName;
  }

  public Results setFileNames(Collection<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }

  public Collection<String> getFileNames() {
    return fileNames;
  }

  public Results setIsJsonSchema(Boolean isJsonSchema) {
    this.isJsonSchema = isJsonSchema;
    return this;
  }

  public Boolean getIsJsonSchema() {
    return isJsonSchema;
  }

  public Results setPos(Long pos) {
    this.pos = pos;
    return this;
  }

  public Long getPos() {
    return pos;
  }

  public Results setResultType(ResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  public ResultType getResultType() {
    return resultType;
  }

  public Results setSchema(Collection<Map<String, Object>> schema) {
    this.schema = schema;
    return this;
  }

  public Collection<Map<String, Object>> getSchema() {
    return schema;
  }

  public Results setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

  public Results setTruncated(Boolean truncated) {
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
    Results that = (Results) o;
    return Objects.equals(cause, that.cause)
        && Objects.equals(data, that.data)
        && Objects.equals(fileName, that.fileName)
        && Objects.equals(fileNames, that.fileNames)
        && Objects.equals(isJsonSchema, that.isJsonSchema)
        && Objects.equals(pos, that.pos)
        && Objects.equals(resultType, that.resultType)
        && Objects.equals(schema, that.schema)
        && Objects.equals(summary, that.summary)
        && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cause,
        data,
        fileName,
        fileNames,
        isJsonSchema,
        pos,
        resultType,
        schema,
        summary,
        truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(Results.class)
        .add("cause", cause)
        .add("data", data)
        .add("fileName", fileName)
        .add("fileNames", fileNames)
        .add("isJsonSchema", isJsonSchema)
        .add("pos", pos)
        .add("resultType", resultType)
        .add("schema", schema)
        .add("summary", summary)
        .add("truncated", truncated)
        .toString();
  }

  ResultsPb toPb() {
    ResultsPb pb = new ResultsPb();
    pb.setCause(cause);
    pb.setData(data);
    pb.setFileName(fileName);
    pb.setFileNames(fileNames);
    pb.setIsJsonSchema(isJsonSchema);
    pb.setPos(pos);
    pb.setResultType(resultType);
    pb.setSchema(schema);
    pb.setSummary(summary);
    pb.setTruncated(truncated);

    return pb;
  }

  static Results fromPb(ResultsPb pb) {
    Results model = new Results();
    model.setCause(pb.getCause());
    model.setData(pb.getData());
    model.setFileName(pb.getFileName());
    model.setFileNames(pb.getFileNames());
    model.setIsJsonSchema(pb.getIsJsonSchema());
    model.setPos(pb.getPos());
    model.setResultType(pb.getResultType());
    model.setSchema(pb.getSchema());
    model.setSummary(pb.getSummary());
    model.setTruncated(pb.getTruncated());

    return model;
  }

  public static class ResultsSerializer extends JsonSerializer<Results> {
    @Override
    public void serialize(Results value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResultsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResultsDeserializer extends JsonDeserializer<Results> {
    @Override
    public Results deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResultsPb pb = mapper.readValue(p, ResultsPb.class);
      return Results.fromPb(pb);
    }
  }
}
