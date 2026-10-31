package ru.skaldytskiivladislav.task5_4.task5_4_2;


public class TestMain {
    public static String applyAll(String text, StringTransformer[] stringTransformers) {
        for (StringTransformer stringTransformer : stringTransformers) {
            text = stringTransformer.transform(text);
        }
        return text;
    }

    public static void main(String[] args) {
        StringTransformer trim = text -> text.trim();
        StringTransformer toUpperCase = text -> text.toUpperCase();
        StringTransformer addExclamation = text -> text + "!";
        StringTransformer replaceSpaces = text -> text.replace(" ", "_");
        StringTransformer truncate = text -> text.length() > 10 ? text.substring(0, 10) : text;

        StringTransformer[] firstCombination = {trim, toUpperCase, addExclamation};
        StringTransformer[] secondCombination = {trim, replaceSpaces};
        StringTransformer[] threeCombination = {trim, toUpperCase, truncate};

        String[] texts = {
                " Test ",
                " functional interfaces ",
                " test test "
        };

        for (String text : texts) {
            System.out.println(text);
            System.out.println();
            System.out.println("Первая комбинация: " + applyAll(text, firstCombination));
            System.out.println();
            System.out.println("Вторая комбинация: " + applyAll(text, secondCombination));
            System.out.println();
            System.out.println("Третья комбинация: " + applyAll(text, threeCombination));
            System.out.println();
        }
    }
}
