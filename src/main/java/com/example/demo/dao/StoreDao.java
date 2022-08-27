package com.example.demo.dao;

import com.example.demo.entity.Store;
import com.example.demo.utils.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoreDao {
    Connection conn = null;

    public StoreDao() { conn = ConnectionHelper.getConn(); }

    public List<Store> getAll() {
        String query = "select * from stores";
        List<Store> stores = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Store store = Store.StoreBuilder.aStore()
                        .withId(rs.getInt(1))
                        .withName(rs.getString(2))
                        .withAddress(rs.getString(3))
                        .withPhone(rs.getString(4))
                        .withFax(rs.getString(5))
                        .build();
                stores.add(store);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stores;
    }
}
