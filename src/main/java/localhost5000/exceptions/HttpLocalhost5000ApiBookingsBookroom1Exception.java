/*
 * BajajHotelManagementLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost5000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import localhost5000.http.client.HttpContext;

/**
 * This is a model class for HttpLocalhost5000ApiBookingsBookroom1Exception type.
 */
public class HttpLocalhost5000ApiBookingsBookroom1Exception
        extends ApiException {
    private static final long serialVersionUID = -64748018789183704L;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public HttpLocalhost5000ApiBookingsBookroom1Exception(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    private void setMessage(String message) {
        this.message = message;
    }
}
