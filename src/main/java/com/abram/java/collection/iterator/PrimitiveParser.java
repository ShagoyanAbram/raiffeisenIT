package com.abram.java.collection.iterator;

public class PrimitiveParser {

    public static Object[] parser(Object object) {
        Object[] objects = null;
        if (object instanceof int[]) {
            objects = parserInteger(object);
        } else if (object instanceof float[]) {
            objects = parserFloat(object);
        } else if (object instanceof double[]) {
            objects = parserDouble(object);
        } else if (object instanceof boolean[]) {
            objects = parserBoolean(object);
        } else if (object instanceof long[]) {
            objects = parserLong(object);
        } else if (object instanceof byte[]) {
            objects = parserByte(object);
        } else if (object instanceof short[]) {
            objects = parserShort(object);
        } else if (object instanceof char[]) {
            objects = parserChar(object);
        } else {
            objects = (Object[]) object;
        }
        return objects;
    }

    private static Object[] parserInteger(Object object) {
        int[] buf = (int[]) object;
        Integer[] integers = new Integer[buf.length];
        for (int i = 0; i < buf.length; i++) {
            integers[i] = buf[i];
        }
        return integers;
    }

    public static Object[] parserFloat(Object object) {
        float[] buf = (float[]) object;
        Float[] floats = new Float[buf.length];
        for (int i = 0; i < buf.length; i++) {
            floats[i] = buf[i];
        }
        return floats;
    }

    private static Object[] parserDouble(Object object) {
        double[] buf = (double[]) object;
        Double[] doubles = new Double[buf.length];
        for (int i = 0; i < buf.length; i++) {
            doubles[i] = buf[i];
        }
        return doubles;
    }

    private static Object[] parserBoolean(Object object) {
        boolean[] buf = (boolean[]) object;
        Boolean[] booleans = new Boolean[buf.length];
        for (int i = 0; i < buf.length; i++) {
            booleans[i] = buf[i];
        }
        return booleans;
    }

    private static Object[] parserLong(Object object) {
        long[] buf = (long[]) object;
        Long[] longs = new Long[buf.length];
        for (int i = 0; i < buf.length; i++) {
            longs[i] = buf[i];
        }
        return longs;
    }

    private static Object[] parserByte(Object object) {
        byte[] buf = (byte[]) object;
        Byte[] bytes = new Byte[buf.length];
        for (int i = 0; i < buf.length; i++) {
            bytes[i] = buf[i];
        }
        return bytes;
    }

    private static Object[] parserShort(Object object) {
        short[] buf = (short[]) object;
        Short[] shorts = new Short[buf.length];
        for (int i = 0; i < buf.length; i++) {
            shorts[i] = buf[i];
        }
        return shorts;
    }

    private static Object[] parserChar(Object object) {
        char[] buf = (char[]) object;
        String[] strings = new String[buf.length];
        for (int i = 0; i < buf.length; i++) {
            strings[i] = String.valueOf(buf[i]);
        }
        return strings;
    }
}
