package com.coderpwh.test;

/**
 * @author coderpwh
 * @date 2023/10/13 16:51
 */
public class ByteTest {

    public static void main(String[] args) {

        int a = 10;

        byte[] arr = intToByteArray(a);


        int result = byteArrayToInt(arr);
        System.out.println(result);

    }

    public static byte[] intToByteArray(int count) {
        byte[] result = new byte[4];

        result[0] = (byte) ((count >> 24) & 0xFF);
        result[1] = (byte) ((count >> 16) & 0xFF);
        result[2] = (byte) ((count >> 8) & 0xFF);
        result[3] = (byte) (count & 0xFF);

        return result;
    }

    public static int byteArrayToInt(byte[] bytes) {

        int value = 0;

        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += (bytes[i] & 0x000000FF) << shift;
        }

        return value;
    }


}
