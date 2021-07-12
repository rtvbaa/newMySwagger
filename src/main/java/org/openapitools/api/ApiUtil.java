package org.openapitools.api;

import org.openapitools.model.Person;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApiUtil {
    public static void setExampleResponse(NativeWebRequest req, String contentType, Person person) {
        try {
            HttpServletResponse res = req.getNativeResponse(HttpServletResponse.class);
            assert res != null;
            res.setCharacterEncoding("UTF-8");
            res.addHeader("Content-Type", contentType);
            res.getWriter().print(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
