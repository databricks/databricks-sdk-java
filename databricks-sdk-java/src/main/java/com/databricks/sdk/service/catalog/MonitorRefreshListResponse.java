// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = MonitorRefreshListResponse.MonitorRefreshListResponseSerializer.class)
@JsonDeserialize(using = MonitorRefreshListResponse.MonitorRefreshListResponseDeserializer.class)
public class MonitorRefreshListResponse {
  /** List of refreshes. */
  private Collection<MonitorRefreshInfo> refreshes;

  public MonitorRefreshListResponse setRefreshes(Collection<MonitorRefreshInfo> refreshes) {
    this.refreshes = refreshes;
    return this;
  }

  public Collection<MonitorRefreshInfo> getRefreshes() {
    return refreshes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorRefreshListResponse that = (MonitorRefreshListResponse) o;
    return Objects.equals(refreshes, that.refreshes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshes);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorRefreshListResponse.class).add("refreshes", refreshes).toString();
  }

  MonitorRefreshListResponsePb toPb() {
    MonitorRefreshListResponsePb pb = new MonitorRefreshListResponsePb();
    pb.setRefreshes(refreshes);

    return pb;
  }

  static MonitorRefreshListResponse fromPb(MonitorRefreshListResponsePb pb) {
    MonitorRefreshListResponse model = new MonitorRefreshListResponse();
    model.setRefreshes(pb.getRefreshes());

    return model;
  }

  public static class MonitorRefreshListResponseSerializer
      extends JsonSerializer<MonitorRefreshListResponse> {
    @Override
    public void serialize(
        MonitorRefreshListResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorRefreshListResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorRefreshListResponseDeserializer
      extends JsonDeserializer<MonitorRefreshListResponse> {
    @Override
    public MonitorRefreshListResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorRefreshListResponsePb pb = mapper.readValue(p, MonitorRefreshListResponsePb.class);
      return MonitorRefreshListResponse.fromPb(pb);
    }
  }
}
