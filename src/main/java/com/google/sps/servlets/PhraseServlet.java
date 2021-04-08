package com.google.sps.servlets;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

@WebServlet("/phrase")
public class PhraseServlet extends HttpServlet {

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws IOException {

         //hardcoded arraylist of english phrases 
        final ArrayList<String> engPhrases = new ArrayList<String>();
        engPhrases.add("Hello");
        engPhrases.add("Good morning");
        engPhrases.add("Good evening");
        engPhrases.add("How are you?");
        engPhrases.add("I am doing great");
        engPhrases.add("Thank you");
        engPhrases.add("You are welcome");

        //randomPhrase = engPhrases[Math.floor(Math.random() * engPhrases.length)];
        //randomPhrase = engPhrases.get(rand.nextString(engPhrases.size()));
        Random rand = new Random();
        String randomPhrase = engPhrases.get(rand.nextInt(engPhrases.size())); //nextString

        final Gson gson = new Gson();
        final String json = gson.toJson(randomPhrase); // randomPhrase

        response.setContentType("text/html;");
        response.getWriter().println(json);

        // for request (up top) use the random phrase  
    }
}
