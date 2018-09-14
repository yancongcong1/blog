package com.ycc.framework;

import com.ycc.framework.ioc.annotation.Inject;
import com.ycc.framework.ioc.configure.ConfigHelper;
import com.ycc.framework.mvc.annotation.Controller;
import com.ycc.framework.mvc.annotation.Mapping;
import com.ycc.framework.mvc.annotation.Param;
import com.ycc.framework.mvc.response.Data;
import com.ycc.framework.mvc.response.View;

/**
 * MVC测试用例
 *
 * created by ycc at 2018\4\24 0024
 */
@Controller
public class TestController {

    @Inject
    private TestService service;

    @Mapping(method = "get", url = "/data")
    public Data getData(@Param("username") String username, @Param("extra") String extra) {
        service.test();
        Data data = new Data();
        data.setModel("welcome to my frame work, " + username + ", " + extra);
        return data;
    }

    @Mapping(method = "get", url = "/view")
    public View getView() {
        View view = new View(ConfigHelper.getJspPath() + "a");
        return view;
    }
}
