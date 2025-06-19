// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = User.UserSerializer.class)
@JsonDeserialize(using = User.UserDeserializer.class)
public class User {
  /** */
  private String email;

  /** */
  private Long id;

  /** */
  private String name;

  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public User setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User that = (User) o;
    return Objects.equals(email, that.email)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, name);
  }

  @Override
  public String toString() {
    return new ToStringer(User.class)
        .add("email", email)
        .add("id", id)
        .add("name", name)
        .toString();
  }

  UserPb toPb() {
    UserPb pb = new UserPb();
    pb.setEmail(email);
    pb.setId(id);
    pb.setName(name);

    return pb;
  }

  static User fromPb(UserPb pb) {
    User model = new User();
    model.setEmail(pb.getEmail());
    model.setId(pb.getId());
    model.setName(pb.getName());

    return model;
  }

  public static class UserSerializer extends JsonSerializer<User> {
    @Override
    public void serialize(User value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UserPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UserDeserializer extends JsonDeserializer<User> {
    @Override
    public User deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UserPb pb = mapper.readValue(p, UserPb.class);
      return User.fromPb(pb);
    }
  }
}
