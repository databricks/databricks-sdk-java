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
@JsonSerialize(using = DbtCloudTask.DbtCloudTaskSerializer.class)
@JsonDeserialize(using = DbtCloudTask.DbtCloudTaskDeserializer.class)
public class DbtCloudTask {
  /** The resource name of the UC connection that authenticates the dbt Cloud for this task */
  private String connectionResourceName;

  /** Id of the dbt Cloud job to be triggered */
  private Long dbtCloudJobId;

  public DbtCloudTask setConnectionResourceName(String connectionResourceName) {
    this.connectionResourceName = connectionResourceName;
    return this;
  }

  public String getConnectionResourceName() {
    return connectionResourceName;
  }

  public DbtCloudTask setDbtCloudJobId(Long dbtCloudJobId) {
    this.dbtCloudJobId = dbtCloudJobId;
    return this;
  }

  public Long getDbtCloudJobId() {
    return dbtCloudJobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtCloudTask that = (DbtCloudTask) o;
    return Objects.equals(connectionResourceName, that.connectionResourceName)
        && Objects.equals(dbtCloudJobId, that.dbtCloudJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionResourceName, dbtCloudJobId);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtCloudTask.class)
        .add("connectionResourceName", connectionResourceName)
        .add("dbtCloudJobId", dbtCloudJobId)
        .toString();
  }

  DbtCloudTaskPb toPb() {
    DbtCloudTaskPb pb = new DbtCloudTaskPb();
    pb.setConnectionResourceName(connectionResourceName);
    pb.setDbtCloudJobId(dbtCloudJobId);

    return pb;
  }

  static DbtCloudTask fromPb(DbtCloudTaskPb pb) {
    DbtCloudTask model = new DbtCloudTask();
    model.setConnectionResourceName(pb.getConnectionResourceName());
    model.setDbtCloudJobId(pb.getDbtCloudJobId());

    return model;
  }

  public static class DbtCloudTaskSerializer extends JsonSerializer<DbtCloudTask> {
    @Override
    public void serialize(DbtCloudTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DbtCloudTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DbtCloudTaskDeserializer extends JsonDeserializer<DbtCloudTask> {
    @Override
    public DbtCloudTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DbtCloudTaskPb pb = mapper.readValue(p, DbtCloudTaskPb.class);
      return DbtCloudTask.fromPb(pb);
    }
  }
}
