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

@Generated
@JsonSerialize(using = ListPublicTokensResponse.ListPublicTokensResponseSerializer.class)
@JsonDeserialize(using = ListPublicTokensResponse.ListPublicTokensResponseDeserializer.class)
public class ListPublicTokensResponse {
  /** The information for each token. */
  private Collection<PublicTokenInfo> tokenInfos;

  public ListPublicTokensResponse setTokenInfos(Collection<PublicTokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  public Collection<PublicTokenInfo> getTokenInfos() {
    return tokenInfos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPublicTokensResponse that = (ListPublicTokensResponse) o;
    return Objects.equals(tokenInfos, that.tokenInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenInfos);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPublicTokensResponse.class).add("tokenInfos", tokenInfos).toString();
  }

  ListPublicTokensResponsePb toPb() {
    ListPublicTokensResponsePb pb = new ListPublicTokensResponsePb();
    pb.setTokenInfos(tokenInfos);

    return pb;
  }

  static ListPublicTokensResponse fromPb(ListPublicTokensResponsePb pb) {
    ListPublicTokensResponse model = new ListPublicTokensResponse();
    model.setTokenInfos(pb.getTokenInfos());

    return model;
  }

  public static class ListPublicTokensResponseSerializer
      extends JsonSerializer<ListPublicTokensResponse> {
    @Override
    public void serialize(
        ListPublicTokensResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListPublicTokensResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListPublicTokensResponseDeserializer
      extends JsonDeserializer<ListPublicTokensResponse> {
    @Override
    public ListPublicTokensResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListPublicTokensResponsePb pb = mapper.readValue(p, ListPublicTokensResponsePb.class);
      return ListPublicTokensResponse.fromPb(pb);
    }
  }
}
