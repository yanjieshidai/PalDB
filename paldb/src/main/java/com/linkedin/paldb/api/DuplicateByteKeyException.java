package com.linkedin.paldb.api;

/**
 * Description: DuplicateKeyException
 * Author: wangjie12
 * Create: 2017-05-11
 */
public class DuplicateByteKeyException extends RuntimeException {
    private byte[] key;

    public DuplicateByteKeyException(byte[] bytes) {
        super();
        this.key = bytes;
    }

    public byte[] getKey() {
        return key;
    }
}
