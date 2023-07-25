package com.databricks.sdk.core;

import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeaderSerializer {
  public static Map<String, Object> serialize(Object o) {
    Map<String, Object> flattened = flattenObject(o);
    for (Field f : o.getClass().getDeclaredFields()) {
      QueryParam queryParam = f.getAnnotation(QueryParam.class);
      if (queryParam == null) {
        flattened.remove(getFieldName(f));
      }
    }

    return flattened;
  }

  private static final List<Class<?>> primitiveTypes = Arrays.asList(
      boolean.class,
      Boolean.class,
      byte.class,
      Byte.class,
      char.class,
      Character.class,
      short.class,
      Short.class,
      int.class,
      Integer.class,
      long.class,
      Long.class,
      float.class,
      Float.class,
      double.class,
      Double.class,
      String.class
  );

  private static String getFieldName(Field f) {
    JsonProperty jsonProperty = f.getAnnotation(JsonProperty.class);
    if (jsonProperty != null) {
      return jsonProperty.value();
    } else {
      return f.getName();
    }
  }

  private static Map<String, Object> flattenObject(Object o) {
    Map<String, Object> result = new HashMap<>();
    Field[] fields = o.getClass().getDeclaredFields();
    for (Field f : fields) {
      f.setAccessible(true);
      try {
        String name = getFieldName(f);
        Object value = f.get(o);
        if (value == null) {
          continue;
        }
        // check if object is a primitive type
        if (primitiveTypes.contains(f.getType()) || Iterable.class.isAssignableFrom(f.getType())) {
          result.put(name, value);
        } else {
          // recursively flatten the object
          Map<String, Object> flattened = flattenObject(value);
          for (Map.Entry<String, Object> entry : flattened.entrySet()) {
            result.put(name + "." + entry.getKey(), entry.getValue());
          }
        }
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      } finally {
        f.setAccessible(false);
      }
    }
    return result;
  }
}
