package com.github.overmighty.croissant.command.argument;

/**
 * Resolves raw command arguments of a certain expected type, into appropriate
 * objects.
 *
 * @see ArgumentType
 */
public interface ArgumentResolver<T> {

    /**
     * Resolves a raw command argument.
     *
     * @param value the value of the argument to resolve
     * @return the resolved argument, or {@code null} if it could not be
     *         resolved
     */
    T resolve(String value);

}
