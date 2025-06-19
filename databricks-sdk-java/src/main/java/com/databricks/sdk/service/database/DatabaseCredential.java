// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = DatabaseCredential.DatabaseCredentialSerializer.class)
@JsonDeserialize(using = DatabaseCredential.DatabaseCredentialDeserializer.class)
public class DatabaseCredential {
  /** */
  private String token;

  public DatabaseCredential setToken(String token) {
    this.token = token;
    return this;
  }

  public String getToken() {
    return token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabaseCredential that = (DatabaseCredential) o;
    return Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabaseCredential.class).add("token", token).toString();
  }

  DatabaseCredentialPb toPb() {
    DatabaseCredentialPb pb = new DatabaseCredentialPb();
    pb.setToken(token);

    return pb;
  }

  static DatabaseCredential fromPb(DatabaseCredentialPb pb) {
    DatabaseCredential model = new DatabaseCredential();
    model.setToken(pb.getToken());

    return model;
  }

  public static class DatabaseCredentialSerializer extends JsonSerializer<DatabaseCredential> {
    @Override
    public void serialize(DatabaseCredential value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DatabaseCredentialPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DatabaseCredentialDeserializer extends JsonDeserializer<DatabaseCredential> {
    @Override
    public DatabaseCredential deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DatabaseCredentialPb pb = mapper.readValue(p, DatabaseCredentialPb.class);
      return DatabaseCredential.fromPb(pb);
    }
  }
}
