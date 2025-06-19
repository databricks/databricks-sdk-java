// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

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
@JsonSerialize(using = ListQualityMonitorResponse.ListQualityMonitorResponseSerializer.class)
@JsonDeserialize(using = ListQualityMonitorResponse.ListQualityMonitorResponseDeserializer.class)
public class ListQualityMonitorResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<QualityMonitor> qualityMonitors;

  public ListQualityMonitorResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQualityMonitorResponse setQualityMonitors(Collection<QualityMonitor> qualityMonitors) {
    this.qualityMonitors = qualityMonitors;
    return this;
  }

  public Collection<QualityMonitor> getQualityMonitors() {
    return qualityMonitors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQualityMonitorResponse that = (ListQualityMonitorResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(qualityMonitors, that.qualityMonitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, qualityMonitors);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQualityMonitorResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("qualityMonitors", qualityMonitors)
        .toString();
  }

  ListQualityMonitorResponsePb toPb() {
    ListQualityMonitorResponsePb pb = new ListQualityMonitorResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setQualityMonitors(qualityMonitors);

    return pb;
  }

  static ListQualityMonitorResponse fromPb(ListQualityMonitorResponsePb pb) {
    ListQualityMonitorResponse model = new ListQualityMonitorResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setQualityMonitors(pb.getQualityMonitors());

    return model;
  }

  public static class ListQualityMonitorResponseSerializer
      extends JsonSerializer<ListQualityMonitorResponse> {
    @Override
    public void serialize(
        ListQualityMonitorResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQualityMonitorResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQualityMonitorResponseDeserializer
      extends JsonDeserializer<ListQualityMonitorResponse> {
    @Override
    public ListQualityMonitorResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQualityMonitorResponsePb pb = mapper.readValue(p, ListQualityMonitorResponsePb.class);
      return ListQualityMonitorResponse.fromPb(pb);
    }
  }
}
