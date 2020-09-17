package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String source = new Scanner(System.in).next().replace(" ", "");

        var conversionResult = source.startsWith("{") ? jsonToXml(source) : xmlToJson(source);

        System.out.println(conversionResult);
    }

    private static String xmlToJson(String xml) {
        String key = xml.substring(xml.indexOf('<') + 1, xml.indexOf('>'));

        if (key.endsWith("/")) {
            key = key.substring(0, key.length() - 1);
            return String.format("{\"%s\":null}", key);
        }

        String openingTag = "<" + key + ">";
        int startIndex = xml.indexOf(openingTag) + openingTag.length();
        String closingTag = "</" + key + ">";
        int endIndex = xml.indexOf(closingTag);
        String value = xml.substring(startIndex, endIndex);

        if (value.isBlank()) {
            return String.format("{\"%s\":null}", key);
        }

        return String.format("{\"%s\":\"%s\"}", key, value);
    }

    private static String jsonToXml(String json) {
        String key = json.substring(json.indexOf('{') + 2, json.indexOf(':') - 1);
        String startElement = "{\"" + key + "\":";
        String endingElement = "}";

        int startIndex, endIndex;
        startIndex = json.indexOf(startElement) + startElement.length();
        endIndex = json.indexOf(endingElement);
        String value;

        if (json.contains("null")) {
            value = json.substring(startIndex, endIndex);
        } else {
            value = json.substring(startIndex + 1, endIndex - 1);
        }

        if (value.equals("null") || value.equals("0")) {
            return String.format("<%s/>", key);
        }

        return String.format("<%s>%s</%s>", key, value, key);
    }
}