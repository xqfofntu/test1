package com.xqf.test.util;

import com.github.pagehelper.PageHelper;

/**
 * 分页工具类
 * 
 * @author ruoyi
 */
public class PageUtils extends PageHelper
{
    /**
     * 设置请求分页数据
     */
    public static void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize))
        {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            Boolean reasonable = pageDomain.getReasonable();
            PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
        }
    }
    /**
     * 设置请求分页数据 仅支持post 业务层可用
     */
    public static void startPage(Integer pageNum,Integer pageSize) {

        pageNum = StringUtils.isNotNull(pageNum) ? pageNum : 1;
        pageSize = StringUtils.isNotNull(pageSize) ? pageSize : 10;
        String orderBy = SqlUtil.escapeOrderBySql("");
        //分页页码不变，总是limit 10
        PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(true);
        //分页成功
//        PageHelper.startPage(pageNum, pageSize);
    }
    /**
     * 清理分页的线程变量
     */
    public static void clearPage()
    {
        PageHelper.clearPage();
    }
}
