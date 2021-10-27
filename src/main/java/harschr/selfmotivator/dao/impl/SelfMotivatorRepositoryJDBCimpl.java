package harschr.selfmotivator.dao.impl;

import harschr.selfmotivator.dao.interf.*;
import harschr.selfmotivator.model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class SelfMotivatorRepositoryJDBCimpl implements SelfMotivatorRepository {

    private Connection conn;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement listAll;
    private PreparedStatement update;
    private PreparedStatement findById;

    public SelfMotivatorRepositoryJDBCimpl() {

        Properties prop = new Properties();
        try {
            prop.load(SelfMotivatorRepositoryJDBCimpl.class.getResourceAsStream("/sql.ini"));
            String url = prop.getProperty("SQLite_url");
            conn = DriverManager.getConnection(url);

            String sqlTable1 = "CREATE TABLE IF NOT EXISTS " + prop.getProperty("SQLite_table1") + " (\n"
                    + "	id integer PRIMARY KEY,\n"
                    + "	name text NOT NULL UNIQUE,\n"
                    + "	activity1 text NOT NULL,\n"
                    + "	length_training1 integer NOT NULL,\n"
                    + "	activity2 text,\n"
                    + "	length_training2 integerL,\n"
                    + "	activity3 text,\n"
                    + "	length_training3 integer,\n"
                    + "	activity4 text,\n"
                    + "	length_training4 integer,\n"
                    + "	activity5 text,\n"
                    + "	length_training5 integer,\n"
                    + "	length_break integer,\n"
                    + "	recurrence integer \n"
                    + ");";
            Statement stmtTable1 = conn.createStatement();
            {
                stmtTable1.execute(sqlTable1);
            }
        } catch (Exception e) {
        }

        try {
            this.conn = conn;
            this.insert = conn.prepareStatement("INSERT INTO trainings (name, activity1, length_training1, activity2, length_training2, activity3, length_training3, activity4, length_training4, activity5, length_training5, length_break, recurrence) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            this.delete = conn.prepareStatement("DELETE FROM trainings WHERE id = ?");
            this.listAll = conn.prepareStatement("SELECT * FROM trainings");
            this.update = conn.prepareStatement("UPDATE trainings SET name = ?, activity1 = ?, length_training1 = ?, activity2 = ?, length_training2 = ?, activity3 = ?, length_training3 = ?, activity4 = ?, length_training4 = ?, activity5 = ?, length_training5 = ?, length_break = ?, recurrence = ? WHERE id = ?");
            this.findById = conn.prepareStatement("SELECT * FROM trainings WHERE id = ?");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insert(Training tr) {
        try {
            this.insert.setString(1, tr.getName());
            this.insert.setString(2, tr.getActivity1());
            this.insert.setInt(3, tr.getLength_training1());
            this.insert.setString(4, tr.getActivity2());
            this.insert.setInt(5, tr.getLength_training2());
            this.insert.setString(6, tr.getActivity3());
            this.insert.setInt(7, tr.getLength_training3());
            this.insert.setString(8, tr.getActivity4());
            this.insert.setInt(9, tr.getLength_training4());
            this.insert.setString(10, tr.getActivity5());
            this.insert.setInt(11, tr.getLength_training5());
            this.insert.setInt(12, tr.getLength_break());
            this.insert.setInt(13, tr.getRecurrence());
            this.insert.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        try {
            this.delete.setString(1, id);
            this.delete.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<String[]> listAll() {
        ArrayList<String[]> trainingList = new ArrayList<>();

        try {
            ResultSet rs = listAll.executeQuery();

            while (rs.next()) {
                String[] data = new String[14];
                data[0] = String.valueOf(rs.getInt("id"));
                data[1] = rs.getString("name");
                data[2] = rs.getString("activity1");
                data[3] = String.valueOf(rs.getInt("length_training1"));
                data[4] = rs.getString("activity2");
                data[5] = String.valueOf(rs.getInt("length_training2"));
                data[6] = rs.getString("activity3");
                data[7] = String.valueOf(rs.getInt("length_training3"));
                data[8] = rs.getString("activity4");
                data[9] = String.valueOf(rs.getInt("length_training4"));
                data[10] = rs.getString("activity5");
                data[11] = String.valueOf(rs.getInt("length_training5"));
                data[12] = String.valueOf(rs.getInt("length_break"));
                data[13] = String.valueOf(rs.getInt("recurrence"));
                trainingList.add(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return trainingList;
    }

    @Override
    public void update(Training tr, String id) {
        try {
            this.update.setString(1, tr.getName());
            this.update.setString(2, tr.getActivity1());
            this.update.setInt(3, tr.getLength_training1());
            this.update.setString(4, tr.getActivity2());
            this.update.setInt(5, tr.getLength_training2());
            this.update.setString(6, tr.getActivity3());
            this.update.setInt(7, tr.getLength_training3());
            this.update.setString(8, tr.getActivity4());
            this.update.setInt(9, tr.getLength_training4());
            this.update.setString(10, tr.getActivity5());
            this.update.setInt(11, tr.getLength_training5());
            this.update.setInt(12, tr.getLength_break());
            this.update.setInt(13, tr.getRecurrence());
            this.update.setString(14, id);
            this.update.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Training findById(String id) {
        Training tr = new Training();
        try {                   
            this.findById.setString(1, id);
            ResultSet rs = this.findById.executeQuery();
            tr = makeOneTraining(rs);
            rs.close();
            return tr;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tr;
    }

    @Override
    public Training makeOneTraining(ResultSet rs) {
        Training tr = new Training();
        try {
            while (rs.next()) {
                tr.setName(rs.getString("name"));
                tr.setActivity1(rs.getString("activity1"));
                tr.setLength_training1(rs.getInt("length_training1"));
                tr.setActivity2(rs.getString("activity2"));
                tr.setLength_training2(rs.getInt("length_training2"));
                tr.setActivity3(rs.getString("activity3"));
                tr.setLength_training3(rs.getInt("length_training3"));
                tr.setActivity4(rs.getString("activity4"));
                tr.setLength_training4(rs.getInt("length_training4"));
                tr.setActivity5(rs.getString("activity5"));
                tr.setLength_training5(rs.getInt("length_training5"));
                tr.setLength_break(rs.getInt("length_break"));
                tr.setRecurrence(rs.getInt("recurrence"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tr;
    }
}
