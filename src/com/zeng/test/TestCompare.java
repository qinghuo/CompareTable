package com.zeng.test;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

import com.zeng.CompareTable;

public class TestCompare {

    @Test
    public void ucenterTable() {
        String mainUrl = "localhost:3306/wdw";
        String mainUsername = "myuser";
        String mainPw = "mypwd123";
        String otherUrl = "localhost:3306/wdw";
        String otherUsername = "myuser";
        String otherPw = "Mypwd123!";
        CompareTable test = new CompareTable(mainUrl, mainUsername, mainPw, otherUrl, otherUsername, otherPw);
        List<String> tableNameList = new LinkedList<String>();
        tableNameList.add("u_base");
        tableNameList.add("u_base_extend");
        tableNameList.add("spouse_info");
        tableNameList.add("org_info");
        tableNameList.add("u_wyrstatus");
        tableNameList.add("u_borrower");
        // tableNameList.add("u_borrower_type");
        tableNameList.add("s_file");
        test.match(tableNameList);
    }
}
