package com.lofominhili.lab_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExpressionChecker expressionChecker = new ExpressionChecker();
        String expressionText = "2+1-6/(1+2)";
        List<ExpressionChecker.Lexeme> lexemes = expressionChecker.lexAnalyze(expressionText);
        ExpressionChecker.LexemeBuffer lexemeBuffer = new ExpressionChecker.LexemeBuffer(lexemes);
        System.out.println(expressionChecker.expr(lexemeBuffer));
    }
}
