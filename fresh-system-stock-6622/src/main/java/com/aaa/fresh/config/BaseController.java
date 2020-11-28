package com.aaa.fresh.config;


import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.io.File;
import java.text.ParseException;
import java.util.Date;

public class BaseController extends DateUtils {
    // 设置上传图片的路径
    public final String REAL_PATH = "D:"+ File.separator+"File"+File.separator+"AAA_JAVA_STUDAY"+File.separator+"picture"+File.separator;
    //读取图片
    public final String VISIT_PATH = File.separator+"upimg"+File.separator;
    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};
    /**
     * 日期型字符串转化为日期 格式
     */
    public static Date parseDate(Object str) {
        if (str == null)
        {
            return null;
        }
        try
        {
            return parseDate(str.toString(), parsePatterns);
        }
        catch (ParseException e)
        {
            return null;
        }
    }
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(parseDate(text));
            }
        });
    }
}
