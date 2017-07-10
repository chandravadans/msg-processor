package com.cv.tlv.exceptions;

/**
 * Created by cv on 10/7/17.
 */
public class TLVException extends Exception {

    private String reason;
    private String code;
    private Long timestamp;

    public TLVException(String reason) {
        super(reason);
        this.timestamp = System.currentTimeMillis();
    }

    public TLVException(String reason, String code) {
        this.reason = reason;
        this.code = code;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return reason;
    }
}
