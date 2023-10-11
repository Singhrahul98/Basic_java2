package com.samplepage.Relevel.AnjaliJava.AnjaliCollection;

public class CensorWord {
    public static void main(String[] args) {
        String sentence = "This is the text we write the text files";
        String wordToCensor = "text";

        //Create the Censor word
        String censorWord = "";

        for (int i=0; i<wordToCensor.length(); i++){
            censorWord += "*";
        }

        //Word to Given Sentence
        String[] words = sentence.split(" ");

        for (int i=0; i< words.length; i++){
            if (words[i].contains(wordToCensor)){
                words[i] =censorWord;
            }
        }

        //Join The words array to form a Sentence
        String outputSentence = "";
        for (int i=0; i< words.length; i++){

            if (i == words.length - 1) {
                outputSentence += words[i];
            } else {
                outputSentence += words[i] + " ";
            }

        }
        System.out.println(outputSentence);
    }
}
