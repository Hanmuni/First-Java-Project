package Annotations;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CSVParser<T> {
    private String delimiter = ";";
    private String newLine = "\n";
    private Class<T> clazz;
    private boolean headerPrinted = false;

    public CSVParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public boolean isParsable() {

        if (clazz.isAnnotationPresent(CSVEntity.class)) {
            return true; // wenn Class @CSVEntity Annotations hat
        } else {
            throw new CSVEntityNotParsable();
        }
    }

    public String parse(List<T> objects) {
        isParsable();

        String list = "";
        list = getHeader(objects.get(0)) + newLine;

        for (T object : objects) {

            list += getValue(object) + newLine;
        }

        return list;
    }

    private List<Field> getFields(T object) {
        List<Field> csvFields = new ArrayList<>();

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field f : fields) {
            if (f.isAnnotationPresent(CSVField.class)) ;
            csvFields.add(f);
        }

        return csvFields;
    }

    public String getHeader(T object) {
        List<Field> fields = getFields(object);
        String header = "";
        for (Field f : fields) {
            header = header + f.getName() + delimiter;
        }

        header = header.substring(0, header.length() - 1);

        return header;
    }

    public String getValue(T object) {
        List<Field> fields = getFields(object);
        String value = "";
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                value = value + f.get(object) + delimiter;
            } catch (IllegalAccessException e) {

            }
        }
        value = value.substring(0, value.length() - 1);
        return value;
    }
}
