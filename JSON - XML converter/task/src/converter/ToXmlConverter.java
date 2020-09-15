package converter;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ToXmlConverter implements Converter {

    @Override
    public String convert(@NotNull final String src) {
        for (String current : src.replace("\n", "").trim().split("\\{")) {
            for (String assignedProperty : current.split(",")) {
                getTagAssigned(assignedProperty);
            }
        }

        return null;
    }

    @Nullable
    private String getTagAssigned(String assignedProperty) {
        var values = assignedProperty.split(":");

        System.out.println("ASSIGNED " + assignedProperty);

        if (values.length > 1) {
            //System.out.println(createTag(values[0].trim(), values[1].replace("}", "").trim()));
        }

        return null;
    }

    @NotNull
    private String createTag(@NotNull String tagName, String tagValue) {
        String strTag = tagName.replace('"', ' ').trim();

        if (tagValue == null || tagValue.isEmpty() || tagValue.equals("null"))
            return String.format("<%s/>", strTag);

        return String.format("<%s>%s</%s>",
                strTag,
                tagValue.replace('"', ' ').trim(),
                strTag
        );
    }
}
