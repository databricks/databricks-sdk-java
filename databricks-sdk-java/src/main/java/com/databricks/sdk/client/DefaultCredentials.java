package com.databricks.sdk.client;

import org.apache.http.HttpMessage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

class DefaultAuth(DatabricksAuth):
    classes: List[DatabricksAuth] = [Pat, Basic]
    selected: DatabricksAuth = None

    def __init__(self, **kwargs):
        candidates = []
        for provider in self.classes:
            instance = provider(**kwargs)
            if instance.is_configured():
                candidates.append(instance)
        if not candidates:
            raise DatabricksError('No auth configured')
        if len(candidates) > 1:
            names = " and ".join(sorted([c.name for c in candidates]))
            raise DatabricksError(f'More than one auth configured: {names}')
        self.selected = candidates[0]

    def is_configured(self) -> bool:
        return self.selected is not None

    @property
    def name(self):
        return self.selected.name

    def __call__(self, r):
        return self.selected.__call__(r)

 */

public class DefaultCredentials implements Credentials {
    private static List<Class<? extends Credentials>> providers = Arrays.asList(
        PatCredentials.class,
        BasicCredentials.class
    );

    private final Credentials effective;

    public DefaultCredentials(DatabricksConfig config) {
        try {
            List<Credentials> candidates = new ArrayList<>();
            for (Class<? extends Credentials> provider : providers) {
                Constructor<? extends Credentials> ctor = provider.getDeclaredConstructor(
                        DatabricksConfig.class);
                Credentials credentials = ctor.newInstance(config);
                if (!credentials.isConfigured()) {
                    continue;
                }
                candidates.add(credentials);
            }
            if (candidates.isEmpty()) {
                throw new DatabricksException("No authentication credentials configured");
            }
            if (candidates.size() > 1) {
                String names = candidates.stream()
                        .map(Credentials::name)
                        .collect(Collectors.joining(" and "));
                throw new DatabricksException(String.format(
                        "More than one auth configured: %s", names));
            }
            effective = candidates.get(0);
        } catch (ReflectiveOperationException e) {
            throw new DatabricksException("Default credentials failure: " + e.getMessage(), e);
        }
    }

    @Override
    public String name() {
        return effective.name();
    }

    @Override
    public boolean isConfigured() {
        return effective != null;
    }

    @Override
    public void visit(HttpMessage request) {
        effective.visit(request);
    }
}
