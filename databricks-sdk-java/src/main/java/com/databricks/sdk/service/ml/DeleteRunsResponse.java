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
@JsonSerialize(using = DeleteRunsResponse.DeleteRunsResponseSerializer.class)
@JsonDeserialize(using = DeleteRunsResponse.DeleteRunsResponseDeserializer.class)
public class DeleteRunsResponse {
  /** The number of runs deleted. */
  private Long runsDeleted;

  public DeleteRunsResponse setRunsDeleted(Long runsDeleted) {
    this.runsDeleted = runsDeleted;
    return this;
  }

  public Long getRunsDeleted() {
    return runsDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteRunsResponse that = (DeleteRunsResponse) o;
    return Objects.equals(runsDeleted, that.runsDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runsDeleted);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteRunsResponse.class).add("runsDeleted", runsDeleted).toString();
  }

  DeleteRunsResponsePb toPb() {
    DeleteRunsResponsePb pb = new DeleteRunsResponsePb();
    pb.setRunsDeleted(runsDeleted);

    return pb;
  }

  static DeleteRunsResponse fromPb(DeleteRunsResponsePb pb) {
    DeleteRunsResponse model = new DeleteRunsResponse();
    model.setRunsDeleted(pb.getRunsDeleted());

    return model;
  }

  public static class DeleteRunsResponseSerializer extends JsonSerializer<DeleteRunsResponse> {
    @Override
    public void serialize(DeleteRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteRunsResponseDeserializer extends JsonDeserializer<DeleteRunsResponse> {
    @Override
    public DeleteRunsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteRunsResponsePb pb = mapper.readValue(p, DeleteRunsResponsePb.class);
      return DeleteRunsResponse.fromPb(pb);
    }
  }
}
