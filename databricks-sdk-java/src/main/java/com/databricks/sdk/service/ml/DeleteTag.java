// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = DeleteTag.DeleteTagSerializer.class)
@JsonDeserialize(using = DeleteTag.DeleteTagDeserializer.class)
public class DeleteTag {
  /** Name of the tag. Maximum size is 255 bytes. Must be provided. */
  private String key;

  /** ID of the run that the tag was logged under. Must be provided. */
  private String runId;

  public DeleteTag setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public DeleteTag setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteTag that = (DeleteTag) o;
    return Objects.equals(key, that.key) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTag.class).add("key", key).add("runId", runId).toString();
  }

  DeleteTagPb toPb() {
    DeleteTagPb pb = new DeleteTagPb();
    pb.setKey(key);
    pb.setRunId(runId);

    return pb;
  }

  static DeleteTag fromPb(DeleteTagPb pb) {
    DeleteTag model = new DeleteTag();
    model.setKey(pb.getKey());
    model.setRunId(pb.getRunId());

    return model;
  }

  public static class DeleteTagSerializer extends JsonSerializer<DeleteTag> {
    @Override
    public void serialize(DeleteTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTagDeserializer extends JsonDeserializer<DeleteTag> {
    @Override
    public DeleteTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTagPb pb = mapper.readValue(p, DeleteTagPb.class);
      return DeleteTag.fromPb(pb);
    }
  }
}
