// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Tokens were successfully returned. */
@Generated
@JsonSerialize(using = ListTokensResponse.ListTokensResponseSerializer.class)
@JsonDeserialize(using = ListTokensResponse.ListTokensResponseDeserializer.class)
public class ListTokensResponse {
  /** Token metadata of each user-created token in the workspace */
  private Collection<TokenInfo> tokenInfos;

  public ListTokensResponse setTokenInfos(Collection<TokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  public Collection<TokenInfo> getTokenInfos() {
    return tokenInfos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTokensResponse that = (ListTokensResponse) o;
    return Objects.equals(tokenInfos, that.tokenInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTokensResponse.class).add("tokenInfos", tokenInfos).toString();
  }

  ListTokensResponsePb toPb() {
    ListTokensResponsePb pb = new ListTokensResponsePb();
    pb.setTokenInfos(tokenInfos);

    return pb;
  }

  static ListTokensResponse fromPb(ListTokensResponsePb pb) {
    ListTokensResponse model = new ListTokensResponse();
    model.setTokenInfos(pb.getTokenInfos());

    return model;
  }

  public static class ListTokensResponseSerializer extends JsonSerializer<ListTokensResponse> {
    @Override
    public void serialize(ListTokensResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListTokensResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListTokensResponseDeserializer extends JsonDeserializer<ListTokensResponse> {
    @Override
    public ListTokensResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListTokensResponsePb pb = mapper.readValue(p, ListTokensResponsePb.class);
      return ListTokensResponse.fromPb(pb);
    }
  }
}
