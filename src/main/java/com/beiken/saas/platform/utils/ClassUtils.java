package com.beiken.saas.platform.utils;

import java.io.*;

public class ClassUtils {

    public static byte[] write(Serializable object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream stream = new ObjectOutputStream(byteArrayOutputStream);
        stream.writeObject(object);
        return byteArrayOutputStream.toByteArray();
    }

    public static Object read(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
        return inputStream.readObject();
    }

}
