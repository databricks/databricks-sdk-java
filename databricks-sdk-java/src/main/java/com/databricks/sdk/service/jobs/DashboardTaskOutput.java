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
@JsonSerialize(using = DashboardTaskOutput.DashboardTaskOutputSerializer.class)
@JsonDeserialize(using = DashboardTaskOutput.DashboardTaskOutputDeserializer.class)
public class DashboardTaskOutput {
  /** Should only be populated for manual PDF download jobs. */
  private Collection<DashboardPageSnapshot> pageSnapshots;

  public DashboardTaskOutput setPageSnapshots(Collection<DashboardPageSnapshot> pageSnapshots) {
    this.pageSnapshots = pageSnapshots;
    return this;
  }

  public Collection<DashboardPageSnapshot> getPageSnapshots() {
    return pageSnapshots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DashboardTaskOutput that = (DashboardTaskOutput) o;
    return Objects.equals(pageSnapshots, that.pageSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSnapshots);
  }

  @Override
  public String toString() {
    return new ToStringer(DashboardTaskOutput.class).add("pageSnapshots", pageSnapshots).toString();
  }

  DashboardTaskOutputPb toPb() {
    DashboardTaskOutputPb pb = new DashboardTaskOutputPb();
    pb.setPageSnapshots(pageSnapshots);

    return pb;
  }

  static DashboardTaskOutput fromPb(DashboardTaskOutputPb pb) {
    DashboardTaskOutput model = new DashboardTaskOutput();
    model.setPageSnapshots(pb.getPageSnapshots());

    return model;
  }

  public static class DashboardTaskOutputSerializer extends JsonSerializer<DashboardTaskOutput> {
    @Override
    public void serialize(DashboardTaskOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DashboardTaskOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DashboardTaskOutputDeserializer
      extends JsonDeserializer<DashboardTaskOutput> {
    @Override
    public DashboardTaskOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DashboardTaskOutputPb pb = mapper.readValue(p, DashboardTaskOutputPb.class);
      return DashboardTaskOutput.fromPb(pb);
    }
  }
}
