package utilities;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utilities.ConfigurationReader.*;

public class DatabaseUtility {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection(){
        try {
            connection = DriverManager.getConnection(getProperty("databaseUrl"), getProperty("user"), getProperty("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void executeQuery(String sql){
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void closeConnection(){
            try {
                if(resultSet != null){resultSet.close();}
                if(statement != null){statement.close();}
                if(connection != null){connection.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static List<List<Object>> getQueryResultList(String query){
        List<List<Object>> rowList = new ArrayList<>();
        executeQuery(query);
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            while (resultSet.next()){
                List<Object> row = new ArrayList<>();
                for (int i=1; i<= metaData.getColumnCount();i++){
                    row.add(resultSet.getObject(i));
                }
                rowList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowList;
    }

}
