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
@JsonSerialize(using = ListFunctionsResponse.ListFunctionsResponseSerializer.class)
@JsonDeserialize(using = ListFunctionsResponse.ListFunctionsResponseDeserializer.class)
public class ListFunctionsResponse {
  /** An array of function information objects. */
  private Collection<FunctionInfo> functions;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListFunctionsResponse setFunctions(Collection<FunctionInfo> functions) {
    this.functions = functions;
    return this;
  }

  public Collection<FunctionInfo> getFunctions() {
    return functions;
  }

  public ListFunctionsResponse setNextPageToken(String nextPageToken) {
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
    ListFunctionsResponse that = (ListFunctionsResponse) o;
    return Objects.equals(functions, that.functions)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functions, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListFunctionsResponse.class)
        .add("functions", functions)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListFunctionsResponsePb toPb() {
    ListFunctionsResponsePb pb = new ListFunctionsResponsePb();
    pb.setFunctions(functions);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListFunctionsResponse fromPb(ListFunctionsResponsePb pb) {
    ListFunctionsResponse model = new ListFunctionsResponse();
    model.setFunctions(pb.getFunctions());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListFunctionsResponseSerializer
      extends JsonSerializer<ListFunctionsResponse> {
    @Override
    public void serialize(
        ListFunctionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFunctionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFunctionsResponseDeserializer
      extends JsonDeserializer<ListFunctionsResponse> {
    @Override
    public ListFunctionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFunctionsResponsePb pb = mapper.readValue(p, ListFunctionsResponsePb.class);
      return ListFunctionsResponse.fromPb(pb);
    }
  }
}
