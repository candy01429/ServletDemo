package com.encoding;
// java 編碼/解碼

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encoding {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // text space
        String encode1 = URLEncoder.encode(" ", "UTF8"); // 編碼
        System.out.println(encode1);

        System.out.println(URLDecoder.decode(encode1, "UTF8")); // 解碼

        // test +
        String encode2 = URLEncoder.encode("+", "UTF8"); // 編碼
        System.out.println(encode2);
        System.out.println(URLDecoder.decode(encode2, "UTF8")); // 解碼

        // test <
        String encode3 = URLEncoder.encode("<", "UTF8"); // 編碼
        System.out.println(encode3);
        System.out.println(URLDecoder.decode(encode3, "UTF8")); // 解碼
        // test 中文測試
        String encode4 = URLEncoder.encode("中文測試", "UTF8"); // 編碼
        System.out.println(encode4);
        System.out.println(URLDecoder.decode(encode4, "UTF8")); // 解碼

    }
}
