package com.databricks.sdk.client;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.function.Function;

class ConfigAttributeAccessor {
    private ConfigAttribute configAttribute;
    private Field field;

    public ConfigAttributeAccessor(ConfigAttribute configAttribute, Field field) {
        this.configAttribute = configAttribute;
        this.field = field;
    }

    public String getName() {
        return configAttribute.value();
    }

    public String getEnvVariable() {
        return configAttribute.env();
    }

    public Boolean isSensitive() {
        return configAttribute.sensitive();
    }

    public String getEnv(Function<String, String> getEnv) {
        if (configAttribute.env().isEmpty()) {
            return "";
        }
        return getEnv.apply(configAttribute.env());
    }

    public void setValue(DatabricksConfig cfg, String value) throws IllegalAccessException {
        field.setAccessible(true);
        if (field.getType() == String.class) {
            field.set(cfg, value);
        } else if (field.getType() == int.class) {
            field.set(cfg, Integer.parseInt(value));
        } else if (field.getType() == boolean.class) {
            field.set(cfg, Boolean.parseBoolean(value));
        }
        field.setAccessible(false);
    }

    public Object getValue(DatabricksConfig cfg) throws IllegalAccessException {
        field.setAccessible(true);
        Object value = field.get(cfg);
        field.setAccessible(false);
        return value;
    }

    @Override
    public String toString() {
        String repr = configAttribute.value();
        if (!Objects.equals(configAttribute.env(), "")) {
            repr += "(env: " + configAttribute.env() + ")";
        }
        return repr;
    }
}
