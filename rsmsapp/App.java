package com.rsmsapp;

import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import spark.*;
import static spark.Spark.*;
 
public class App {
 
    public static void main(String[] args) {
      staticFileLocation("/public");

      ContentEdit pageContent = new ContentEdit();
      
      String username = "paul";
      String password = "paul";
      int rm_factor = (new Random().nextInt(20)) + 1;
      //Page thePage;

      pageContent.setUsername(username);
      pageContent.setRmFactor(rm_factor);

      HashMap <String, Object> model = new HashMap <String, Object>();
      //model.put("username", username);
      //model.put("rm_factor", rm_factor);

      get("/", (request, response) -> {
        if(request.session().attribute("username") != null)
          response.redirect("/dashboard");
      return new ModelAndView(model, "templates/login.vtl");
    }, new VelocityTemplateEngine());

      get("/login", (request, response) -> {
        if(request.session().attribute("username") != null)
          response.redirect("/dashboard");
      return new ModelAndView(model, "templates/login.vtl");
    }, new VelocityTemplateEngine());
    
      post("/login", (request, response) -> {
        if(username.equals(request.queryParams("username")) && password.equals(request.queryParams("password"))){
        request.session(true);
        request.session().attribute("username", request.queryParams("username"));
        response.redirect("/dashboard");
        }

    return new ModelAndView(model, "templates/login.vtl");
    }, new VelocityTemplateEngine());
    
    get("/dashboard", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "dashboard");
        //thePage = dashboard;
        pageContent.setPage(ContentEdit.Page.dashboard);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/dashboard.vtl");
    }, new VelocityTemplateEngine());

    get("/lmcs", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
        
      //model.put("page", "lmcs");
        //thePage = lmcs;
        pageContent.setPage(ContentEdit.Page.lmcs);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/lmcs.vtl");
    }, new VelocityTemplateEngine());

     get("/chart", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "lmcs");
      return new ModelAndView(model, "templates/chart.vtl");
    }, new VelocityTemplateEngine());

    get("/lmc_view", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "lmcs");
        //thePage = lmcs;
        pageContent.setPage(ContentEdit.Page.lmcs);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/lmc_view.vtl");
    }, new VelocityTemplateEngine());

    get("/lmc_edit", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "lmcs");
        //thePage = lmcs;
        pageContent.setPage(ContentEdit.Page.lmcs);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/lmc_edit.vtl");
    }, new VelocityTemplateEngine());

    get("/retailers", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "retailers");
        //thePage = retailers;
        pageContent.setPage(ContentEdit.Page.retailers);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/retailers.vtl");
    }, new VelocityTemplateEngine());

  /*  get("/chart", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "retailers");
      return new ModelAndView(new HashMap(), "templates/chart.vtl");
    }, new VelocityTemplateEngine());
*/
    get("/retailer_view", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "retailers");
        //thePage = retailers;
        pageContent.setPage(ContentEdit.Page.retailers);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/retailer_view.vtl");
    }, new VelocityTemplateEngine());

     get("/retailerView_test", (request, response) -> {
      //model.put("page", "retailers");
        //thePage = retailers;
        pageContent.setPage(ContentEdit.Page.retailers);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/retailerView_test.vtl");
    }, new VelocityTemplateEngine());

    get("/retailer_edit", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
    
      //model.put("page", "retailers");
        //thePage = retailers;
        pageContent.setPage(ContentEdit.Page.retailers);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/retailer_edit.vtl");
    }, new VelocityTemplateEngine());

    get("/notifications", (request, response) -> {
      if(request.session().attribute("username") == null)
          response.redirect("/login");
      
        //model.put("page", "notification");
        //thePage = notification;
        pageContent.setPage(ContentEdit.Page.notification);
        model.put("pageContent", pageContent);
      return new ModelAndView(model, "templates/notifications.vtl");
    }, new VelocityTemplateEngine());
    
    }   
}
