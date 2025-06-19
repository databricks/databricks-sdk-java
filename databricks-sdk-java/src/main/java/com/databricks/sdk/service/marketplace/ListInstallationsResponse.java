// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = ListInstallationsResponse.ListInstallationsResponseSerializer.class)
@JsonDeserialize(using = ListInstallationsResponse.ListInstallationsResponseDeserializer.class)
public class ListInstallationsResponse {
  /** */
  private Collection<InstallationDetail> installations;

  /** */
  private String nextPageToken;

  public ListInstallationsResponse setInstallations(Collection<InstallationDetail> installations) {
    this.installations = installations;
    return this;
  }

  public Collection<InstallationDetail> getInstallations() {
    return installations;
  }

  public ListInstallationsResponse setNextPageToken(String nextPageToken) {
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
    ListInstallationsResponse that = (ListInstallationsResponse) o;
    return Objects.equals(installations, that.installations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListInstallationsResponse.class)
        .add("installations", installations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListInstallationsResponsePb toPb() {
    ListInstallationsResponsePb pb = new ListInstallationsResponsePb();
    pb.setInstallations(installations);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListInstallationsResponse fromPb(ListInstallationsResponsePb pb) {
    ListInstallationsResponse model = new ListInstallationsResponse();
    model.setInstallations(pb.getInstallations());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListInstallationsResponseSerializer
      extends JsonSerializer<ListInstallationsResponse> {
    @Override
    public void serialize(
        ListInstallationsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListInstallationsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListInstallationsResponseDeserializer
      extends JsonDeserializer<ListInstallationsResponse> {
    @Override
    public ListInstallationsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListInstallationsResponsePb pb = mapper.readValue(p, ListInstallationsResponsePb.class);
      return ListInstallationsResponse.fromPb(pb);
    }
  }
}
