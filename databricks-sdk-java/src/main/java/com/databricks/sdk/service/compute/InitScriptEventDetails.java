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
import java.util.Objects;

@Generated
@JsonSerialize(using = InitScriptEventDetails.InitScriptEventDetailsSerializer.class)
@JsonDeserialize(using = InitScriptEventDetails.InitScriptEventDetailsDeserializer.class)
public class InitScriptEventDetails {
  /** The cluster scoped init scripts associated with this cluster event. */
  private Collection<InitScriptInfoAndExecutionDetails> cluster;

  /** The global init scripts associated with this cluster event. */
  private Collection<InitScriptInfoAndExecutionDetails> global;

  /**
   * The private ip of the node we are reporting init script execution details for (we will select
   * the execution details from only one node rather than reporting the execution details from every
   * node to keep these event details small)
   *
   * <p>This should only be defined for the INIT_SCRIPTS_FINISHED event
   */
  private String reportedForNode;

  public InitScriptEventDetails setCluster(Collection<InitScriptInfoAndExecutionDetails> cluster) {
    this.cluster = cluster;
    return this;
  }

  public Collection<InitScriptInfoAndExecutionDetails> getCluster() {
    return cluster;
  }

  public InitScriptEventDetails setGlobal(Collection<InitScriptInfoAndExecutionDetails> global) {
    this.global = global;
    return this;
  }

  public Collection<InitScriptInfoAndExecutionDetails> getGlobal() {
    return global;
  }

  public InitScriptEventDetails setReportedForNode(String reportedForNode) {
    this.reportedForNode = reportedForNode;
    return this;
  }

  public String getReportedForNode() {
    return reportedForNode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptEventDetails that = (InitScriptEventDetails) o;
    return Objects.equals(cluster, that.cluster)
        && Objects.equals(global, that.global)
        && Objects.equals(reportedForNode, that.reportedForNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, global, reportedForNode);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptEventDetails.class)
        .add("cluster", cluster)
        .add("global", global)
        .add("reportedForNode", reportedForNode)
        .toString();
  }

  InitScriptEventDetailsPb toPb() {
    InitScriptEventDetailsPb pb = new InitScriptEventDetailsPb();
    pb.setCluster(cluster);
    pb.setGlobal(global);
    pb.setReportedForNode(reportedForNode);

    return pb;
  }

  static InitScriptEventDetails fromPb(InitScriptEventDetailsPb pb) {
    InitScriptEventDetails model = new InitScriptEventDetails();
    model.setCluster(pb.getCluster());
    model.setGlobal(pb.getGlobal());
    model.setReportedForNode(pb.getReportedForNode());

    return model;
  }

  public static class InitScriptEventDetailsSerializer
      extends JsonSerializer<InitScriptEventDetails> {
    @Override
    public void serialize(
        InitScriptEventDetails value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InitScriptEventDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InitScriptEventDetailsDeserializer
      extends JsonDeserializer<InitScriptEventDetails> {
    @Override
    public InitScriptEventDetails deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InitScriptEventDetailsPb pb = mapper.readValue(p, InitScriptEventDetailsPb.class);
      return InitScriptEventDetails.fromPb(pb);
    }
  }
}
