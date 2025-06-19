// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

@Generated
@JsonSerialize(using = NotebookOutput.NotebookOutputSerializer.class)
@JsonDeserialize(using = NotebookOutput.NotebookOutputDeserializer.class)
public class NotebookOutput {
  /**
   * The value passed to
   * [dbutils.notebook.exit()](/notebooks/notebook-workflows.html#notebook-workflows-exit).
   * Databricks restricts this API to return the first 5 MB of the value. For a larger result, your
   * job can store the results in a cloud storage service. This field is absent if
   * `dbutils.notebook.exit()` was never called.
   */
  private String result;

  /** Whether or not the result was truncated. */
  private Boolean truncated;

  public NotebookOutput setResult(String result) {
    this.result = result;
    return this;
  }

  public String getResult() {
    return result;
  }

  public NotebookOutput setTruncated(Boolean truncated) {
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
    NotebookOutput that = (NotebookOutput) o;
    return Objects.equals(result, that.result) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookOutput.class)
        .add("result", result)
        .add("truncated", truncated)
        .toString();
  }

  NotebookOutputPb toPb() {
    NotebookOutputPb pb = new NotebookOutputPb();
    pb.setResult(result);
    pb.setTruncated(truncated);

    return pb;
  }

  static NotebookOutput fromPb(NotebookOutputPb pb) {
    NotebookOutput model = new NotebookOutput();
    model.setResult(pb.getResult());
    model.setTruncated(pb.getTruncated());

    return model;
  }

  public static class NotebookOutputSerializer extends JsonSerializer<NotebookOutput> {
    @Override
    public void serialize(NotebookOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NotebookOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NotebookOutputDeserializer extends JsonDeserializer<NotebookOutput> {
    @Override
    public NotebookOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NotebookOutputPb pb = mapper.readValue(p, NotebookOutputPb.class);
      return NotebookOutput.fromPb(pb);
    }
  }
}
