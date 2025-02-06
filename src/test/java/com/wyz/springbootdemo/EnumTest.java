package com.wyz.springbootdemo;

import org.junit.jupiter.api.Test;

public class EnumTest {

    @Test
    void testPrint() {
        MySQLTextDataType t = MySQLTextDataType.TEXT;
        System.out.println("MySQLTextDataType.TEXT: " + t);
    }

    enum MySQLTextDataType {
        TINYTEXT("TINYTEXT", 255L),
        TEXT("TEXT", 65535L),
        MEDIUMTEXT("MEDIUMTEXT", 16777215L),
        LONGTEXT("LONGTEXT", 4294967295L);

        private final String value;
        private final Long maximumLength;   // MySQL能存的最大字节数

        MySQLTextDataType(String value, Long maximumLength) {
            this.value = value;
            this.maximumLength = maximumLength;
        }

        public static MySQLTextDataType valOf(String value) {
            for (MySQLTextDataType type : MySQLTextDataType.values()) {
                if (type.value.equals(value)) {
                    return type;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return value + "(" + maximumLength + ")";
        }
    }

}
