package com.usl.delivery_app.security;

public class SecurityConstant {
    public static final String SECRET_KEY = ";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/v1/users/signup";

}
