// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = ListAppDeploymentsResponse.ListAppDeploymentsResponseSerializer.class)
@JsonDeserialize(using = ListAppDeploymentsResponse.ListAppDeploymentsResponseDeserializer.class)
public class ListAppDeploymentsResponse {
  /** Deployment history of the app. */
  private Collection<AppDeployment> appDeployments;

  /** Pagination token to request the next page of apps. */
  private String nextPageToken;

  public ListAppDeploymentsResponse setAppDeployments(Collection<AppDeployment> appDeployments) {
    this.appDeployments = appDeployments;
    return this;
  }

  public Collection<AppDeployment> getAppDeployments() {
    return appDeployments;
  }

  public ListAppDeploymentsResponse setNextPageToken(String nextPageToken) {
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
    ListAppDeploymentsResponse that = (ListAppDeploymentsResponse) o;
    return Objects.equals(appDeployments, that.appDeployments)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployments, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppDeploymentsResponse.class)
        .add("appDeployments", appDeployments)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListAppDeploymentsResponsePb toPb() {
    ListAppDeploymentsResponsePb pb = new ListAppDeploymentsResponsePb();
    pb.setAppDeployments(appDeployments);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListAppDeploymentsResponse fromPb(ListAppDeploymentsResponsePb pb) {
    ListAppDeploymentsResponse model = new ListAppDeploymentsResponse();
    model.setAppDeployments(pb.getAppDeployments());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListAppDeploymentsResponseSerializer
      extends JsonSerializer<ListAppDeploymentsResponse> {
    @Override
    public void serialize(
        ListAppDeploymentsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAppDeploymentsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAppDeploymentsResponseDeserializer
      extends JsonDeserializer<ListAppDeploymentsResponse> {
    @Override
    public ListAppDeploymentsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAppDeploymentsResponsePb pb = mapper.readValue(p, ListAppDeploymentsResponsePb.class);
      return ListAppDeploymentsResponse.fromPb(pb);
    }
  }
}
