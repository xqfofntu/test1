package com.xqf.test.controller;

import com.xqf.test.service.IOaService;
import com.xqf.test.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuqifeng
 * @create 2022/8/3 17:19
 **/

@RestController
@RequestMapping("/test")
@Api(value = "测试",tags = "测试")
public class OaController extends BaseController{

    private final IOaService oaService;

    public OaController(IOaService oaService) {
        this.oaService = oaService;
    }

    @PostMapping("/demo")
    @ApiOperation(value="demo", notes="demo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "商品名", required = true, dataType = "String", paramType = "query")
    })
    public R test(String name, Integer pageNum, Integer pageSize) {
        return R.ok(getDataTable(oaService.test(name,pageNum,pageSize)));
    }
}