package com.github.mobile.accounts;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;

import java.util.Map;


/**
 * Base scope class
 */
public abstract class ScopeBase implements Scope {

    private static final Provider<Object> SEEDED_KEY_PROVIDER = new Provider<Object>() {
        public Object get() {
            throw new IllegalStateException("Object not seeded in this scope");
        }
    };

    /**
     * Returns a provider that always throws an exception complaining that the
     * object in question must be seeded before it can be injected.
     *
     * @return typed provider
     */
    public static <T> Provider<T> seededKeyProvider() {
        return (Provider<T>) SEEDED_KEY_PROVIDER;
    }

    public <T> Provider<T> scope(final Key<T> key, final Provider<T> unscoped) {
        return new Provider<T>() {
            public T get() {
                Map<Key<?>, Object> scopedObjects = getScopedObjectMap(key);

                @SuppressWarnings("unchecked")
                T current = (T) scopedObjects.get(key);
                if (current == null && !scopedObjects.containsKey(key)) {
                    current = unscoped.get();
                    scopedObjects.put(key, current);
                }
                return current;
            }
        };
    }

    /**
     * Get scoped object map
     *
     * @param key
     * @return map
     */
    protected abstract <T> Map<Key<?>, Object> getScopedObjectMap(Key<T> key);
}
