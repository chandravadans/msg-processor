package com.cv.tlv.exceptions;

/**
 * Created by cv on 10/7/17.
 */
public class MalformedMessageException extends TLVException {

    public MalformedMessageException(String reason) {
        super(reason, ExceptionCodes.MALFORMED_MSG_CODE);
    }
}
