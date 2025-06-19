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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = DbtCloudTaskOutput.DbtCloudTaskOutputSerializer.class)
@JsonDeserialize(using = DbtCloudTaskOutput.DbtCloudTaskOutputDeserializer.class)
public class DbtCloudTaskOutput {
  /** Id of the job run in dbt Cloud */
  private Long dbtCloudJobRunId;

  /** Steps of the job run as received from dbt Cloud */
  private Collection<DbtCloudJobRunStep> dbtCloudJobRunOutput;

  /** Url where full run details can be viewed */
  private String dbtCloudJobRunUrl;

  public DbtCloudTaskOutput setDbtCloudJobRunId(Long dbtCloudJobRunId) {
    this.dbtCloudJobRunId = dbtCloudJobRunId;
    return this;
  }

  public Long getDbtCloudJobRunId() {
    return dbtCloudJobRunId;
  }

  public DbtCloudTaskOutput setDbtCloudJobRunOutput(
      Collection<DbtCloudJobRunStep> dbtCloudJobRunOutput) {
    this.dbtCloudJobRunOutput = dbtCloudJobRunOutput;
    return this;
  }

  public Collection<DbtCloudJobRunStep> getDbtCloudJobRunOutput() {
    return dbtCloudJobRunOutput;
  }

  public DbtCloudTaskOutput setDbtCloudJobRunUrl(String dbtCloudJobRunUrl) {
    this.dbtCloudJobRunUrl = dbtCloudJobRunUrl;
    return this;
  }

  public String getDbtCloudJobRunUrl() {
    return dbtCloudJobRunUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudTaskOutput that = (DbtCloudTaskOutput) o;
    return Objects.equals(dbtCloudJobRunId, that.dbtCloudJobRunId)
        && Objects.equals(dbtCloudJobRunOutput, that.dbtCloudJobRunOutput)
        && Objects.equals(dbtCloudJobRunUrl, that.dbtCloudJobRunUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbtCloudJobRunId, dbtCloudJobRunOutput, dbtCloudJobRunUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudTaskOutput.class)
        .add("dbtCloudJobRunId", dbtCloudJobRunId)
        .add("dbtCloudJobRunOutput", dbtCloudJobRunOutput)
        .add("dbtCloudJobRunUrl", dbtCloudJobRunUrl)
        .toString();
  }

  DbtCloudTaskOutputPb toPb() {
    DbtCloudTaskOutputPb pb = new DbtCloudTaskOutputPb();
    pb.setDbtCloudJobRunId(dbtCloudJobRunId);
    pb.setDbtCloudJobRunOutput(dbtCloudJobRunOutput);
    pb.setDbtCloudJobRunUrl(dbtCloudJobRunUrl);

    return pb;
  }

  static DbtCloudTaskOutput fromPb(DbtCloudTaskOutputPb pb) {
    DbtCloudTaskOutput model = new DbtCloudTaskOutput();
    model.setDbtCloudJobRunId(pb.getDbtCloudJobRunId());
    model.setDbtCloudJobRunOutput(pb.getDbtCloudJobRunOutput());
    model.setDbtCloudJobRunUrl(pb.getDbtCloudJobRunUrl());

    return model;
  }

  public static class DbtCloudTaskOutputSerializer extends JsonSerializer<DbtCloudTaskOutput> {
    @Override
    public void serialize(DbtCloudTaskOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DbtCloudTaskOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DbtCloudTaskOutputDeserializer extends JsonDeserializer<DbtCloudTaskOutput> {
    @Override
    public DbtCloudTaskOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DbtCloudTaskOutputPb pb = mapper.readValue(p, DbtCloudTaskOutputPb.class);
      return DbtCloudTaskOutput.fromPb(pb);
    }
  }
}
