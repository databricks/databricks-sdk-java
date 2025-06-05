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
@JsonSerialize(using = PipelineParams.PipelineParamsSerializer.class)
@JsonDeserialize(using = PipelineParams.PipelineParamsDeserializer.class)
public class PipelineParams {
  /** If true, triggers a full refresh on the delta live table. */
  private Boolean fullRefresh;

  public PipelineParams setFullRefresh(Boolean fullRefresh) {
    this.fullRefresh = fullRefresh;
    return this;
  }

  public Boolean getFullRefresh() {
    return fullRefresh;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineParams that = (PipelineParams) o;
    return Objects.equals(fullRefresh, that.fullRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullRefresh);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineParams.class).add("fullRefresh", fullRefresh).toString();
  }

  PipelineParamsPb toPb() {
    PipelineParamsPb pb = new PipelineParamsPb();
    pb.setFullRefresh(fullRefresh);

    return pb;
  }

  static PipelineParams fromPb(PipelineParamsPb pb) {
    PipelineParams model = new PipelineParams();
    model.setFullRefresh(pb.getFullRefresh());

    return model;
  }

  public static class PipelineParamsSerializer extends JsonSerializer<PipelineParams> {
    @Override
    public void serialize(PipelineParams value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineParamsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineParamsDeserializer extends JsonDeserializer<PipelineParams> {
    @Override
    public PipelineParams deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineParamsPb pb = mapper.readValue(p, PipelineParamsPb.class);
      return PipelineParams.fromPb(pb);
    }
  }
}
