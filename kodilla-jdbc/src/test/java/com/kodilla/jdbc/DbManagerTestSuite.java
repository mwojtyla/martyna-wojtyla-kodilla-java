package com.kodilla.jdbc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    // Given
    DbManager dbManager = DbManager.getInstance();

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndTasks() throws SQLException {
        //Given
        //When
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, I.SUMMARY
                  FROM USERS U
                  JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("SUMMARY"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(15, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        //When
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
                FROM USERS U
                JOIN POSTS ON U.ID = POSTS.USER_ID
                GROUP BY U.ID
                HAVING COUNT(*) >1;
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}