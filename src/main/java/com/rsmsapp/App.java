package com.rsmsapp;

import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
 
import spark.*;
import static spark.Spark.*;
 
public class App {
 
    public static void main(String[] args) {
     staticFileLocation("/public");
      HashMap<String, Object> model = new HashMap<String, Object>();
      get("/", (request, response) -> {
       if(request.session().attribute("username") != null)
        response.redirect("/dashboard");
      return new ModelAndView(new HashMap(), "templates/login.vtl");
    }, new VelocityTemplateEngine());

      get("/login", (request, response) -> {
        if(request.session().attribute("username") != null)
        response.redirect("/dashboard");
      return new ModelAndView(new HashMap(), "templates/login.vtl");
    }, new VelocityTemplateEngine());
   
   post("/login", (request, response) -> {
    if(request.session().attribute("username") != null)
      response.redirect("/dashboard");
    String username = "paul";
    String password = "paul";
    try{
      if(username.equals(request.queryParams("username")) && password.equals(request.queryParams("password"))){
        request.session(true);
        request.session().attribute("username",request.queryParams("username"));
        response.redirect("/dashboard");
      }
    }catch(Exception ex){

    }
      return new ModelAndView(new HashMap(), "templates/login.vtl");
    }, new VelocityTemplateEngine());
   

    get("/dashboard", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
         model.put("username",request.session().attribute("username") );
          model.put("page","dashboard" );
      return new ModelAndView(model, "templates/dashboard.vtl");
    }, new VelocityTemplateEngine());

    get("/lmc_table_files", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "lmcs");
      return new ModelAndView(model, "templates/lmc_table_files.vtl");
    }, new VelocityTemplateEngine());


    get("/retailer_table_files", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "retailers");
      return new ModelAndView(model, "templates/retailer_table_files.vtl");
    }, new VelocityTemplateEngine());

    get("/chart", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      return new ModelAndView(new HashMap(), "templates/chart.vtl");
    }, new VelocityTemplateEngine());

    get("/notifications", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "notification");
      return new ModelAndView(model, "templates/notifications.vtl");
    }, new VelocityTemplateEngine());


    get("/lmc_view_details", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "lmcs");
      return new ModelAndView(model, "templates/lmc_view_details.vtl");
    }, new VelocityTemplateEngine());

    get("/lmc_edit_details", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "lmcs");
      return new ModelAndView(model, "templates/lmc_edit_details.vtl");
    }, new VelocityTemplateEngine());

    get("/retailer_view_details", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "retailers");
      return new ModelAndView(model, "templates/retailer_view_details.vtl");
    }, new VelocityTemplateEngine());

    get("/retailer_edit_details", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "retailers");
      return new ModelAndView(model, "templates/retailer_edit_details.vtl");
    }, new VelocityTemplateEngine());


get("/log_history", (request, response) -> {
      if(request.session().attribute("username") == null)
        response.redirect("/login");
      //HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("page", "retailers");
      return new ModelAndView(model, "templates/log_history.vtl");
    }, new VelocityTemplateEngine());

    
    }   
}
