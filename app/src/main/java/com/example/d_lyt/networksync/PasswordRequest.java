package com.example.d_lyt.networksync;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kshitij on 12/19/17.
 */

public class PasswordRequest extends StringRequest {

    private static final String LOGIN_URL = "https://hagiologic-balances.000webhostapp.com/a/PhpFiles/forgotpass.php";
    private Map<String, String> parameters;

    public PasswordRequest(String email, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, LOGIN_URL, listener, errorListener);
        parameters = new HashMap<>();
        parameters.put("email", email);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }

}
