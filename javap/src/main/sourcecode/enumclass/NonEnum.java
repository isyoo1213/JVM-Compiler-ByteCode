package main.sourcecode.enumclass;

import java.util.List;

public abstract class NonEnum<E extends NonEnum<E>> {

    private final String name;
    private final int ordinal;

    private NonEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String toString() {
        return name;
    }

//    public static <T extends NonEnum<T>> T valueOf(Class<T> nonEnumClass, String name) {
//        T result = nonEnumClass.getEnumConstants()
//        List<String>
//        nonEnum.
//    }
}
