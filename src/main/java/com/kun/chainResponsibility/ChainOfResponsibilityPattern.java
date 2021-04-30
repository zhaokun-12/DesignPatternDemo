package com.kun.chainResponsibility;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/4/30
 * @Version 1.0
 **/
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
//        Msg msg = new Msg();
//        String s = "你:{},tm的  (￣▽￣) 真好看";
//        msg.setMessage(s);
        //方式一 方法调用
//        jsHandler jsStringHandler = new jsHandler();
//        String s1 = jsStringHandler.doHandle(s);
//        System.out.println(s1);
//
//        sensitiveHandler sensitiveHandler = new sensitiveHandler();
//        String s2 = sensitiveHandler.doHandle(s1);
//        System.out.println(s2);
//
//        expressionHandler expressionHandler = new expressionHandler();
//        String s3 = expressionHandler.doHandle(s2);
//        System.out.println(s3);

        //方式二

        Request request = new Request();
        request.setMsg("你:{},tm的  (￣▽￣) 真好看");

        FilterChain chain = new FilterChain();
        chain.addFilter(new ExpressionFilter());
        chain.addFilter(new HtmlFilter());
        chain.addFilter(new SensitiveFilter());
        chain.doChain(request, null);
        System.out.println(request.getMsg());
    }


}

