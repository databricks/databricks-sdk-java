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
@JsonSerialize(using = Sequencing.SequencingSerializer.class)
@JsonDeserialize(using = Sequencing.SequencingDeserializer.class)
public class Sequencing {
  /** A sequence number, unique and increasing within the control plane. */
  private Long controlPlaneSeqNo;

  /** the ID assigned by the data plane. */
  private DataPlaneId dataPlaneId;

  public Sequencing setControlPlaneSeqNo(Long controlPlaneSeqNo) {
    this.controlPlaneSeqNo = controlPlaneSeqNo;
    return this;
  }

  public Long getControlPlaneSeqNo() {
    return controlPlaneSeqNo;
  }

  public Sequencing setDataPlaneId(DataPlaneId dataPlaneId) {
    this.dataPlaneId = dataPlaneId;
    return this;
  }

  public DataPlaneId getDataPlaneId() {
    return dataPlaneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sequencing that = (Sequencing) o;
    return Objects.equals(controlPlaneSeqNo, that.controlPlaneSeqNo)
        && Objects.equals(dataPlaneId, that.dataPlaneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlPlaneSeqNo, dataPlaneId);
  }

  @Override
  public String toString() {
    return new ToStringer(Sequencing.class)
        .add("controlPlaneSeqNo", controlPlaneSeqNo)
        .add("dataPlaneId", dataPlaneId)
        .toString();
  }

  SequencingPb toPb() {
    SequencingPb pb = new SequencingPb();
    pb.setControlPlaneSeqNo(controlPlaneSeqNo);
    pb.setDataPlaneId(dataPlaneId);

    return pb;
  }

  static Sequencing fromPb(SequencingPb pb) {
    Sequencing model = new Sequencing();
    model.setControlPlaneSeqNo(pb.getControlPlaneSeqNo());
    model.setDataPlaneId(pb.getDataPlaneId());

    return model;
  }

  public static class SequencingSerializer extends JsonSerializer<Sequencing> {
    @Override
    public void serialize(Sequencing value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SequencingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SequencingDeserializer extends JsonDeserializer<Sequencing> {
    @Override
    public Sequencing deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SequencingPb pb = mapper.readValue(p, SequencingPb.class);
      return Sequencing.fromPb(pb);
    }
  }
}
