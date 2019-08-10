package com.github.overmighty.croissant.command.argument;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotating the last parameter of the executor method of a command class with
 * {@code @Rest} indicates, if the parameter is of the {@link String} type, that
 * all remaining arguments provided by the command sender should be joined into
 * a {@link String} using spaces to form a last command argument.
 *
 * @see com.github.overmighty.croissant.command.CroissantCommand
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Rest {
}
