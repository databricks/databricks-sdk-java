// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = DataPlaneId.DataPlaneIdSerializer.class)
@JsonDeserialize(using = DataPlaneId.DataPlaneIdDeserializer.class)
public class DataPlaneId {
  /** The instance name of the data plane emitting an event. */
  private String instance;

  /** A sequence number, unique and increasing within the data plane instance. */
  private Long seqNo;

  public DataPlaneId setInstance(String instance) {
    this.instance = instance;
    return this;
  }

  public String getInstance() {
    return instance;
  }

  public DataPlaneId setSeqNo(Long seqNo) {
    this.seqNo = seqNo;
    return this;
  }

  public Long getSeqNo() {
    return seqNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataPlaneId that = (DataPlaneId) o;
    return Objects.equals(instance, that.instance) && Objects.equals(seqNo, that.seqNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance, seqNo);
  }

  @Override
  public String toString() {
    return new ToStringer(DataPlaneId.class)
        .add("instance", instance)
        .add("seqNo", seqNo)
        .toString();
  }

  DataPlaneIdPb toPb() {
    DataPlaneIdPb pb = new DataPlaneIdPb();
    pb.setInstance(instance);
    pb.setSeqNo(seqNo);

    return pb;
  }

  static DataPlaneId fromPb(DataPlaneIdPb pb) {
    DataPlaneId model = new DataPlaneId();
    model.setInstance(pb.getInstance());
    model.setSeqNo(pb.getSeqNo());

    return model;
  }

  public static class DataPlaneIdSerializer extends JsonSerializer<DataPlaneId> {
    @Override
    public void serialize(DataPlaneId value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DataPlaneIdPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DataPlaneIdDeserializer extends JsonDeserializer<DataPlaneId> {
    @Override
    public DataPlaneId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DataPlaneIdPb pb = mapper.readValue(p, DataPlaneIdPb.class);
      return DataPlaneId.fromPb(pb);
    }
  }
}
