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

@WebServlet("/translate")
public class TranslateServlet extends HttpServlet {

    @Override
    public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws IOException {

        // Get the request
        String phrase = request.getParameter("text");
        String lang = request.getParameter("lang");

        // Do the translation
        final Translate translate = TranslateOptions.getDefaultInstance().getService();
        System.out.println(translate);
        System.out.println(phrase);
        System.out.println(lang);
        final Translation translation = translate.translate(phrase,
                Translate.TranslateOption.targetLanguage(lang));
        
         String translatedText = ((Translation) translation).getTranslatedText();
         //Output the translation 
         response.setContentType("application/json;charset=UTF-8");
         response.setCharacterEncoding("UTF-8");
         response.getWriter().println(translatedText);

        // for request (up top) use the random phrase  
    }
}
