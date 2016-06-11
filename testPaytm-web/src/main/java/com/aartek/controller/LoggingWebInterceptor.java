package com.aartek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingWebInterceptor extends HandlerInterceptorAdapter {

 /* (non-Javadoc)
  * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
  */
 @Override
 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
   throws Exception {
  
  System.out.println("inside after completion");
 }

 /* (non-Javadoc)
  * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
  */
 @Override
 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
   ModelAndView modelAndView) throws Exception {
  System.out.println("inside post handler");
 }

 /* (non-Javadoc)
  * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
  */
 @Override
 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
   throws Exception {
  System.out.println("inside pre handler");
  return true;
 }
 
 
 
	

}
