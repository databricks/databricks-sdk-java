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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = GetMetricHistoryResponse.GetMetricHistoryResponseSerializer.class)
@JsonDeserialize(using = GetMetricHistoryResponse.GetMetricHistoryResponseDeserializer.class)
public class GetMetricHistoryResponse {
  /**
   * All logged values for this metric if `max_results` is not specified in the request or if the
   * total count of metrics returned is less than the service level pagination threshold. Otherwise,
   * this is one page of results.
   */
  private Collection<Metric> metrics;

  /**
   * A token that can be used to issue a query for the next page of metric history values. A missing
   * token indicates that no additional metrics are available to fetch.
   */
  private String nextPageToken;

  public GetMetricHistoryResponse setMetrics(Collection<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public Collection<Metric> getMetrics() {
    return metrics;
  }

  public GetMetricHistoryResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetMetricHistoryResponse that = (GetMetricHistoryResponse) o;
    return Objects.equals(metrics, that.metrics)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetMetricHistoryResponse.class)
        .add("metrics", metrics)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetMetricHistoryResponsePb toPb() {
    GetMetricHistoryResponsePb pb = new GetMetricHistoryResponsePb();
    pb.setMetrics(metrics);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetMetricHistoryResponse fromPb(GetMetricHistoryResponsePb pb) {
    GetMetricHistoryResponse model = new GetMetricHistoryResponse();
    model.setMetrics(pb.getMetrics());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetMetricHistoryResponseSerializer
      extends JsonSerializer<GetMetricHistoryResponse> {
    @Override
    public void serialize(
        GetMetricHistoryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetMetricHistoryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetMetricHistoryResponseDeserializer
      extends JsonDeserializer<GetMetricHistoryResponse> {
    @Override
    public GetMetricHistoryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetMetricHistoryResponsePb pb = mapper.readValue(p, GetMetricHistoryResponsePb.class);
      return GetMetricHistoryResponse.fromPb(pb);
    }
  }
}
