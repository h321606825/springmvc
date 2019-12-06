package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDataConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("请传入source参数");
        }
        DateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return fm.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
