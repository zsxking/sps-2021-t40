package com.google.sps.servlets;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/phrase")
public class PhraseServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
  
  
    ArrayList<String> phrases = new ArrayList<String>();
    phrases.add("phrase 1");
    phrases.add("phrase 2");
    phrases.add("phrase 3");

    Gson gson = new Gson();
    String json = gson.toJson(phrases);

    response.setContentType("text/html;");
    response.getWriter().println(json);
    }
}
