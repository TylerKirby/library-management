/**
 * Validate individual parameters.
 *
 * Taken from http://jcommander.org/#_overview.
 */

import com.beust.jcommander.ParameterException;

public interface IParameterValidator {
    /**
     * Validate the parameter.
     *
     * @param name The name of the parameter. (e.g., "-host").
     * @param value The value of the parameter to validate.
     *
     * @throws ParameterException Thrown is the value of the parameter is invalid.
     */
    void validate(String name, String value) throws ParameterException;
}
